package testCaseVBKySo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBDuThaoChoPheDuyet;
import pages.DanhSachVBDuThaoDangSoan;
import pages.DanhSachViecCanXuLy;
import pages.FormPhatHanhVb;
import pages.FormVanBanDuThao;
import pages.Login;
import pages.ThemMoiVanBanDuThao;
import pages.ThuocTinhVBDuThao;

public class TC24_YeuCauHieuChinhVaThayDoiKyThuaLenh extends ThuocTinhVBDuThao {
	WebDriver driver;
// Format Simple Date
	String trich_yeu = "[VTTest] TC 23 - Luồng ký số VB Yêu cầu hiệu chỉnh và Thay đổi người phê duyệt " + System.currentTimeMillis();
@Test
public void VBDangLuuKhongDinhKem() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDuThao themMoiVanBanDuThao = new ThemMoiVanBanDuThao(driver);
	FormVanBanDuThao formVanBanDuThao = new FormVanBanDuThao(driver);
	DanhSachVBDuThaoChoPheDuyet danhSachVBDuThaoChoPheDuyet = new DanhSachVBDuThaoChoPheDuyet(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	FormPhatHanhVb formPhatHanhVb = new FormPhatHanhVb(driver);
	login.NavigateToSite();
	login.LoginNhanVienKhoiTaoKySo();
	login.NavigateToTrangChuVB();
	login.NavigateToThemMoiVbKySo();
	themMoiVanBanDuThao.inputVanBanDuThao(
			trich_yeu,
			loai_van_ban);
	themMoiVanBanDuThao.submitForm();
	formVanBanDuThao.uploadFile(file_word_ky_so_1_chu_ky);
	formVanBanDuThao.GuiPheDuyet(
			lanh_dao_phong_ban,
			lanh_dao_phong_lien_quan,
			lanh_dao_dong_phe_duyet,
			lanh_dao_duyet_vb, 
			y_kien_nguoi_gui);
	login.NavigateToDanhSachVBDuThaoChoPheDuyet();
	danhSachVBDuThaoChoPheDuyet.ValidateVBChoPheDuyet(
			trich_yeu,
			loai_van_ban, 
			lanh_dao_phong_ban, 
			tinh_trang_lanh_dao_phong);
	login.NavigateToDanhSachVanBanDiChoPheDuyet();
	login.signOut();
	login.NavigateToSite();
	login.LoginTruongPhongPheDuyetVbDuThao();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThaoKySo(trich_yeu, nguoi_tao_vb_ky_so);
	danhSachViecCanXuLy.ClickOnFirstItem();
	login.LogReport();
	formVanBanDuThao.DongY(y_kien_phe_duyet_vb_du_thao);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskPheDuyetVbDuThao(trich_yeu);
	login.signOut();
	// Nguoi lien quan
		login.NavigateToSite();
		login.LoginUserTpLienQuan();
		danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThaoKySo(trich_yeu, lanh_dao_phong_ban);
		danhSachViecCanXuLy.ClickOnFirstItem();
		formVanBanDuThao.YeuCauHieuChinh();
		login.signOut();
		
	//tra ve user soan thao
		login.LoginNhanVienKhoiTaoKySo();
		danhSachViecCanXuLy.ClickOnFirstItem();
		formVanBanDuThao.MoVBDuThao();
		formVanBanDuThao.SuaThongTinVbDuThaoKySo(loai_van_ban, trich_yeu);
		formVanBanDuThao.GuiPheDuyetVbThuaLenh(lanh_dao_phong_ban, y_kien_nguoi_gui);
		login.signOut();
		
// gui lai truong phong
		login.LoginTruongPhongPheDuyetVbDuThao();
		danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThaoKySo(trich_yeu, nguoi_tao_vb_ky_so);
		danhSachViecCanXuLy.ClickOnFirstItem();
		formVanBanDuThao.DongY(y_kien_phe_duyet_vb_du_thao);
		login.NavigateToTrangChuVB();
		danhSachViecCanXuLy.ValidateHoanTatTaskPheDuyetVbDuThao(trich_yeu);
		login.signOut();
		
		
//	login.NavigateToSite();
//	login.LoginUserTgd();
//	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThaoKySo(trich_yeu, lanh_dao_phong_ban);
//	danhSachViecCanXuLy.ClickOnFirstItem();
//	formVanBanDuThao.YeuCauHieuChinh();
//	login.signOut();
	
	login.LoginUserVanThu();
	danhSachViecCanXuLy.ValidateTaskPhatHanhVBDuThaoDaPheDuyet(trich_yeu, lanh_dao_phong_ban);
	danhSachViecCanXuLy.ClickOnFirstItem();
	login.LogReport();
//	formPhatHanhVb.PhatHanh();
//	login.NavigateToTrangChuVB();
//	danhSachViecCanXuLy.ValidateHoanTatPhatHanhVBDuThaoDaPheDuyet(trich_yeu);
	driver.quit();
	} 
}
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

public class TC23_YeuCauHieuChinhVaThayDoiNguoiDuyet extends ThuocTinhVBDuThao {
	WebDriver driver;
// Format Simple Date
	String trich_yeu = "[VTTest] TC 23 - Luồng ký số VB Yêu cầu hiệu chỉnh đổi người ký" + System.currentTimeMillis();
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
	//Người tạo 
	login.NavigateToSite();
	login.LoginNhanVienKhoiTaoKySo();
	login.NavigateToTrangChuVB();
	login.NavigateToThemMoiVbKySo();
	themMoiVanBanDuThao.inputVanBanDuThao(
			trich_yeu,
			loai_van_ban);
	themMoiVanBanDuThao.submitForm();
	formVanBanDuThao.uploadFile(file_word_ky_so_1_trang_key_stt);
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
//Người phê duyệt bước thống nhất
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
	
// Tra ve dư thao
	
	login.LoginNhanVienKhoiTaoKySo();
	danhSachViecCanXuLy.ClickOnFirstItem();
	formVanBanDuThao.GuiPheDuyetLaiThayDoiNguoiDuyet(
			lanh_dao_phong_ban, 
			lanh_dao_phong_lien_quan,
			lanh_dao_dong_phe_duyet,
			lanh_dao_duyet_vb_so_2, 
			y_kien_nguoi_gui);
	login.signOut();
	
	
	login.LoginTruongPhongPheDuyetVbDuThao();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThaoKySo(trich_yeu, nguoi_tao_vb_ky_so);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formVanBanDuThao.DongY(y_kien_phe_duyet_vb_du_thao);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskPheDuyetVbDuThao(trich_yeu);
	login.signOut();
//	Tp Lien quan duyet
	login.NavigateToSite();
	login.LoginUserTpLienQuan();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThaoKySo(trich_yeu, lanh_dao_phong_ban);
	danhSachViecCanXuLy.ClickOnFirstItem();
	login.LogReport();
	formVanBanDuThao.DongY(y_kien_phe_duyet_vb_du_thao);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskPheDuyetVbDuThao(trich_yeu);
	login.signOut();
//	Lanh dao Dong phe duyet duyet
	login.NavigateToSite();
	login.LoginUserLdDongPheDuyet();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThaoKySo(trich_yeu, lanh_dao_phong_lien_quan);
	danhSachViecCanXuLy.ClickOnFirstItem();
	login.LogReport();
	formVanBanDuThao.DongY(y_kien_phe_duyet_vb_du_thao);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskPheDuyetVbDuThao(trich_yeu);
	login.signOut();
// nguoi duoc doi
	login.LoginUserChuTich();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThaoKySo(trich_yeu, lanh_dao_dong_phe_duyet);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formVanBanDuThao.PheDuyet(y_kien_phe_duyet_vb_du_thao);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskPheDuyetVbDuThao(trich_yeu);
	login.signOut();
	
	login.LoginUserVanThu();
	danhSachViecCanXuLy.ValidateTaskPhatHanhVBDuThaoDaPheDuyet(trich_yeu, lanh_dao_duyet_vb_so_2);
	danhSachViecCanXuLy.ClickOnFirstItem();
	login.LogReport();
//	formPhatHanhVb.PhatHanh();
//	login.NavigateToTrangChuVB();
//	danhSachViecCanXuLy.ValidateHoanTatPhatHanhVBDuThaoDaPheDuyet(trich_yeu);
	driver.quit();
	} 
}
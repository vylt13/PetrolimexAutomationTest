package testCaseVBDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBDiChoPheDuyet;
import pages.DanhSachVBDuThaoChoPheDuyet;
import pages.DanhSachViecCanXuLy;
import pages.FormVanBanDuThao;
import pages.Login;
import pages.ThemMoiVanBanDuThao;
import pages.ThuocTinhVBDuThao;

public class TC06_NguoiPheDuyetYeuCauBoSungThongTin extends ThuocTinhVBDuThao {
	WebDriver driver;
// Format Simple Date
	String trich_yeu = "[2808][VTTest] TC 05 - Người phê duyệt Yêu cầu BSTT" + System.currentTimeMillis();
@Test
public void NguoiPheDuyetYeuCauBoSungThongTin() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDuThao themMoiVanBanDuThao = new ThemMoiVanBanDuThao(driver);
	FormVanBanDuThao formVanBanDuThao = new FormVanBanDuThao(driver);
	DanhSachVBDuThaoChoPheDuyet danhSachVBDuThaoChoPheDuyet = new DanhSachVBDuThaoChoPheDuyet(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDiChoPheDuyet danhSachVBDiChoPheDuyet = new DanhSachVBDiChoPheDuyet(driver);
	login.NavigateToSite();
	login.LoginNhanVienKhoiTao();
	login.NavigateToThemMoiVbDuThaoKhongKySo();
	themMoiVanBanDuThao.inputVanBanDuThao(
			trich_yeu,
			loai_van_ban);
	themMoiVanBanDuThao.UploadFile(file01);
	themMoiVanBanDuThao.submitForm();
	formVanBanDuThao.GuiPheDuyet(
			lanh_dao_phong_ban,
			lanh_dao_phong_lien_quan,
			lanh_dao_dong_phe_duyet,
			lanh_dao_duyet_vb, 
			y_kien_nguoi_gui);
	login.NavigateToTrangChuVB();
	login.NavigateToDanhSachVBDuThaoChoPheDuyet();
	danhSachVBDuThaoChoPheDuyet.ValidateVBChoPheDuyet(
			trich_yeu,
			loai_van_ban, 
			lanh_dao_phong_ban, 
			tinh_trang_lanh_dao_phong);
	login.NavigateToDanhSachVanBanDiChoPheDuyet();
	danhSachVBDiChoPheDuyet.ValidateVBDiChoPheDuyet(
			trich_yeu, 
			loai_van_ban, 
			lanh_dao_phong_ban, 
			tinh_trang_lanh_dao_phong);
	login.signOut();
	login.NavigateToSite();
	login.LoginTruongPhongPheDuyetVbDuThao();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThao(trich_yeu, nguoi_tao);
	danhSachViecCanXuLy.ClickOnFirstItem();
	login.LogReport();
	formVanBanDuThao.DongY(y_kien_phe_duyet_vb_du_thao);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTgd();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThao(trich_yeu, lanh_dao_phong_ban);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formVanBanDuThao.BoSungThongTin(nguoi_tao);
	danhSachViecCanXuLy.ValidateHoanTatTaskPheDuyetVbDuThao(trich_yeu);
	login.signOut();
	login.LoginNhanVienKhoiTao();
	danhSachViecCanXuLy.ValidateTaskBoSungThongTin(trich_yeu, lanh_dao_duyet_vb);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formVanBanDuThao.GuiPheDuyetLai();
	login.NavigateToDanhSachVBDuThaoChoPheDuyet();
	danhSachVBDuThaoChoPheDuyet.ValidateVBChoPheDuyet(
			trich_yeu, 
			loai_van_ban, 
			lanh_dao_bgd_dang_xu_ly,
			tinh_trang_bgd);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTgd();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThao(trich_yeu, nguoi_tao);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formVanBanDuThao.ValidatePermissionPheDuyet();
	driver.quit();
	} 
}
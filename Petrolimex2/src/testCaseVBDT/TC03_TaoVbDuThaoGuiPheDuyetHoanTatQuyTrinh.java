package testCaseVBDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBDiChoPheDuyet;
import pages.DanhSachVBDiDaPheDuyet;
import pages.DanhSachVBDuThaoChoPheDuyet;
import pages.DanhSachVBDuThaoDaPheDuyet;
import pages.DanhSachViecCanXuLy;
import pages.FormVanBanDuThao;
import pages.Login;
import pages.ThemMoiVanBanDuThao;
import pages.ThuocTinhVBDuThao;

public class TC03_TaoVbDuThaoGuiPheDuyetHoanTatQuyTrinh extends ThuocTinhVBDuThao {
	WebDriver driver;
// Format Simple Date
	String trich_yeu = "[2808][VTTest] TC 03 - Tạo Văn bản dự thảo gửi phê duyệt Hoàn tất quy trình " + System.currentTimeMillis();
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
	DanhSachVBDiChoPheDuyet danhSachVBDiChoPheDuyet = new DanhSachVBDiChoPheDuyet(driver);
	DanhSachVBDiDaPheDuyet danhSachVBDiDaPheDuyet = new DanhSachVBDiDaPheDuyet(driver);
	DanhSachVBDuThaoDaPheDuyet danhSachVBDuThaoDaPheDuyet = new DanhSachVBDuThaoDaPheDuyet(driver);
	login.NavigateToSite();
	login.LoginNhanVienKhoiTao();
	login.NavigateToTrangChuVB();
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
	login.NavigateToDanhSachVanBanDiChoPheDuyet();
	danhSachVBDiChoPheDuyet.ValidateVBDiChoPheDuyet(
			trich_yeu, 
			loai_van_ban, 
			lanh_dao_bgd_dang_xu_ly, 
			tinh_trang_bgd);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTgd();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThao(trich_yeu, lanh_dao_phong_ban);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formVanBanDuThao.PheDuyet(y_kien_phe_duyet_vb_du_thao);
	login.NavigateToDanhSachVanBanDiDaPheDuyet();
	danhSachVBDiDaPheDuyet.ValidateVBDiDaPheDuyet(trich_yeu, loai_van_ban, ngay_phe_duyet, "Chờ phát hành");
	login.signOut();
	login.NavigateToSite();
	login.LoginNhanVienKhoiTao();
	login.NavigateToDanhSachVbDuThaoDaPheDuyet();
	danhSachVBDuThaoDaPheDuyet.ValidateVBDuThaoDaPheDuyet(trich_yeu, loai_van_ban, ngay_phe_duyet, "Chờ phát hành");
	driver.quit();
	} 
}
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

public class TC14_KyThuaLenh_NguoiSoanKhongCoWorkerName extends ThuocTinhVBDuThao {
	WebDriver driver;
// Format Simple Date
	String trich_yeu = "[VTTest] TC 14 - Ký thừa lệnh - Người soạn Không có WorkerName" + System.currentTimeMillis();
@Test
public void KyThuaLenh_NguoiSoanCoWorkerName() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDuThao themMoiVanBanDuThao = new ThemMoiVanBanDuThao(driver);
	DanhSachVBDuThaoDangSoan danhSachVBDuThaoDangSoan = new DanhSachVBDuThaoDangSoan(driver);
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
	themMoiVanBanDuThao.ChonKyThuaLenh();
	themMoiVanBanDuThao.submitForm();
	formVanBanDuThao.uploadFile(file_word_ky_so_1_chu_ky);
	formVanBanDuThao.uploadFile(file_excel_ky_so);
	formVanBanDuThao.uploadFile(file_pdf_ky_so);
	formVanBanDuThao.GuiPheDuyetVbThuaLenh(
			lanh_dao_phong_ban,
			y_kien_nguoi_gui);
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
	login.LoginUserVanThu();
	danhSachViecCanXuLy.ValidateTaskPhatHanhVBDuThaoDaPheDuyet(trich_yeu, lanh_dao_phong_ban);
	danhSachViecCanXuLy.ClickOnFirstItem();
//	formPhatHanhVb.PhatHanh();
//	login.NavigateToTrangChuVB();
//	danhSachViecCanXuLy.ValidateHoanTatPhatHanhVBDuThaoDaPheDuyet(trich_yeu);
	driver.quit();
	} 
}
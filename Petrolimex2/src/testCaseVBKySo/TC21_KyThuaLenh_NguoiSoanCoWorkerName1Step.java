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

public class TC21_KyThuaLenh_NguoiSoanCoWorkerName1Step extends ThuocTinhVBDuThao {
	WebDriver driver;
// Format Simple Date
	String trich_yeu = "[VTTest] TC 13 - Ký thừa lệnh - Người soạn có WorkerName - Quy trình 1 Step duyệt " + System.currentTimeMillis();
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
	login.LoginTruongPhongPheDuyetVbDuThao();
	login.NavigateToTrangChuVB();
	login.NavigateToThemMoiVbKySo();
	themMoiVanBanDuThao.inputVanBanDuThao(
			trich_yeu,
			loai_van_ban);
	themMoiVanBanDuThao.ChonKyThuaLenh();
	themMoiVanBanDuThao.submitForm();
	login.LogReport();
	formVanBanDuThao.uploadFile(file_word_ky_so_1_chu_ky);
	formVanBanDuThao.uploadFile(file_excel_ky_so);
	formVanBanDuThao.uploadFile(file_pdf_ky_so);
	formVanBanDuThao.GuiPheDuyetVbThuaLenh1Step(y_kien_nguoi_gui);
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
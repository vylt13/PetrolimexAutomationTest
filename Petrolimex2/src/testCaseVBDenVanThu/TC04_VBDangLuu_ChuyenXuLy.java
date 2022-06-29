package testCaseVBDenVanThu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachVBDangLuu;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;


public class TC04_VBDangLuu_ChuyenXuLy extends ThuocTinhVBDen {
	WebDriver driver;
	String trich_yeu = "TC 04 - VB đến đang lưu - Kiểm tra Chuyển xử lý VB đến Đang lưu được tạo lúc: " + createdTime;
@Test
public void VBDangLuuChuyenXuLy() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBDangLuu danhSachVBDangLuu = new DanhSachVBDangLuu(driver);
	DanhSachVBChoYKienLanhDao danhSachVBChoYkien = new DanhSachVBChoYKienLanhDao(driver);
	login.NavigateToSite();
	login.LoginUserVanThu();
	login.NavigateToNewInDocumentForm();
	iputVanBanDen.inputVanBanDen(
			so_van_ban, 
			trich_yeu,
			loai_van_ban,
			co_quan_gui,
			linh_vuc,
			ngay_den,
			ngay_tren_vb,
			do_khan,
			do_mat,
			so_ban,
			so_trang,
			chon_lanh_dao_luu_vb_den);
	iputVanBanDen.uploadFile(filePath);
	iputVanBanDen.waitingForValidate();
	iputVanBanDen.luuNhap();
	iputVanBanDen.waitingForLoading();
	login.NavigateToDanhSachVBDangLuu();
	danhSachVBDangLuu.ClickOnFirstItem();
	String formUrl = driver.getCurrentUrl();
	iputVanBanDen.waitingForLoading();
	iputVanBanDen.chuyenXuLy();
	iputVanBanDen.waitingForLoading();
	login.NavigatToVBChoYKienLanhDao();
	danhSachVBChoYkien.ValidateVBChoYKienCoDinhKem(
			trich_yeu,
			ngay_tren_vb, 
			do_mat,
			do_khan);
	Reporter.log(formUrl);
	driver.quit();
	} 
}
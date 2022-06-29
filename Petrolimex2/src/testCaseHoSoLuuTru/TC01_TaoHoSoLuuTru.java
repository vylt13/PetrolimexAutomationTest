package testCaseHoSoLuuTru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.FormHSLuuTru;
import pages.FormThemMoiHSLuuTru;
import pages.Login;
import pages.ThuocTinhHoSoTaiLieu;

public class TC01_TaoHoSoLuuTru extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String noi_dung_hop_dong = "Hợp đồng Luồng Ký số Bình thường Tạo ngày: " + createdTime;
	String noi_dung_hop_dong_edit = "Hợp đồng Luồng Ký số Bình thường Edit Tạo ngày: " + createdTime;
@Test
public void TaoHoSoLuuTru() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormThemMoiHSLuuTru formThemMoiHSLuuTru = new FormThemMoiHSLuuTru(driver);
	FormHSLuuTru formHSLuuTru = new FormHSLuuTru(driver);
	login.NavigateToSite();
	login.LoginNhanVienKhoiTao();
	login.NavigateToFormThemMoiHSLuuTru();
	formThemMoiHSLuuTru.inputHoSoLuuTru();
//	formHSLuuTru.validateHSLT();
	formHSLuuTru.ThemVanBanDen();
	formHSLuuTru.BoChonVanBanDen();
	formHSLuuTru.ThemVanBanDen();
	formHSLuuTru.XoaVanBanDaThem();
	formHSLuuTru.ThemVanBanBanHanh();
	formHSLuuTru.BoChonVanBanBanHanh();
	formHSLuuTru.ThemVanBanBanHanh();
	formHSLuuTru.XoaVanBanDaThem();
	formHSLuuTru.ThemHoSoTaiLieu();
	formHSLuuTru.BoChonHoSoTaiLieu();
	formHSLuuTru.ThemHoSoTaiLieu();
	formHSLuuTru.XoaVanBanDaThem();
	formHSLuuTru.UploadFile();
	driver.quit();
	} 
}
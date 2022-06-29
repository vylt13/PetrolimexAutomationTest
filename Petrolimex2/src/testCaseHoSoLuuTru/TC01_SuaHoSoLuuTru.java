package testCaseHoSoLuuTru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachHoSoLuuTru;
import pages.FormHSLuuTru;
import pages.FormThemMoiHSLuuTru;
import pages.Login;
import pages.ThuocTinhHoSoTaiLieu;

public class TC01_SuaHoSoLuuTru extends ThuocTinhHoSoTaiLieu{
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
	DanhSachHoSoLuuTru danhSachHoSoLuuTru = new DanhSachHoSoLuuTru(driver);
	login.NavigateToSite();
	login.LoginNhanVienKhoiTao();
	login.NavigateToFormThemMoiHSLuuTru();
	formThemMoiHSLuuTru.inputHoSoLuuTru();
//	formHSLuuTru.validateHSLT();
	String formUrl = driver.getCurrentUrl();
	String ma_ho_so = formHSLuuTru.LayMaHoSo();
	String ten_ho_so = formHSLuuTru.LayTenHoSo();
	formHSLuuTru.SuaHoSo();
	formThemMoiHSLuuTru.EditHoSoLuuTru();
	String ma_ho_so_edit = formHSLuuTru.LayMaHoSo();
	String ten_ho_so_edit = formHSLuuTru.LayTenHoSo();
	login.NavigateToTrangChuVB();
	login.NavigateToDanhSachHSLuuTru();
	danhSachHoSoLuuTru.TimHoSoDaXoa(ma_ho_so, ten_ho_so);
	login.NavigateToTrangChuVB();
	login.NavigateToDanhSachHSLuuTru();
	danhSachHoSoLuuTru.TimHoSoTheoMa(ma_ho_so_edit, ten_ho_so_edit);
	driver.get(formUrl);
	formHSLuuTru.XoaHoSo();
	driver.quit();
	} 
}
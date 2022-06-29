package testCaseVBDenVanThu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.DanhSachVBDangLuu;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC03_VBDangLuuCoDinhKem_XoaFileDinhKem extends ThuocTinhVBDen {
	WebDriver driver;
	String trich_yeu = "TC 03 - VB đến đang lưu - Kiểm tra xóa file đính kèm trên VB đang lưu: " + createdTime;
@Test
public void VBDangLuuXoaFileDinhKem() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBDangLuu danhSachVBDangLuu = new DanhSachVBDangLuu(driver);
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
	danhSachVBDangLuu.ValidateVBDangLuuCoDinhKem(
			trich_yeu,
			ngay_tren_vb, 
			do_khan);
	danhSachVBDangLuu.ClickOnFirstItem();
	String formUrl = driver.getCurrentUrl();
	iputVanBanDen.ValidateFormEditCoDinhKem(
			loai_van_ban,
			trich_yeu, 
			co_quan_gui, 
			linh_vuc, 
			ngay_den, 
			ngay_tren_vb, 
			do_khan, 
			do_mat, 
			so_ban, 
			so_trang,
			file_name);
	iputVanBanDen.XoaFileDinhKem();
	iputVanBanDen.waitingForLoading();
	iputVanBanDen.Thoat();
	danhSachVBDangLuu.ValidateVBDangLuuKhongDinhKem(
			trich_yeu,
			ngay_tren_vb,
			do_khan);
	danhSachVBDangLuu.ClickOnFirstItem();
	iputVanBanDen.ValidateFormEditKhongDinhKem(
			loai_van_ban,
			trich_yeu,
			co_quan_gui, 
			linh_vuc, 
			ngay_den, 
			ngay_tren_vb, 
			do_khan, 
			do_mat, 
			so_ban, 
			so_trang);
	Reporter.log(formUrl);
	driver.quit();
	} 
}
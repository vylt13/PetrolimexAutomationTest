package testCaseVBDenVanThu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.DanhSachVBDaGiaiQuyet;
import pages.DanhSachVBDangLuu;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC08_VBDen_VanThuKetThucVB extends ThuocTinhVBDen {
	WebDriver driver;
	String trich_yeu = "TC 08 - VB Đến đang lưu - Văn thư kết thúc Văn bản đến: " + createdTime;
@Test
public void VBDangLuuCoDinhKem() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBDangLuu danhSachVBDangLuu = new DanhSachVBDangLuu(driver);
	DanhSachVBDaGiaiQuyet danhSachVBDaGiaiQuyet = new DanhSachVBDaGiaiQuyet(driver);
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
	iputVanBanDen.ketThuc();
	iputVanBanDen.waitingForLoading();
	login.NavigateToVBDaGiaiQuyet();
	danhSachVBDaGiaiQuyet.ValidateVBDaGiaiQuyet(
			trich_yeu,
			ngay_tren_vb,
			co_quan_gui,
			do_mat);
	Reporter.log(formUrl);
	driver.quit();
	} 
}
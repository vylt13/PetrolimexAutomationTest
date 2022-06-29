package testCaseVBBanHanh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBBanHanhDangLuu;
import pages.FormPhatHanhVb;
import pages.Login;
import pages.ThuocTinhVBBanHanh;

public class TC01_ThemMoiVaLuu extends ThuocTinhVBBanHanh {
	WebDriver driver;
	String trich_yeu = "Thêm mới và Lưu văn bản lúc: " + createdTime ;
	
@Test
public void ThemMoiVaLuu() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormPhatHanhVb formPhatHanhVb = new FormPhatHanhVb(driver);
	DanhSachVBBanHanhDangLuu danhSachVBBanHanhDangLuu = new DanhSachVBBanHanhDangLuu(driver);
	login.NavigateToSite();
	login.LoginUserVanThu();
	login.NavigateToThemMoiVBBanHanh();
	formPhatHanhVb.ThemMoiVbBanHanh(
			loai_van_ban, 
			trich_yeu,
			file01,
			file02,
			nguoi_nhan_vb,
			group_nhan_vb,
			linh_vuc,
			ngay_hieu_luc,
			do_khan,
			do_mat,
			so_ban,
			so_trang,
			nguoi_soan_thao);	
	formPhatHanhVb.ChonDonViPhatHanh();
	formPhatHanhVb.Luu();
	login.NavigateToDanhSachVbBanHanhDangLuu();
	danhSachVBBanHanhDangLuu.ValidateVBBanHanhDangLuu(
			trich_yeu,
			ngay_ban_hanh,
			nguoi_ky_vb, 
			do_mat);
	danhSachVBBanHanhDangLuu.ClickOnFirstItem();
	formPhatHanhVb.ValidateVbBanHanhDangLuu(
			loai_van_ban, 
			trich_yeu, 
			linh_vuc, 
			ngay_hieu_luc, 
			do_khan, 
			do_mat, 
			so_ban, 
			so_trang, 
			optionNguoiKyVB, 
			chuc_vu_nguoi_ky);
	formPhatHanhVb.XoaFileDinhKem();
	formPhatHanhVb.Luu();
	driver.quit();
	} 
}
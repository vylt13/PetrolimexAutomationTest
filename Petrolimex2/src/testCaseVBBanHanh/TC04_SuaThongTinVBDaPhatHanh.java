package testCaseVBBanHanh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBBanHanhDaPhatHanh;
import pages.DanhSachViecCanXuLy;
import pages.FormPhatHanhVb;
import pages.Login;
import pages.ThuocTinhVBBanHanh;

public class TC04_SuaThongTinVBDaPhatHanh extends ThuocTinhVBBanHanh {
	WebDriver driver;
	String trich_yeu = "Thông tin VB đã Phát hành văn bản lúc: " + createdTime ;
	String trich_yeu_edit = "Thông tin VB đã Phát hành văn bản được chỉnh sửa lúc:" + createdTime;
@Test
public void SuaThongTinVBDaPhatHanh() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormPhatHanhVb formPhatHanhVb = new FormPhatHanhVb(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBBanHanhDaPhatHanh danhSachVBBanHanhDaPhatHanh = new DanhSachVBBanHanhDaPhatHanh(driver);
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
			nguoi_ky_vb,
			nguoi_soan_thao);	
	formPhatHanhVb.PhatHanh();
	login.signOut();
	login.NavigateToSite();
	login.LoginUserNhanVanBanBanHanh();
	danhSachViecCanXuLy.ValidateTaskNhanVanBanDiDeBiet(trich_yeu, van_thu);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formPhatHanhVb.ValidateQuyenXem(trich_yeu);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskNhanVanBanDiDeBiet(trich_yeu);
	login.NavigateToVanBanDaPhatHanh();
	danhSachVBBanHanhDaPhatHanh.ClickOnFirstItem();
	formPhatHanhVb.ValidateQuyenXem(trich_yeu);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserVanThu();
	login.NavigateToVanBanDaPhatHanh();
	danhSachVBBanHanhDaPhatHanh.ClickOnFirstItem();
	formPhatHanhVb.ChinhSuaVbBanHanh(
			trich_yeu_edit,
			file03, 
			fileName03);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserNhanVanBanBanHanh();
	login.NavigateToVanBanDaPhatHanh();
	danhSachVBBanHanhDaPhatHanh.ValidateVBBanHanhDaPhatHanh(
			trich_yeu_edit, 
			ngay_ban_hanh,
			nguoi_ky_vb, 
			do_mat);
	danhSachVBBanHanhDaPhatHanh.ClickOnFirstItem();
	formPhatHanhVb.ValidateQuyenXem(trich_yeu_edit);
	driver.quit();
	} 
}
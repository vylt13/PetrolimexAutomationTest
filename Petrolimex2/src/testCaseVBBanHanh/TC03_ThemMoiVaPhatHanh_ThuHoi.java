package testCaseVBBanHanh;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBBanHanhDaPhatHanh;
import pages.DanhSachVBDenQuaMangDonVi;
import pages.DanhSachVBDenQuaMangTapDoan;
import pages.DanhSachViecCanXuLy;
import pages.FormPhatHanhVb;
import pages.Login;
import pages.ThuocTinhVBBanHanh;

public class TC03_ThemMoiVaPhatHanh_ThuHoi extends ThuocTinhVBBanHanh {
	WebDriver driver;
	String trich_yeu = "Thêm mới và Phát hành văn bản, sau đó thu hồi lúc: " + createdTime ;
@Test
public void ThemMoiVaPhatHanh_ThuHoi() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormPhatHanhVb formPhatHanhVb = new FormPhatHanhVb(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBBanHanhDaPhatHanh danhSachVBBanHanhDaPhatHanh = new DanhSachVBBanHanhDaPhatHanh(driver);
	DanhSachVBDenQuaMangTapDoan danhSachVBDenQuaMangTapDoan = new DanhSachVBDenQuaMangTapDoan(driver);
	DanhSachVBDenQuaMangDonVi danhSachVBDenQuaMangDonVi = new DanhSachVBDenQuaMangDonVi(driver);
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
	formPhatHanhVb.PhatHanh();
	login.signOut();
	login.NavigateToSite();
	login.LoginUserNhanVanBanBanHanh();
	danhSachViecCanXuLy.ValidateTaskNhanVanBanDiDeBiet(trich_yeu, van_thu);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formPhatHanhVb.ValidateQuyenXem(trich_yeu);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskNhanVanBanDiDeBiet(trich_yeu);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTrongGroupNhanVBBanHanh();
	danhSachViecCanXuLy.ValidateTaskNhanVanBanDiDeBiet(trich_yeu, van_thu);
	danhSachViecCanXuLy.ClickOnFirstItem();
	String formUrl = driver.getCurrentUrl();
	formPhatHanhVb.ValidateQuyenXem(trich_yeu);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskNhanVanBanDiDeBiet(trich_yeu);
	login.signOut();
	TimeUnit.MINUTES.sleep(5);
	login.NavigateToSiteTD();
	login.LoginVanThuTD();
	login.NavigateToVanBanDenQuaMangTapDoan();
	danhSachVBDenQuaMangTapDoan.ValidateVBDenQuaMang(trich_yeu, ngay_ban_hanh, do_mat);
	danhSachVBDenQuaMangTapDoan.ClickOnFirstItem();
	login.signOut();
	login.NavigateToSiteTD();
	login.LoginVanThuPlxBn();
	login.NavigateToVanBanDenQuaMangPlxbn();
	danhSachVBDenQuaMangDonVi.ValidateVBDenQuaMang(trich_yeu, ngay_ban_hanh, do_mat);
	danhSachVBDenQuaMangDonVi.ClickOnFirstItem();
	login.signOut();
	login.NavigateToSite();
	login.LoginUserVanThu();
	login.NavigateToVanBanDaPhatHanh();
	danhSachVBBanHanhDaPhatHanh.ClickOnFirstItem();
	formPhatHanhVb.ThuHoiVanBanBanHanh();
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTrongGroupNhanVBBanHanh();
	login.NavigateToVanBanDaPhatHanh();
	danhSachVBBanHanhDaPhatHanh.ValidateVanBanDaThuHoi(trich_yeu);
	driver.get(formUrl);
	assertEquals(driver.getTitle(), "Trang chủ - Văn bản");
	login.signOut();
	TimeUnit.MINUTES.sleep(5);
	login.NavigateToSiteTD();
	login.LoginVanThuTD();
	login.NavigateToVanBanDenQuaMangTapDoan();
	danhSachVBDenQuaMangTapDoan.ValidateVanBanDaThuHoi(trich_yeu);
	driver.quit();
	} 
}
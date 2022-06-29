package testCaseVBBanHanh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBBanHanhDaPhatHanh;
import pages.DanhSachVBDenQuaMangDonVi;
import pages.DanhSachVBDenQuaMangTapDoan;
import pages.DanhSachViecCanXuLy;
import pages.DanhSachViecCanXuLyB12;
import pages.DanhSachViecCanXuLyPlxbn;
import pages.FormPhatHanhVb;
import pages.Login;
import pages.ThuocTinhVBBanHanh;

public class TC02_ThemMoiVaPhatHanhVb extends ThuocTinhVBBanHanh {
	WebDriver driver;
	String trich_yeu = "[VTTest]-Thêm mới và Phát hành văn bản lúc: " + createdTime ;
@Test
public void ThemMoiVaPhatHanhVb() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormPhatHanhVb formPhatHanhVb = new FormPhatHanhVb(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDenQuaMangTapDoan danhSachVBDenQuaMangTapDoan = new DanhSachVBDenQuaMangTapDoan(driver);
	DanhSachVBDenQuaMangDonVi danhSachVBDenQuaMangDonVi = new DanhSachVBDenQuaMangDonVi(driver);
	DanhSachVBBanHanhDaPhatHanh danhSachVBBanHanhDaPhatHanh = new DanhSachVBBanHanhDaPhatHanh(driver);
	DanhSachViecCanXuLyPlxbn danhSachViecCanXuLyPlxbn = new DanhSachViecCanXuLyPlxbn(driver);
	DanhSachViecCanXuLyB12 danhSachViecCanXuLyB12 = new DanhSachViecCanXuLyB12(driver);
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
	login.LoginUserTrongGroupNhanVBBanHanh();
	danhSachViecCanXuLy.ValidateTaskNhanVanBanDiDeBiet(trich_yeu, van_thu);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formPhatHanhVb.ValidateQuyenXem(trich_yeu);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskNhanVanBanDiDeBiet(trich_yeu);
	login.NavigateToVanBanDaPhatHanh();
	danhSachVBBanHanhDaPhatHanh.ClickOnFirstItem();
	formPhatHanhVb.ValidateQuyenXem(trich_yeu);
	login.signOut();
	TimeUnit.MINUTES.sleep(5);
	login.NavigateToSiteTD();
	login.LoginVanThuB12();
	danhSachViecCanXuLyPlxbn.ValidateTaskNhanVanBanDenQuaMang(trich_yeu, cong_ty_phat_hanh_vb);
	login.signOut();
	driver.quit();
	} 
}
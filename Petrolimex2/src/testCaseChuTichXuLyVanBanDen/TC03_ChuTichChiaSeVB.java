package testCaseChuTichXuLyVanBanDen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachViecCanXuLy;
import pages.FormXuLyVanBanDen;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC03_ChuTichChiaSeVB extends ThuocTinhVBDen {
	WebDriver driver;
	String trich_yeu = "TC 03 - Chủ tịch - Kiểm tra Chủ tịch Chia sẻ Văn bản được tạo lúc: " + createdTime;
	String y_kien_chia_se = "Ý kiến Chủ tịch Kết thúc VB vào lúc: " + createdTime;
@Test
public void ChuTichChiaSeVB() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBChoYKienLanhDao danhSachVBChoYkien = new DanhSachVBChoYKienLanhDao(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	FormXuLyVanBanDen formXuLyVanBanDen = new FormXuLyVanBanDen(driver);
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
			chon_lanh_dao_trinh_buoc_vthu);
	iputVanBanDen.uploadFile(filePath);
	iputVanBanDen.waitingForValidate();
	iputVanBanDen.chuyenXuLy();
	iputVanBanDen.waitingForLoading();
	login.NavigatToVBChoYKienLanhDao();
	danhSachVBChoYkien.ValidateVBChoYKienCoDinhKem(
			trich_yeu,
			ngay_tren_vb, 
			do_mat,
			do_khan);
	login.signOut();
	driver.manage().deleteAllCookies();
	login.NavigateToSite();
	login.LoginUserChuTich();
	danhSachViecCanXuLy.ValidateTaskChoYKienVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	login.LogReport();
	formXuLyVanBanDen.waitingForLoading();
	formXuLyVanBanDen.chiaSeVB(
			nguoi_duoc_chia_se_vb_den,
			y_kien_chia_se);
	formXuLyVanBanDen.waitingForLoading();
	login.signOut();
	driver.manage().deleteAllCookies();
	login.NavigateToSite();
	login.LoginUserDuocChiaSeVBDen();
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateTaskVBDuocChiaSe(
			trich_yeu, 
			account_lanh_dao_chu_tich);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.Thoat();
	danhSachViecCanXuLy.ValidateHoanTatTaskChiaSe(trich_yeu);
	driver.quit();
	} 
}
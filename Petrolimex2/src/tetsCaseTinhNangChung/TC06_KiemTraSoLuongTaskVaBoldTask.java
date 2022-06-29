package tetsCaseTinhNangChung;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachVBDenTatCa;
import pages.DanhSachViecCanXuLy;
import pages.FormXuLyVanBanDen;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC06_KiemTraSoLuongTaskVaBoldTask extends ThuocTinhVBDen{
	WebDriver driver;
	String trich_yeu = "Kiểm tra số lượng Task và Bold Task: " + createdTime;
	String y_kien_chia_se = "TGD chia sẻ Văn bản đến lúc" + createdTime;
@Test
public void TGDChiaSeVB() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBChoYKienLanhDao danhSachVBChoYkien = new DanhSachVBChoYKienLanhDao(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDenTatCa danhSachVBDenTatCa = new DanhSachVBDenTatCa(driver);
	FormXuLyVanBanDen formXuLyVanBanDen = new FormXuLyVanBanDen(driver);
	login.NavigateToSite();
	login.LoginUserChuTich();
	int so_luong_task_truoc = login.KiemTraSoLuongTak();
	login.signOut();
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
	login.signOut();
	login.NavigateToSite();
	login.LoginUserChuTich();
	int so_luong_task_sau = login.KiemTraSoLuongTak();
	login.ValidatePhatSinhTask(so_luong_task_truoc, so_luong_task_sau);
	danhSachViecCanXuLy.ValidateTaskChuaXem();
	danhSachViecCanXuLy.ValidateTaskChoYKienVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	formXuLyVanBanDen.chiaSeVB(
			nguoi_duoc_chia_se_vb_den,
			y_kien_chia_se);
	formXuLyVanBanDen.waitingForLoading();
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateTaskDaXem();
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.ketThucVBDen();
	int so_luong_task_sau_hoan_tat = login.KiemTraSoLuongTak();
	login.ValidateHoanTatTask(so_luong_task_sau, so_luong_task_sau_hoan_tat);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserDuocChiaSeVBDen();
	danhSachViecCanXuLy.ValidateTaskVBDuocChiaSe(
			trich_yeu, 
			account_lanh_dao_chu_tich);
	danhSachViecCanXuLy.ValidateTaskChuaXem();
	danhSachViecCanXuLy.ClickOnFirstItem();
	login.LogReport();
	formXuLyVanBanDen.Thoat();
	danhSachViecCanXuLy.ValidateHoanTatTaskChiaSe(trich_yeu);
	driver.quit();
	} 
}
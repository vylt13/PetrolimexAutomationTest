package testCaseChuTichXuLyVanBanDen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachVBDangGiaiQuyet;
import pages.DanhSachVBDenTatCa;
import pages.DanhSachViecCanXuLy;
import pages.FormXuLyVanBanDen;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC05_ChuTich_PhanCongLaiDepartment extends ThuocTinhVBDen {
	WebDriver driver;
	String trich_yeu = "TC 05 - Chủ tịch - Kiểm tra Chủ tịch Phân công Lại Department thự hiện VB: " + createdTime;
	String y_kien_lanh_dao = "Ý kiến Chủ tịch Phân côgn thực hiện VB vào lúc: " + createdTime;
@Test
public void ChuTichPhanCongThucHien() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBChoYKienLanhDao danhSachVBChoYkien = new DanhSachVBChoYKienLanhDao(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDangGiaiQuyet danhSachVBDangGiaiQuyet = new DanhSachVBDangGiaiQuyet(driver);
	DanhSachVBDenTatCa danhSachVBDenTatCa = new DanhSachVBDenTatCa(driver);
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
	formXuLyVanBanDen.ChonCboxPhanCong();
	formXuLyVanBanDen.CheckPhanCongAll();
	formXuLyVanBanDen.PhanCongVanBan();
	formXuLyVanBanDen.waitingForLoading();
	login.NavigateToVBDangGiaiQuyet();
	danhSachVBDangGiaiQuyet.ValidateVBDangGiaiQuyet(
			trich_yeu,
			ngay_tren_vb, 
			do_khan, 
			co_quan_gui);
	danhSachVBDangGiaiQuyet.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	formXuLyVanBanDen.ValidateTatCaDonViToChucThucHien(
			account_lanh_dao_chu_tich);
	login.NavigateToTatCaVBDen();
	danhSachVBDenTatCa.TimKiemVb(trich_yeu);
	danhSachVBDenTatCa.ValidateTinhTrangChuyenDonVi(
			trich_yeu, 
			tat_ca_don_vi_xu_ly,
			co_quan_gui);
	driver.quit();
	} 
}
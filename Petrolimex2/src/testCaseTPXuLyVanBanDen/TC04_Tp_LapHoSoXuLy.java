package testCaseTPXuLyVanBanDen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachVBDangGiaiQuyet;
import pages.DanhSachVBDenTatCa;
import pages.DanhSachViecCanXuLy;
import pages.FormTaskVanBanDen;
import pages.FormXuLyVanBanDen;
import pages.HoSoXuLy;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC04_Tp_LapHoSoXuLy extends ThuocTinhVBDen {
	WebDriver driver;
	String trich_yeu = "[VTTest]- Trưởng phòng - Kiểm tra Trưởng phòng lập HSXL được tạo lúc: " + createdTime;
	String y_kien_lanh_dao = "Lãnh đạo Phân công VB vào lúc: " + createdTime;
@Test
public void LapHoSoXuLy() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBChoYKienLanhDao danhSachVBChoYkien = new DanhSachVBChoYKienLanhDao(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDangGiaiQuyet danhSachVBDangGiaiQuyet = new DanhSachVBDangGiaiQuyet(driver);
	FormTaskVanBanDen formTaskVanBanDen = new FormTaskVanBanDen(driver);
	DanhSachVBDenTatCa danhSachVBDenTatCa = new DanhSachVBDenTatCa(driver);
	FormXuLyVanBanDen formXuLyVanBanDen = new FormXuLyVanBanDen(driver);
	HoSoXuLy hoSoXuLy = new HoSoXuLy(driver);
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
	
	login.signOut();
	login.LoginUserChuTich();
	danhSachViecCanXuLy.ValidateTaskChoYKienVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	formXuLyVanBanDen.CheckPhanCongPB();
	formXuLyVanBanDen.PhanCongVanBan();
	formXuLyVanBanDen.waitingForLoading();
	login.signOut();
	login.LoginTphongThucHien();
	danhSachViecCanXuLy.ClickOnFirstItem();
	formTaskVanBanDen.CheckPhanCong();
	formTaskVanBanDen.LapHoSoXuLy();
	formTaskVanBanDen.waitingForLoading();
	formTaskVanBanDen.MoPhieuGiaiQuyet();
	formXuLyVanBanDen.ValidateLinkHoSoXuLy();
	formXuLyVanBanDen.MoHSXL();
	hoSoXuLy.uploadFile(filePath,file_name_xl);
	hoSoXuLy.dongHoSo();
	login.LogReport();
	//driver.quit();
	} 
}
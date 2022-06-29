package testCaseTPXuLyVanBanDen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachVBDangGiaiQuyet;
import pages.DanhSachVBDenTatCa;
import pages.DanhSachViecCanXuLy;
import pages.FormTaskVanBanDen;
import pages.FormXuLyVanBanDen;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC05_Tp_PhanCongVanBan extends ThuocTinhVBDen {
	WebDriver driver;
	String trich_yeu = "[VTTest]- Trưởng phòng - Kiểm tra Tp Phân công tiếp VB được tạo lúc: " + createdTime;
	String y_kien_lanh_dao = "Tổng giám đốc Phân công VB vào lúc: " + createdTime;
	String y_kien_nguoi_nhan = "Trưởng phòng phân công Văn bản";@Test
public void PhanCongVanBan() throws InterruptedException {
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
	//lanh dao
	login.LoginUserChuTich();
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	formXuLyVanBanDen.inputYKienLanhDao(y_kien_lanh_dao);
	formXuLyVanBanDen.CheckPhanCongPB();
	formXuLyVanBanDen.PhanCongVanBan();
	formXuLyVanBanDen.waitingForLoading();
	login.signOut();
	//tphong
	login.LoginTphongThucHien();
	danhSachViecCanXuLy.ValidateTaskThucHienVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formTaskVanBanDen.CheckAllNhanVien();
	formTaskVanBanDen.CheckNVPhoiHop();
	formTaskVanBanDen.PhanCong(y_kien_nguoi_nhan);
	formTaskVanBanDen.waitingForLoading();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='form-ds VBDeBietTop']//div[2]//tr[2]//td[1]")).click();
	login.signOut();
	
	login.LoginNvienThucHien();
	danhSachViecCanXuLy.ValidateTaskXuLyVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	login.LogReport();
	formTaskVanBanDen.waitingForLoading();
	driver.quit();
	} 
}
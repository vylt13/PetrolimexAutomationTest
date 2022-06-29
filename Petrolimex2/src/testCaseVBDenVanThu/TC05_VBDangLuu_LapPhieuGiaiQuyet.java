package testCaseVBDenVanThu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.DanhSachVBDangGiaiQuyet;
import pages.DanhSachVBDangLuu;
import pages.FormXuLyVanBanDen;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;


public class TC05_VBDangLuu_LapPhieuGiaiQuyet extends ThuocTinhVBDen {
	WebDriver driver;
	String trich_yeu = "TC 04 - VB đến đang lưu - Kiểm tra Chuyển xử lý VB đến Đang lưu được tạo lúc: " + createdTime;
	String y_kien_lanh_dao = "Văn thư Nhập ý kiến trước khi Lập phiếu giải quyết vào lúc: " + createdTime;
@Test
public void VBDangLuuLapPhieuGiaiQuyet() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBDangLuu danhSachVBDangLuu = new DanhSachVBDangLuu(driver);
	FormXuLyVanBanDen xuLyVanBanDen = new FormXuLyVanBanDen(driver);
	DanhSachVBDangGiaiQuyet danhSachVBDangGiaiQuyet = new DanhSachVBDangGiaiQuyet(driver);
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
	danhSachVBDangLuu.ClickOnFirstItem();
	String formUrl = driver.getCurrentUrl();
	iputVanBanDen.waitingForLoading();
	iputVanBanDen.ChonLanhDao(chon_lanh_dao_luu_vb_den);
	iputVanBanDen.LapPhieuGiaiQuyet();
	iputVanBanDen.waitingForLoading();
	xuLyVanBanDen.inputYKienLanhDao(y_kien_lanh_dao);
	xuLyVanBanDen.VanThuPhanCong();
	xuLyVanBanDen.waitingForLoading();
	login.NavigateToVBDangGiaiQuyet();
	danhSachVBDangGiaiQuyet.ValidateVBDangGiaiQuyet(
			trich_yeu,
			ngay_tren_vb,
			do_khan,
			co_quan_gui);
	Reporter.log(formUrl);
	driver.quit();
	} 
}
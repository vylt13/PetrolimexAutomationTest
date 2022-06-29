package testCaseTGDXuLyVanBanDen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial;
import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachVBDenTatCa;
import pages.DanhSachViecCanXuLy;
import pages.FormXuLyVanBanDen;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC05_TGD_TrinhLanhDao extends ThuocTinhVBDen {
	WebDriver driver;
//	String trich_yeu = "TC 05 - TGD- Kiểm tra Tổng giám đốc Trình Lãnh đạo được tạo lúc: " + createdTime;
	//String y_kien_lanh_dao = "Tổng giám đốc Trình Lãnh đạo khác vào lúc: " + createdTime;
@Test
public void TGDTrinhLanhDao() throws InterruptedException {
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
	login.LoginUserVanThu();
	String trich_yeu = "[VTTest]- Lãnh đạo cấp 1 chuyển xử lý cho lãnh đạo cấp 2 lúc " + createdTime; 
	login.NavigateToNewInDocumentForm();
	iputVanBanDen.inputVanBanDen(
			so_van_ban, 
			trich_yeu ,
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
	//dang nhap vao user được trình
	
	login.NavigateToSite();
	login.LoginUserChuTich();
//	danhSachViecCanXuLy.ValidateTaskChoYKienVBDen(
//			trich_yeu, 
//			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	login.LogReport();
	formXuLyVanBanDen.inputYKienLanhDao(y_kien_lanh_dao);
	formXuLyVanBanDen.ChuyenXuLyLanhDaoKhac(lanh_dao_tgd); // chuyen xư ly cho lanh dao khac
	formXuLyVanBanDen.waitingForLoading();	
	login.signOut();
	
// Login vào user được chuyển xử lý 
	
	login.NavigateToSite();
	login.LoginUserTgd();
//	danhSachViecCanXuLy.ValidateTaskChoYKienVBDen(
//			trich_yeu, 
//			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	driver.quit();
	} 
}
package testCaseTPXuLyVanBanDen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachVBDangGiaiQuyet;
import pages.DanhSachVBDenTatCa;
import pages.DanhSachViecCanXuLy;
import pages.FormTaskVanBanDen;
import pages.FormVanBanDuThao;
import pages.FormXuLyVanBanDen;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;
import pages.ThuocTinhVBDuThao;

public class TC03_Tp_LapHoSoDuThao extends ThuocTinhVBDen{
	WebDriver driver;
	String trich_yeu = "[VTTest]-Trưởng phòng - Kiểm tra Trưởng phòng lập HSDT được tạo lúc: " + createdTime;
	String y_kien_lanh_dao = "Lãnh đạo Phân công VB vào lúc: " + createdTime;
	String phong_ban_nguoi_tao_vb_ky_so = "Đơn vị Upgrade";
@Test
public void TpLapHoSoDuThao() throws InterruptedException {
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
	FormVanBanDuThao formVanBanDuThao = new FormVanBanDuThao(driver);
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
	danhSachViecCanXuLy.ClickOnFirstItem();
	formTaskVanBanDen.CheckPhanCong();
	formTaskVanBanDen.LapHoSoDuThao(
			trich_yeu_du_thao_vb,
			filePath);
	formTaskVanBanDen.waitingForLoading();
	formTaskVanBanDen.MoPhieuGiaiQuyet();
	formXuLyVanBanDen.ValidateLinkHoSoDuThao(trich_yeu_du_thao_vb);
	formXuLyVanBanDen.MoHSXL();
	formVanBanDuThao.ValidateTinhTrangSoanThao(
			trich_yeu_du_thao_vb,
			phong_ban_nguoi_tao_vb_ky_so, 
			loai_van_ban_HSDT);
	formVanBanDuThao.SuaFile();
	Thread.sleep(3000);
	driver.navigate().refresh();
	login.LogReport();
//	driver.quit();
	}
}
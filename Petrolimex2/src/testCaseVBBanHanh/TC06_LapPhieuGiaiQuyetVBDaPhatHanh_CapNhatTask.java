package testCaseVBBanHanh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBBanHanhDaPhatHanh;
import pages.DanhSachViecCanXuLy;
import pages.FormPhatHanhVb;
import pages.FormTaskVanDi;
import pages.Login;
import pages.ThuocTinhVBBanHanh;

public class TC06_LapPhieuGiaiQuyetVBDaPhatHanh_CapNhatTask extends ThuocTinhVBBanHanh {
	WebDriver driver;
	String trich_yeu = "Lập Phiếu giải quyết trên VB đã Phát hành, Người nhận cập nhật tình trạng Task, lập HSXL và kết thúc HSXL: " + createdTime ;
@Test
public void LapPhieuGiaiQuyetVBDaPhatHanh() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormPhatHanhVb formPhatHanhVb = new FormPhatHanhVb(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBBanHanhDaPhatHanh danhSachVBBanHanhDaPhatHanh = new DanhSachVBBanHanhDaPhatHanh(driver);
	FormTaskVanDi formTaskVanDi = new FormTaskVanDi(driver);
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
			nguoi_ky_vb,
			nguoi_soan_thao);	
	formPhatHanhVb.PhatHanh();
	login.NavigateToVanBanDaPhatHanh();
	danhSachVBBanHanhDaPhatHanh.ClickOnFirstItem();
	login.LogReport();
	formPhatHanhVb.LapPhieuGiaiQuyet(y_kien_lanh_dao_phan_cong_vb);
	login.signOut();
	login.NavigateToSite();
	login.LoginTphongThucHien();
	danhSachViecCanXuLy.ValidateTaskThucHienVanBanDi(trich_yeu, van_thu);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formTaskVanDi.CheckPhanCong();
	formTaskVanDi.CapNhatTinhTrangDangThucHien(y_kien_nguoi_nhan, tien_do);
	login.NavigateToVanBanDaPhatHanh();
	danhSachVBBanHanhDaPhatHanh.ClickOnFirstItem();
	formPhatHanhVb.ValidateDangThucHienTaskVanBanDi(y_kien_lanh_dao_phan_cong_vb, phong_ban_thuc_hien_vb);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ClickOnFirstItem();
	formTaskVanDi.CheckPhanCong();
	formTaskVanDi.LapHoSoXuLy();
	formTaskVanDi.MoHoSoXuLy();
	formTaskVanDi.DongHoSoXuLy();
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskThucHienVanBanDi(trich_yeu);
	login.NavigateToVanBanDaPhatHanh();
	danhSachVBBanHanhDaPhatHanh.ClickOnFirstItem();
	formPhatHanhVb.ValidateHoanTatTaskThucHienVanBanDi(y_kien_lanh_dao_phan_cong_vb, phong_ban_thuc_hien_vb);
	driver.quit();
	} 
}
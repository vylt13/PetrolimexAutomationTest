package testCaseHSTL;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.*;

public class TC08_ThaoTacXoaDanhMucTrenForm extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String noi_dung_hop_dong = "[VTTest] Thao tác xóa danh mục trên form: " + createdTime;
	String noi_dung_hop_dong_edit = "[VTTest] Hợp đồng Luồng Ký số Bình thường Edit Tạo ngày: " + createdTime;
@Test
public void ThaoTacXoaDanhMucTrenForm() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormThemMoiHSTL formThemMoiHopDong = new FormThemMoiHSTL(driver);
	DanhSachVBDuThaoDangSoan danhSachVBDuThaoDangSoan = new DanhSachVBDuThaoDangSoan(driver);
	FormHoSoTaiLieu formHoSoTaiLieu = new FormHoSoTaiLieu(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDiTatCa danhSachVBDiTatCa = new DanhSachVBDiTatCa(driver);
	login.NavigateToSite();
	login.LoginUserTaoHSTL();
	login.NavigateToFormThemMoiHopDong();
	formThemMoiHopDong.inputHopDong(
			so_hop_dong, 
			noi_dung_hop_dong, 
			ngay_ky, 
			nguoi_ky, 
			ngay_hieu_luc, 
			noi_luu, 
			linh_vuc, 
			ho_so_luu_tru,
			filepathKySo01, 
			y_kien_trinh);
	formThemMoiHopDong.TaoHoSo();
	Thread.sleep(3000);
	login.LogReport();
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(noi_dung_hop_dong, "Hợp đồng", nguoi_tao_hstl);
	danhSachVBDuThaoDangSoan.ClickOnFirstItem();
	login.LogReport();
	formHoSoTaiLieu.ValidateFormHopDongDangLuu(
			noi_dung_hop_dong,
			don_vi_soan_thao, 
			ho_so_luu_tru, 
			ngay_ky, 
			ten_nguoi_ky, 
			ngay_hieu_luc, 
			linh_vuc, 
			so_hop_dong, 
			noi_luu);
	formHoSoTaiLieu.ValidatePermisisonDangLuu();
	formHoSoTaiLieu.SuaThongTinHSTL();
	formThemMoiHopDong.XoaDanhMuc();
	formHoSoTaiLieu.ValidateDanhMucXoa(noi_dung_hop_dong, don_vi_soan_thao, ho_so_luu_tru, ngay_ky, ten_nguoi_ky, ngay_hieu_luc, linh_vuc, so_hop_dong, noi_luu);
	driver.quit();
	} 
}
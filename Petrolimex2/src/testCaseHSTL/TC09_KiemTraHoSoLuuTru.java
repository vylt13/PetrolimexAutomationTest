package testCaseHSTL;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.*;

public class TC09_KiemTraHoSoLuuTru extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String noi_dung_hop_dong = "[VTTest] Kiểm tra lưu trữ HSTL vào hồ sơ Lưu trữ: " + createdTime;
@Test
public void TaoHopDong() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormThemMoiHSTL formThemMoiHopDong = new FormThemMoiHSTL(driver);
	DanhSachVBDuThaoDangSoan danhSachVBDuThaoDangSoan = new DanhSachVBDuThaoDangSoan(driver);
	FormHoSoTaiLieu formHoSoTaiLieu = new FormHoSoTaiLieu(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDiTatCa danhSachVBDiTatCa = new DanhSachVBDiTatCa(driver);
	DanhSachHoSoLuuTru danhSachHoSoLuuTru = new DanhSachHoSoLuuTru(driver);
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
	login.LogReport();
	Thread.sleep(3000);
	login.NavigateToDanhSachHSLuuTru();
	danhSachHoSoLuuTru.TimHoSoTheoTen(ho_so_luu_tru, noi_dung_hop_dong);
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(noi_dung_hop_dong, "Hợp đồng", nguoi_tao_hstl);
	danhSachVBDuThaoDangSoan.ClickOnFirstItem();
	formHoSoTaiLieu.SuaThongTinHSTL();
	formThemMoiHopDong.editHopDong(
			so_hop_dong_edit, 
			noi_dung_hop_dong_edit, 
			ngay_ky_edit, 
			ngay_hieu_luc_edit, 
			noi_luu_edit, 
			linh_vuc_edit, 
			ho_so_luu_tru_edit);
	login.NavigateToDanhSachHSLuuTru();
	danhSachHoSoLuuTru.TimHoSoTheoTen(ho_so_luu_tru_edit, noi_dung_hop_dong_edit);
	login.NavigateToTrangChuVB();
	login.NavigateToDanhSachHSLuuTru();
	danhSachHoSoLuuTru.TimHSTLDaXoaKhoiHSLT(ho_so_luu_tru, noi_dung_hop_dong);
	login.NavigateToTrangChuVB();
	login.NavigateToDanhSachHSLuuTru();
	danhSachHoSoLuuTru.TimHSTLDaXoaKhoiHSLT(ho_so_luu_tru, noi_dung_hop_dong_edit);
	driver.quit();
	} 
}
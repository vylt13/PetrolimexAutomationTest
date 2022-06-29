package testCaseHSTL;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.*;

public class TC24_HoSoTaiLieuKhongKyMoc_2BuocPheDuyetGiongNhau extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String trich_yeu = "[VTTest] Hồ sơ tài liệu không ký mộc - 2 Bước phê duyệt User giống nhau " + createdTime;
@Test
public void HoSoTaiLieuKhongKyMoc2_KeyUser() throws InterruptedException {
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
	login.LoginTphongThucHien();
	login.NavigateToFormThemMoiToTrinh();
	formThemMoiHopDong.inputToTrinh(
			so_van_ban, 
			trich_yeu, 
			ngay_ky, 
			nguoi_ky, 
			noi_luu, 
			ho_so_luu_tru, 
			filepathKySo01, 
			y_kien_trinh);
	formThemMoiHopDong.TaoHoSo();
	Thread.sleep(5000);
	login.LogReport();
	formHoSoTaiLieu.XoaFile();
	driver.navigate().refresh();
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "Không có mục nào");
	formHoSoTaiLieu.uploadFile(file_hstl_2_key_user);
	formHoSoTaiLieu.uploadFile(file_hstl_2_key_stt);
	formHoSoTaiLieu.uploadFile(file_excel_ky_so);
	formHoSoTaiLieu.uploadFile(file_pdf_ky_so);
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "1 - 4 của 4 mục");
	formHoSoTaiLieu.TrinhPheDuyetHopDong(lanh_dao_pb, lanh_dao_bgd);
	login.signOut();
	login.LoginTphongThucHien();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetToTrinh(trich_yeu, lanh_dao_pb);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(trich_yeu);
	login.signOut();
	login.LoginUserTgd();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetToTrinh(trich_yeu, lanh_dao_pb);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.PheDuyet();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(trich_yeu);
	login.NavigateToTrangChuVB();
	login.NavigateToTatCaVBDi();
	danhSachVBDiTatCa.ValidateTinhTrangDaPheDuyet(trich_yeu);
	driver.quit();
	} 
}
package testCaseHSTL;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.*;

public class TC23_HoSoTaiLieuKyMoc_2BuocPheDuyetGiongNhau extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String noi_dung_hop_dong = "[VTTest] Hồ sơ tài liệu ký Mộc - 2 User phê duyệt tại 2 bước giống nhau " + createdTime;
@Test
public void HoSoTaiLieuKyMoc_KeyUser() throws InterruptedException {
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
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(noi_dung_hop_dong, lanh_dao_pb);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(noi_dung_hop_dong);
	login.signOut();
	login.LoginUserTgd();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(noi_dung_hop_dong, lanh_dao_pb);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.PheDuyet();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(noi_dung_hop_dong);
	login.NavigateToTrangChuVB();
	login.NavigateToTatCaVBDi();
	danhSachVBDiTatCa.ValidateTinhTrangDaPheDuyet(noi_dung_hop_dong);
	driver.quit();
	} 
}
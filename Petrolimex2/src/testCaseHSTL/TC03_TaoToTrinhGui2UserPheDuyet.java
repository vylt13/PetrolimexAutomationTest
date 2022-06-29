package testCaseHSTL;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.*;

public class TC03_TaoToTrinhGui2UserPheDuyet extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String trich_yeu = "[VTTest] Tờ trình Luồng ký số 2 User phê duyệt tại 1 Step: " + createdTime;
	String trich_yeu_edit = "[VTTest] Tờ trình Luồng ký số 2 User phê duyệt tại 1 Step Edit lúc: " + createdTime;
@Test
public void TaoToTrinhGui2UserPheDuyet() throws InterruptedException {
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
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(trich_yeu, "Tờ trình", nguoi_tao_hstl);
	danhSachVBDuThaoDangSoan.ClickOnFirstItem();
	formHoSoTaiLieu.ValidateFormToTrinhDangLuu(
			trich_yeu, 
			don_vi_soan_thao, 
			ho_so_luu_tru, 
			ngay_ky, 
			so_van_ban, 
			noi_luu);
	formHoSoTaiLieu.ValidatePermisisonDangLuu();
	formHoSoTaiLieu.XoaFile();
	driver.navigate().refresh();
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "Không có mục nào");
	formHoSoTaiLieu.uploadFile(file_hstl_ky_so_nhieu_user);
	formHoSoTaiLieu.uploadFile(file_excel_ky_so);
	formHoSoTaiLieu.uploadFile(file_pdf_ky_so);
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "1 - 3 của 3 mục");
	formHoSoTaiLieu.TrinhPheDuyetHopDong2User(
			user_phe_duyet_hstl,
			lanh_dao_pb, 
			lanh_dao_bgd);
	login.signOut();
	login.LoginUserPheDuyetHSTL();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetToTrinh(trich_yeu, nguoi_tao_hstl);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(trich_yeu);
	login.signOut();
	login.LoginTphongThucHien();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetToTrinh(trich_yeu, nguoi_tao_hstl);
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
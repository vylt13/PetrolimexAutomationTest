package testCaseHSTL;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.*;

public class TC14_HoSoTaiLieuKyMocChuyenXuLyBuocTruongPhong extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String noi_dung_hop_dong = "[VTTest] Hồ sơ tài liệu ký Mộc - Chuyển xử lý ở Bước Trưởng phòng " + createdTime;
@Test
public void HoSoTaiLieuKyMocChuyenXuLyBuocTruongPhong() throws InterruptedException {
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
	formHoSoTaiLieu.XoaFile();
	driver.navigate().refresh();
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "Không có mục nào");
	formHoSoTaiLieu.uploadFile(file_hstl_2_key_stt);
	formHoSoTaiLieu.uploadFile(file_excel_ky_so);
	formHoSoTaiLieu.uploadFile(file_pdf_ky_so);
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "1 - 3 của 3 mục");
	formHoSoTaiLieu.TrinhPheDuyetHSTL(
			lanh_dao_pb,
			lanh_dao_phong_lien_quan,
			lanh_dao_dong_phe_duyet,
			lanh_dao_duyet_vb,
			y_kien_trinh);
	login.signOut();
	login.NavigateToSite();
	login.LoginTphongThucHien();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(noi_dung_hop_dong, nguoi_tao_hstl);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.ChuyenXuLy(user_phe_duyet_hstl, y_kien_phe_duyet_hstl);
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(noi_dung_hop_dong);
	login.signOut();
	login.LoginUserPheDuyetHSTL();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(noi_dung_hop_dong, lanh_dao_pb);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(noi_dung_hop_dong);
	login.signOut();
	login.LoginUserTpLienQuan();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(noi_dung_hop_dong, user_phe_duyet_hstl);
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
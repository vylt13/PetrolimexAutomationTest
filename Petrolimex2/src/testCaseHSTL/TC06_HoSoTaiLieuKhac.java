package testCaseHSTL;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.*;
public class TC06_HoSoTaiLieuKhac extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String noi_dung_hop_dong = "[VTTest] Hồ sơ Tài liệu khác Luồng ký số bình thường lúc" + createdTime;
	String noi_dung_hop_dong_edit = "[VTTest] Hồ sơ Tài liệu khác Luồng ký số bình thường Edit lúc" + createdTime;
@Test
public void HoSoTaiLieuKhac() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormThemMoiHSTL formThemMoiHopDong = new FormThemMoiHSTL(driver);
	DanhSachVBDuThaoDangSoan danhSachVBDuThaoDangSoan = new DanhSachVBDuThaoDangSoan(driver);
	FormHoSoTaiLieu formHoSoTaiLieu = new FormHoSoTaiLieu(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDiTatCa danhSachVBDiTatCa = new DanhSachVBDiTatCa(driver);
	DanhSachVBDiChoPheDuyet danhSachVBDiChoPheDuyet = new DanhSachVBDiChoPheDuyet(driver);
	login.NavigateToSite();
	login.LoginUserTaoHSTL();
	login.NavigateToFormThemMoiHstlKhac();
	formThemMoiHopDong.inputHstlKhac(
			ten_ho_so, 
			noi_dung_hop_dong, 
			ngay_ky, 
			noi_luu, 
			ho_so_luu_tru, 
			filepathKySo01);
	formThemMoiHopDong.TaoHoSo();
	Thread.sleep(3000);
	login.LogReport(); 
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(noi_dung_hop_dong, "Hồ sơ tài liệu khác", nguoi_tao_hstl);
	danhSachVBDuThaoDangSoan.ClickOnFirstItem();
	formHoSoTaiLieu.ValidateFormHstlKhacDangLuu(
			noi_dung_hop_dong, 
			don_vi_soan_thao, 
			ho_so_luu_tru, 
			ngay_ky, 
			linh_vuc, 
			ten_ho_so, 
			noi_luu);
	formHoSoTaiLieu.ValidatePermisisonDangLuu();
	formHoSoTaiLieu.XoaFile();
	driver.navigate().refresh();
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "Không có mục nào");
	formHoSoTaiLieu.uploadFile(file_hstl_khac_ky_so);
	formHoSoTaiLieu.uploadFile(file_excel_ky_so);
	formHoSoTaiLieu.uploadFile(file_pdf_ky_so);
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "1 - 3 của 3 mục");
	formHoSoTaiLieu.SuaThongTinHSTL();
	formThemMoiHopDong.ValidateThongTinFormSuaHstlKhac(
			ten_ho_so, 
			noi_dung_hop_dong, 
			ngay_ky, 
			linh_vuc, 
			noi_luu, 
			ho_so_luu_tru);
	formThemMoiHopDong.editHstlKhac(
			ten_ho_so_edit, 
			noi_dung_hop_dong_edit, 
			ngay_ky_edit, 
			noi_luu_edit, 
			linh_vuc_edit, 
			ho_so_luu_tru_edit);
	formHoSoTaiLieu.ValidateFormHstlKhacDangLuu(
			noi_dung_hop_dong_edit, 
			don_vi_soan_thao, 
			ho_so_luu_tru_edit, 
			ngay_ky, 
			linh_vuc_edit, 
			ten_ho_so_edit, 
			noi_luu_edit);
	login.NavigateToTrangChuVB();
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(
			noi_dung_hop_dong_edit,
			"Hồ sơ tài liệu khác",
			nguoi_tao_hstl);
	danhSachVBDuThaoDangSoan.ClickOnFirstItem();
	formHoSoTaiLieu.TrinhPheDuyetHSTLKhac(lanh_dao_pb);
	login.signOut();
	login.LoginTphongThucHien();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHSTLKhac(noi_dung_hop_dong_edit, nguoi_tao_hstl);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.PheDuyet();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(noi_dung_hop_dong_edit);
	login.NavigateToTrangChuVB();
	login.NavigateToTatCaVBDi();
	danhSachVBDiTatCa.ValidateTinhTrangDaPheDuyet(noi_dung_hop_dong_edit);
	driver.quit();
	} 
}
package testCaseHSTL;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.*;

public class TC01_TaoHopDong extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String noi_dung_hop_dong = "[VTTest] Luồng Ký số Bình thường Tạo ngày: " + createdTime;
	String noi_dung_hop_dong_edit = "[VTTest] Hợp đồng Luồng Ký số Bình thường Edit Tạo ngày: " + createdTime;
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
	formHoSoTaiLieu.XoaFile();
	driver.navigate().refresh();
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "Không có mục nào");
	formHoSoTaiLieu.uploadFile(file_hop_dong_ky_so);
	formHoSoTaiLieu.uploadFile(file_excel_ky_so);
	formHoSoTaiLieu.uploadFile(file_pdf_ky_so);
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "1 - 3 của 3 mục");
	formHoSoTaiLieu.SuaThongTinHSTLKhongEdit();
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
	formHoSoTaiLieu.SuaThongTinHSTL();
	formThemMoiHopDong.ValidateThongTinFormSuaHopDong(
			so_hop_dong,
			don_vi_soan_thao,
			noi_dung_hop_dong, 
			ngay_ky, 
			ngay_hieu_luc, 
			linh_vuc, 
			noi_luu, 
			ho_so_luu_tru);
	formThemMoiHopDong.editHopDong(
			so_hop_dong_edit, 
			noi_dung_hop_dong_edit, 
			ngay_ky_edit, 
			ngay_hieu_luc_edit, 
			noi_luu_edit, 
			linh_vuc_edit, 
			ho_so_luu_tru_edit);
	formHoSoTaiLieu.ValidateFormHopDongDangLuu(
			noi_dung_hop_dong_edit,
			don_vi_soan_thao, 
			ho_so_luu_tru_edit, 
			ngay_ky_edit, 
			ten_nguoi_ky, 
			ngay_hieu_luc_edit, 
			linh_vuc_edit, 
			so_hop_dong_edit, 
			noi_luu_edit);
	login.NavigateToTrangChuVB();
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(
			noi_dung_hop_dong_edit,
			"Hợp đồng",
			nguoi_tao_hstl);
	danhSachVBDuThaoDangSoan.ClickOnFirstItem();
	formHoSoTaiLieu.TrinhPheDuyetHSTL(
			lanh_dao_pb,
			lanh_dao_phong_lien_quan,
			lanh_dao_dong_phe_duyet,
			lanh_dao_duyet_vb,
			y_kien_trinh);
	login.signOut();
	login.LoginTphongThucHien();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(noi_dung_hop_dong_edit, nguoi_tao_hstl);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(noi_dung_hop_dong_edit);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTpLienQuan();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(noi_dung_hop_dong_edit, lanh_dao_pb);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(noi_dung_hop_dong_edit);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserLdDongPheDuyet();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(noi_dung_hop_dong_edit, lanh_dao_phong_lien_quan);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(noi_dung_hop_dong_edit);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTgd();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(noi_dung_hop_dong_edit, lanh_dao_dong_phe_duyet);
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
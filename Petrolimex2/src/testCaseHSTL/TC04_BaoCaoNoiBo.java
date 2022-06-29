package testCaseHSTL;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.*;

public class TC04_BaoCaoNoiBo extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String trich_yeu = "[VTTest] Báo cáo nội bộ Luồng ký số bình thường Tạo lúc " + createdTime;
	String trich_yeu_edit = "[VTTest] Báo cáo nội bộ Luồng ký số bình thường Edit Tạo lúc " + createdTime;
@Test
public void BaoCaoNoiBo() throws InterruptedException {
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
	login.NavigateToFormThemMoiBaoCaoNoiBo();
	formThemMoiHopDong.inputBaoCaoNoiBo(
			so_van_ban, 
			trich_yeu,
			ngay_ky, 
			noi_luu, 
			ho_so_luu_tru, 
			filepathKySo01, 
			y_kien_trinh);
	formThemMoiHopDong.TaoHoSo();
	Thread.sleep(3000);
	login.LogReport();
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(trich_yeu, "Báo cáo", nguoi_tao_hstl);
	danhSachVBDuThaoDangSoan.ClickOnFirstItem();
	formHoSoTaiLieu.ValidateFormBaoCaoNoiBoDangLuu(
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
	formHoSoTaiLieu.uploadFile(file_word_ky_so_1_trang_key_stt);
	formHoSoTaiLieu.uploadFile(file_excel_ky_so);
	formHoSoTaiLieu.uploadFile(file_pdf_ky_so);
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "1 - 3 của 3 mục");
	formHoSoTaiLieu.SuaThongTinHSTL();
	formThemMoiHopDong.ValidateThongTinFormSuaBaoCaoNoiBo(
			so_van_ban, 
			don_vi_soan_thao, 
			trich_yeu, 
			ngay_ky, 
			linh_vuc, 
			noi_luu, 
			ho_so_luu_tru);
	formThemMoiHopDong.editBaoCaoNoiBo(
			so_van_ban_edit, 
			trich_yeu_edit, 
			ngay_ky_edit, 
			noi_luu_edit, 
			linh_vuc_edit, 
			ho_so_luu_tru_edit);
	formHoSoTaiLieu.ValidateFormBaoCaoNoiBoDangLuu(
			trich_yeu_edit, 
			don_vi_soan_thao, 
			ho_so_luu_tru_edit, 
			ngay_ky_edit, 
			so_van_ban_edit, 
			noi_luu_edit);
	login.NavigateToTrangChuVB();
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(
			trich_yeu_edit,
			"Báo cáo",
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
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(trich_yeu_edit, nguoi_tao_hstl);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(trich_yeu_edit);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTpLienQuan();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(trich_yeu_edit, lanh_dao_pb);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(trich_yeu_edit);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserLdDongPheDuyet();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(trich_yeu_edit, lanh_dao_phong_lien_quan);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.DongY();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(trich_yeu_edit);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTgd();
	danhSachViecCanXuLy.ValidateTaskYeuCauPheDuyetHopDong(trich_yeu_edit, lanh_dao_dong_phe_duyet);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formHoSoTaiLieu.InputYKienPheDuyet(y_kien_phe_duyet_hstl);
	formHoSoTaiLieu.PheDuyet();
	danhSachViecCanXuLy.ValidateHoanTatTaskYeuCauPheDuyetHSTL(trich_yeu_edit);
	login.NavigateToTrangChuVB();
	login.NavigateToTatCaVBDi();
	danhSachVBDiTatCa.ValidateTinhTrangDaPheDuyet(trich_yeu_edit);
	driver.quit();
	} 
}
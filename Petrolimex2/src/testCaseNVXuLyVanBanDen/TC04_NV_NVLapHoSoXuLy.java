package testCaseNVXuLyVanBanDen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBChoYKienLanhDao;
import pages.DanhSachVBDangGiaiQuyet;
import pages.DanhSachVBDenTatCa;
import pages.DanhSachViecCanXuLy;
import pages.FormTaskVanBanDen;
import pages.FormXuLyVanBanDen;
import pages.HoSoXuLy;
import pages.Login;
import pages.ThemMoiVanBanDen;
import pages.ThuocTinhVBDen;

public class TC04_NV_NVLapHoSoXuLy extends ThuocTinhVBDen {
	WebDriver driver;
	String trich_yeu = "TC 03 - Nhân viên - Kiểm tra Nhân viên Lập HSXL: " + createdTime;
	String y_kien_lanh_dao = "Tổng giám đốc Phân công VB vào lúc: " + createdTime;
	String y_kien_nguoi_nhan = "Trưởng phòng phân công Văn bản";
@Test
public void NVLapHoSoXuLy() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDen iputVanBanDen = new ThemMoiVanBanDen(driver);
	DanhSachVBChoYKienLanhDao danhSachVBChoYkien = new DanhSachVBChoYKienLanhDao(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	DanhSachVBDangGiaiQuyet danhSachVBDangGiaiQuyet = new DanhSachVBDangGiaiQuyet(driver);
	FormTaskVanBanDen formTaskVanBanDen = new FormTaskVanBanDen(driver);
	DanhSachVBDenTatCa danhSachVBDenTatCa = new DanhSachVBDenTatCa(driver);
	FormXuLyVanBanDen formXuLyVanBanDen = new FormXuLyVanBanDen(driver);
	HoSoXuLy hoSoXuLy = new HoSoXuLy(driver);
	login.NavigateToSite();
	login.LoginUserVanThu();
	login.NavigateToNewInDocumentForm();
	iputVanBanDen.inputVanBanDen(
			so_van_ban, 
			trich_yeu,
			loai_van_ban,
			co_quan_gui,
			linh_vuc,
			ngay_den,
			ngay_tren_vb,
			do_khan,
			do_mat,
			so_ban,
			so_trang,
			chon_lanh_dao_trinh_buoc_vthu);
	iputVanBanDen.uploadFile(filePath);
	iputVanBanDen.waitingForValidate();
	iputVanBanDen.chuyenXuLy();
	iputVanBanDen.waitingForLoading();
	login.NavigatToVBChoYKienLanhDao();
	danhSachVBChoYkien.ValidateVBChoYKienCoDinhKem(
			trich_yeu,
			ngay_tren_vb, 
			do_mat, 
			do_khan);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserChuTich();
	danhSachViecCanXuLy.ValidateTaskChoYKienVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	login.LogReport();
	formXuLyVanBanDen.ChuyenLanhDaoKhacXyLy();
	formXuLyVanBanDen.waitingForLoading();
	login.NavigatToVBChoYKienLanhDao();
	danhSachVBChoYkien.ValidateVBChoYKienCoDinhKem(
			trich_yeu, 
			ngay_tren_vb, 
			do_mat, 
			do_khan);
	login.NavigateToTatCaVBDen();
	danhSachVBDenTatCa.TimKiemVb(trich_yeu);
	danhSachVBDenTatCa.ValidateTinhTrangTrinhLanhDao(
			trich_yeu, 
			lanh_dao_tgd, 
			co_quan_gui);
	login.signOut();
	login.NavigateToSite();
	login.LoginUserTgd();
	danhSachViecCanXuLy.ValidateTaskChoYKienVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	formXuLyVanBanDen.inputYKienLanhDao(y_kien_lanh_dao);
	formXuLyVanBanDen.CheckPhanCongAll();
	formXuLyVanBanDen.PhanCongVanBan();
	formXuLyVanBanDen.waitingForLoading();
	login.NavigateToVBDangGiaiQuyet();
	danhSachVBDangGiaiQuyet.ValidateVBDangGiaiQuyet(
			trich_yeu,
			ngay_tren_vb, 
			do_khan,
			co_quan_gui);
	danhSachVBDangGiaiQuyet.ClickOnFirstItem();
	formXuLyVanBanDen.waitingForLoading();
	formXuLyVanBanDen.ValidateTatCaDonViToChucThucHien(account_lanh_dao_tgd);
	login.NavigateToTatCaVBDen();
	danhSachVBDenTatCa.TimKiemVb(trich_yeu);
	danhSachVBDenTatCa.ValidateTinhTrangChuyenDonVi(
			trich_yeu, 
			tat_ca_don_vi_xu_ly, 
			co_quan_gui);
	login.signOut();
	login.NavigateToSite();
	login.LoginTphongThucHien();
	danhSachViecCanXuLy.ValidateTaskThucHienVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formTaskVanBanDen.CheckAllNhanVien();
	formTaskVanBanDen.PhanCong(y_kien_tp_phan_cong);
	formTaskVanBanDen.waitingForLoading();
	danhSachViecCanXuLy.ClickOnVbDaXuLy();
	formTaskVanBanDen.ValidateNhiemVuDaPhanCong(nguoi_xu_ly_1, nguoi_xu_ly_2);
	login.NavigateToTatCaVBDen();
	login.signOut();
	login.NavigateToSite();
	login.LoginNvienThucHien();
	danhSachViecCanXuLy.ValidateTaskXuLyVBDen(
			trich_yeu, 
			co_quan_gui);
	danhSachViecCanXuLy.ClickOnFirstItem();
	formTaskVanBanDen.LapHoSoXuLy();
	formTaskVanBanDen.waitingForLoading();
	formTaskVanBanDen.MoPhieuGiaiQuyet();
	formXuLyVanBanDen.ValidateTinhTrangNhanVienLapHoSoXuLy(nguoi_xu_ly_1);
	String formVbUrl = driver.getCurrentUrl();
	formXuLyVanBanDen.MoHoSoNhanVienTao();
	hoSoXuLy.uploadFile(
			filePath, 
			file_name_hsxl);
	hoSoXuLy.dongHoSo();
	driver.get(formVbUrl);
	formXuLyVanBanDen.ValidateTinhTrangNhanVienHoanTatLapHoSoXuLy(account_nv_thuc_hien);
	login.NavigateToTrangChuVB();
	danhSachViecCanXuLy.ValidateHoanTatTaskXuLyVBDen(trich_yeu);
	driver.quit();
	} 
}
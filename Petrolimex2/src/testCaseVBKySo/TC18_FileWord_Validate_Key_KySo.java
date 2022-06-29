package testCaseVBKySo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBDuThaoChoPheDuyet;
import pages.DanhSachVBDuThaoDangSoan;
import pages.DanhSachViecCanXuLy;
import pages.FormPhatHanhVb;
import pages.FormVanBanDuThao;
import pages.Login;
import pages.ThemMoiVanBanDuThao;
import pages.ThuocTinhVBDuThao;

public class TC18_FileWord_Validate_Key_KySo extends ThuocTinhVBDuThao {
	WebDriver driver;
// Format Simple Date
	String trich_yeu = "[VTTest] TC 18 - File Word - Validate Key Ký số" + System.currentTimeMillis();
@Test
public void VBDangLuuKhongDinhKem() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDuThao themMoiVanBanDuThao = new ThemMoiVanBanDuThao(driver);
	FormVanBanDuThao formVanBanDuThao = new FormVanBanDuThao(driver);
	DanhSachVBDuThaoChoPheDuyet danhSachVBDuThaoChoPheDuyet = new DanhSachVBDuThaoChoPheDuyet(driver);
	DanhSachViecCanXuLy danhSachViecCanXuLy = new DanhSachViecCanXuLy(driver);
	login.NavigateToSite();
	login.LoginNhanVienKhoiTaoKySo();
	login.NavigateToTrangChuVB();
	login.NavigateToThemMoiVbKySo();
	themMoiVanBanDuThao.inputVanBanDuThao(
			trich_yeu,
			loai_van_ban);
	themMoiVanBanDuThao.submitForm();
	login.LogReport();
	formVanBanDuThao.uploadFile(file_word_validate_key);
	formVanBanDuThao.ValidateKeyGuiPheDuyet(
			lanh_dao_phong_ban, 
			lanh_dao_duyet_vb,
			y_kien_phe_duyet_vb_du_thao);
	formVanBanDuThao.SuaFile();
	formVanBanDuThao.uploadFile(file_word_ky_so_1_trang_key_stt);
	formVanBanDuThao.GuiPheDuyet(lanh_dao_phong_ban,lanh_dao_phong_lien_quan,lanh_dao_dong_phe_duyet, lanh_dao_duyet_vb, y_kien_nguoi_gui);
	login.NavigateToDanhSachVBDuThaoChoPheDuyet();
	danhSachVBDuThaoChoPheDuyet.ValidateVBChoPheDuyet(
			trich_yeu,
			loai_van_ban, 
			lanh_dao_phong_ban, 
			tinh_trang_lanh_dao_phong);
	login.NavigateToDanhSachVanBanDiChoPheDuyet();
	login.signOut();
	login.NavigateToSite();
	login.LoginTruongPhongPheDuyetVbDuThao();
	danhSachViecCanXuLy.ValidateTaskPheDuyetVbDuThaoKySo(trich_yeu, nguoi_tao_vb_ky_so);
	driver.quit();
	} 
}
package testCaseVBDT;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.DanhSachVBDuThaoDangSoan;
import pages.FormVanBanDuThao;
import pages.Login;
import pages.ThemMoiVanBanDuThao;
import pages.ThuocTinhVBDuThao;

public class TC01_ThaoTacTrenFormDuThao extends ThuocTinhVBDuThao {
	WebDriver driver;
// Format Simple Date
	String trich_yeu = "[2808][VTTest] TC 01 - Thao tác trên form Dự thảo lúc " + System.currentTimeMillis();
	String trich_yeu_cap_nhat = "[2808][VTTest] TC 01 - Chỉnh sửa thuộc tính VB dự thảo " + System.currentTimeMillis();
@Test
public void ThaoTacTrenFormDuThao() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	ThemMoiVanBanDuThao themMoiVanBanDuThao = new ThemMoiVanBanDuThao(driver);
	DanhSachVBDuThaoDangSoan danhSachVBDuThaoDangSoan = new DanhSachVBDuThaoDangSoan(driver);
	FormVanBanDuThao formVanBanDuThao = new FormVanBanDuThao(driver);
	login.NavigateToSite();
	login.LoginNhanVienKhoiTao();
	login.NavigateToTrangChuVB();
	login.NavigateToThemMoiVbDuThaoKhongKySo();
	themMoiVanBanDuThao.inputVanBanDuThao(
			trich_yeu,
			loai_van_ban);
	themMoiVanBanDuThao.UploadFile(file01);
	themMoiVanBanDuThao.UploadFile(file02);
	themMoiVanBanDuThao.submitForm();
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(
			trich_yeu, 
			loai_van_ban, 
			nguoi_tao);
	danhSachVBDuThaoDangSoan.ClickOnFirstItem();
	login.LogReport();
	formVanBanDuThao.ValidateTinhTrangSoanThao(
			trich_yeu,
			phong_ban_nguoi_tao, 
			loai_van_ban);
	formVanBanDuThao.ValidatePermissionEdit();
	formVanBanDuThao.SuaThongTinVbDuThao(loai_van_ban_cap_nhat, trich_yeu_cap_nhat);
	formVanBanDuThao.ValidateTinhTrangSoanThao(trich_yeu_cap_nhat, phong_ban_nguoi_tao, loai_van_ban_cap_nhat);
	formVanBanDuThao.uploadFile(file03);
	formVanBanDuThao.TaoFileTuMau();
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "1 - 4 của 4 mục");
	formVanBanDuThao.SuaFile();
	Thread.sleep(3000);
	driver.navigate().refresh();
	formVanBanDuThao.XoaFile();	
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(), "1 - 3 của 3 mục");
	login.NavigateToDanhSachVBDuThaoDangSoan();
	danhSachVBDuThaoDangSoan.ValidateVBDangSoan(trich_yeu_cap_nhat, loai_van_ban_cap_nhat, nguoi_tao);
	driver.quit();
	} 
}
package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachVBDenTatCa {
	WebDriver driver;
public DanhSachVBDenTatCa(WebDriver driver) {
	this.driver = driver;
}
By lableHomNay = By.xpath("//div[@id='DynamicManage']//table//tbody[@role='rowgroup']//tr[1]//p[1]");
By soVanBan = By.xpath("//div[@id='DynamicManage']//table//tbody[@role='rowgroup']//tr[2]//td[2]");
By trichYeu = By.xpath("//div[@id='DynamicManage']//table//tbody[@role='rowgroup']//tr[2]//td[3]");
By nguoiXuLy= By.xpath("//div[@id='DynamicManage']//table//tbody[@role='rowgroup']//tr[2]//td[5]");
By iconDoKhan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[4]//a");
By tinhTrang = By.xpath("//div[@id='DynamicManage']//table//tbody[@role='rowgroup']//tr[2]//td[6]");
By noiGui = By.xpath("//div[@id='DynamicManage']//table//tbody[@role='rowgroup']//tr[2]//td[7]");
By ngayTrenVb = By.xpath("//div[@id='DynamicManage']//table//tbody[@role='rowgroup']//tr[2]//td[8]//div");
By iconDinhKem = By.xpath("//div[@id='DynamicManage']//table//tbody[@role='rowgroup']//tr[2]//td[9]//a");
By txtKeyword = By.id("txtKey");
By btnTimVb = By.xpath("//div[@class='filterSearch']//div[2]//div[2]//input[2]");

public void TimKiemVb(
		String trich_yeu) throws InterruptedException {
	driver.findElement(txtKeyword).sendKeys(trich_yeu);
	driver.findElement(btnTimVb).click();
	Thread.sleep(5000);
}
public void ValidateTinhTrangHoanTat(
		String trich_yeu,
		String nguoi_xu_ly,
		String co_quan_gui,
		String ngay_tren_vb) {
	assertEquals(driver.findElement(lableHomNay).getText(), "Hôm nay");
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(nguoiXuLy).getText(), nguoi_xu_ly);
	assertEquals(driver.findElement(tinhTrang).getText(), "Hoàn tất");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
	assertEquals(driver.findElement(ngayTrenVb).getText(), ngay_tren_vb);
	assertEquals(driver.findElement(iconDinhKem).getAttribute("class"), "aAttack");
}
public void ValidateTinhTrangDangLuu(
		String trich_yeu,
		String nguoi_xu_ly_hoan_tat,
		String co_quan_gui) {
	assertEquals(driver.findElement(lableHomNay).getText(), "Hôm nay");
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(nguoiXuLy).getText(), nguoi_xu_ly_hoan_tat);
	assertEquals(driver.findElement(tinhTrang).getText(), "Lưu");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
	assertEquals(driver.findElement(iconDinhKem).getAttribute("class"), "aAttack");
}
public void ValidateTinhTrangTrinhLanhDao(
		String trich_yeu,
		String nguoi_xu_ly,
		String co_quan_gui) {
	assertEquals(driver.findElement(lableHomNay).getText(), "Hôm nay");
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(nguoiXuLy).getText(), nguoi_xu_ly);
	assertEquals(driver.findElement(tinhTrang).getText(), "Trình Lãnh đạo");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
	assertEquals(driver.findElement(iconDinhKem).getAttribute("class"), "aAttack");
}
public void ValidateTinhTrangChuyenDonVi(
		String trich_yeu,
		String nguoi_xu_ly,
		String co_quan_gui) {
	assertEquals(driver.findElement(lableHomNay).getText(), "Hôm nay");
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(nguoiXuLy).getText(), nguoi_xu_ly);
	assertEquals(driver.findElement(tinhTrang).getText(), "Chuyển đơn vị");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
	assertEquals(driver.findElement(iconDinhKem).getAttribute("class"), "aAttack");
}
public void ValidateTinhTrangChuyenPhanCong(
		String trich_yeu,
		String nguoi_xu_ly,
		String co_quan_gui,
		String ngay_tren_vb) {
	assertEquals(driver.findElement(lableHomNay).getText(), "Hôm nay");
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(nguoiXuLy).getText(), nguoi_xu_ly);
	assertEquals(driver.findElement(tinhTrang).getText(), "Chuyển phân công");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
	assertEquals(driver.findElement(ngayTrenVb).getText(), ngay_tren_vb);
	assertEquals(driver.findElement(iconDinhKem).getAttribute("class"), "aAttack");
}
public void ClickOnFirstItem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	driver.findElement(soVanBan).click();
}
}

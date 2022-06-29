package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachVBDangLuu {
	WebDriver driver;
public DanhSachVBDangLuu(WebDriver driver) {
	this.driver = driver;
}
By soVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[1]");
By trichYeu = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[2]");
By ngayTrenVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[3]");
By valueDoKhan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[4]//div");
By iconDinhKem = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[5]//a");

public void ValidateVBDangLuuKhongDinhKem(
		String trich_yeu,
		String ngay_tren_vb,
		String do_khan) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(ngayTrenVanBan).getText(), ngay_tren_vb);
	assertEquals(driver.findElement(valueDoKhan).getAttribute("title"), do_khan);
	assertEquals(driver.findElements(iconDinhKem).isEmpty(), true);
}
public void ValidateVBDangLuuCoDinhKem(
		String trich_yeu,
		String ngay_tren_vb,
		String do_khan) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(ngayTrenVanBan).getText(), ngay_tren_vb);
	assertEquals(driver.findElement(valueDoKhan).getAttribute("title"), do_khan);
	assertEquals(driver.findElement(iconDinhKem).getAttribute("class"), "aAttack");
}
public void ClickOnFirstItem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	driver.findElement(soVanBan).click();
}
}

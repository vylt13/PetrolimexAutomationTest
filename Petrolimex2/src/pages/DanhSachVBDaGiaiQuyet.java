package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachVBDaGiaiQuyet {
	WebDriver driver;
public DanhSachVBDaGiaiQuyet(WebDriver driver) {
	this.driver = driver;
}
By soVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[1]");
By trichYeu = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[2]");
By ngayTrenVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[3]");
By noiGui = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[4]");
By valueDoMat = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[5]//div");
By iconDinhKem = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[6]//a");

public void ValidateVBDaGiaiQuyet(
		String trich_yeu,
		String ngay_tren_vb,
		String co_quan_gui,
		String do_mat) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(ngayTrenVanBan).getText(), ngay_tren_vb);
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
	assertEquals(driver.findElement(valueDoMat).getText(), do_mat);
	assertEquals(driver.findElement(iconDinhKem).getAttribute("class"), "aAttack");
}
public void ClickOnFirstItem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	driver.findElement(soVanBan).click();
}
}

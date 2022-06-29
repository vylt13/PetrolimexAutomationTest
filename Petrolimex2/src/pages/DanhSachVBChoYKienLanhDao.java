package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachVBChoYKienLanhDao {
	WebDriver driver;
public DanhSachVBChoYKienLanhDao(WebDriver driver) {
	this.driver = driver;
}
By soVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[1]");
By trichYeu = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[2]");
By ngayTrenVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[3]");
By valueDoMat = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[4]//div");
By iconDinhKem = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[5]//a");
By valueDoKhan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[6]//div");

public void ValidateVBChoYKienKhongDinhKem(
		String trich_yeu,
		String ngay_tren_vb,
		String do_mat) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(ngayTrenVanBan).getText(), ngay_tren_vb);
	assertEquals(driver.findElement(valueDoMat).getAttribute("title"), do_mat);
	assertEquals(driver.findElements(iconDinhKem).isEmpty(), true);
}
public void ValidateVBChoYKienCoDinhKem(
		String trich_yeu,
		String ngay_tren_vb,
		String do_mat,
		String do_khan) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(ngayTrenVanBan).getText(), ngay_tren_vb);
	assertEquals(driver.findElement(valueDoMat).getAttribute("title"), do_mat);
	assertEquals(driver.findElement(iconDinhKem).getAttribute("class"), "aAttack");
	assertEquals(driver.findElement(valueDoKhan).getAttribute("title"), do_khan);
}
public void ClickOnFirstItem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	driver.findElement(soVanBan).click();
}
}

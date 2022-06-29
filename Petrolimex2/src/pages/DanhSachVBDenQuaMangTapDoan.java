package pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachVBDenQuaMangTapDoan {
	WebDriver driver;
public DanhSachVBDenQuaMangTapDoan(WebDriver driver) {
	this.driver = driver;
}
By soVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[1]");
By trichYeu = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[2]");
By ngayTrenVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[3]");
By doMat = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[4]");
By iconDinhKem = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[5]//a");
public void ValidateVBDenQuaMang(
		String trich_yeu,
		String ngay_tren_vb,
		String do_mat) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(ngayTrenVanBan).getText(), ngay_tren_vb);
	assertEquals(driver.findElement(doMat).getText(), do_mat);
	assertEquals(driver.findElement(iconDinhKem).getAttribute("class"), "aAttack");
}
public void ValidateVanBanDaThuHoi(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	assertNotEquals(driver.findElement(trichYeu).getText(), trich_yeu, "VB đã Thu hồi");
}
public void ClickOnFirstItem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(soVanBan));
	driver.findElement(soVanBan).click();
}
}

package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachVBDuThaoDangSoan {
	WebDriver driver;
public DanhSachVBDuThaoDangSoan(WebDriver driver) {
	this.driver = driver;
}
By trichYeu = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[1]//a");
By loaiVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[2]");
By nguoiTao = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[3]");

public void ValidateVBDangSoan(
		String trich_yeu,
		String loai_van_ban,
		String nguoi_tao) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(trichYeu));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(loaiVanBan).getText(), loai_van_ban);
	assertEquals(driver.findElement(nguoiTao).getText(), nguoi_tao);
}
public void ClickOnFirstItem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(trichYeu));
	driver.findElement(trichYeu).click();
}
}

package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachVBDiDaPheDuyet {
	WebDriver driver;
public DanhSachVBDiDaPheDuyet (WebDriver driver) {
	this.driver = driver;
}
By trichYeu = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[1]");
By loaiVanBan = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[2]");
By ngayPheDuyet = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[3]");
By tinhTrang = By.xpath("//div[@id='DynamicManage']//tbody/tr[1]/td[4]");

public void ValidateVBDiDaPheDuyet(
		String trich_yeu,
		String loai_van_ban,
		String ngay_phe_duyet,
		String tinh_trang) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(trichYeu));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(loaiVanBan).getText(), loai_van_ban);
	assertEquals(driver.findElement(ngayPheDuyet).getText(), ngay_phe_duyet);
	assertEquals(driver.findElement(tinhTrang).getText(), tinh_trang);
}
public void ClickOnFirstItem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(trichYeu));
	driver.findElement(trichYeu).click();
}
}

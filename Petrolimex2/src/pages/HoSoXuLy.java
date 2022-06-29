package pages;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HoSoXuLy {
	WebDriver driver;
	
public HoSoXuLy(WebDriver driver) {
	this.driver = driver;
}
By iconDinhKemFile = By.id("divLinkNewDocument");
By chooseFile = By.xpath("//input[contains(@id, 'sp_file')]");
By saveUploadFile = By.xpath("//input[contains(@id, 'btnSave')]");
By lableFileName = By.xpath("//table[@id='onetidDoclibViewTbl0']//tbody//tr[1]//td[3]//a");
By iconDongHoSo = By.xpath("//input[contains(@id, 'btnDongHS')]");
By txtLinkVanBan = By.xpath("//div[@class='FormR']//div[2]//div[2]//a");
By lableTinhTrangHoSo = By.xpath("//div[@class='FormR']//div[3]//div[2]");

public void uploadFile(
		String filePath,
		String file_name) {
	driver.findElement(iconDinhKemFile).click();
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
	driver.findElement(chooseFile).sendKeys(filePath);
	driver.findElement(saveUploadFile).click();
	String fileNameValue = driver.findElement(lableFileName).getText();
	assertEquals(fileNameValue, file_name);
}
public void dongHoSo() {
	driver.findElement(iconDongHoSo).click();
	driver.switchTo().alert().accept();
	String tinhTrangHoSoValue = driver.findElement(lableTinhTrangHoSo).getText();
	assertEquals(tinhTrangHoSoValue.contains("Đã xử lý"), true);
}

public void WaitionForLoading() {
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
}

}

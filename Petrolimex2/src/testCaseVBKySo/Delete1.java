package testCaseVBKySo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.DanhSachVBDuThaoDangSoan;
import pages.FormVanBanDuThao;
import pages.Login;
import pages.ThemMoiVanBanDuThao;
import pages.ThuocTinhVBDuThao;

public class Delete1 extends ThuocTinhVBDuThao {
	WebDriver driver;
@Test
public void ThaoTacTrenFormDuThao() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, 120);
	Login login = new Login(driver);
	driver.get("http://eoffice.petrolimex.com.vn/ptcnt/vanban/Lists/ShareVanBanBanHanh/AllItems.aspx");
	
	driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_UserName")).sendKeys("adminsp");
	driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_password")).sendKeys("Plx22@!@#$%");
	driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_login")).click();
	for(int i=1; 1<30; i++) {
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(@id,'cbxSelectAllItems')]"))));
//		Xoa Image Tin tuc
//		driver.findElement(By.xpath("//input[@title='Select or deselect all items']")).click();
//		driver.findElement(By.xpath("//input[@title='Select or deselect all items']")).sendKeys(Keys.DELETE);
		driver.findElement(By.xpath("//span[contains(@id,'cbxSelectAllItems')]")).click();
		driver.findElement(By.xpath("//span[contains(@id,'cbxSelectAllItems')]")).sendKeys(Keys.DELETE);
		driver.switchTo().alert().accept();
		Thread.sleep(15000);
		driver.navigate().refresh();
	
//	driver.quit();
	} 
}
}
package tetsCaseTinhNangChung;

import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Login;
public class AddUser {
	WebDriver driver;
	@BeforeTest
public void KhoiTaoTrinhDuyet() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
}
@Test
public void TaoMoiUser() throws InterruptedException, EncryptedDocumentException, IOException, ParseException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormThemMoiUser taoFormNew = new FormThemMoiUser(driver);
	driver.get("https://daotaoeoffice.petrolimex.com.vn/plxkv1/Lists/NhanVien/NewForm.aspx?ID=&ListID=0eaa3e44-c359-4600-8a22-063fe45532c7&RootFolder=&Source=%2fplxkv1%2flists%2fnhanvien%2fallitems.aspx");
	driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_UserName")).sendKeys("adminsp");
	driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_password")).sendKeys("Plx22@!@#$%");
	driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_login")).click();
	taoFormNew.inputUser(1);
	
}
}
package checkWebpart;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class baoCaoInSo {
	WebDriver driver;
@BeforeTest 
public void KhaiBaoTrinhDuyet() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
}
@Test (priority=1)
public void BaoCaoInSo1(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Report/SoDangKyVBDen.aspx");
	checklistWP.Check1WP("SoDangKyVBDen");
	driver.quit();
}
@Test (priority=2)
public void BaoCaoInSo2(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Report/SoDangKiVBDi.aspx");
	checklistWP.Check1WP("SoDangKyVBDi");
	driver.quit();
}
@Test (priority=3)
public void BaoCaoInSo3(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Report/BaoCaoTinhHinhVBDen.aspx");
	checklistWP.Check1WP("BaoCaoTinhHinhVBDen");
	driver.quit();
}
@Test (priority=4)
public void BaoCaoInSo4(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Report/BaoCaoTinhHinhVBDi.aspx");
	checklistWP.Check1WP("BaoCaoTinhHinhVBDi");
	driver.quit();
}
@Test (priority=5)
public void BaoCaoInSo5(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Report/InTheoTieuChiVBDen.aspx");
	checklistWP.Check1WP("InTheoTieuChiVBDen");
	driver.quit();
}
@Test (priority=6)
public void BaoCaoInSo6(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Report/InTheoTieuChiVBDi.aspx");
	checklistWP.Check1WP("InTheoTieuChiVBDi");
	driver.quit();
}





}
package checkWebpart;

import static org.testng.Assert.assertEquals;

import java.awt.event.ActionEvent;

import javax.swing.event.HyperlinkEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class checkfn extends vanBanDi{
	WebDriver driver;
@BeforeTest 
public void KhaiBaoTrinhDuyet() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
}
@Test (priority=1)
public void CauHinh1(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.LoginUserAdmin("/SignatureImage");
	assertEquals(driver.getTitle().trim(), "SignatureImage - Hình thu nhỏ");
	String url = driver.getCurrentUrl();
	Reporter.log("<a href="+ url+ " target=_blank" +">"+url+"</a>");
	System.out.println("<a hreft="+ url+">"+url+"</a>");
	driver.quit();

}

}
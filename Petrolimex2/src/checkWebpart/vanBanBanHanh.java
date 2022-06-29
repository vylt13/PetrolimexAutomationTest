package checkWebpart;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class vanBanBanHanh {
	WebDriver driver;
@BeforeTest 
public void KhaiBaoTrinhDuyet() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
}
@Test (priority=1)
public void VBBanHanh1(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/Luu.aspx");
	checklistWP.Check3WP("SearchVanBanBanHanh", "SetParameterVanBanBanHanh", "DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=2)
public void VBBanHanh2(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/ChoBanHanh.aspx");
	checklistWP.Check2WP("SetParameterVanBanBanHanh", "DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=3)
public void VBBanHanh3(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/ChoPheDuyet.aspx");
	checklistWP.Check2WP("DynamicGridSQLForm", "SetParameterVanBanDi");
	driver.quit();
}
@Test (priority=4)
public void VBBanHanh4(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/DaPheDuyet.aspx");
	checklistWP.Check2WP("DynamicGridSQLForm", "SetParameterVanBanDi");
	driver.quit();
}
@Test (priority=5)
public void VBBanHanh5(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/KhongPheDuyet.aspx");
	checklistWP.Check2WP("DynamicGridSQLForm", "SetParameterVanBanDi");
	driver.quit();
}
@Test (priority=6)
public void VBBanHanh6(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/VanBanBanHanhNew.aspx");
	checklistWP.Check1WP("VanBanBanHanhUnit_New");
	driver.quit();
}
@Test (priority=7)
public void VBBanHanh7(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/DaBanHanh.aspx");
	checklistWP.Check2WP("SetParameterVanBanBanHanh", "DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=8)
public void VBBanHanh8(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/TatCa.aspx");
	checklistWP.Check2WP("SearchVanBanBanHanh", "DynamicGridFormSearchPetroDocument");
	driver.quit();
}
@Test (priority=9)
public void VBBanHanh9(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDi/TatCa.aspx");
	checklistWP.Check2WP("SearchVanBanDocument", "DynamicGridFormSearchPetroDocument");
	driver.quit();
}
@Test (priority=10)
public void VBBanHanh10(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/UpdateDanhSachVBBH.aspx");
	checklistWP.Check1WP("UpdateDanhSachVBBanHanh");
	driver.quit();
}
@Test (priority=11)
public void VBBanHanh11(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/VanBanBanHanhEdit.aspx");
	checklistWP.Check1WP("VanBanBanHanhUnit_Edit");
	driver.quit();
}
@Test (priority=12)
public void VBBanHanh12(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/ThuHoiBoSung.aspx");
	checklistWP.Check1WP("VanBanBanHanhUnit_ThuHoiBoSung");
	driver.quit();
}
@Test (priority=13)
public void VBBanHanh13(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/PhanCong.aspx");
	checklistWP.Check1WP("PhanCongLaiBanHanh");
	driver.quit();
}
@Test (priority=14)
public void VBBanHanh14(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/VanBanBanHanhUpdate.aspx");
	checklistWP.Check1WP("VanBanBanHanhUnit_Update");
	driver.quit();
}
@Test (priority=15)
public void VBBanHanh15(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/ThongTinLuanChuyen.aspx");
	checklistWP.Check1WP("VanBanBanHanhUnit_ThongTinLuanChuyen");
	driver.quit();
}
@Test (priority=16)
public void VBBanHanh16(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanBanHanh/TaskVBDi.aspx");
	checklistWP.Check1WP("VanBanBanHanh_TaskVBDi");
	driver.quit();
}







}
package checkWebpart;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class vanBanDen {
	WebDriver driver;
@BeforeTest 
public void KhaiBaoTrinhDuyet() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
}
@Test (priority=1)
public void VBDen1(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/VanBanDenNew.aspx");
	checklistWP.Check1WP("VanBanDenUnit_New");
	driver.quit();
}
@Test (priority=2)
public void VBDen2(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/DenQuaMang.aspx");
	checklistWP.Check2WP("SetParameterVanBanDen", "DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=3)
public void VBDen3(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/Luu.aspx");
	checklistWP.Check2WP("SetParameterVanBanDen", "DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=4)
public void VBDen4(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/ChoYKienLanhDao.aspx");
	checklistWP.Check2WP("SetParameterVanBanDen", "DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=5)
public void VBDen5(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/DaGiaiQuyet.aspx");
	checklistWP.Check2WP("SetParameterVanBanDen", "DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=6)
public void VBDen6(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/DangGiaiQuyet.aspx");
	checklistWP.Check2WP("SetParameterVanBanDen", "DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=7)
public void VBDen7(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/TreHan.aspx");
	checklistWP.Check2WP("SetParameterVanBanDen", "DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=8)
public void VBDen8(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/TatCa.aspx");
	checklistWP.Check2WP("SearchVanBanDocument", "DynamicGridFormSearchPetroDocument");
	driver.quit();
}
@Test (priority=9)
public void VBDen9(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/UpdateDanhSachVBDen.aspx");
	checklistWP.Check1WP("UpdateDanhSachVBDen");
	driver.quit();
}
@Test (priority=10)
public void VBDen10(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/VanBanDenEdit.aspx");
	checklistWP.Check1WP("VanBanDenUnit_Edit");
	driver.quit();
}
@Test (priority=11)
public void VBDen11(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/ThuHoiBoSung.aspx");
	checklistWP.Check1WP("ThuHoiBoSungDenUnit");
	driver.quit();
}
@Test (priority=12)
public void VBDen12(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/CapNhatVanBan.aspx");
	checklistWP.Check1WP("CapNhatVanBanDenUnit");
	driver.quit();
}
@Test (priority=13)
public void VBDen13(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/PhanCongLai.aspx");
	checklistWP.Check1WP("PhanCongLaiVanBanDenUnit");
	driver.quit();
}
@Test (priority=14)
public void VBDen14(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/ThongTinLuanChuyen.aspx");
	checklistWP.Check1WP("ThongTinLuanChuyenDen");
	driver.quit();
}
@Test (priority=15)
public void VBDen15(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/TaskVBDen.aspx");
	checklistWP.Check1WP("TaskVanBanDenUnit");
	driver.quit();
}
@Test (priority=16)
public void VBDen16(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDen/TaskDaPhan.aspx ");
	checklistWP.Check1WP("VanBanDenUnit_TaskDaPhan");
	driver.quit();
}



}
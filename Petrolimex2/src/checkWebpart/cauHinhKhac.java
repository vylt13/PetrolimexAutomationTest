package checkWebpart;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class cauHinhKhac {
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
	driver.quit();
}
@Test (priority=7)
public void CauHinh7(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/Lists/Workflow/NewForm.aspx");
	checklistWP.Check1WP("Workflow_FormNewV1");
	driver.quit();
}
@Test (priority=8)
public void CauHinh8(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/Lists/Workflow/EditForm.aspx");
	checklistWP.Check1WP("Workflow_FormEditV1");
	driver.quit();
}
@Test (priority=9)
public void CauHinh9(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/WorkflowList.aspx");
	checklistWP.Check1WP("WorkflowListByHtmlV1");
	driver.quit();
}
@Test (priority=10)
public void CauHinh10(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/Lists/DinhNghiaQuiTrinh/NewForm.aspx");
	checklistWP.Check1WP("DinhNghiaQuiTrinh_FormNewV1");
	driver.quit();
}
@Test (priority=11)
public void CauHinh11(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/Lists/DinhNghiaQuiTrinh/EditForm.aspx");
	checklistWP.Check1WP("DinhNghiaQuiTrinh_FormEditV1");
	driver.quit();
}
@Test (priority=13)
public void CauHinh13(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/ListSettings.aspx");
	checklistWP.Check1WP("DynamicGridSQLForm");
	driver.quit();
}
@Test (priority=14)
public void CauHinh14(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/ModulePermission.aspx");
	checklistWP.Check1WP("DynamicGridSQLForm_V2");
	driver.quit();
}
@Test (priority=15)
public void CauHinh15(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/Settings_NewEdit.aspx");
	checklistWP.Check1WP("Settings_NewEdit");
	driver.quit();
}
@Test (priority=16)
public void CauHinh16(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/WorkerSignature_List.aspx");
	checklistWP.Check1WP("DynamicGridSQLForm_V1");
	driver.quit();
}
@Test (priority=17)
public void CauHinh17(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/WorkerSignature_NewEdit.aspx");
	checklistWP.Check1WP("WorkerSignature_NewEdit");
	driver.quit();
}
@Test (priority=18)
public void CauHinh18(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/SignatureError_List.aspx");
	checklistWP.Check1WP("DynamicGridSignFilesError");
	driver.quit();
}
@Test (priority=19)
public void CauHinh19(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/SignatureErrorDetails.aspx");
	checklistWP.Check1WP("SignatureErrorDetails");
	driver.quit();
}
@Test (priority=20)
public void CauHinh20(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/DetailSearchDocumentSignature.aspx");
	checklistWP.Check1WP("DetailSearchVanBan");
	driver.quit();
}
@Test (priority=21)
public void CauHinh21(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/SearchDocumentSignature.aspx");
	checklistWP.Check2WP("SearchVanBan_New", "DynamicGridSearchVanBan");
	driver.quit();
}
@Test (priority=22)
public void CauHinh22(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/ConditionList.aspx");
	checklistWP.Check1WP("ConditionsList");
	driver.quit();
}
@Test (priority=23)
public void CauHinh23(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/ModulePermission.aspx");
	checklistWP.Check1WP("DynamicGridSQLForm_V2");
	driver.quit();
}
@Test (priority=24)
public void CauHinh24(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.KiemTraMoc("/SignatureImage/MocCongTy.png");
	driver.quit();
}
@Test (priority=31)
public void CauHinh31(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/ModulePermission_NewEdit.aspx");
	checklistWP.Check1WP("ModulePermission_Form");
	driver.quit();
}
@Test (priority=37)
public void CauHinh37(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/AccessDeny.aspx");
	checklistWP.Check1WP("AccessDeny");
	driver.quit();
}
@Test (priority=47)
public void CauHinh47(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/HoSoTaiLieu21/Forms/EditForm.aspx");
	checklistWP.Check1WP("CreateVanBanDiDocument_V2");
	driver.quit();
}
@Test (priority=48)
public void CauHinh48(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/HoSoTaiLieu21/Forms/DispForm.aspx");
	checklistWP.Check1WP("CreateVanBanDiDocument_V2");
	driver.quit();
}
@Test (priority=52)
public void CauHinh52(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/HoSoTaiLieu21/Forms/DocumentsSet.aspx?ID=");
	checklistWP.Check1WP("Workflow_GuiKiemDuyet");
	driver.quit();
}


}
package checkWebpart;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class vanBanDi {
	WebDriver driver;
@BeforeTest 
public void KhaiBaoTrinhDuyet() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
}
@Test (priority=1)
public void VBDi1(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDi_New.aspx");
	checklistWP.Check1WP("CreateVanBanDiDocument_V2");
	driver.quit();
}
@Test (priority=2)
public void VBDi2(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanDi_Detail.aspx");
	checklistWP.Check4WP("Document_Info_VBD", "QLHSTL_VanBan_Detail", "DynamicGridFormVanBanFolderDocument", "WorkflowHistory_Document");
	driver.quit();
}
@Test (priority=3)
public void VBDi3(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Popup_QLHSTL_VanBan_Edit.aspx");
	checklistWP.Check1WP("Popup_QLHSTL_VanBan_Edit");
	driver.quit();
}
@Test (priority=4)
public void VBDi4() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Workflow_XuLyQuyTrinhV2_Document.aspx");
	checklistWP.Check1WP("Workflow_XuLyQuyTrinhV2_Document");
	driver.quit();
} 	
@Test (priority=5)
public void VBDi5() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanCuaToi/DangSoanThao.aspx");
	checklistWP.Check2WP("SetParameterVanBanDi","DynamicGridSQLForm");
	driver.quit();
} 	
@Test (priority=6)
public void VBDi6() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanCuaToi/ChoPheDuyet.aspx");
	checklistWP.Check2WP("SetParameterVanBanDi","DynamicGridSQLForm");
	driver.quit();
} 	
@Test (priority=7)
public void VBDi7() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanCuaToi/DaPheDuyet.aspx");
	checklistWP.Check2WP("SetParameterVanBanDi","DynamicGridSQLForm");
	driver.quit();
} 	
@Test (priority=8)
public void VBDi8() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanCuaToi/KhongPheDuyet.aspx");
	checklistWP.Check2WP("SetParameterVanBanDi","DynamicGridSQLForm");
	driver.quit();
} 
@Test (priority=9)
public void VBDi9() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/VanBanCuaToi/TatCa.aspx");
	checklistWP.Check2WP("DynamicGridFormSearchPetroDocument","SearchVanBanDocument");
	driver.quit();
} 
@Test (priority=10)
public void VBDi10() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/Popup_QLHSTL_HoSoTaiLieuKhac_Edit.aspx");
	checklistWP.Check1WP("Popup_HSTL_HoSoTaiLieuKhac_Edit");
	driver.quit();
} 
@Test (priority=11)
public void VBDi11() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/Popup_QLHSTL_BienBanThanhToan_Edit.aspx");
	checklistWP.Check1WP("Popup_HSTL_BienBanThanhToan_Edit");
	driver.quit();
} 
@Test (priority=12)
public void VBDi12() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/Popup_QLHSTL_HopDong_Edit.aspx");
	checklistWP.Check1WP("Popup_HSTL_HopDong_Edit");
	driver.quit();
} 
@Test (priority=13)
public void VBDi13() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/Popup_QLHSTL_BienBanNoiBo_Edit.aspx");
	checklistWP.Check1WP("Popup_HSTL_BienBanNoiBo_Edit");
	driver.quit();
} 
@Test (priority=14)
public void VBDi14() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/Popup_QLHSTL_ToTrinhBaoCaoNoiBo_Edit.aspx");
	checklistWP.Check1WP("Popup_HSTL_ToTrinhBaoCaoNoiBo_Edit");
	driver.quit();
} 
@Test (priority=15)
public void VBDi15(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/SitePages/Popup_QLHSTL_ToTrinhNoiBo_Edit.aspx");
	checklistWP.Check1WP("Popup_HSTL_ToTrinhNoiBo_Edit");
	driver.quit();
} 
@Test (priority=16)
public void VBDi16(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/ChuyenXuLy_Document.aspx");
	checklistWP.Check1WP("UserReplaceForm_Document");
	driver.quit();
} 
@Test (priority=17)
public void VBDi17(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/ThemVanBanVaoBoHoSo.aspx");
	checklistWP.Check1WP("HSTL_ThemHoSo");
	driver.quit();
}
@Test (priority=18)
public void VBDi18(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Popup_BoHoSo_Edit.aspx");
	checklistWP.Check1WP("HSTL_Popup_BoHoSo_Edit");
	driver.quit();
} 
@Test (priority=19)
public void VBDi19(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/HoSoLuuTru/XemTheoPhongBan.aspx");
	checklistWP.Check1WP("ViewDocumentByDepartment");
	driver.quit();
}  
@Test (priority=20)
public void VBDi20(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/HoSoLuuTru/DanhSachBoHoSo.aspx");
	checklistWP.Check1WP("HSTL_DanhSachBoHoSo");
	driver.quit();
} 
@Test (priority=21)
public void VBDi21(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/BoHoSo.aspx");
	checklistWP.Check1WP("HSTL_BoHoSo");
	driver.quit();
} 
@Test (priority=22)
public void VBDi22(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Popup_AddAttachFile.aspx");
	checklistWP.Check1WP("Popup_AddAttachFile");
	driver.quit();
} 
@Test (priority=23)
public void VBDi23(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/Popup_EditFile.aspx");
	checklistWP.Check1WP("Popup_HSTL_EditFile");
	driver.quit();
} 
@Test (priority=24)
public void VBDi24(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/LinhVucManagementSQL.aspx");
	checklistWP.Check1WP("LinhVucManagementSQL");
	driver.quit();
} 
@Test (priority=25)
public void VBDi25(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/CheckDepartment.aspx");
	checklistWP.Check1WP("CheckDepartment");
	driver.quit();
} 
@Test (priority=26)
public void VBDi26(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/LoaiVanBan.aspx");
	checklistWP.Check1WP("VanBanListGrid");
	driver.quit();
} 
@Test (priority=27)
public void VBDi27(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/QLHSTL_HoSoTaiLieuKhac.aspx");
	checklistWP.Check1WP("HSTL_HoSoTaiLeuKhac_FormNew");
	driver.quit();
} 
@Test (priority=28)
public void VBDi28(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/QLHSTL_BienBanNoiBo.aspx");
	checklistWP.Check1WP("HSTL_BienBanNoiBo_FormNew");
	driver.quit();
} 
@Test (priority=29)
public void VBDi29(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/QLHSTL_BienBanThanhToan.aspx");
	checklistWP.Check1WP("HSTL_BienBanThanhToan_FormNew");
	driver.quit();
} 
@Test (priority=30)
public void VBDi30(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/QLHSTL_ToTrinhBaoCaoNoiBo.aspx");
	checklistWP.Check1WP("HSTL_ToTrinhBaoCaoNoiBo_FormNew");
	driver.quit();
} 
@Test (priority=31)
public void VBDi31(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/QLHSTL_HopDong.aspx");
	checklistWP.Check1WP("HSTL_HopDong_FromNew");
	driver.quit();
} 
@Test (priority=32)
public void VBDi32(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/new_document.aspx");
	checklistWP.Check1WP("DanhSachQuyTrinhPheDuyetV2");
	driver.quit();
} 
//@Test (priority=33)
public void VBDi33(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/CheckPermission.aspx");
	checklistWP.Check1WP("CheckPermissionRedirect");
	driver.quit();
} 
//@Test (priority=34)
public void VBDi34(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/VanBanDi/Forms/EditForm.aspx");
	checklistWP.Check1WP("CreateVanBanDiDocument_V2");
	driver.quit();
} 
//@Test (priority=35)
public void VBDi35(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/VanBanDi/Forms/DispForm.aspx");
	checklistWP.Check1WP("CreateVanBanDiDocument_V2");
	driver.quit();
} 
@Test (priority=36)
public void VBDi36(){
	WebDriver driver = new ChromeDriver();
	ChecklistWP checklistWP = new ChecklistWP(driver);
	checklistWP.EditWp("/vanban/SitePages/PopupChonHoSo.aspx");
	checklistWP.Check1WP("HSTL_PopupChonHoSo");
	driver.quit();
} 















}
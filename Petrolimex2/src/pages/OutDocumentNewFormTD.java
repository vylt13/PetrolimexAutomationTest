package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OutDocumentNewFormTD {
	WebDriver driver;
	String file01 = "C:\\\\Users\\\\Admin\\\\Desktop\\\\File\\\\VanBanChinh.docx";
	String file02 = "C:\\\\Users\\\\Admin\\\\Desktop\\\\File\\\\MauBieu03.docx";
	String urlAfterCancelForm = "https://daotaoeoffice.petrolimex.com.vn/plxbn/vanban/VanBanDi/Forms/AllItems.aspx";
	String outDocumentUrl = "https://daotaoeoffice.petrolimex.com.vn/vanban/SitePages/VanBanBanHanh/VanBanBanHanhNew.aspx";
public OutDocumentNewFormTD(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// Trich yeu
By trichYeu = By.id("ctl00_ctl45_g_ae443f86_c94e_4f58_886e_7de65e3028c8_txtTrichYeu");
// Upload file 01
By upload = By.id("ctl00_ctl45_g_ae443f86_c94e_4f58_886e_7de65e3028c8_upFile1");
// Them moi 01 dong Upload file
By uploadMore01 = By.id("ctl00_ctl45_g_ae443f86_c94e_4f58_886e_7de65e3028c8_btnAddRow1");
// Upload file 02 
By upload02 = By.id("ctl00_ctl45_g_ae443f86_c94e_4f58_886e_7de65e3028c8_upFile2");
// Button Gui
By btnPhatHanh = By.id("ctl00_ctl45_g_ae443f86_c94e_4f58_886e_7de65e3028c8_btnPhatHanh");
// Button Thoát
By closeBtn = By.id("ctl00_ctl46_g_f70b7457_c7a6_4bb9_9afe_618455e704f5_ctl05_ctl00_diidIOGoBack");
// Button SigOut
By signOutBtn = By.id("ulmnSetting");
//icon Loading
By loadingIcon = By.id("divLoading");
// Chon KV1
By donvi = By.xpath("//a[@title='All to Right']//span[@class='rlbButtonText']");
//Truy cập ThemMoiVanBanDuThao
public void CreateNewForm() {
	driver.get(outDocumentUrl);
}
// Thực hiện Action Form

public void selectLoaiVB() {
	Select selectLoaiVanBan = new Select(driver.findElement(By.id("ctl00_ctl46_g_f70b7457_c7a6_4bb9_9afe_618455e704f5_ddlLoaiVanBan")));
	selectLoaiVanBan.selectByValue("49;#Báo cáo");
}
public void inputTrichYeu(String TrichYeu) {
	driver.findElement(trichYeu).sendKeys(TrichYeu);
}
public void UploadFile() {
	driver.findElement(upload).sendKeys(file01);
	driver.findElement(uploadMore01).click();
	driver.findElement(upload02).sendKeys(file02);
}
public void SelectDonVi() {
	driver.findElement(donvi).click();
}
public void submitForm() {
	driver.findElement(btnPhatHanh).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
}
public void signOut() {
	driver.findElement(signOutBtn).click();
}
public void ValidateCloseForm() {
	assertEquals(driver.getCurrentUrl(), urlAfterCancelForm);	
}
}

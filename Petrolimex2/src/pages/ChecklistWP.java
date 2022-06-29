package pages;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ChecklistWP {
	WebDriver driver;
	String baseUrl = "https://daotaoeoffice.petrolimex.com.vn/plxkv1";
	String userKhoiTaoVBKhongKySo = "eoff.kv1xn.cv1"; String pwUserKhoiTao = "vtpt@123";
	String userKhoiTaoHSLT = "eoff.kv1xn.cv1"; String pwUserKhoiTaoHSLT = "vtpt@123";
	String userChapThuan = "eoff.dn.tp"; String pwUserChapThuan = "123321";
	String userPheDuyet = "eoff.dn.ct"; String pwUserPheDuyet = "123321";
	String userVanThu = "eoff.kv1xn.vthu"; String pwUserVanThu = "vtpt@123";
	String userChuTich = "eoff.kv1xn.ct"; String pwUserChuTich = "vtpt@123";
	String userTgd = "eoff.kv1xn.gd"; String pwUserTgd = "vtpt@123";
	String userTphongThucHien = "eoff.kv1xn.tp"; String pwUserTphongThucHien ="vtpt@123";
	String userTphongPheDuyet = "eoff.kv1xn.tp"; String pwUserTphongPheDuyet ="vtpt@123";
	String userNvienThucHien ="eoff.kv1xn.cv1"; String pwNvienThucHien ="vtpt@123";
	String userDuocChiaSeVBDen = "eoff.kv1xn.cv1"; String pwUserDuocChiaSeVBDen = "vtpt@123";
	String userDuocChuyenXuLy = "eoff.kv1xn.cv2"; String pwUserDuocChuyenXuly = "vtpt@123";
	String userVanThuPlxkv1xn = "eoff.kv1xn.vthu"; String pwUserVanThuPlxkv1xn = "vtpt@123";
	String userVanThuB12 = "eoff.b12.vthu"; String pwUserVanThuB12 = "123456";
	String userNhanVbBanHanh = "eoff.kv1xn.cv2"; String pwUserNhanVbBanHanh = "vtpt@123";
	String userTrongGroupNhanVbBanHanh = "eoff.kv1xn.tp"; String pwUserTrongGroupNhanVbBanHanh = "vtpt@123";
	String userKhoiTaoVBKySo = "eoff.kv1xn.cv1"; String pwUserKhoiTaoVBKySo = "vtpt@123";
	String userKhoiTaoVBKySoCoWN = "eoff.kv1xn.cv2"; String pwUserKhoiTaoVBKySoCoWN = "vtpt@123";
	String userKhoiTaoHSTL = "eoff.kv1xn.cv1"; String pwUserKhoiTaoHSTL = "vtpt@123";
	String userPheDuyetHSTL = "eoff.kv1xn.ct"; String pwUserPheDuyetHSTL = "vtpt@123";
	String userCapNhatHSLT = "eoff.kv1xn.cv2"; String pwUserCapNhatHSLT = "123456";
	String userXuLyVB2 = "eoff.kv1xn.cv2"; String pwUserXuLyVB2 = "vtpt@123";
	String userAdmin ="adminsp"; String pwUserAdmin = "Plx22@!@#$%";
	
 	String passWord = "vtpt@123";
public ChecklistWP(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// Tieu de form
By userNameField = By.id("ctl00_PlaceHolderMain_signInControl_UserName");
// Trich yeu
By passwordField = By.id("ctl00_PlaceHolderMain_signInControl_password");
// Button Login
By loginBtn = By.id("ctl00_PlaceHolderMain_signInControl_login");
// Sign out
By signOutBtn = By.id("ulmnSetting");

// Truy cap site
public void NavigateToSite() {
	driver.get(baseUrl);
}
// Truy cap form

public void LoginUserAdmin(
		String page) {
	driver.get(baseUrl);
	driver.findElement(userNameField).sendKeys(userAdmin);
	driver.findElement(passwordField).sendKeys(pwUserAdmin);
	driver.findElement(loginBtn).click();
	driver.get(baseUrl+page);
}

public void EditWp(
		String page) {
	driver.get(baseUrl);
	driver.findElement(userNameField).sendKeys(userAdmin);
	driver.findElement(passwordField).sendKeys(pwUserAdmin);
	driver.findElement(loginBtn).click();
	driver.get(baseUrl+page);
	String currentUrl = driver.getCurrentUrl();
	Reporter.log("<a href="+ currentUrl+ " target=_blank" +">"+ currentUrl +"</a>");
	driver.findElement(By.xpath("//span[contains(@id,'SiteActionsMenu')]")).click();
	driver.findElement(By.xpath("//div[contains(@id,'EditPage')]")).click();
}
public void Check1WP(
		String wpTitle) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[contains(text(),'Thêm Phần Web')]")));
	String wp1Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[2]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span[1]")).getText().trim();
	System.out.println(wp1Title);
	assertEquals(wp1Title, wpTitle);
}
public void Check2WP(
		String wp1,
		String wp2) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[contains(text(),'Thêm Phần Web')]")));
	String wp1Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[2]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span")).getText().trim();
	String wp2Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[3]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span")).getText().trim();
	ArrayList<String> DanhSachWp = new ArrayList<String>();
	DanhSachWp.add(wp1Title);
	DanhSachWp.add(wp2Title);
	assertEquals(DanhSachWp.contains(wp1), true);
	assertEquals(DanhSachWp.contains(wp2), true);
}
public void Check3WP(
		String wp1,
		String wp2,
		String wp3) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[contains(text(),'Thêm Phần Web')]")));
	String wp1Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[2]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span")).getText().trim();
	String wp2Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[3]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span")).getText().trim();
	String wp3Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[4]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span")).getText().trim();
	ArrayList<String> DanhSachWp = new ArrayList<String>();
	DanhSachWp.add(wp1Title);
	DanhSachWp.add(wp2Title);
	DanhSachWp.add(wp3Title);
	assertEquals(DanhSachWp.contains(wp1), true);
	assertEquals(DanhSachWp.contains(wp2), true);
	assertEquals(DanhSachWp.contains(wp3), true);
}
public void Check4WP(
		String wp1,
		String wp2,
		String wp3,
		String wp4) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a//span[contains(text(),'Thêm Phần Web')]")));
	String wp1Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[2]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span")).getText().trim();
	String wp2Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[3]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span")).getText().trim();
	String wp3Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[4]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span")).getText().trim();
	String wp4Title = driver.findElement(By.xpath("//div[@id='MSOZone']//div[5]//h2[@class='ms-webpart-titleText-withMenu ms-webpart-titleText']//span")).getText().trim();
	ArrayList<String> DanhSachWp = new ArrayList<String>();
	DanhSachWp.add(wp1Title);
	DanhSachWp.add(wp2Title);
	DanhSachWp.add(wp3Title);
	DanhSachWp.add(wp4Title);
	assertEquals(DanhSachWp.contains(wp1), true);
	assertEquals(DanhSachWp.contains(wp2), true);
	assertEquals(DanhSachWp.contains(wp3), true);
	assertEquals(DanhSachWp.contains(wp4), true);
}
public void LogReport() {
	String currentUrl = driver.getCurrentUrl();
	Reporter.log(currentUrl);
}
public void KiemTraMoc(
		String page) {
	driver.get(baseUrl);
	driver.findElement(userNameField).sendKeys(userAdmin);
	driver.findElement(passwordField).sendKeys(pwUserAdmin);
	driver.findElement(loginBtn).click();
	driver.get(baseUrl+page);
	String currentUrl = driver.getCurrentUrl();
	Reporter.log(currentUrl);
	assertEquals(driver.getTitle(), "MocCongTy.png (100×100)");
}

}

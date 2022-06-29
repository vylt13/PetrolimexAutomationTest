package pages;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Login {
	WebDriver driver;
	String tapDoanUrl = "https://daotaoeoffice.petrolimex.com.vn/";
	String baseUrl = "https://daotaoeoffice.petrolimex.com.vn/plxkv1/";
	String userKhoiTaoVBKhongKySo = "eoff.kv1.cv1"; String pwUserKhoiTao = "vtpt@2022";
	String userKhoiTaoHSLT = "eoff.kv1.cv1"; String pwUserKhoiTaoHSLT = "vtpt@2022";
	String userChahnn = "eoff.kv1.tp"; String pwUserChahnn = "vtpt@2022";
	String userPheDuyet = "eoff.kv1.ct"; String pwUserPheDuyet = "vtpt@2022";
	String userVanThu = "eoff.kv1.vthu"; String pwUserVanThu = "vtpt@2022";
	String userChuTich = "eoff.kv1.ct"; String pwUserChuTich = "vtpt@2022";
	String userTgd = "eoff.kv1.gd"; String pwUserTgd = "vtpt@2022";
	String userTphongThucHien = "eoff.kv1.tp"; String pwUserTphongThucHien ="vtpt@2022";
	String userTphongPheDuyet = "eoff.kv1.tp"; String pwUserTphongPheDuyet ="vtpt@2022";
	String userNvienThucHien ="eoff.kv1.cv1"; String pwNvienThucHien ="vtpt@2022";
	String userDuocChiaSeVBDen = "eoff.kv1.cv1"; String pwUserDuocChiaSeVBDen = "vtpt@2022";
	String userDuocChuyenXuLy = "eoff.kv1.cv2"; String pwUserDuocChuyenXuly = "vtpt@2022";
	String userVanThuPlxhnn = "eoff.kv1.vthu"; String pwUserVanThuPlxhnn = "vtpt@2022";
	String userVanThuB12 = "eoff.b12.vthu"; String pwUserVanThuB12 = "vtpt@2022";
	String userNhanVbBanHanh = "eoff.kv1.cv2"; String pwUserNhanVbBanHanh = "vtpt@2022";
	String userTrongGroupNhanVbBanHanh = "eoff.kv1.tp"; String pwUserTrongGroupNhanVbBanHanh = "vtpt@2022";
	String userKhoiTaoVBKySo = "eoff.kv1.cv1"; String pwUserKhoiTaoVBKySo = "vtpt@2022";
	String userKhoiTaoVBKySoCoWN = "eoff.kv1.cv2"; String pwUserKhoiTaoVBKySoCoWN = "vtpt@2022";
	String userKhoiTaoHSTL = "eoff.kv1.cv2"; String pwUserKhoiTaoHSTL = "vtpt@2022";
	String userPheDuyetHSTL = "eoff.kv1.ct"; String pwUserPheDuyetHSTL = "vtpt@2022";
	String userCapNhatHSLT = "eoff.kv1.cv2"; String pwUserCapNhatHSLT = "123456";
	String userXuLyVB2 = "eoff.kv1.cv2"; String pwUserXuLyVB2 = "vtpt@2022";
	String userAdmin ="adminsp"; String pwUserAdmin = "VT2022@123!@#";
	String userTpLienQuan = "eoff.kv1.tphc"; String pwUserTpLienQuan = "vtpt@2022";
	String userLdDongPheDuyet = "eoff.kv1.pgd"; String pwUserLdDongPheDuyet = "vtpt@2022";
 	String passWord = "vtpt@2022";
public Login(WebDriver driver) {
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
public void NavigateToSiteTD() {
	driver.get(tapDoanUrl);
}
// Truy cap form
public void NavigateToNewInDocumentForm() {
//	driver.get(inDocumentNewFormUrl);	
	driver.get(baseUrl + "vanban/SitePages/VanBanDen/VanBanDenNew.aspx");
}
//	Truy cap danh sach VB Dang luu
public void NavigateToDanhSachVBDangLuu() {
//	driver.get(vanBanDenDangLuuUrl);
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='DynamicManage']//table//tbody//tr[1]")));
	driver.findElement(By.xpath("//span[contains(text(),'Đăng ký văn bản')]")).click();
//	driver.findElement(By.xpath("//span[contains(text(),'Đang lưu')]")).click();
	driver.get(baseUrl + "vanban/SitePages/VanBanDen/Luu.aspx");
	
}
public void NavigatToVBChoYKienLanhdao() {
//	driver.get(vanBanDenChoYKienLanhnn.nbaoUrl);
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='DynamicManage']//table//tbody//tr[1]")));
	driver.findElement(By.xpath("//span[contains(text(),'Đang giải quyết')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Chờ ý kiến Lãnh đạo')]")).click();
}
public void NavigateToVBDangGiaiQuyet() {
//	driver.get(vanBanDenDangGiaiQuyetUrl);
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='DynamicManage']//table//tbody//tr[1]")));
	driver.findElement(By.xpath("//span[contains(text(),'Đang giải quyết')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'VB đang giải quyết')]")).click();
}
public void NavigateToTatCaVBDen() {
//	driver.get(vanBanDenTatCaUrl);
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'Tất cả')]"))));
	driver.findElement(By.xpath("//span[contains(text(),'Tất cả')]")).click();
}
public void NavigateToTrangChuVB() {
//	driver.get(trangChuVBUrl);
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[2]//span")));
	driver.findElement(By.xpath("//span[@class='menu-item-text'][contains(text(),'Văn bản')]")).click();
}
public void NavigateToVBDaGiaiQuyet() {
//	driver.get(vanBanDenDaGiaiQuyetUrl);
//	WebDriverWait wait = new WebDriverWait(driver, 10);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='DynamicManage']//table//tbody//tr[1]")));
	driver.findElement(By.xpath("//span[contains(text(),'Đã giải quyết')]")).click();
}
public void NavigateToThemMoiVbDuThaoKhongKySo() throws InterruptedException {
	driver.get(baseUrl + "/vanban/SitePages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi không ký số')]")).click();
}
public void NavigateToThemMoiVbKySo() throws InterruptedException {
	driver.get(baseUrl + "/vanban/SitePages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi có ký số')]")).click();
}
public void NavigateToThemMoiUser() throws InterruptedException {
	driver.get(baseUrl+"Lists/NhanVien/NewForm.aspx?");
	Thread.sleep(1500);
	//driver.findElement(By.xpath("//input[@value='Tạo mới']")).click();
}
public void NavigateToDanhSachVBDuThaoDangSoan() throws InterruptedException {
	driver.get(baseUrl + "/vanban/SitePages/VanBanCuaToi/DangSoanThao.aspx");
//	driver.findElement(By.xpath("//span[contains(text(),'Văn bản của tôi')]")).click();
//	Thread.sleep(2000);
////	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Đang soạn thảo']")));
//	driver.findElement(By.xpath("//span[normalize-space()='Đang soạn thảo']")).click();
//	Thread.sleep(2000);
}
public void NavigateToDanhSachVBDuThaoChoPheDuyet() throws InterruptedException {
	driver.get(baseUrl + "/vanban/SitePages/VanBanCuaToi/ChoPheDuyet.aspx");
//	driver.findElement(By.xpath("//span[contains(text(),'Văn bản của tôi')]")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//li[@class='has-sub root-level opened']//span[contains(text(),'Chờ phê duyệt')]")).click();
//	Thread.sleep(2000);
}
public void NavigateToDanhSachVbDuThaoDaPheDuyet() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản của tôi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='has-sub root-level opened']//span[contains(text(),'Đã phê duyệt')]")).click();
	Thread.sleep(2000);
}
public void NavigateToDanhSachVanBanDiChoPheDuyet() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='has-sub root-level opened']//span[contains(text(),'Chờ phê duyệt')]")).click();
	Thread.sleep(2000);
}
public void NavigateToDanhSachVanBanDiDaPheDuyet() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='has-sub root-level opened']//span[contains(text(),'Đã phê duyệt')]")).click();
	Thread.sleep(2000);
}
public void NavigateToThemMoiVBBanHanh() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Ban hành']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='has-sub opened']//span[contains(text(),'Thêm mới')]")).click();
}
public void NavigateToDanhSachVbBanHanhDangLuu() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Ban hành']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='has-sub opened']//span[contains(text(),'Đang lưu')]")).click();
}
public void NavigateToVanBanDaPhatHanh() throws InterruptedException {
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Ban hành']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='has-sub opened']//span[contains(text(),'Đã ban hành')]")).click();
}
// Thực hiện Action Login
public void inputUserPass (String user, String password) {
	driver.findElement(userNameField).sendKeys(user);
	driver.findElement(passwordField).sendKeys(password);
	driver.findElement(loginBtn).click();
}
public void LoginNhanVienKhoiTao() {
	driver.findElement(userNameField).sendKeys(userKhoiTaoHSLT);
	driver.findElement(passwordField).sendKeys(pwUserKhoiTaoHSLT);
	driver.findElement(loginBtn).click();
}
public void LoginNhanVienKhoiTaoKySo() {
	driver.findElement(userNameField).sendKeys(userKhoiTaoVBKySo);
	driver.findElement(passwordField).sendKeys(pwUserKhoiTaoVBKySo);
	driver.findElement(loginBtn).click();
}
public void LoginNhanVienKhoiTaoKySoCoWN() {
	driver.findElement(userNameField).sendKeys(userKhoiTaoVBKySoCoWN);
	driver.findElement(passwordField).sendKeys(pwUserKhoiTaoVBKySoCoWN);
	driver.findElement(loginBtn).click();
}
public void LoginUserChahnn() {
	driver.findElement(userNameField).sendKeys(userChahnn);
	driver.findElement(passwordField).sendKeys(pwUserChahnn);
	driver.findElement(loginBtn).click();
}
public void LoginUserPheDuyet() {
	driver.findElement(userNameField).sendKeys(userPheDuyet);
	driver.findElement(passwordField).sendKeys(pwUserPheDuyet);
	driver.findElement(loginBtn).click();
}
public void LoginUserDuocChuyenXuLy() {
	driver.findElement(userNameField).sendKeys(userDuocChuyenXuLy);
	driver.findElement(passwordField).sendKeys(pwUserDuocChuyenXuly);
	driver.findElement(loginBtn).click();
}
public void LoginUserVanThu() {
	driver.findElement(userNameField).sendKeys(userVanThu);
	driver.findElement(passwordField).sendKeys(pwUserVanThu);
	driver.findElement(loginBtn).click();
}
public void LoginUserChuTich() {
	driver.findElement(userNameField).sendKeys(userChuTich);
	driver.findElement(passwordField).sendKeys(pwUserChuTich);
	driver.findElement(loginBtn).click();
}
public void LoginUserTgd() {
	driver.findElement(userNameField).sendKeys(userTgd);
	driver.findElement(passwordField).sendKeys(pwUserTgd);
	driver.findElement(loginBtn).click();
}
public void LoginVanThuTD() {
	driver.findElement(userNameField).sendKeys("eoff.vthu");
	driver.findElement(passwordField).sendKeys("vtpt@123");
	driver.findElement(loginBtn).click();
}
public void LoginVanThuPlxhnn() {
	driver.findElement(userNameField).sendKeys(userVanThuPlxhnn);
	driver.findElement(passwordField).sendKeys(pwUserVanThuPlxhnn);
	driver.findElement(loginBtn).click();
}
public void LoginVanThuB12() {
	driver.findElement(userNameField).sendKeys(userVanThuB12);
	driver.findElement(passwordField).sendKeys(pwUserVanThuB12);
	driver.findElement(loginBtn).click();
}
public void LoginUserDuocChiaSeVBDen() {
	driver.findElement(userNameField).sendKeys(userDuocChiaSeVBDen);
	driver.findElement(passwordField).sendKeys(pwUserDuocChiaSeVBDen);
	driver.findElement(loginBtn).click();
}
public void LoginTphongThucHien() {
	driver.findElement(userNameField).sendKeys(userTphongThucHien);
	driver.findElement(passwordField).sendKeys(pwUserTphongThucHien);
	driver.findElement(loginBtn).click();
}
public void LoginTruongPhongPheDuyetVbDuThao() {
	driver.findElement(userNameField).sendKeys(userTphongPheDuyet);
	driver.findElement(passwordField).sendKeys(pwUserTphongPheDuyet);
	driver.findElement(loginBtn).click();
}
public void LoginNvienThucHien() {
	driver.findElement(userNameField).sendKeys(userNvienThucHien);
	driver.findElement(passwordField).sendKeys(pwNvienThucHien);
	driver.findElement(loginBtn).click();
}
public void LoginUser(
		String user) {
	driver.findElement(userNameField).sendKeys(user);
	driver.findElement(passwordField).sendKeys(passWord);
	driver.findElement(loginBtn).click();
}

public void LoginUserNhanVanBanBanHanh() {
	driver.findElement(userNameField).sendKeys(userNhanVbBanHanh);
	driver.findElement(passwordField).sendKeys(pwUserNhanVbBanHanh);
	driver.findElement(loginBtn).click();
}
public void LoginUserTrongGroupNhanVBBanHanh() {
	driver.findElement(userNameField).sendKeys(userTrongGroupNhanVbBanHanh);
	driver.findElement(passwordField).sendKeys(pwUserTrongGroupNhanVbBanHanh);
	driver.findElement(loginBtn).click();
}
public void signOut() {
	driver.findElement(signOutBtn).click();
	driver.manage().deleteAllCookies();
	driver.get(baseUrl);

}
public void LoginUserTaoHSTL() {
	driver.findElement(userNameField).sendKeys(userKhoiTaoHSTL);
	driver.findElement(passwordField).sendKeys(pwUserKhoiTaoHSTL);
	driver.findElement(loginBtn).click();
	
}
public void LoginUserPheDuyetHSTL() {
	driver.findElement(userNameField).sendKeys(userPheDuyetHSTL);
	driver.findElement(passwordField).sendKeys(pwUserPheDuyetHSTL);
	driver.findElement(loginBtn).click();
	
}
public void LoginUserXuLyVb2() {
	driver.findElement(userNameField).sendKeys(userXuLyVB2);
	driver.findElement(passwordField).sendKeys(pwUserXuLyVB2);
	driver.findElement(loginBtn).click();
	
}
public void LoginUserAdmin() {
	driver.findElement(userNameField).sendKeys(userAdmin);
	driver.findElement(passwordField).sendKeys(pwUserAdmin);
	driver.findElement(loginBtn).click();
	
}
public void LoginUserTpLienQuan() {
	driver.findElement(userNameField).sendKeys(userTpLienQuan);
	driver.findElement(passwordField).sendKeys(pwUserTpLienQuan);
	driver.findElement(loginBtn).click();
}
public void LoginUserLdDongPheDuyet() {
	driver.findElement(userNameField).sendKeys(userLdDongPheDuyet);
	driver.findElement(passwordField).sendKeys(pwUserLdDongPheDuyet);
	driver.findElement(loginBtn).click();
}
public void NavigateToFormThemMoiHopDong() throws InterruptedException  {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/SitePages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Hợp đồng')]")).click();
	
}
public void NavigateToFormThemMoiBBThanhToan() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/SitePages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Biên bản thanh toán')]")).click();
}
public void NavigateToFormThemMoiToTrinh() throws InterruptedException  {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/SitePages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Tờ trình')]")).click();
}
public void NavigateToFormThemMoiBaoCaoNoiBo() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/SitePages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Báo cáo nội bộ')]")).click();
}
public void NavigateToFormThemMoiBienBanNoiBo() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/SitePages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Biên bản nội bộ')]")).click();
}
public void NavigateToFormThemMoiHstlKhac() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/SitePages/new_document.aspx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[contains(text(),'Hồ sơ tài liệu khác')]")).click();
}
public void NavigateToFormThemMoiHSLuuTru() throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(By.xpath("//span[contains(text(),'Hồ sơ lưu trữ')]")).click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[@class='visible']//span[@class='title'][contains(text(),'Thêm mới')]"))));
	driver.findElement(By.xpath("//ul[@class='visible']//span[@class='title'][contains(text(),'Thêm mới')]")).click();
}
public void NavigateToDanhSachHSLuuTru() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//span[contains(text(),'Hồ sơ lưu trữ')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Tìm kiếm']")).click();
}
public void LoginUserCapNhatHSLT() {
	// TODO Auto-generated method stub
	driver.findElement(userNameField).sendKeys(userCapNhatHSLT);
	driver.findElement(passwordField).sendKeys(pwUserCapNhatHSLT);
	driver.findElement(loginBtn).click();
}
public void LogReport() {
	String urlForm = driver.getCurrentUrl();
	Reporter.log(urlForm);
//	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
//	driver.switchTo().window(tabs.get(1)); 
}
public void KiemTraPageAcessDeny() {
	assertEquals(driver.getTitle(), "AccessDeny");
	assertEquals(driver.findElement(By.xpath("//div[@class='Message']//span[@class='Text']")).getText(), "Bạn không có quyền xem thông tin này.");
}
public int KiemTraSoLuongTak() {
	int valueSoLuongTask = Integer.parseInt(driver.findElement(By.id("numTasks")).getText());
	return valueSoLuongTask;
}
public void ValidatePhatSinhTask(
		int so_luong_tak_truoc,
		int so_luong_task_sau) {
	assertEquals(so_luong_task_sau - so_luong_tak_truoc, 1);
}
public void ValidateHoanTatTask(
		int so_luong_tak_truoc,
		int so_luong_task_sau) {
	assertEquals(so_luong_tak_truoc - so_luong_task_sau, 1);
}
public void NavigateToTatCaVBDi() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@class='visible']//span[normalize-space()='Tất cả']")).click();
}
public void NavigateToVBDenQuaMang() throws InterruptedException {
	// TODO Auto-generated method stub
	driver.findElement(By.xpath("//span[contains(text(),'Văn bản đi')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='opened active ']//span[normalize-space()='Tất cả']")).click();
}
public void NavigatToVBChoYKienLanhDao() {
	// TODO Auto-generated method stub
	driver.get(baseUrl + "/vanban/SitePages/VanBanDen/ChoYKienLanhDao.aspx");
}
}

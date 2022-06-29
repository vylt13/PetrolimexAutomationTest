package pages;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormTaskVanDi {
	WebDriver driver;
	String file01 = "C:\\AttachFiles\\FileWord.docx";
	String inDocumentNewFormUrl = "https://daotaoeoffice.petrolimex.com.vn/plxbn/vanban/Lists/VanBanDen/ThemMoiVanBanDuThao.aspx?Source=https%3A%2F%2Fdaotaoeoffice%2Epetrolimex%2Ecom%2Evn%2Fplxbn%2Fvanban%2FLists%2FVanBanDen%2FTatCa%2Easpx&ContentTypeId=0x0100F8457C2B8B1A7D4FA6B2B4AFB3DB7340";
public FormTaskVanDi(WebDriver driver) {
	this.driver = driver;
}
// Button
By btnThoat = By.xpath("//input[contains(@id,'btnThoat')]");
By btnLuu = By.xpath("//input[contains(@id,'btnLuu')]");
By btnKetThuc = By.xpath("//input[contains(@id,'btnHoanTat')]");
By btnLapHSDT = By.xpath("//input[contains(@id,'btnLapHSDT')]");
By btnLapHSXL = By.xpath("//input[contains(@id,'btnLapHSXL')]");
By btnPhanCong = By.xpath("//input[contains(@id,'btnPhanCong')]");
//	Checkbox Phan cong
By cBoxPhanCong = By.id("chkPhanCong");
By cBoxPhanCongAllNhanVien = By.id("cbHeaderHandle");
By cBoxPhanCongNguoiXuLy2 = By.id("chbHandle209_727");
By txtYKienNguoiNhan = By.xpath("//textarea[contains (@id,'txtNguoiGiaiQuyet')]");
By ddlTrangThai = By.xpath("//select[contains(@id,'ddlTrangThai')]");
By txtTienDo = By.xpath("//input[contains(@id,'txtTienDo')]");
By txtlinkThongTinVB = By.xpath("//div//a[contains(@id,'lnkbtnThongTinVanBan')]");
By txtlinkNhiemVuDaPhanCong = By.xpath("//div//a[contains(@id,'lnkbtnNhiemVuDaPhanCong')]");
By txtlinkHoSoDuThao = By.xpath("//div[contains(@id,'divHoSoDuThaoData')]//a");
By txtlinkHoSoXuLy = By.xpath("//div[contains(@id,'divHoSoXuLyData')]//a");
//	Form Lap Ho so du thao
By tenHoSo = By.xpath("//input[contains(@id,'onetidIOFile')]");
By trichYeu = By.xpath("//textarea[contains(@id,'TxtTrichYeu')]");
By btnTiepTuc = By.xpath("//span[@class='SaveButton']");
By uploadFile = By.id("FileAttachmentUpload1");
public void CheckPhanCong() {
	driver.findElement(cBoxPhanCong).click();
}
public void CheckAllNhanVien() {
	driver.findElement(cBoxPhanCongAllNhanVien).click();
}
public void CheckPhanCongNguoiXuLy2() {
	driver.findElement(cBoxPhanCongNguoiXuLy2).click();
}
public void CapNhatTinhTrangDangThucHien(
		String y_kien_nguoi_nhan,
		String tien_do) {
	driver.findElement(txtYKienNguoiNhan).sendKeys(y_kien_nguoi_nhan);
	Select ddlTinhTrang = new Select(driver.findElement(ddlTrangThai));
	ddlTinhTrang.selectByVisibleText("Đang thực hiện");
	driver.findElement(txtTienDo).sendKeys(tien_do);
	driver.findElement(btnLuu).click();
}
public void KetThucTask(String y_kien_nguoi_nhan) {
	driver.findElement(txtYKienNguoiNhan).sendKeys(y_kien_nguoi_nhan);
	driver.findElement(btnKetThuc).click();
}
public void MoPhieuGiaiQuyet() {
	driver.findElement(txtlinkThongTinVB).click();
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTb.get(1));
}
public void LapHoSoDuThao(
		String trich_yeu_du_thao_vb,
		String filePath) throws InterruptedException {
	driver.findElement(btnLapHSDT).click();
	Thread.sleep(2000);
	driver.switchTo().frame(4);
	Thread.sleep(2000);
	driver.findElement(trichYeu).sendKeys(trich_yeu_du_thao_vb);
	driver.findElement(uploadFile).sendKeys(filePath);
	driver.findElement(btnTiepTuc).click();
}
public void LapHoSoXuLy() {
	driver.findElement(btnLapHSXL).click();
}
public void ValidateLinkHoSoDuThao(
		String ten_ho_so) {
	String linkHSDT = driver.findElement(txtlinkHoSoDuThao).getText();
	assertEquals(linkHSDT, ten_ho_so);
}
public void MoHoSoXuLy() throws InterruptedException {
	String linkHSXL = driver.findElement(txtlinkHoSoXuLy).getText();
	assertEquals(linkHSXL.contains("HSXL-VBNB"), true);
	driver.findElement(txtlinkHoSoXuLy).click();
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTb.get(1));
    driver.findElement(By.id("divLinkNewDocument")).click();
    driver.switchTo().frame(2);
    Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@id,'sp_file')]")).sendKeys(file01);
	driver.findElement(By.xpath("//input[contains(@id, 'btnSave')]")).click();
}
public void DongHoSoXuLy() {
	driver.findElement(By.xpath("//input[contains(@id,'btnDongHS')]")).click();
	driver.switchTo().alert().accept();
}
public void PhanCong(String y_kien_nguoi_nhan) {
	driver.findElement(txtYKienNguoiNhan).sendKeys(y_kien_nguoi_nhan);
	driver.findElement(btnPhanCong).click();
}
public void ValidateNhiemVuDaPhanCong(
		String nguoi_xu_ly_1,
		String nguoi_xu_ly_2) throws InterruptedException {
	driver.findElement(txtlinkNhiemVuDaPhanCong).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(4));
	Thread.sleep(2000);
	String nguoiXuLy1 = driver.findElement(By.xpath("//div[contains(@id,'divDanhSachTask')]//tr[2]//td[1]")).getText();
	String tinhTrangNguoiXuLy1 = driver.findElement(By.xpath("//div[contains(@id,'divDanhSachTask')]//tr[2]//td[4]")).getText();
	String nguoiXuLy2 = driver.findElement(By.xpath("//div[contains(@id,'divDanhSachTask')]//tr[3]//td[1]")).getText();
	String tinhTrangNguoiXuLy2 = driver.findElement(By.xpath("//div[contains(@id,'divDanhSachTask')]//tr[3]//td[4]")).getText();
	assertEquals(nguoiXuLy1, nguoi_xu_ly_1);
	assertEquals(tinhTrangNguoiXuLy1, "Chưa bắt đầu");
	assertEquals(nguoiXuLy2, nguoi_xu_ly_2);
	assertEquals(tinhTrangNguoiXuLy2, "Chưa bắt đầu");
}
public void CapNhatNhiemVuDaPhanCong(
		String nguoi_xu_ly_2) throws InterruptedException {
	driver.findElement(txtlinkNhiemVuDaPhanCong).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(4));
	Thread.sleep(2000);
	String nguoiXuLy2 = driver.findElement(By.xpath("//div[contains(@id,'divDanhSachTask')]//tr[2]//td[1]")).getText();
	String tinhTrangNguoiXuLy2 = driver.findElement(By.xpath("//div[contains(@id,'divDanhSachTask')]//tr[2]//td[4]")).getText();
	assertEquals(nguoiXuLy2, nguoi_xu_ly_2);
	assertEquals(tinhTrangNguoiXuLy2, "Chưa bắt đầu");
	driver.findElement(By.xpath("//div[contains(@id,'divDanhSachTask')]//tr[2]//td[5]")).click(); /* Click vao icon Edit */
    driver.switchTo().parentFrame();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(6));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='sp-peoplepicker-delImage']")).click(); /* Xoa user da nhap*/
	driver.findElement(By.xpath("//div[contains(@id,'pkNguoiXuLy')]//input[2]")).sendKeys("eoff.kv1.cv1"); /* Nhap user phan cong lai*/
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'pkNguoiXuLy')]//input[2]")).sendKeys(Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'pkNguoiXuLy')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[contains(@id,'pkNguoiXuLy')]//li[1]//a")).click();
	Thread.sleep(3000);
	driver.findElement(btnLuu).click();
}
public void Luu() {
	driver.findElement(btnLuu).click();
}
public void Thoat() {
	driver.findElement(btnThoat).click();
}
public void waitingForLoading() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
}
}

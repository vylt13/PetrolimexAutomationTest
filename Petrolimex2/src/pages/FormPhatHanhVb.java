package pages;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPhatHanhVb {
	WebDriver driver;
	String urlAfterCancelForm = "https://daotaoeoffice.petrolimex.com.vn/plxbn/vanban/VanBanDi/Forms/AllItems.aspx";
	String outDocumentUrl = "https://daotaoeoffice.petrolimex.com.vn/vanban/SitePages/VanBanBanHanh/VanBanBanHanhNew.aspx";
	String outDocumentUrlDV = "https://daotaoeoffice.petrolimex.com.vn/plxkv1/vanban/Lists/VanBanBanHanh/ThemMoiVanBanDuThao.aspx?Source=http%3A%2F%2Feoffice%2Epetrolimex%2Ecom%2Evn%2Fplxkv1%2Fvanban%2FLists%2FVanBanBanHanh%2FAllItems.aspx&ContentTypeId=0x0100824CBFFB1684BB4BA1387C029CCEC9B3";
public FormPhatHanhVb(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// Trich yeu
By labelLoaiVanBan = By.xpath("//span[contains(@id,'lbVLoaiVB')]");
By trichYeu = By.xpath("//textarea[contains(@id,'txtTrichYeu')]");
By labelTrichYeu = By.xpath("//span[contains(@id,'lbVTrichYeu')]");
// Upload file 01
By upload = By.xpath("//input[contains(@id,'upFile1')]");
// Them moi 01 dong Upload file
By uploadMore01 = By.xpath("//input[contains(@id,'btnAddRow1')]");
// Upload file 02 
By upload02 = By.xpath("//input[contains(@id,'upFile2')]");
By nguoiNhanVb = By.xpath("//div[contains(@id,'CaNhanTrongDonVi')]//input[2]");
By linhVuc = By.xpath("//input[contains(@id,'txtLinhVuc')]");
By ngayHieuLuc = By.xpath("//input[contains(@id,'NgayHieuLucDate')]");
By doKhan = By.id("ddlDoKhan");
By doMat = By.id("ddlDoMat");
By soBan = By.xpath("//input[@class='soban']");
By soTrang = By.xpath("//input[contains(@id,'txtSoTrang')]");
By nguoiKyVanBan = By.xpath("//select[contains(@id,'NguoiKyVanBan')]");
By nguoiSoanThao = By.xpath("//div[contains(@id,'NguoiSoanThao')]//input[2]");
By iconChonDonVi = By.xpath("//table[@class='rlbButtonAreaRight']//a[@title='To Right']");
// Button Gui
By btnPhatHanh = By.xpath("//div[@class='Buttons']//input[contains(@id,'btnPhatHanh')]");
By btnLuu = By.xpath("//div[@class='Buttons']//input[contains(@id,'btnLuu')]");
By btnThuHoiBoSung = By.xpath("//div[@class='Buttons']//input[contains(@id,'btnThuHoiBoSung')]");
By rdbtThuHoi = By.xpath("//div//input[contains(@id,'rbThuHoi')]");
By btnSuaThongTin = By.xpath("//div//input[contains(@id,'btnSuaThongTin')]");
By btnLapPhieuGiaiQuyet = By.xpath("//div//input[contains(@id,'btnPhanCong')]");
By yKienLanhDaoPhanCongVanBanBanHanh = By.xpath("//textarea[contains(@id,'txtYKienChiHuy')]");
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
public void CreateNewFormDV() {
	driver.get(outDocumentUrlDV);
}
// Thực hiện Action Form

public void ThemMoiVbBanHanh(
	String loai_van_ban,
	String trich_yeu,
	String file01,
	String file02,
	String nguoi_nhan_vb,
	String group_nhan_vb,
	String linh_vuc,
	String ngay_hieu_luc,
	String do_khan,
	String do_mat,
	String so_ban,
	String so_trang,
	String nguoi_soan_thao) throws InterruptedException {
	Select selectLoaiVanBan = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlLoaiVanBan')]")));
	selectLoaiVanBan.selectByVisibleText(loai_van_ban);
	driver.findElement(trichYeu).sendKeys(trich_yeu);
	driver.findElement(upload).sendKeys(file01);
	driver.findElement(uploadMore01).click();
	driver.findElement(upload02).sendKeys(file02);
	driver.findElement(linhVuc).sendKeys(linh_vuc);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li//span")).click();
	driver.findElement(ngayHieuLuc).sendKeys(ngay_hieu_luc);
	Select selectDoKhan = new Select(driver.findElement(doKhan));
	selectDoKhan.selectByVisibleText(do_khan);
	Select selectDoMat = new Select(driver.findElement(doMat));
	selectDoMat.selectByVisibleText(do_mat);
	driver.findElement(soBan).sendKeys(so_ban);
	driver.findElement(soTrang).sendKeys(so_trang);
	driver.findElement(nguoiSoanThao).sendKeys(nguoi_soan_thao, Keys.TAB, Keys.ENTER);
	Thread.sleep(50);
	driver.findElement(nguoiNhanVb).sendKeys(nguoi_nhan_vb, Keys.TAB, Keys.ENTER);
	Thread.sleep(100);
	driver.findElement(nguoiNhanVb).sendKeys(group_nhan_vb, Keys.TAB, Keys.ENTER);
	Thread.sleep(100);
}
public void ChonDonViPhatHanh() {
	driver.findElement(By.xpath("//div[@id='rlb_DonVi_Source']//div[@class='rlbGroup rlbGroupRight']//ul//li[@id='i1']")).click();
	driver.findElement(iconChonDonVi).click();
	driver.findElement(By.xpath("//div[@id='rlb_DonVi_Source']//div[@class='rlbGroup rlbGroupRight']//ul//li[@id='i2']")).click();
	driver.findElement(iconChonDonVi).click();
	driver.findElement(By.xpath("//div[@id='rlb_DonVi_Source']//div[@class='rlbGroup rlbGroupRight']//ul//li[@id='i3']")).click();
	driver.findElement(iconChonDonVi).click();
}
public void ChonNguoiNhanVB(
		String nguoi_nhan_vb,
		String group_nhan_vb) {
	driver.findElement(nguoiNhanVb).sendKeys(nguoi_nhan_vb, Keys.TAB, Keys.ENTER);
	driver.findElement(nguoiNhanVb).sendKeys(group_nhan_vb, Keys.TAB, Keys.ENTER);
}
public void ChinhSuaVbBanHanh(
		String trich_yeu_edit,
		String file03,
		String fileName03) throws InterruptedException {
		driver.findElement(btnSuaThongTin).click();
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
		driver.findElement(trichYeu).clear();
		driver.findElement(trichYeu).sendKeys(trich_yeu_edit);
		driver.findElement(By.xpath("//table[@id='tbAttachDoc']//tr[2]//td[3]//input")).click();
		driver.switchTo().alert().accept();
		driver.findElement(upload).sendKeys(file03);
		driver.findElement(By.xpath("//input[contains(@id, 'btnSuaThongTinVanBan')]")).click();
//	Kiem tra thong tin da chinh sua
		assertEquals(driver.findElement(labelTrichYeu).getText(), trich_yeu_edit);
		assertEquals(driver.findElement(By.xpath("//div[contains(@id, 'divDinhKem')]//tr[3]//td[1]//a")).getAttribute("textContent"), fileName03);
	}
public void PhatHanh() {
	driver.findElement(btnPhatHanh).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
}
public void PhatHanhVbTuVbDuThao(
		String trich_yeu,
		String fileName01,
		String fileName02,
		String do_mat,
		String nguoi_ky_vb,
		String nguoi_nhan_vb,
		String group_nhan_vb) {
//	Validate thong tin tu Du Thao
	assertEquals(driver.findElement(trichYeu).getAttribute("textContent"), trich_yeu);
//	assertEquals(driver.findElement(By.xpath("//table[@id='tbAttachDoc']//tr[2]//td[1]//a")).getAttribute("textContent"), fileName01);
//	assertEquals(driver.findElement(By.xpath("//table[@id='tbAttachDoc']//tr[3]//td[1]//a")).getAttribute("textContent"), fileName02);
//	Click icon Show more
	driver.findElement(By.xpath("//div[contains(@id,'divShowMore')]")).click();;
//	Input them thong tin 
	Select selectDoMat = new Select(driver.findElement(doMat));
	selectDoMat.selectByVisibleText(do_mat);
	Select selectNguoiKy = new Select(driver.findElement(nguoiKyVanBan));
	selectNguoiKy.selectByVisibleText(nguoi_ky_vb);
	driver.findElement(nguoiNhanVb).sendKeys(nguoi_nhan_vb, Keys.TAB, Keys.ENTER);
	driver.findElement(nguoiNhanVb).sendKeys(group_nhan_vb, Keys.TAB, Keys.ENTER);
// Phat hanh VB	
	driver.findElement(btnPhatHanh).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
}
public void Luu() {
	driver.findElement(btnLuu).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
}
public void ValidateVbBanHanhDangLuu(
		String loai_van_ban,
		String trich_yeu,
		String linh_vuc,
		String ngay_hieu_luc,
		String do_khan,
		String do_mat,
		String so_ban,
		String so_trang,
		String nguoi_ky_vb,
		String chuc_vu_nguoi_ky) {
	assertEquals(driver.findElement(labelLoaiVanBan).getText(),loai_van_ban);
	assertEquals(driver.findElement(trichYeu).getAttribute("textContent"), trich_yeu);
	assertEquals(driver.findElement(linhVuc).getAttribute("value"), linh_vuc);
	assertEquals(driver.findElement(ngayHieuLuc).getAttribute("value"), ngay_hieu_luc);
	Select selectDoKhan = new Select(driver.findElement(doKhan));
	WebElement optionDoKhan = selectDoKhan.getFirstSelectedOption();
	String giaTriDoKhan = optionDoKhan.getAttribute("value");
	assertEquals(giaTriDoKhan, do_khan);
	Select selectDoMat = new Select(driver.findElement(doMat));
	WebElement optionDoMat = selectDoMat.getFirstSelectedOption();
	String giaTriDoMat = optionDoMat.getAttribute("value");
	assertEquals(giaTriDoMat, do_mat);
	assertEquals(driver.findElement(soBan).getAttribute("value"), so_ban);
	assertEquals(driver.findElement(soTrang).getAttribute("value"), so_trang);
	Select selectNguoiKyVanBan = new Select(driver.findElement(nguoiKyVanBan));
	WebElement optionNguoiKyVanBan = selectNguoiKyVanBan.getFirstSelectedOption();
	String giaTriNguoiKy = optionNguoiKyVanBan.getAttribute("value");
	assertEquals(giaTriNguoiKy, nguoi_ky_vb);
//	assertEquals(driver.findElement(By.xpath("//div[contains(@id,'lbVChucVu')]")).getText(), chuc_vu_nguoi_ky);
}
public void XoaFileDinhKem() {
	driver.findElement(By.xpath("//table[@id='tbAttachDoc']//tr[2]//td[4]//input")).click();
	driver.switchTo().alert().accept();
}
public void ValidateQuyenXem(
		String trich_yeu) {
	assertEquals(driver.findElement(By.xpath("//span[contains(@id,'lbVTrichYeu')]")).getText(), trich_yeu);
}
public void MoHoSoDuThao() {
	driver.findElement(By.xpath("//div[@class='divHoSoXuLyLink']//a")).click();
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTb.get(1));
}
public void TruyCapLaiVanBan() {
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTb.get(0));
}
public void ThuHoiVanBanBanHanh() throws InterruptedException {
	driver.findElement(btnThuHoiBoSung).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
	Thread.sleep(2000);
	driver.findElement(rdbtThuHoi).click();
	driver.findElement(By.xpath("//span[contains(@id,'ThuHoi_CaNhanTrongDonVi')]//a")).click();
	driver.findElement(By.xpath("//span[contains(@id,'ThuHoi_CaNhanTrongDonVi')]//a")).click();
	driver.findElement(By.xpath("//ul//li[contains(@id,'DonViThuHoi_Source_i0')]")).click();
	driver.findElement(By.xpath("//a[@class='rlbButton rlbNoButtonText rlbTransferFrom']")).click();
	driver.findElement(By.xpath("//div[@class='Buttons']//input[contains(@id,'btnThuHoi')]")).click();
}
public void LapPhieuGiaiQuyet(
		String y_kien_lanh_dao_phan_cong_vb) {
	driver.findElement(btnLapPhieuGiaiQuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
	driver.findElement(yKienLanhDaoPhanCongVanBanBanHanh).sendKeys(y_kien_lanh_dao_phan_cong_vb);
	driver.findElement(By.id("cbHeaderHandle")).click();
	driver.findElement(btnLapPhieuGiaiQuyet).click();
}
public void ValidateHoanTatTaskThucHienVanBanDi(
		String y_kien_lanh_dao_phan_cong_vb,
		String phong_ban_thuc_hien_vb) {
	assertEquals(driver.findElement(By.xpath("//div[@class='ykienlanhdao']//div[@class='noidung']")).getText(), y_kien_lanh_dao_phan_cong_vb);
	assertEquals(driver.findElement(By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tr[5]//td[1]")).getText(), phong_ban_thuc_hien_vb);
	assertEquals(driver.findElement(By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tr[5]//td[5]")).getText(), "Hoàn tất");
}
public void ValidateDangThucHienTaskVanBanDi(
		String y_kien_lanh_dao_phan_cong_vb,
		String phong_ban_thuc_hien_vb) {
	assertEquals(driver.findElement(By.xpath("//div[@class='ykienlanhdao']//div[@class='noidung']")).getText(), y_kien_lanh_dao_phan_cong_vb);
	assertEquals(driver.findElement(By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tr[5]//td[1]")).getText(), phong_ban_thuc_hien_vb);
	assertEquals(driver.findElement(By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tr[5]//td[5]")).getText(), "Đang thực hiện");
}
}

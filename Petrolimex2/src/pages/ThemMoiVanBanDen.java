package pages;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThemMoiVanBanDen {
	WebDriver driver;
	String file01 = "C:\\AttachFiles\\FileWord.docx";
	String inDocumentNewFormUrl = "https://daotaoeoffice.petrolimex.com.vn/plxkv1/vanban/Lists/VanBanDen/ThemMoiVanBanDuThao.aspx?Source=https%3A%2F%2Fdaotaoeoffice%2Epetrolimex%2Ecom%2Evn%2Fplxbn%2Fvanban%2FLists%2FVanBanDen%2FTatCa%2Easpx&ContentTypeId=0x0100F8457C2B8B1A7D4FA6B2B4AFB3DB7340";
	String vbDangLuuUrl = "https://daotaoeoffice.petrolimex.com.vn/plxkv1/vanban/sitepages/vanbanden/luu.aspx";
//	String danhSachChoYKienLanhDao = "https://daotaoeoffice.petrolimex.com.vn/plxkv1/vanban/Lists/VanBanDen/vb-cho-y-kien.aspx";
public ThemMoiVanBanDen(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// So van ban
By soVanBan = By.xpath("//input[contains(@id,'txtSoHieuGoc')]");
By ddlLoaiVanBan = By.xpath("//select[contains(@id,'ddlLoaiVB')]");
By cbxLinhVuc = By.id("txtLinhVuc");
By cldNgayDen = By.xpath("//tr//td//input[contains(@id,'dtNgayDen')]");
By cldNgayTrenVB = By.xpath("//tr//td//input[contains(@id,'dtNgayTrenVB')]");
By ddlDoKhan = By.xpath("//select[contains(@id,'ddlDoKhan')]");
By ddlDoMat = By.xpath("//select[contains(@id,'ddlDoMat')]");
By txtSoBan = By.xpath("//input[contains(@id,'txtSoBan')]");
By txtSoTrang = By.xpath("//input[contains(@id,'txtSoTrang')]");
By btnXoaFileDinhKem = By.xpath("//td[@class='VCol-Delete']//input[contains(@id,'btnDelete')]");
By btnLapPhieuGiaiQuyet =  By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnLuuVaLapPGQVB')]");
//	Trich yeu
By trichYeu = By.xpath("//div//textarea[contains (@id, 'txtTrichYeu')]");
//	Noi gui
By noiGui = By.id("txtCoQuanGui");
// Upload file
By chooseFile = By.xpath("//input[contains (@id,'upFile1')]"); 
//	Btn Trinh Lanh dao
By btnChuyenXuLy = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnTrinhLanhDao')]");
//	Btn Lưu
By btnLuu = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnLuu')]");
//	Btn Ket thuc
By btnKetThuc = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnKetThuc')]");
// Select Ban Lanh dao o Fom VB Den
By chonLanhDaoCongTy = By.xpath("//div[@class='ItemInput']//select[contains (@id, 'ddlBanLanhDao')]");
//	Field Nhap y kien lanh dao
By yKienLanhDao =  By.xpath("//div//textarea[contains (@id, 'txtYKienLanhDao_3')]");
// Btn Lanh dao Chuyen xu ly
By lanhDaoChuyenXuLy = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnTrinhLanhDao_3')]");
//Btn Kết thúc Văn bản Đến
By btnThoat = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnThoat')]");
public void NavigateToNewFormUrl() {
	driver.get(inDocumentNewFormUrl);
}
public void inputVanBanDen(
		String so_van_ban,
		String trich_yeu,
		String loai_van_ban,
		String co_quan_gui,
		String linh_vuc,
		String ngay_den,
		String ngay_tren_vb,
		String do_khan,
		String do_mat,
		String so_ban,
		String so_trang,
		String lanh_dao) {
// Nhap So Van ban
	driver.findElement(soVanBan).sendKeys( so_van_ban + System.currentTimeMillis());	
// Nhap Trich Yeu Van ban
	driver.findElement(trichYeu).sendKeys(trich_yeu);
// Chon Loai Van ban
	Select loaiVanBan = new Select(driver.findElement(ddlLoaiVanBan));
	loaiVanBan.selectByVisibleText(loai_van_ban);
//	Chon Noi gui	
	driver.findElement(noiGui).sendKeys(co_quan_gui);
	WebDriverWait waitNoiGui = new WebDriverWait(driver, 30);
	waitNoiGui.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtCoQuanGui_listbox")));
	driver.findElement(By.xpath("//ul[@id='txtCoQuanGui_listbox']//li[1]")).click();
//	Chon Linh vuc
	driver.findElement(cbxLinhVuc).sendKeys(linh_vuc);
	WebDriverWait waitLinhVuc = new WebDriverWait(driver, 30);
	waitLinhVuc.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtLinhVuc_listbox")));
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
//	Nhap Ngay den	
	driver.findElement(cldNgayDen).clear();
	driver.findElement(cldNgayDen).sendKeys(ngay_den);
// Nhap Ngay tren VB	
	driver.findElement(cldNgayTrenVB).clear();
	driver.findElement(cldNgayTrenVB).sendKeys(ngay_tren_vb);
//	Chon Do Khan
	Select doKhan = new Select(driver.findElement(ddlDoKhan));
	doKhan.selectByVisibleText(do_khan);
//	Chon Do Mat
	Select doMat = new Select(driver.findElement(ddlDoMat));
	doMat.selectByVisibleText(do_mat);
//	Nhap So ban
	driver.findElement(txtSoBan).sendKeys(so_ban);
//	Nhap So trang 
	driver.findElement(txtSoTrang).sendKeys(so_trang);
//  Chon Lanh dao
	Select lanhDaoCongTy= new Select(driver.findElement(chonLanhDaoCongTy));
	lanhDaoCongTy.selectByVisibleText(lanh_dao);
}
//	Action tren Form Them moi
public void uploadFile(String filePath) {
	driver.findElement(chooseFile).sendKeys(filePath);	
}
public void chuyenXuLy() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(btnChuyenXuLy)));
	driver.findElement(btnChuyenXuLy).click();
}
public void luuNhap() {
	driver.findElement(btnLuu).click();
}
public void ketThuc() {
	driver.findElement(btnKetThuc).click();
}
public void waitingForValidate() {
	WebElement fieldSoVanBan = driver.findElement(soVanBan);
	WebElement fieldTrichYeu = driver.findElement(trichYeu);
	Actions actions = new Actions(driver);
	actions.moveToElement(fieldSoVanBan).click();
	actions.moveToElement(fieldTrichYeu).click();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
}
public void waitingForLoading() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
}
public void ValidateFormEditKhongDinhKem(
		String loai_van_ban,
		String trich_yeu,
		String co_quan_gui,
		String linh_vuc,
		String ngay_den,
		String ngay_tren_vb,
		String do_khan,
		String do_mat,
		String so_ban,
		String so_trang) {
	Select loaiVanBan = new Select(driver.findElement(ddlLoaiVanBan));
	WebElement optionLoaiVanBan = loaiVanBan.getFirstSelectedOption();
	assertEquals(optionLoaiVanBan.getText(), loai_van_ban);
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(noiGui).getAttribute("value"), co_quan_gui);
	assertEquals(driver.findElement(cbxLinhVuc).getAttribute("value"), linh_vuc);
	assertEquals(driver.findElement(cldNgayDen).getAttribute("value"), ngay_den);
	assertEquals(driver.findElement(cldNgayTrenVB).getAttribute("value"), ngay_tren_vb);
//	So sanh Do Khan
	Select doKhan = new Select(driver.findElement(ddlDoKhan));
	WebElement optionDoKhan = doKhan.getFirstSelectedOption();
	assertEquals(optionDoKhan.getText(), do_khan);
//	So sanh Do Mat
	Select doMat = new Select(driver.findElement(ddlDoMat));
	WebElement optionDoMat = doMat.getFirstSelectedOption();
	assertEquals(optionDoMat.getText(), do_mat);
// So sanh So ban + So trang
	assertEquals(driver.findElement(txtSoBan).getAttribute("value"), so_ban);
	assertEquals(driver.findElement(txtSoTrang).getAttribute("value"), so_trang);
}
public void ValidateFormEditCoDinhKem(
		String loai_van_ban,
		String trich_yeu,
		String co_quan_gui,
		String linh_vuc,
		String ngay_den,
		String ngay_tren_vb,
		String do_khan,
		String do_mat,
		String so_ban,
		String so_trang,
		String file_name) {
	Select loaiVanBan = new Select(driver.findElement(ddlLoaiVanBan));
	WebElement optionLoaiVanBan = loaiVanBan.getFirstSelectedOption();
	assertEquals(optionLoaiVanBan.getText(), loai_van_ban);
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(noiGui).getAttribute("value"), co_quan_gui);
	assertEquals(driver.findElement(cbxLinhVuc).getAttribute("value"), linh_vuc);
	assertEquals(driver.findElement(cldNgayDen).getAttribute("value"), ngay_den);
	assertEquals(driver.findElement(cldNgayTrenVB).getAttribute("value"), ngay_tren_vb);
//	So sanh Do Khan
	Select doKhan = new Select(driver.findElement(ddlDoKhan));
	WebElement optionDoKhan = doKhan.getFirstSelectedOption();
	assertEquals(optionDoKhan.getText(), do_khan);
//	So sanh Do Mat
	Select doMat = new Select(driver.findElement(ddlDoMat));
	WebElement optionDoMat = doMat.getFirstSelectedOption();
	assertEquals(optionDoMat.getText(), do_mat);
// So sanh So ban + So trang
	assertEquals(driver.findElement(txtSoBan).getAttribute("value"), so_ban);
	assertEquals(driver.findElement(txtSoTrang).getAttribute("value"), so_trang);
	assertEquals(driver.findElement(By.xpath("//table[@id='tbAttachDoc']//tbody//tr//td[1]//a")).getText(), file_name);
}
public void XoaFileDinhKem() {
	driver.findElement(btnXoaFileDinhKem).click();
	driver.switchTo().alert().accept();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("tbAttachDoc"))));
}
public void ChonLanhDao(String lanh_dao_form_edit) {
	Select lanhDaoCongTy= new Select(driver.findElement(chonLanhDaoCongTy));
	lanhDaoCongTy.selectByVisibleText(lanh_dao_form_edit);
}
public void LapPhieuGiaiQuyet() {
	driver.findElement(btnLapPhieuGiaiQuyet).click();
}
public void Thoat() throws InterruptedException {
	driver.findElement(btnThoat).click();
	Thread.sleep(3000);
}
public void lanhDaoChuyenXuLy() {
	driver.findElement(lanhDaoChuyenXuLy).click();	
}
}

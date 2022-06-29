package pages;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FormVanBanDuThao {
	WebDriver driver;
	String lineManager ="1171;#eoff.dn.tp";
	String director = "1170;#eoff.dn.ct";
	String filePath = "C:\\AttachFiles\\FileExcel.xlsx";
	String userDepartment = "Phòng Kỹ thuật Tổng hợp";
public FormVanBanDuThao(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
By trichYeu = By.xpath("//span[contains(@id,'lblSubject')]");
//Button newFile từ Template
By btnNewFileTemp = By.id("divLinkNewTemplate");
//File Template được chọn
By tempFile = By.xpath("//div[@id='ctl00_PlaceHolderMain_Content']//table//tbody//tr//td[2]");
//Field Nhập tên file Templte
By tempFileName = By.id("txtSetNameDoc");
//	Button Luu file Tem
By btnSaveTempFile = By.id("ctl00_PlaceHolderMain_btnCreate");
// Button Upload file trên Form
By uploadFileBtn = By.xpath("//div[@class='divContainLinkButton']");
//By.id("divLinkNewDocument");
// Button Upload file trên Pop-up
By uploadFileChoose = By.id("sp_file");
// Button confirm Upload file tren Pop-up
By btnSave = By.xpath("//div[@class='Buttons bottom']//input[@value='OK']");
//Button Sửa thuộc tính 
By btnSua = By.xpath("//div[@id='divLinkEdit']//a");
// Button Xóa file
By btnDeleteFile = By.id("btnDeleteDynamicGridDynamicManage");
// Button Gửi phê duyệt
By btnGuiPheDuyet = By.xpath("//div[@id='divGuiKiemDuyet']//a");
// Button Dong y
By btnNext = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnNext')]");
// Button Phe duyet
By finalApproveBtn = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnApproved')]");
//Button Yêu cầu hiệu chỉnh
By btnYeuCauHieuChinh = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnReturn')]");
// Button Bổ sung thông tin
By btnBoSungThongTin = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnRequestInfo')]");
// Button Chuyển xử lý
By btnChuyenXuLy = By.xpath("//input[contains (@id, 'btnChuyenXuLy')]");
//	Button Recall
By btnRecall = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnRecall')]");
By btnChiaSe = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnShare')]");
By btnThoat = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnThoat')]");
// Ý kiến trên form Pop-up
By comment = By.xpath("//textarea[contains(@id,'txtYKien')]");
// Subform Bổ sung thông tin
By requestFrame = By.xpath("//iframe[@id='DlgFrame^']");
By requestBtn = By.id("ctl00_PlaceHolderMain_btnRequest");
By requestCmt = By.xpath("//div[@id='s4-workspace']//div//div//div//div//div//textarea[@id='ctl00_PlaceHolderMain_txtYKien']");
//Validate Thuộc tính Văn bản
public void ValidateTinhTrangSoanThao(
		String trich_yeu,
		String phong_ban_nguoi_tao,
		String loai_van_ban) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.presenceOfElementLocated(trichYeu));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(By.xpath("//div[contains(@id,'lblDonVi')]")).getText(), phong_ban_nguoi_tao);
	assertEquals(driver.findElement(By.xpath("//div[contains(@id,'lblLoaiVanBan')]")).getText(),loai_van_ban);
	assertEquals(driver.findElement(By.xpath("//div[contains(@id,'lblStatus')]")).getText(),"Soạn thảo");
}
public void ValidateTinhTrangDaPhatHanh(
		String trich_yeu,
		String phong_ban_nguoi_tao,
		String loai_van_ban) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.presenceOfElementLocated(trichYeu));
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(By.xpath("//div[contains(@id,'lblDonVi')]")).getText(), phong_ban_nguoi_tao);
	assertEquals(driver.findElement(By.xpath("//div[contains(@id,'lblLoaiVanBan')]")).getText(),loai_van_ban);
	assertEquals(driver.findElement(By.xpath("//div[contains(@id,'lblStatus')]")).getText(),"Đã phát hành");
}
// Thực hiện Action Form
public void ValidatePermissionEdit() {
	driver.findElement(By.id("divLinkNewDocument")).isEnabled(); /*Upload file */
	driver.findElement(By.id("divLinkNewTemplate")).isEnabled(); /*Tạo từ mẫu*/
	driver.findElement(By.id("divGuiKiemDuyet")).isEnabled(); /*Trình phê duyệt*/
	driver.findElement(By.xpath("//a[contains(text(),'Chia sẻ')]")).isEnabled(); /*Chia sẻ*/
	driver.findElement(By.xpath("//a[contains(text(),'In')]")).isEnabled(); /*Chia sẻ*/
	driver.findElement(By.xpath("//a[contains(text(),'Sửa')]")).isEnabled(); /*Sửa thuộc tính*/	
}

public void SuaThongTinVbDuThao(
		String loai_van_ban_cap_nhat,
		String trich_yeu_cap_nhat) throws InterruptedException {
	driver.findElement(btnSua).click();
	Thread.sleep(3000);
	driver.switchTo().frame(1);
	Select selectLoaiVB = new Select(driver.findElement(By.id("ddlCodeDocumentType")));
	selectLoaiVB.selectByVisibleText(loai_van_ban_cap_nhat);
	driver.findElement(By.id("txtSubject")).clear();
	driver.findElement(By.id("txtSubject")).sendKeys(trich_yeu_cap_nhat);
	driver.findElement(By.id("btnComplete")).click();
}
public void SuaThongTinVbDuThaoKySo(
		String loai_van_ban_cap_nhat,
		String trich_yeu_cap_nhat) throws InterruptedException {
	driver.findElement(btnSua).click();
	Thread.sleep(3000);
	driver.switchTo().frame(1);
	Select selectLoaiVB = new Select(driver.findElement(By.id("ddlCodeDocumentType")));
	selectLoaiVB.selectByVisibleText(loai_van_ban_cap_nhat);
	driver.findElement(By.id("txtSubject")).clear();
	driver.findElement(By.id("txtSubject")).sendKeys(trich_yeu_cap_nhat);
	driver.findElement(By.id("IsDelegate")).click();
	driver.findElement(By.id("btnComplete")).click();
	Thread.sleep(1000);
}
public void TaoFileTuMau() throws InterruptedException {
	driver.findElement(btnNewFileTemp).click();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(tempFile).click();
	Thread.sleep(3000);
	driver.findElement(tempFileName).sendKeys("File được tạo từ Template");
	driver.findElement(btnSaveTempFile).click();
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@role='grid']/tbody[1]/tr[1]/td[2]")));
//	Thread.sleep(3000);
//	driver.switchTo().defaultContent();
//	driver.navigate().refresh();
	assertEquals(driver.findElement(By.xpath("//table[@role='grid']/tbody[1]/tr[1]/td[2]")).getText(),"File được tạo từ Template.docx");
}
public void uploadFile (
		String file03) throws InterruptedException {
	driver.findElement(uploadFileBtn).click();
	Thread.sleep(3000);
	driver.switchTo().frame(1);
	driver.findElement(uploadFileChoose).sendKeys(file03);
	driver.findElement(btnSave).click();
	Thread.sleep(3000);
	driver.navigate().refresh();
}
public void SuaFile() throws InterruptedException {
	driver.findElement(By.xpath("//table[@role='grid']/tbody[1]/tr[1]/td[7]")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//input[contains(@id,'TxtName')]")).clear();
	driver.findElement(By.xpath("//input[contains(@id,'TxtName')]")).sendKeys("Chinh sua ten file");
	Select selectLoaiTaiLieu = new Select(driver.findElement(By.xpath("//select[contains(@id, 'DDLLoaiTaiLieu')]")));
	selectLoaiTaiLieu.selectByVisibleText("Biểu mẫu");
	driver.findElement(By.xpath("//span[@class='SaveButton']")).click();
}
public void XoaFile() throws InterruptedException {
	driver.findElement(By.xpath("//table[@role='grid']/tbody[1]/tr[1]/td[6]")).click();
	driver.findElement(btnDeleteFile).click();
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
//	driver.navigate().refresh();
}
public void ValidateKeyGuiPheDuyet(
		String lanh_dao_phong_ban,
		String lanh_dao_duyet_vb,
		String y_kien_nguoi_gui) throws InterruptedException {
		driver.findElement(btnGuiPheDuyet).click();
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		Select ChonTpPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[2]//select[@id='ddlUser']")));
		ChonTpPheDuyet.selectByVisibleText(lanh_dao_phong_ban);
		Select ChonLanhDaoPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[3]//select[@id='ddlUser']")));
		ChonLanhDaoPheDuyet.selectByVisibleText(lanh_dao_duyet_vb);
		driver.findElement(By.xpath("//textarea[@id='txtYKien']")).sendKeys(y_kien_nguoi_gui);
		driver.findElement(btnNext).click();
		Thread.sleep(3000);
		assertEquals(driver.findElement(By.id("divMessage")).getText(), "Vui lòng kiểm tra lại Key ký số trong file: \"VB Ky so - Validate Key.doc\";");
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
	}
public void GuiPheDuyet(
	String lanh_dao_phong_ban,
	String lanh_dao_phong_lien_quan,
	String lanh_dao_dong_phe_duyet,
	String lanh_dao_duyet_vb,
	String y_kien_nguoi_gui) throws InterruptedException {
	driver.findElement(btnGuiPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
//	Cho Lanh dao Phong lien quan
	driver.findElement(By.xpath("//div[@class='Process']//div[3]//a[@class='SetDynamicStep']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(3);
//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='k-item k-state-default k-last']//span[contains(text(),'Người dùng')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(lanh_dao_phong_lien_quan);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[contains(@id, 'cppUser_TopSpan_AutoFillDiv_MenuList')]//li[1]"))));
	driver.findElement(By.xpath("//ul[contains(@id, 'cppUser_TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btnLuu2")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	Thread.sleep(3000);
//	Chon Lanh dao Dong Phe duyet
	driver.findElement(By.xpath("//div[@class='Process']//div[4]//a[@class='SetDynamicStep']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(3);
//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='k-item k-state-default k-last']//span[contains(text(),'Người dùng')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(lanh_dao_dong_phe_duyet);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[contains(@id, 'cppUser_TopSpan_AutoFillDiv_MenuList')]//li[1]"))));
	driver.findElement(By.xpath("//ul[contains(@id, 'cppUser_TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btnLuu2")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	Thread.sleep(3000);
//	Chon Lanh Dao Phong ban, Lanh Dao Phe duyet tư Dropdown
	Select ChonTpPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[2]//select[@id='ddlUser']")));
	ChonTpPheDuyet.selectByVisibleText(lanh_dao_phong_ban);
	Select ChonLanhDaoPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[5]//select[@id='ddlUser']")));
	ChonLanhDaoPheDuyet.selectByVisibleText(lanh_dao_duyet_vb);
	driver.findElement(By.xpath("//textarea[@id='txtYKien']")).sendKeys(y_kien_nguoi_gui);
	driver.findElement(btnNext).click();
	Thread.sleep(3000);
}
public void GuiPheDuyetTpTrinhTGD(
		String lanh_dao_duyet_vb,
		String y_kien_nguoi_gui) throws InterruptedException {
		driver.findElement(btnGuiPheDuyet).click();
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		Select ChonLanhDaoPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[3]//select[@id='ddlUser']")));
		ChonLanhDaoPheDuyet.selectByVisibleText(lanh_dao_duyet_vb);
		driver.findElement(By.xpath("//textarea[@id='txtYKien']")).sendKeys(y_kien_nguoi_gui);
		driver.findElement(btnNext).click();
		Thread.sleep(3000);
	}
public void GuiPheDuyetVbThuaLenh(
		String lanh_dao_phong_ban,
		String y_kien_nguoi_gui) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.elementToBeClickable(btnGuiPheDuyet));
		driver.findElement(btnGuiPheDuyet).click();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		Select ChonTpPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[2]//select[@id='ddlUser']")));
		ChonTpPheDuyet.selectByVisibleText(lanh_dao_phong_ban);
		driver.findElement(By.xpath("//textarea[@id='txtYKien']")).sendKeys(y_kien_nguoi_gui);
		driver.findElement(btnNext).click();
		Thread.sleep(3000);
	}
public void GuiPheDuyetVbThuaLenh1Step(
		String y_kien_nguoi_gui) throws InterruptedException {
		driver.findElement(btnGuiPheDuyet).click();
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
		driver.findElement(By.xpath("//textarea[@id='txtYKien']")).sendKeys(y_kien_nguoi_gui);
		driver.findElement(btnNext).click();
		Thread.sleep(3000);
	}
public void DongY(
		String y_kien_phe_duyet_vb_du_thao) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(btnNext));
	driver.findElement(btnNext).click();
//	driver.findElement(By.id("txtYKien")).sendKeys(y_kien_phe_duyet_vb_du_thao);
}
public void PheDuyet(
		String y_kien_phe_duyet_vb_du_thao) {
	driver.findElement(finalApproveBtn).click();
//	driver.findElement(By.id("txtYKien")).sendKeys(y_kien_phe_duyet_vb_du_thao);
}
public void ChuyenXuLy(
		String user_chuyen_xu_ly,
		String y_kien_phe_duyet_vb_du_thao) throws InterruptedException {
	driver.findElement(btnChuyenXuLy).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(By.xpath("//div[contains(@id, 'UserReplace')]//input[2]")).sendKeys(user_chuyen_xu_ly);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id, 'UserReplace')]//input[2]")).sendKeys(Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id, 'UserReplace')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[contains(@id, 'UserReplace_TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	driver.findElement(By.xpath("//textarea[contains(@id,'txtYKien')]")).sendKeys(y_kien_phe_duyet_vb_du_thao);
	driver.findElement(By.xpath("//input[contains (@id, 'btnChuyenXyLy')]")).click();
}
public void YeuCauHieuChinh() {
	driver.findElement(comment).sendKeys("Ý kiến từ chối của Người phê duyệt");
	driver.findElement(btnYeuCauHieuChinh).click();
}
public void BoSungThongTin(
		String nguoi_bo_sung_thong_tin) throws InterruptedException {
	driver.findElement(btnBoSungThongTin).click();
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	Select selectUserBstt = new Select(driver.findElement(By.xpath("//select[contains(@id,'ddlUsers')]")));
	selectUserBstt.selectByVisibleText(nguoi_bo_sung_thong_tin);
	driver.findElement(comment).sendKeys("Yêu cầu Bổ sung thông tin của người phê duyệt");
	driver.findElement(By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnRequest')]")).click();	
}
public void ChiaSe(
		String user_duoc_chia_se,
		String y_kien_phe_duyet_vb_du_thao) throws InterruptedException {
	driver.findElement(btnChiaSe).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(By.xpath("//div[contains(@id, 'People_TopSpan')]//input[2]")).sendKeys(user_duoc_chia_se);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id, 'People_TopSpan')]//input[2]")).sendKeys(Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id, 'People_TopSpan')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[contains(@id, 'TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	driver.findElement(By.xpath("//textarea[contains(@id,'txtComment')]")).sendKeys(y_kien_phe_duyet_vb_du_thao);
	driver.findElement(btnChiaSe).click();
}
public void ThuHoi() {
	driver.findElement(btnGuiPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(comment).sendKeys("Ý kiến của người thu hồi");
	driver.findElement(btnRecall).click();
	driver.navigate().refresh();
}
public void GuiPheDuyetLai() throws InterruptedException {
	driver.findElement(btnNext).click();
	Thread.sleep(5000);
}
public void GuiPheDuyetLaiThayDoiNguoiDuyet(
		String lanh_dao_phong_ban,
		String lanh_dao_phong_lien_quan,
		String lanh_dao_dong_phe_duyet,
		String lanh_dao_duyet_vb,
		String y_kien_nguoi_gui) throws InterruptedException {
		Select ChonTpPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[2]//select[@id='ddlUser']")));
		ChonTpPheDuyet.selectByVisibleText(lanh_dao_phong_ban);
		Select ChonLanhDaoPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[5]//select[@id='ddlUser']")));
		ChonLanhDaoPheDuyet.selectByVisibleText(lanh_dao_duyet_vb);
		driver.findElement(By.xpath("//textarea[@id='txtYKien']")).sendKeys(y_kien_nguoi_gui);
		driver.findElement(btnNext).click();
		Thread.sleep(3000);
	}
public void MoVBDuThao() {
	driver.findElement(By.xpath("//div[contains(@id,'divHoSoDuThao')]")).click();
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTb.get(1));
}
public void ValidatePermissionXuLy() {
	assertEquals(driver.findElement(btnNext).isEnabled(), true);
	assertEquals(driver.findElement(btnYeuCauHieuChinh).isEnabled(), true);
	assertEquals(driver.findElement(btnBoSungThongTin).isEnabled(), true);
	assertEquals(driver.findElement(btnChuyenXuLy).isEnabled(), true);
	assertEquals(driver.findElement(btnChiaSe).isEnabled(), true);
	assertEquals(driver.findElement(btnThoat).isEnabled(), true);
}
public void ValidatePermissionPheDuyet() {
	assertEquals(driver.findElement(finalApproveBtn).isEnabled(), true);
	assertEquals(driver.findElement(btnYeuCauHieuChinh).isEnabled(), true);
	assertEquals(driver.findElement(btnBoSungThongTin).isEnabled(), true);
	assertEquals(driver.findElement(btnChuyenXuLy).isEnabled(), true);
	assertEquals(driver.findElement(btnChiaSe).isEnabled(), true);
	assertEquals(driver.findElement(btnThoat).isEnabled(), true);
}
public void ValidatePermissionView() {
	assertEquals(driver.findElements(uploadFileBtn).size(), 0);
	assertEquals(driver.findElements(btnNewFileTemp).size(), 0);
	assertEquals(driver.findElements(btnGuiPheDuyet).size(), 0);
	assertEquals(driver.findElement(By.id("divLinkShare")).isEnabled(), true);
	assertEquals(driver.findElement(By.xpath("//a[@class='btnPrint']")).isEnabled(), true);
}
}

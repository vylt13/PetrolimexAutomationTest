package pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormHoSoTaiLieu {
	WebDriver driver;
public FormHoSoTaiLieu(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// Trich yeu
By trichYeu = By.xpath("//span[contains(@id,'lblSubject')]");
By btnChooseFile = By.id("sp_file");
By btnSave = By.xpath("//input[contains(@id,'btnSave')]");
By btnNewFileTemp = By.id("divLinkNewTemplate");
By tempFile = By.xpath("//div[@id='ctl00_PlaceHolderMain_Content']//table//tbody//tr//td[2]");
By tempFileName = By.id("txtSetNameDoc");
By lbLoaiVb = By.xpath("//div[contains(@id,'lblLoaiVanBan')]");
By lbDonVi = By.xpath("//div[contains(@id,'lblDonVi')]");
By lbHoSoLuuTru = By.xpath("//div[contains(@id,'lblHoSo')]");
By lbNgayKy = By.xpath("//div[contains(@id,'lblNgayKy')]");
By lbNguoiKy = By.xpath("//div[contains(@id,'lblNguoiKy')]");
By lbNgayHieuLuc = By.xpath("//div[contains(@id,'lblNgayHieuLuc')]");
By lbLinhVuc = By.xpath("//div[contains(@id,'lblLinhVuc')]");
By lbSoHopDong = By.xpath("//div[contains(@id,'lblSoHopDong')]");
By lbNoiLuu = By.xpath("//div[contains(@id,'lblNoiLuu')]");
By lbTinhTrang = By.xpath("//div[contains(@id,'lblStatus')]");
By btnSaveTempFile = By.id("ctl00_PlaceHolderMain_btnCreate");
By btnDinhKemFile = By.id("divLinkNewDocument");
By btnChonMau = By.id("divLinkNewTemplate");
By btnTrinhPheDuyet = By.id("divGuiKiemDuyet");
By btnSua = By.id("divLinkEdit");
By btnDongY = By.xpath("//div[@class='Buttons']//input[contains(@id,'btnNext')]");
By btnDeleteFile = By.id("btnDeleteDynamicGridDynamicManage");
By btnTiepTuc = By.xpath("//input[@id='btnComplete']");

//Button Gửi phê duyệt
By btnGuiPheDuyet = By.xpath("//div[@id='divGuiKiemDuyet']//a");
//Button Dong y
By btnNext = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnNext')]");
//Button Phe duyet
By finalApproveBtn = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnApproved')]");
//Button Yêu cầu hiệu chỉnh
By btnYeuCauHieuChinh = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnReturn')]");
//Button Bổ sung thông tin
By btnBoSungThongTin = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnRequestInfo')]");
//Button Chuyển xử lý
By btnChuyenXuLy = By.xpath("//input[contains (@id, 'btnChuyenXuLy')]");
//	Button Recall
By btnRecall = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnRecall')]");
By btnChiaSe = By.id("divLinkShare");
By btnThoat = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnThoat')]");
//Ý kiến trên form Pop-up
By comment = By.xpath("//textarea[contains(@id,'txtYKien')]");
//Subform Bổ sung thông tin
By requestFrame = By.xpath("//iframe[@id='DlgFrame^']");
By requestBtn = By.id("ctl00_PlaceHolderMain_btnRequest");
By requestCmt = By.xpath("//div[@id='s4-workspace']//div//div//div//div//div//textarea[@id='ctl00_PlaceHolderMain_txtYKien']");

// Luoi file dinh kem
By iconEditFileR1 = By.xpath("//tbody/tr[@role='row']/td[7]/div[1]");

public void ValidatePermisisonDangLuu() {
	assertEquals(driver.findElement(btnDinhKemFile).isEnabled(), true);
	assertEquals(driver.findElement(btnChonMau).isEnabled(), true);
	assertEquals(driver.findElement(btnTrinhPheDuyet).isEnabled(), true);
	assertEquals(driver.findElement(btnChiaSe).isEnabled(), true);
	assertEquals(driver.findElement(btnSua).isEnabled(), true);
	assertEquals(driver.findElement(iconEditFileR1).isEnabled(), true);
}
public void ValidateFormHopDongDangLuu(
		String noi_dung_hop_dong,
		String don_vi_soan_thao,
		String ho_so_luu_tru,
		String ngay_ky,
		String ten_nguoi_ky, 
		String ngay_hieu_luc,
		String linh_vuc,
		String so_hop_dong,
		String noi_luu) {
	assertEquals(driver.findElement(trichYeu).getText(), noi_dung_hop_dong);
	assertEquals(driver.findElement(lbLoaiVb).getText(), "Hợp đồng");
	assertEquals(driver.findElement(lbDonVi).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(lbHoSoLuuTru).getText(), ho_so_luu_tru);
	assertEquals(driver.findElement(lbNgayKy).getText(), ngay_ky);
	assertEquals(driver.findElement(lbNguoiKy).getText(), ten_nguoi_ky);
	assertEquals(driver.findElement(lbNgayHieuLuc).getText(), ngay_hieu_luc);
	assertEquals(driver.findElement(lbLinhVuc).getText(), linh_vuc);
	assertEquals(driver.findElement(lbSoHopDong).getText(), so_hop_dong);
	assertEquals(driver.findElement(lbNoiLuu).getText(), noi_luu);
}
public void ValidateDanhMucXoa(
		String noi_dung_hop_dong,
		String don_vi_soan_thao,
		String ho_so_luu_tru,
		String ngay_ky,
		String ten_nguoi_ky, 
		String ngay_hieu_luc,
		String linh_vuc,
		String so_hop_dong,
		String noi_luu) {
	assertEquals(driver.findElement(trichYeu).getText(), noi_dung_hop_dong);
	assertEquals(driver.findElement(lbLoaiVb).getText(), "Hợp đồng");
	assertEquals(driver.findElement(lbDonVi).getText(), don_vi_soan_thao);
	assertTrue(driver.findElements(lbHoSoLuuTru).size() <1);
	assertEquals(driver.findElement(lbNgayKy).getText(), ngay_ky);
	assertEquals(driver.findElement(lbNguoiKy).getText(), ten_nguoi_ky);
	assertEquals(driver.findElement(lbNgayHieuLuc).getText(), ngay_hieu_luc);
	assertTrue(driver.findElements(lbLinhVuc).size() <1);
	assertEquals(driver.findElement(lbSoHopDong).getText(), so_hop_dong);
	assertEquals(driver.findElement(lbNoiLuu).getText(), noi_luu);
}
public void ValidateFormBBThanhToanDangLuu(
		String noi_dung_hop_dong,
		String don_vi_soan_thao,
		String ho_so_luu_tru,
		String ngay_ky,
		String linh_vuc,
		String so_hop_dong,
		String noi_luu) {
	assertEquals(driver.findElement(trichYeu).getText(), noi_dung_hop_dong);
	assertEquals(driver.findElement(lbLoaiVb).getText(), "Biên bản thanh toán");
	assertEquals(driver.findElement(lbDonVi).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(lbHoSoLuuTru).getText(), ho_so_luu_tru);
	assertEquals(driver.findElement(lbNgayKy).getText(), ngay_ky);
	assertEquals(driver.findElement(lbLinhVuc).getText(), linh_vuc);
	assertEquals(driver.findElement(lbSoHopDong).getText(), so_hop_dong);
	assertEquals(driver.findElement(lbNoiLuu).getText(), noi_luu);
}
public void ValidateFormToTrinhDangLuu(
		String trich_yeu,
		String don_vi_soan_thao,
		String ho_so_luu_tru,
		String ngay_ky,
		String so_van_ban,
		String noi_luu) {
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(lbLoaiVb).getText(), "Tờ trình");
	assertEquals(driver.findElement(lbDonVi).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(lbHoSoLuuTru).getText(), ho_so_luu_tru);
	assertEquals(driver.findElement(lbNgayKy).getText(), ngay_ky);
	assertEquals(driver.findElement(lbSoHopDong).getText(), so_van_ban);
	assertEquals(driver.findElement(lbNoiLuu).getText(), noi_luu);
}
public void ValidateFormBaoCaoNoiBoDangLuu(
		String trich_yeu,
		String don_vi_soan_thao,
		String ho_so_luu_tru,
		String ngay_ky,
		String so_van_ban,
		String noi_luu) {
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(lbLoaiVb).getText(), "Báo cáo");
	assertEquals(driver.findElement(lbDonVi).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(lbHoSoLuuTru).getText(), ho_so_luu_tru);
	assertEquals(driver.findElement(lbNgayKy).getText(), ngay_ky);
	assertEquals(driver.findElement(lbSoHopDong).getText(), so_van_ban);
	assertEquals(driver.findElement(lbNoiLuu).getText(), noi_luu);
}
public void ValidateFormBienBanNoiBoDangLuu(
		String trich_yeu,
		String ho_so_luu_tru,
		String ngay_ky,
		String linh_vuc,
		String so_van_ban,
		String noi_luu) {
	assertEquals(driver.findElement(trichYeu).getText(), trich_yeu);
	assertEquals(driver.findElement(lbLoaiVb).getText(), "Biên bản nội bộ");
	assertEquals(driver.findElement(lbHoSoLuuTru).getText(), ho_so_luu_tru);
	assertEquals(driver.findElement(lbNgayKy).getText(), ngay_ky);
	assertEquals(driver.findElement(lbLinhVuc).getText(), linh_vuc);
	assertEquals(driver.findElement(lbSoHopDong).getText(), so_van_ban);
	assertEquals(driver.findElement(lbNoiLuu).getText(), noi_luu);
}
public void ValidateFormHstlKhacDangLuu(
		String noi_dung,
		String don_vi_soan_thao,
		String ho_so_luu_tru,
		String ngay_ky,
		String linh_vuc,
		String ten_ho_so,
		String noi_luu) {
	assertEquals(driver.findElement(trichYeu).getText(), noi_dung);
	assertEquals(driver.findElement(lbLoaiVb).getText(), "Hồ sơ tài liệu khác");
//	assertEquals(driver.findElement(lbDonVi).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(lbHoSoLuuTru).getText(), ho_so_luu_tru);
//	assertEquals(driver.findElement(lbNgayKy).getText(), ngay_ky);
	assertEquals(driver.findElement(lbLinhVuc).getText(), linh_vuc);
	assertEquals(driver.findElement(lbSoHopDong).getText(), ten_ho_so);
	assertEquals(driver.findElement(lbNoiLuu).getText(), noi_luu);
}
public void TrinhPheDuyet(
		String lanh_dao_phong_ban,
		String lanh_dao_van_phong,
		String lanh_dao_tap_doan) {
	driver.findElement(btnTrinhPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 9);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	Select selectLDban = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[2]//select[@id='ddlUser']")));
	selectLDban.selectByVisibleText(lanh_dao_phong_ban);
	Select selectLDVP = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[3]//select[@id='ddlUser']")));
	selectLDVP.selectByVisibleText(lanh_dao_van_phong);
	Select selectTGD = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[4]//select[@id='ddlUser']")));
	selectTGD.selectByVisibleText(lanh_dao_tap_doan);
	driver.findElement(btnDongY).click();
}
public void TrinhPheDuyetKySo(
		String lanh_dao_phong_ban,
		String lanh_dao_van_phong,
		String lanh_dao_tap_doan) {
	driver.findElement(btnTrinhPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 9);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	Select selectLDban = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[2]//select[@id='ddlUser']")));
	selectLDban.selectByVisibleText(lanh_dao_phong_ban);
	Select selectLDVP = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[3]//select[@id='ddlUser']")));
	selectLDVP.selectByVisibleText(lanh_dao_van_phong);
	Select selectTGD = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[5]//select[@id='ddlUser']")));
	selectTGD.selectByVisibleText(lanh_dao_tap_doan);
	driver.findElement(btnDongY).click();
}
public void TrinhPheDuyetTGD(
		String lanh_dao_tap_doan) {
	driver.findElement(btnTrinhPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 9);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
//	Select selectLDban = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[2]//select[@id='ddlUser']")));
//	selectLDban.selectByVisibleText(lanh_dao_phong_ban);
//	Select selectLDVP = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[3]//select[@id='ddlUser']")));
//	selectLDVP.selectByVisibleText(lanh_dao_van_phong);
	Select selectTGD = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[5]//select[@id='ddlUser']")));
	selectTGD.selectByVisibleText(lanh_dao_tap_doan);
	driver.findElement(btnDongY).click();
}
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
		String file02) throws InterruptedException {
	driver.findElement(btnDinhKemFile).click();
	Thread.sleep(3000);
	driver.switchTo().frame(1);
	driver.findElement(btnChooseFile).sendKeys(file02);
	driver.findElement(btnSave).click();
	Thread.sleep(3000);
	driver.navigate().refresh();
}
public void SuaFile() throws InterruptedException {
	driver.findElement(By.xpath("//table[@role='grid']/tbody[1]/tr[1]/td[7]")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(1);
	driver.findElement(By.xpath("//input[contains(@id,'TextField')]")).clear();
	driver.findElement(By.xpath("//input[contains(@id,'TextField')]")).sendKeys("Chinh sua ten file");
	Select selectLoaiTaiLieu = new Select(driver.findElement(By.xpath("//select[contains(@id, 'LoaiTaiLieu_Lookup')]")));
	selectLoaiTaiLieu.selectByVisibleText("Biểu mẫu");
	driver.findElement(By.xpath("//span[@class='SaveButton']")).click();
}
public void XoaFile() throws InterruptedException {
	driver.findElement(By.xpath("//table[@role='grid']/tbody[1]/tr[1]/td[6]")).click();
	driver.findElement(btnDeleteFile).click();
	driver.switchTo().alert().accept();
	Thread.sleep(6000);
//	driver.navigate().refresh();
}
public void TrinhPheDuyetHSTL(
		String lanh_dao_phong_ban,
		String lanh_dao_phong_lien_quan,
		String lanh_dao_dong_phe_duyet,
		String lanh_dao_duyet_vb,
		String y_kien_nguoi_gui) throws InterruptedException {
		driver.findElement(btnGuiPheDuyet).click();
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
//		Cho Lanh dao Phong lien quan
		driver.findElement(By.xpath("//div[@class='Process']//div[3]//a[@class='SetDynamicStep']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
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
//		Chon Lanh dao Dong Phe duyet
		driver.findElement(By.xpath("//div[@class='Process']//div[4]//a[@class='SetDynamicStep']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
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
//		Chon Lanh Dao Phong ban, Lanh Dao Phe duyet tư Dropdown
		Select ChonTpPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[2]//select[@id='ddlUser']")));
		ChonTpPheDuyet.selectByVisibleText(lanh_dao_phong_ban);
		Select ChonLanhDaoPheDuyet = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[5]//select[@id='ddlUser']")));
		ChonLanhDaoPheDuyet.selectByVisibleText(lanh_dao_duyet_vb);
		driver.findElement(By.xpath("//textarea[@id='txtYKien']")).sendKeys(y_kien_nguoi_gui);
		driver.findElement(btnNext).click();
		Thread.sleep(3000);
}
public void TrinhPheDuyetToTrinh(
		String lanh_dao_pb,
		String lanh_dao_tap_doan) throws InterruptedException {
	driver.findElement(btnGuiPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(By.xpath("//div[@class='step-process pending']//a[@class='SetDynamicStep']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(3);
//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='k-item k-state-default k-last']//span[contains(text(),'Người dùng')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(lanh_dao_pb, Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[contains(@id, 'cppUser_TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btnLuu2")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	Select selectLDTapDoan = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[3]//select[@id='ddlUser']")));
	selectLDTapDoan.selectByVisibleText(lanh_dao_tap_doan);
	Thread.sleep(1000);
	driver.findElement(btnNext).click();
	Thread.sleep(3000);
}
public void TrinhPheDuyetToTrinh2User(
		String lanh_dao_phe_duyet_khac,
		String lanh_dao_pb,
		String lanh_dao_tap_doan) throws InterruptedException {
	driver.findElement(btnGuiPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(By.xpath("//div[@class='step-process pending']//a[@class='SetDynamicStep']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(3);
//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='k-item k-state-default k-last']//span[contains(text(),'Người dùng')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(lanh_dao_phe_duyet_khac, Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[contains(@id, 'cppUser_TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(lanh_dao_pb, Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[contains(@id, 'cppUser_TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("btnLuu2")).click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	Select selectLDTapDoan = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[4]//select[@id='ddlUser']")));
	selectLDTapDoan.selectByVisibleText(lanh_dao_tap_doan);
	Thread.sleep(1000);
	driver.findElement(btnNext).click();
	Thread.sleep(3000);
}
public void TrinhPheDuyetToTrinhTpTrinhTGD(
		String lanh_dao_tap_doan) throws InterruptedException {
	driver.findElement(btnGuiPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	Select selectLDTapDoan = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[4]//select[@id='ddlUser']")));
	selectLDTapDoan.selectByVisibleText(lanh_dao_tap_doan);
	Thread.sleep(1000);
	driver.findElement(btnNext).click();
	Thread.sleep(3000);
}
public void TrinhPheDuyetHSTLKhac(
		String lanh_dao_pb) throws InterruptedException {
	driver.findElement(btnGuiPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	Select selectLDPhongBan = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[2]//select[@id='ddlUser']")));
	selectLDPhongBan.selectByVisibleText(lanh_dao_pb);
	driver.findElement(btnNext).click();
	Thread.sleep(3000);
}
public void TrinhPheDuyetHopDong2User(
		String nguoi_phe_duyet_khac,
		String lanh_dao_pb,
		String lanh_dao_bgd) throws InterruptedException {
	driver.findElement(btnGuiPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(By.xpath("//div[@class='step-process pending']//a[@class='SetDynamicStep']")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(3);
//	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(2));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@class='k-item k-state-default k-last']//span[contains(text(),'Người dùng')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(nguoi_phe_duyet_khac, Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[contains(@id, 'cppUser_TopSpan_AutoFillDiv_MenuList')]//li[1]"))));
	driver.findElement(By.xpath("//ul[contains(@id, 'cppUser_TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id,'cppUser_TopSpan')]//input[2]")).sendKeys(lanh_dao_pb, Keys.SPACE);
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
	Select selectLDTapDoan = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[3]//select[@id='ddlUser']")));
	selectLDTapDoan.selectByVisibleText(lanh_dao_bgd);
	driver.findElement(btnNext).click();
	Thread.sleep(3000);
}
public void TrinhPheDuyetHopDongTpTrinhTGD(
		String lanh_dao_bgd) throws InterruptedException {
	driver.findElement(btnGuiPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	Select selectLDTapDoan = new Select(driver.findElement(By.xpath("//div[@class='Process']//div[3]//select[@id='ddlUser']")));
	selectLDTapDoan.selectByVisibleText(lanh_dao_bgd);
	driver.findElement(btnNext).click();
	Thread.sleep(3000);
}
public void GuiPheDuyetTrenForm() throws InterruptedException {
	driver.findElement(btnGuiPheDuyet).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(btnNext).click();
	Thread.sleep(3000);
}
public void GuiPheDuyetLaiThayDoiNguoiDuyet(
		String lanh_dao_tap_doan) throws InterruptedException {
	Select selectLDTapDoan = new Select(driver.findElement(By.xpath("//select[@id='ddlUser']")));
	selectLDTapDoan.selectByVisibleText(lanh_dao_tap_doan);
	driver.findElement(btnNext).click();
	Thread.sleep(3000);
}
public void InputYKienPheDuyet(
		String y_kien_phe_duyet_hstl) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txtYKien"))));
	driver.findElement(By.id("txtYKien")).sendKeys(y_kien_phe_duyet_hstl);
}
public void DongY(){
	driver.findElement(btnNext).click();
}
public void PheDuyet() {
	driver.findElement(finalApproveBtn).click();
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
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[contains(@id, 'UserReplace_TopSpan_AutoFillDiv_MenuList')]//li[1]"))));
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
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[contains(@id, 'People_TopSpan_AutoFillDiv_MenuList')]//li[1]"))));
	driver.findElement(By.xpath("//ul[contains(@id, 'People_TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	driver.findElement(By.xpath("//textarea[contains(@id,'txtComment')]")).sendKeys(y_kien_phe_duyet_vb_du_thao);
	driver.findElement(btnChiaSe).click();
}
public void ChiaSeTrenFormXuLy(
		String user_duoc_chia_se,
		String y_kien_phe_duyet_vb_du_thao) throws InterruptedException {
	driver.findElement(By.xpath("//input[contains(@id,'btnShare')]")).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(By.xpath("//div[contains(@id, 'People_TopSpan')]//input[2]")).sendKeys(user_duoc_chia_se);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id, 'People_TopSpan')]//input[2]")).sendKeys(Keys.SPACE);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@id, 'People_TopSpan')]//input[2]")).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[contains(@id, 'People_TopSpan_AutoFillDiv_MenuList')]//li[1]"))));
	driver.findElement(By.xpath("//ul[contains(@id, 'People_TopSpan_AutoFillDiv_MenuList')]//li[1]")).click();
	driver.findElement(By.xpath("//textarea[contains(@id,'txtComment')]")).sendKeys(y_kien_phe_duyet_vb_du_thao);
	driver.findElement(By.id("ctl00_PlaceHolderMain_btnShare")).click();
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
	assertEquals(driver.findElements(btnDinhKemFile).size(), 0);
	assertEquals(driver.findElements(btnNewFileTemp).size(), 0);
	assertEquals(driver.findElements(btnGuiPheDuyet).size(), 0);
	assertEquals(driver.findElement(By.id("divLinkShare")).isEnabled(), true);
	assertEquals(driver.findElement(By.xpath("//a[@class='btnPrint']")).isEnabled(), true);
}
public void SuaThongTinHSTL() throws InterruptedException {
	driver.findElement(btnSua).click();
	Thread.sleep(3000);
	driver.switchTo().frame(1);
}
public void SuaThongTinHSTLKhongEdit() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(btnSua).click();
	Thread.sleep(3000);
	driver.switchTo().frame(1);
	Thread.sleep(1000);
	driver.findElement(btnTiepTuc).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(btnTiepTuc));
}
}

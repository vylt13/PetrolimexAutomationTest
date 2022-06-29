package pages;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormXuLyVanBanDen {
	WebDriver driver;
	String file01 = "C:\\AttachFiles\\FileWord.docx";
	String inDocumentNewFormUrl = "https://daotaoeoffice.petrolimex.com.vn/plxbn/vanban/Lists/VanBanDen/ThemMoiVanBanDuThao.aspx?Source=https%3A%2F%2Fdaotaoeoffice%2Epetrolimex%2Ecom%2Evn%2Fplxbn%2Fvanban%2FLists%2FVanBanDen%2FTatCa%2Easpx&ContentTypeId=0x0100F8457C2B8B1A7D4FA6B2B4AFB3DB7340";
//	String draftInDocumentUrl = "https://daotaoeoffice.petrolimex.com.vn/plxkv1/vanban/SitePages/VanBanDen/Luu.aspx";
//	String danhSachChoYKienLanhDao = "https://daotaoeoffice.petrolimex.com.vn/plxkv1/vanban/Lists/VanBanDen/vb-cho-y-kien.aspx";
public FormXuLyVanBanDen(WebDriver driver) {
	this.driver = driver;
}
//	Field Nhap y kien lanh dao
By yKienLanhDao =  By.xpath("//div//textarea[contains (@id, 'txtYKienLanhDao')]");
//	Btn Phân công
By btnVanThuPhanCong = By.xpath("//div[@class='Buttons']//input[contains(@id,'btnChuyenXuLy')]");
// Btn Lanh dao Chuyen xu ly
By btnChuyenLanhDaoKhacXuLy = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnTrinhLanhDao')]");
By btnLanhDaoChuyenXuLy = By.xpath("//div[@class='Buttons']//input[contains(@id,'btnChuyenXuLy')]");
//Btn Kết thúc Văn bản Đến
By btnKetThuc = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnKetThuc')]");
By btnChiaSe = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnShare')]");
By btnThoat = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnThoat')]");
// Checkbox Phan cong
By cBoxPhanCong = By.id("chkPhanCong");
By cBoxPhanCongAll = By.id("chbRootDeptHandle257");
By cBoxPhoiHopCNTT = By.id("chbRootDeptReport209");
By cBoxChonLanhDaoCongTy = By.id("chkTrinhLanhDao");
//	Checkbox Phoi hop All
By cBoxPhoiHopAll = By.id("chbRootDeptReport66");
// Check Nhan Vien Phoi hop 
By cBoxNVPH = By.id("chbReport257_729");
// Checkbox Chon phong CNTT
By cBoxCNTT = By.id("chbRootDeptHandle209");
//	Btn Phan cong thuc hiện
By btnLanhDaoPhanCong = By.xpath("//div[@class='Buttons']//input[contains (@id, 'btnPhanCongThucHien')]");
//	Form Nhap thong tin chia se
By nguoiDuocChiaSe = By.id("ctl00_PlaceHolderMain_sp_cpp_People_TopSpan_EditorInput");
By txtYKienChiaSe = By.xpath("//textarea[contains (@id, 'txtComment')]");
By ddlLanhDaoCongTy = By.xpath("//div[contains(@id,'TrinhLanhDao')]//select[contains(@id,'ddlBanLanhDao')]");
//	Thong tin tren Form VB Da phan cong
By lbNguoiPhoiHop = By.xpath("//span[contains (@id,'lblNguoiNhanDeBiet')]");
By lbNguoiChuyen = By.xpath("//span[contains (@id, 'lblNguoiGiaoViec')]");
By txtLinkThongTinLuanChuyen = By.xpath("//div//a[contains(@id,'lnkbtnThongTinLuanChuyen')]");
//	Danh sach Don vi phan cong
By lbDonViDauTien = By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tbody//tr[2]//td[1]");
By lbTinhTrangDonViDauTien = By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tbody//tr[2]//td[4]");
By lbDonViCuoiCung = By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tbody//tr[11]//td[1]");
By lbTinhTrangDonViCuoiCung = By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tbody//tr[11]//td[4]");
By lbDonViThucHien = By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tbody//tr[5]//td[1]");
By lbTinhTrangDonViThucHien = By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tbody//tr[5]//td[4]");
By txtLinkHoSoDonViThucHien = By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tbody//tr[2]//td[3]");
By txtLinkMoHSXL = By.xpath("//table[@class='tb-form wrapper-tochucthuchien']//tbody//tr[2]//td[3]//a");
//	Danh sach Nhan vien thuc hien
By nvienThucHien = By.xpath("//div[contains(@id,'divNhiemVuXuLy')]//table[@class='tb-form tb-thongtinxuly']//tbody//tr[2]//td[1]");
By hoSoNhanVienTao = By.xpath("//div[contains(@id,'divNhiemVuXuLy')]//table[@class='tb-form tb-thongtinxuly']//tbody//tr[2]//td[4]//a");
By tinhTrangnhanVienThucHien = By.xpath("//div[contains(@id,'divNhiemVuXuLy')]//table[@class='tb-form tb-thongtinxuly']//tbody//tr[2]//td[5]");


public void waitingForLoading() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
}
//	Input Du lieu tren For
public void inputYKienLanhDao(String y_kien_lanh_dao) {
	driver.findElement(yKienLanhDao).sendKeys(y_kien_lanh_dao);
}
public void CheckPhanCongPB() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(cBoxPhanCong));
	driver.findElement(cBoxPhanCong).click();
	Thread.sleep(1000);
	WebElement donvi = driver.findElement(By.xpath("//input[contains(@data-title,'Upgrade')]"));
	String idDepartment = "chbRootDeptHandle"+donvi.getAttribute("data-did");
	driver.findElement(By.id(idDepartment)).click();
}
public void VanThuPhanCong() {
	driver.findElement(cBoxPhanCongAll).click();
	driver.findElement(btnVanThuPhanCong).click();
}
public void ChonCboxPhanCong() {
	driver.findElement(cBoxPhanCong).click();
}
//public void ChuyenLanhDaoKhacXyLy() {
//	driver.findElement(btnChuyenLanhDaoKhacXuLy).click();	
//}
public void chuyenXuLyGroupAssignment() {
	WebElement checkbox = driver.findElement(By.id("chkTrinhLanhDao"));
	boolean check = checkbox.isSelected();
//	boolean check = driver.findElement(By.id("chkTrinhLanhDao")).getAttribute("checked");
	System.out.println(check);
	if(check == true)
	{driver.findElement(By.id("chkTrinhLanhDao")).click();
	}
	driver.findElement(btnLanhDaoChuyenXuLy).click();
}
public void tgdChuyenXuLyGroupAssignment() {
	driver.findElement(btnLanhDaoChuyenXuLy).click();
}
public void ChuyenXuLyLanhDaoKhac(
		String lanh_dao_duoc_chuyen_xu_ly) {
	WebElement checkbox = driver.findElement(By.id("chkTrinhLanhDao"));
	boolean check = checkbox.isSelected();
//	boolean check = driver.findElement(By.id("chkTrinhLanhDao")).getAttribute("checked");
	System.out.println(check);
	if(check == false)
	{driver.findElement(By.id("chkTrinhLanhDao")).click();
	} 
	Select selectLanhDao = new Select(driver.findElement(By.xpath("//div//select[contains(@id,'ddlBanLanhDao')]")));
	selectLanhDao.selectByVisibleText(lanh_dao_duoc_chuyen_xu_ly);
	driver.findElement(btnChuyenLanhDaoKhacXuLy).click();
}
public void CheckPhoiHopAll() {
	WebElement checkPhoiHopAllElement = driver.findElement(cBoxPhoiHopAll);
	checkPhoiHopAllElement.click();
}
public void CheckNVPhoiHop() {
	WebElement checkPhoiHopAllElement = driver.findElement(cBoxNVPH);
	checkPhoiHopAllElement.click();
}
public void CheckPhoiHopCNTT() {
	driver.findElement(cBoxPhanCong).click();
	driver.findElement(cBoxPhoiHopCNTT).click();
}
public void PhanCongCNTT() {
	WebElement cBoxChonCNTT = driver.findElement(cBoxCNTT);
	cBoxChonCNTT.click();
}
public void ValidateDonViPhoiHop(String nguoi_chuyen) {
	assertEquals(driver.findElement(lbNguoiChuyen).getText(), nguoi_chuyen);
	assertEquals(driver.findElement(lbNguoiPhoiHop).getText(), "Phòng Công nghệ Thông tin");
}
public void ValidateTatCaDonViToChucThucHien(String nguoi_chuyen) {
	assertEquals(driver.findElement(lbDonViDauTien).getText(), "Tổng kho Xăng dầu Đức Giang");
	assertEquals(driver.findElement(lbTinhTrangDonViDauTien).getText(), "Chưa bắt đầu");
	assertEquals(driver.findElement(lbDonViCuoiCung).getText(), "Kho cảng H101");
	assertEquals(driver.findElement(lbTinhTrangDonViCuoiCung).getText(), "Chưa bắt đầu");
}
public void ValidateTinhTrangDonViThucHien() {
	assertEquals(driver.findElement(lbDonViDauTien).getText(), "Tổng kho Xăng dầu Đức Giang");
	assertEquals(driver.findElement(lbTinhTrangDonViDauTien).getText(), "Chưa bắt đầu");		
	assertEquals(driver.findElement(lbDonViThucHien).getText(), "Phòng Kế toán Tài chính");
	assertEquals(driver.findElement(lbTinhTrangDonViThucHien).getText(), "Đang thực hiện");	
	assertEquals(driver.findElement(lbDonViCuoiCung).getText(), "Kho cảng H101");
	assertEquals(driver.findElement(lbTinhTrangDonViCuoiCung).getText(), "Chưa bắt đầu");
}
public void ValidateTinhTrangDonViHoanTat() {
	assertEquals(driver.findElement(lbDonViDauTien).getText(), "Tổng kho Xăng dầu Đức Giang");
	assertEquals(driver.findElement(lbTinhTrangDonViDauTien).getText(), "Chưa bắt đầu");		
	assertEquals(driver.findElement(lbDonViThucHien).getText(), "Phòng Kế toán Tài chính");
	assertEquals(driver.findElement(lbTinhTrangDonViThucHien).getText(), "Hoàn tất");	
	assertEquals(driver.findElement(lbDonViCuoiCung).getText(), "Kho cảng H101");
	assertEquals(driver.findElement(lbTinhTrangDonViCuoiCung).getText(), "Chưa bắt đầu");
}
public void ValidateTinhTrangNhanVienDangThucHien(String nguoi_nhan) {
	String nguoiNhan = driver.findElement(nvienThucHien).getText();
	assertEquals(nguoiNhan, nguoi_nhan);
	assertEquals(driver.findElement(tinhTrangnhanVienThucHien).getText(), "Đang thực hiện");
}
public void ValidateTinhTrangNhanVienDaHoanTat(String nguoi_nhan) {
	String nguoiNhan = driver.findElement(nvienThucHien).getText();
	assertEquals(nguoiNhan, nguoi_nhan);
	assertEquals(driver.findElement(tinhTrangnhanVienThucHien).getText(), "Hoàn tất");
}
public void ValidateTinhTrangNhanVienLapHoSoDuThao(
		String nguoi_nhan,
		String ten_ho_so) {
	String nguoiNhan = driver.findElement(nvienThucHien).getText();
	assertEquals(nguoiNhan, nguoi_nhan);
	String hoSo = driver.findElement(hoSoNhanVienTao).getText();
	assertEquals(hoSo, ten_ho_so);
	assertEquals(driver.findElement(tinhTrangnhanVienThucHien).getText(), "Đang thực hiện");
}
public void ValidateTinhTrangNhanVienLapHoSoXuLy(String nguoi_nhan) {
	String nguoiNhan = driver.findElement(nvienThucHien).getText();
	assertEquals(nguoiNhan, nguoi_nhan);
	String hoSo = driver.findElement(hoSoNhanVienTao).getText();
	assertEquals(hoSo.contains("HSXL-VBD"), true);
	assertEquals(driver.findElement(tinhTrangnhanVienThucHien).getText(), "Đang thực hiện");
}
public void ValidateTinhTrangNhanVienHoanTatLapHoSoXuLy(String nguoi_nhan) {
	String nguoiNhan = driver.findElement(nvienThucHien).getText();
	assertEquals(nguoiNhan, nguoi_nhan);
	String hoSo = driver.findElement(hoSoNhanVienTao).getText();
	assertEquals(hoSo.contains("HSXL-VBD"), true);
	assertEquals(driver.findElement(tinhTrangnhanVienThucHien).getText(), "Hoàn tất");
}
public void MoHoSoNhanVienTao() {
	driver.findElement(hoSoNhanVienTao).click();
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTb.get(2));
}

public void ValidateLinkHoSoDuThao(String ten_ho_so) {
	String textLinkHSDT = driver.findElement(txtLinkHoSoDonViThucHien).getText();
	assertEquals(textLinkHSDT, ten_ho_so);
}
public void ValidateLinkHoSoXuLy() {
	String textLinkHSDT = driver.findElement(txtLinkHoSoDonViThucHien).getText();
	assertEquals(textLinkHSDT.contains("HSXL-VBD"), true);
}
public void MoHSXL () {
	driver.findElement(txtLinkMoHSXL).click();
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTb.get(2));
}
public void ValidateThongTinLuanChuyenTrinhChuTich() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(txtLinkThongTinLuanChuyen).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
}
public void PhanCongVanBan() {
	driver.findElement(btnLanhDaoPhanCong).click();	
}
public void LanhDaoChuyenXuLy() {
	driver.findElement(btnLanhDaoChuyenXuLy).click();
}
public void ketThucVBDen() {
	driver.findElement(btnKetThuc).click();	
}
public void chiaSeVB(
		String user_duoc_chia_se_vb,
		String y_kien_chia_se) throws InterruptedException {
	driver.findElement(btnChiaSe).click();
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(3));
	driver.findElement(txtYKienChiaSe).sendKeys(y_kien_chia_se);
	driver.findElement(nguoiDuocChiaSe).sendKeys(user_duoc_chia_se_vb, Keys.TAB, Keys.ENTER);
	driver.findElement(btnChiaSe).click();
}
public void Thoat() {
	driver.findElement(btnThoat).click();
}
}

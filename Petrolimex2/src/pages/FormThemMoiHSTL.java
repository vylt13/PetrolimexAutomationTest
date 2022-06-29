package pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.expectThrows;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormThemMoiHSTL extends ThuocTinhHoSoTaiLieu {
	WebDriver driver;
public FormThemMoiHSTL(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
// Trich yeu
By tenHoSo = By.id("txtDocumentName");
By soHopDong = By.id("txtSoHopDong");
By soVanBan = By.id("txtSoVanBan");
// Upload file 01
By noiDung = By.id("txtSubject");
By trichYeu = By.id("txtSubject");
// Them moi 01 dong Upload file
By ngayKy = By.id("dtNgayKy");
// Upload file 02 
By nguoiKy = By.id("cppNguoiKy_TopSpan_EditorInput");
By ngayHieuLuc = By.id("dtNgayHieuLuc");
By noiLuu = By.id("txtNoiLuu");
By linhVuc = By.id("txtLinhVuc");
By hoSoLuuTru = By.id("txtBoHoSo");
By yKienTrinh = By.id("txtYKienTrinh");
By uploadFile01 = By.id("FileAttachmentUpload1");
By iconThemMoiFile02 = By.id("AddAttachImg01");
By btnTiepTuc = By.xpath("//input[@id='btnComplete']");
By btnThoat = By.id("btnExit");
By loadingIcon = By.id("divLoading");
By lbDonViSoanThao = By.id("lbDonViSoanThao");

// Thực hiện Action Form
public void inputHopDong(
		String so_hop_dong,
		String noi_dung_hop_dong,
		String ngay_ky,
		String nguoi_ky,
		String ngay_hieu_luc,
		String noi_luu,
		String linh_vuc,
		String ho_so_luu_tru,
		String filepathKySo01,
		String y_kien_trinh) throws InterruptedException {
	driver.findElement(soHopDong).sendKeys(so_hop_dong);
	driver.findElement(noiDung).sendKeys(noi_dung_hop_dong);
	driver.findElement(ngayKy).clear();
	driver.findElement(ngayKy).sendKeys(ngay_ky);
	driver.findElement(nguoiKy).sendKeys(nguoi_ky, Keys.SPACE);
	Thread.sleep(3000);
	driver.findElement(nguoiKy).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//ul[@id='cppNguoiKy_TopSpan_AutoFillDiv_MenuList']//li//a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(ngayHieuLuc).clear();
	driver.findElement(ngayHieuLuc).sendKeys(ngay_hieu_luc);
	driver.findElement(noiLuu).sendKeys(noi_luu);
	driver.findElement(linhVuc).sendKeys(linh_vuc, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(linhVuc).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(uploadFile01).sendKeys(filepathKySo01);
	Thread.sleep(1000);
	driver.findElement(yKienTrinh).sendKeys(y_kien_trinh);
}
public void ValidateThongTinFormSuaHopDong(
		String so_hop_dong,
		String don_vi_soan_thao,
		String noi_dung_hop_dong,
		String ngay_ky,
		String ngay_hieu_luc,
		String linh_vuc,
		String noi_luu,
		String ho_so_luu_tru) throws InterruptedException {
	assertEquals(driver.findElement(soHopDong).getAttribute("value"), so_hop_dong);
	assertEquals(driver.findElement(lbDonViSoanThao).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(noiDung).getAttribute("value"), noi_dung_hop_dong);
	assertEquals(driver.findElement(ngayKy).getAttribute("value"), ngay_ky);
	assertEquals(driver.findElement(ngayHieuLuc).getAttribute("value"), ngay_hieu_luc);
	assertEquals(driver.findElement(linhVuc).getAttribute("value"), linh_vuc);
	assertEquals(driver.findElement(noiLuu).getAttribute("value"), noi_luu);
//	assertEquals(driver.findElement(hoSoLuuTru).getAttribute("value"), ho_so_luu_tru);
}
public void editHopDong(
		String so_hop_dong_edit,
		String noi_dung_hop_dong_edit,
		String ngay_ky_edit,
		String ngay_hieu_luc_edit,
		String noi_luu_edit,
		String linh_vuc_edit,
		String ho_so_luu_tru_edit) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(soHopDong).clear();
	driver.findElement(soHopDong).sendKeys(so_hop_dong_edit);
	driver.findElement(noiDung).clear();
	driver.findElement(noiDung).sendKeys(noi_dung_hop_dong_edit);
	driver.findElement(ngayKy).clear();
	driver.findElement(ngayKy).sendKeys(ngay_ky_edit);
	driver.findElement(ngayHieuLuc).clear();
	driver.findElement(ngayHieuLuc).sendKeys(ngay_hieu_luc_edit);
	driver.findElement(noiLuu).clear();
	driver.findElement(noiLuu).sendKeys(noi_luu_edit);
	driver.findElement(linhVuc).clear();
	driver.findElement(linhVuc).sendKeys(linh_vuc_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(linhVuc).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
	driver.findElement(hoSoLuuTru).clear();
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(btnTiepTuc).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(btnTiepTuc));
}
public void XoaDanhMuc() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(linhVuc).clear();
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).clear();
	driver.findElement(btnTiepTuc).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(btnTiepTuc));
}
public void inputBienBanThanhToan(
		String so_hop_dong,
		String noi_dung_hop_dong,
		String ngay_ky,
		String nguoi_ky,
		String noi_luu,
		String linh_vuc,
		String ho_so_luu_tru,
		String filepathKySo01,
		String y_kien_trinh) throws InterruptedException {
	driver.findElement(soHopDong).sendKeys(so_hop_dong);
	driver.findElement(noiDung).sendKeys(noi_dung_hop_dong);
	driver.findElement(ngayKy).clear();
	driver.findElement(ngayKy).sendKeys(ngay_ky);
	driver.findElement(noiLuu).sendKeys(noi_luu);
	driver.findElement(linhVuc).sendKeys(linh_vuc, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(linhVuc).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(uploadFile01).sendKeys(filepathKySo01);
	Thread.sleep(1000);
	driver.findElement(yKienTrinh).sendKeys(y_kien_trinh);
}
public void ValidateThongTinFormSuaBBThanhToan(
//		String so_hop_dong,
		String don_vi_soan_thao,
		String noi_dung_hop_dong,
		String ngay_ky,
		String linh_vuc,
		String noi_luu,
		String ho_so_luu_tru) throws InterruptedException {
//	assertEquals(driver.findElement(soHopDong).getAttribute("value"), so_hop_dong);
	assertEquals(driver.findElement(lbDonViSoanThao).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(noiDung).getAttribute("value"), noi_dung_hop_dong);
//	assertEquals(driver.findElement(ngayKy).getAttribute("value"), ngay_ky);
	assertEquals(driver.findElement(linhVuc).getAttribute("value"), linh_vuc);
	assertEquals(driver.findElement(noiLuu).getAttribute("value"), noi_luu);
//	assertEquals(driver.findElement(hoSoLuuTru).getAttribute("value"), ho_so_luu_tru);
}
public void editBBThanhToan(
//		String so_hop_dong_edit,
		String noi_dung_hop_dong_edit,
		String ngay_ky_edit,
		String noi_luu_edit,
		String linh_vuc_edit,
		String ho_so_luu_tru_edit) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
//	driver.findElement(soHopDong).clear();
//	driver.findElement(soHopDong).sendKeys(so_hop_dong_edit);
	driver.findElement(noiDung).clear();
	driver.findElement(noiDung).sendKeys(noi_dung_hop_dong_edit);
//	driver.findElement(ngayKy).clear();
//	driver.findElement(ngayKy).sendKeys(ngay_ky_edit);
	driver.findElement(noiLuu).clear();
	driver.findElement(noiLuu).sendKeys(noi_luu_edit);
	driver.findElement(linhVuc).clear();
	driver.findElement(linhVuc).sendKeys(linh_vuc_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(linhVuc).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
	driver.findElement(hoSoLuuTru).clear();
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(btnTiepTuc).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(btnTiepTuc));
}
public void inputToTrinh(
		String so_van_ban,
		String trich_yeu,
		String ngay_ky,
		String nguoi_ky,
		String noi_luu,
		String ho_so_luu_tru,
		String filepathKySo01,
		String y_kien_trinh) throws InterruptedException {
	driver.findElement(soVanBan).sendKeys(so_van_ban);
	driver.findElement(trichYeu).sendKeys(trich_yeu);
	driver.findElement(ngayKy).clear();
	driver.findElement(ngayKy).sendKeys(ngay_ky);
	driver.findElement(noiLuu).sendKeys(noi_luu);
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(uploadFile01).sendKeys(filepathKySo01);
	Thread.sleep(3000);
	driver.findElement(yKienTrinh).sendKeys(y_kien_trinh);
}
public void ValidateThongTinFormSuaToTrinh(
		String so_van_ban,
		String don_vi_soan_thao,
		String trich_yeu,
		String ngay_ky,
		String linh_vuc,
		String noi_luu,
		String ho_so_luu_tru) throws InterruptedException {
	assertEquals(driver.findElement(soVanBan).getAttribute("value"), so_van_ban);
	assertEquals(driver.findElement(lbDonViSoanThao).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(trichYeu).getAttribute("value"), trich_yeu);
	assertEquals(driver.findElement(ngayKy).getAttribute("value"), ngay_ky);
	assertEquals(driver.findElement(noiLuu).getAttribute("value"), noi_luu);
	assertEquals(driver.findElement(hoSoLuuTru).getAttribute("value"), ho_so_luu_tru);
}
public void editToTrinh(
		String so_van_ban_edit,
		String trich_yeu_edit,
		String ngay_ky_edit,
		String noi_luu_edit,
		String linh_vuc_edit,
		String ho_so_luu_tru_edit) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(soVanBan).clear();
	driver.findElement(soVanBan).sendKeys(so_van_ban_edit);
	driver.findElement(trichYeu).clear();
	driver.findElement(trichYeu).sendKeys(trich_yeu_edit);
	driver.findElement(ngayKy).clear();
	driver.findElement(ngayKy).sendKeys(ngay_ky_edit);
	driver.findElement(noiLuu).clear();
	driver.findElement(noiLuu).sendKeys(noi_luu_edit);
	driver.findElement(hoSoLuuTru).clear();
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(btnTiepTuc).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(btnTiepTuc));
}
public void inputBaoCaoNoiBo(
		String so_van_ban,
		String trich_yeu,
		String ngay_ky,
		String noi_luu,
		String ho_so_luu_tru,
		String filepathKySo01,
		String y_kien_trinh) throws InterruptedException {
	driver.findElement(soVanBan).sendKeys(so_van_ban);
	driver.findElement(trichYeu).sendKeys(trich_yeu);
	driver.findElement(ngayKy).clear();
	driver.findElement(ngayKy).sendKeys(ngay_ky);
	driver.findElement(noiLuu).sendKeys(noi_luu);
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(uploadFile01).sendKeys(filepathKySo01);
	Thread.sleep(3000);
	driver.findElement(yKienTrinh).sendKeys(y_kien_trinh);
}
public void ValidateThongTinFormSuaBaoCaoNoiBo(
		String so_van_ban,
		String don_vi_soan_thao,
		String trich_yeu,
		String ngay_ky,
		String linh_vuc,
		String noi_luu,
		String ho_so_luu_tru) throws InterruptedException {
	assertEquals(driver.findElement(soVanBan).getAttribute("value"), so_van_ban);
	assertEquals(driver.findElement(lbDonViSoanThao).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(trichYeu).getAttribute("value"), trich_yeu);
	assertEquals(driver.findElement(ngayKy).getAttribute("value"), ngay_ky);
	assertEquals(driver.findElement(noiLuu).getAttribute("value"), noi_luu);
	assertEquals(driver.findElement(hoSoLuuTru).getAttribute("value"), ho_so_luu_tru);
}
public void editBaoCaoNoiBo(
		String so_van_ban_edit,
		String trich_yeu_edit,
		String ngay_ky_edit,
		String noi_luu_edit,
		String linh_vuc_edit,
		String ho_so_luu_tru_edit) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(soVanBan).clear();
	driver.findElement(soVanBan).sendKeys(so_van_ban_edit);
	driver.findElement(trichYeu).clear();
	driver.findElement(trichYeu).sendKeys(trich_yeu_edit);
	driver.findElement(ngayKy).clear();
	driver.findElement(ngayKy).sendKeys(ngay_ky_edit);
	driver.findElement(noiLuu).clear();
	driver.findElement(noiLuu).sendKeys(noi_luu_edit);
	driver.findElement(hoSoLuuTru).clear();
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]"))));
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(btnTiepTuc).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(btnTiepTuc));
}
public void inputBienBanNoiBo(
		String so_van_ban,
		String noi_dung,
		String ngay_ky,
		String noi_luu,
		String ho_so_luu_tru,
		String filepathKySo01,
		String y_kien_trinh) throws InterruptedException {
	driver.findElement(soVanBan).sendKeys(so_van_ban);
	driver.findElement(trichYeu).sendKeys(noi_dung);
	driver.findElement(ngayHieuLuc).clear();
	driver.findElement(ngayHieuLuc).sendKeys(ngay_ky);
	driver.findElement(noiLuu).sendKeys(noi_luu);
	driver.findElement(linhVuc).sendKeys(linh_vuc, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(linhVuc).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(uploadFile01).sendKeys(filepathKySo01);
	Thread.sleep(1000);
	driver.findElement(yKienTrinh).sendKeys(y_kien_trinh);
}
public void ValidateThongTinFormSuaBienBanNoiBo(
		String so_van_ban,
		String don_vi_soan_thao,
		String noi_dung_hop_dong,
		String ngay_ky,
		String linh_vuc,
		String noi_luu,
		String ho_so_luu_tru) throws InterruptedException {
	assertEquals(driver.findElement(soVanBan).getAttribute("value"), so_van_ban);
//	assertEquals(driver.findElement(lbDonViSoanThao).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(trichYeu).getAttribute("value"), noi_dung_hop_dong);
//	assertEquals(driver.findElement(ngayKy).getAttribute("value"), ngay_ky);
	assertEquals(driver.findElement(linhVuc).getAttribute("value"), linh_vuc);
	assertEquals(driver.findElement(noiLuu).getAttribute("value"), noi_luu);
	assertEquals(driver.findElement(hoSoLuuTru).getAttribute("value"), ho_so_luu_tru);
}
public void editBienBanNoiBo(
		String so_van_ban_edit,
		String trich_yeu_edit,
		String ngay_ky_edit,
		String noi_luu_edit,
		String linh_vuc_edit,
		String ho_so_luu_tru_edit) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(soVanBan).clear();
	driver.findElement(soVanBan).sendKeys(so_van_ban_edit);
	driver.findElement(trichYeu).clear();
	driver.findElement(trichYeu).sendKeys(trich_yeu_edit);
//	driver.findElement(ngayKy).clear();
//	driver.findElement(ngayKy).sendKeys(ngay_ky_edit);
	driver.findElement(noiLuu).clear();
	driver.findElement(noiLuu).sendKeys(noi_luu_edit);
	driver.findElement(linhVuc).clear();
	driver.findElement(linhVuc).sendKeys(linh_vuc_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(linhVuc).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
	driver.findElement(hoSoLuuTru).clear();
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(btnTiepTuc).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(btnTiepTuc));
}
public void inputHstlKhac(
		String ten_ho_so,
		String noi_dung,
		String ngay_ky,
		String noi_luu,
		String ho_so_luu_tru,
		String filepathKySo01) throws InterruptedException {
	driver.findElement(tenHoSo).sendKeys(ten_ho_so);
	driver.findElement(noiDung).sendKeys(noi_dung);
	driver.findElement(linhVuc).sendKeys(linh_vuc, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(linhVuc).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
	driver.findElement(noiLuu).sendKeys(noi_luu);
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(uploadFile01).sendKeys(filepathKySo01);
	Thread.sleep(1000);
}
public void ValidateThongTinFormSuaHstlKhac(
		String ten_ho_so,
		String noi_dung,
		String ngay_ky,
		String linh_vuc,
		String noi_luu,
		String ho_so_luu_tru) throws InterruptedException {
	assertEquals(driver.findElement(tenHoSo).getAttribute("value"), ten_ho_so);
//	assertEquals(driver.findElement(lbDonViSoanThao).getText(), don_vi_soan_thao);
	assertEquals(driver.findElement(trichYeu).getAttribute("value"), noi_dung);
//	assertEquals(driver.findElement(ngayKy).getAttribute("value"), ngay_ky);
	assertEquals(driver.findElement(linhVuc).getAttribute("value"), linh_vuc);
	assertEquals(driver.findElement(noiLuu).getAttribute("value"), noi_luu);
//	assertEquals(driver.findElement(hoSoLuuTru).getAttribute("value"), ho_so_luu_tru);
}
public void editHstlKhac(
		String ten_ho_so_edit,
		String noi_dung_edit,
		String ngay_ky_edit,
		String noi_luu_edit,
		String linh_vuc_edit,
		String ho_so_luu_tru_edit) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(tenHoSo).clear();
	driver.findElement(tenHoSo).sendKeys(ten_ho_so_edit);
	driver.findElement(trichYeu).clear();
	driver.findElement(trichYeu).sendKeys(noi_dung_edit);
//	driver.findElement(ngayKy).clear();
//	driver.findElement(ngayKy).sendKeys(ngay_ky_edit);
	driver.findElement(noiLuu).clear();
	driver.findElement(noiLuu).sendKeys(noi_luu_edit);
	driver.findElement(linhVuc).clear();
	driver.findElement(linhVuc).sendKeys(linh_vuc_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(linhVuc).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
	driver.findElement(hoSoLuuTru).clear();
	driver.findElement(hoSoLuuTru).sendKeys(ho_so_luu_tru_edit, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(hoSoLuuTru).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtBoHoSo_listbox']//li[1]")).click();
	driver.findElement(btnTiepTuc).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(btnTiepTuc));
}
public void TaoHoSo() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(btnTiepTuc).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
	
}
}

package pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormHSLuuTru extends ThuocTinhHoSoLuuTru {
	WebDriver driver;
public FormHSLuuTru(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
By maHoSo = By.xpath("//div[@class='ItemRow col1 two-col']//div[2]");
By tenHoSo = By.xpath("//div[@class='ItemRow col1 two-col']//div[4]");
By noiDung = By.xpath("//div[@class='ItemRow col2 one-col']//div[2]");
By tuNgay = By.xpath("//div[@class='ItemRow col3 two-col']//div[2]");
By denNgay = By.xpath("//div[@class='ItemRow col3 two-col']//div[4]");
By noiLuu = By.xpath("//div[@class='ItemRow col4 one-col']//div[2]");
By linhVuc = By.xpath("//div[@class='ItemRow col5 two-col']//div[2]");
By tinhTrang = By.xpath("//div[@class='ItemRow col5 two-col']//div[4]");
By nguoiCapNhat = By.xpath("//div[@class='ItemRow col6 one-col']//div[2]");
By quyenXem = By.xpath("//div[@class='ItemRow col7 one-col']//div[2]");
By nguoiTaoHoSo = By.xpath("//div[@class='ItemRow col8 one-col']//div[2]");
By iconThemFile = By.xpath("//div[@class='Button-vb Buttons']//a[1]");
By iconThemVanBan = By.xpath("//div[@class='Button-vb Buttons']//a[2]");
By btnIn = By.xpath("//div[@class='Button-vb Buttons']//input[@class='btn-print']");
By btnXoa = By.xpath("//div[@class='Button-vb Buttons']//input[@class='btn-delete']");
By btnSua = By.xpath("//div[@class='Button-vb Buttons']//input[@class='btn-save']");
By btnThoat = By.xpath("//div[@class='Button-vb Buttons']//input[@id='btnExit']");
// Upload file
By btnChooseFile = By.id("ctl00_PlaceHolderMain_fu1");
By btnOK = By.id("ctl00_PlaceHolderMain_btnUpLoad");
// Luoi Danh sach file
By iconEditFile = By.xpath("//tbody/tr[1]/td[2]//a");
By tenTaiLieu = By.id("txtTenTaiLieu");
By ngayTrenVanBan = By.id("txtNgayTrenVB");
By plxKyChinh = By.id("txtPLXKyChinh");
By doiTacKy = By.id("txtDoiTacKy");
By ghiChu = By.id("txtGhiChu");
By luuThongTinFile = By.id("btnSave");
// Them Van ban
By searchbox = By.id("txtMaVanBan");
By iconSearch = By.id("btnSearch");
By cboxChon = By.xpath("//tr[1]//td[1]//input[@type='checkbox']");
By iconThemVaoHoSo = By.id("btnSelect");

// Thực hiện Action Form
public void validateHSLT() throws InterruptedException {
//	assertEquals(driver.findElement(maHoSo).getText(), ma_ho_so);
	assertEquals(driver.findElement(tenHoSo).getText(), ten_ho_so);
	assertEquals(driver.findElement(noiDung).getText(), noi_dung_ho_so);
	assertEquals(driver.findElement(tuNgay).getText(), tu_ngay);
	assertEquals(driver.findElement(denNgay).getText(), den_ngay);
	assertEquals(driver.findElement(noiLuu).getText(), noi_luu);
	assertEquals(driver.findElement(linhVuc).getText(), linh_vuc);
	assertEquals(driver.findElement(tinhTrang).getText(), tinh_trang);
	assertEquals(driver.findElement(nguoiCapNhat).getText(), nguoi_cap_nhat);
	assertEquals(driver.findElement(quyenXem).getText(), quyen_xem);
	assertEquals(driver.findElement(nguoiTaoHoSo).getText(), nguoi_tao_hs);
	assertEquals(driver.findElement(iconThemFile).isEnabled(), true);
	assertEquals(driver.findElement(iconThemVanBan).isEnabled(), true);
	assertEquals(driver.findElement(btnIn).isEnabled(), true);
	assertEquals(driver.findElement(btnSua).isEnabled(), true);
	assertEquals(driver.findElement(btnXoa).isEnabled(), true);
	assertEquals(driver.findElement(btnThoat).isEnabled(), true);
	}
public void validateViewOnlyHSLT() throws InterruptedException {
//	assertEquals(driver.findElement(maHoSo).getText(), ma_ho_so);
	assertEquals(driver.findElement(tenHoSo).getText(), ten_ho_so);
	assertEquals(driver.findElement(noiDung).getText(), noi_dung_ho_so);
	assertEquals(driver.findElement(tuNgay).getText(), tu_ngay);
	assertEquals(driver.findElement(denNgay).getText(), den_ngay);
	assertEquals(driver.findElement(noiLuu).getText(), noi_luu);
	assertEquals(driver.findElement(linhVuc).getText(), linh_vuc);
	assertEquals(driver.findElement(tinhTrang).getText(), tinh_trang);
	assertEquals(driver.findElement(nguoiCapNhat).getText(), nguoi_cap_nhat);
	assertEquals(driver.findElement(quyenXem).getText(), quyen_xem);
	assertEquals(driver.findElement(nguoiTaoHoSo).getText(), nguoi_tao_hs);
	assertTrue(driver.findElements(iconThemFile).size() < 1);
	assertTrue(driver.findElements(iconThemVanBan).size() < 1);
	assertTrue(driver.findElements(btnIn).size() < 1);
	assertTrue(driver.findElements(btnSua).size() < 1);
	assertTrue(driver.findElements(btnXoa).size() < 1);
	assertTrue(driver.findElements(btnThoat).size() < 1);
	}
public String LayMaHoSo() {
	return driver.findElement(maHoSo).getText();
}
public String LayTenHoSo() {
	return driver.findElement(tenHoSo).getText();
}
public void UploadFile() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(iconThemFile).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));	
	driver.findElement(btnChooseFile).sendKeys(file01);
	driver.findElement(btnOK).click();
	assertEquals(driver.findElement(By.xpath("//tbody/tr[1]/td[4]//a")).getText(), file01_full_name);
}
public void EditFile() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(iconEditFile).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(tenTaiLieu).sendKeys(ten_tai_lieu);
	driver.findElement(ngayTrenVanBan).sendKeys(ngay_tren_vb);
	driver.findElement(plxKyChinh).sendKeys(plx_ky_chinh);
	driver.findElement(doiTacKy).sendKeys(doi_tac_ky);
	driver.findElement(ghiChu).sendKeys(ghi_chu);
	driver.findElement(luuThongTinFile).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));	
}
public void ThemVanBanDen() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(iconThemVanBan).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(searchbox).sendKeys(so_van_ban_den);
	driver.findElement(iconSearch).click();
	Thread.sleep(4000);
	driver.findElement(cboxChon).click();
	driver.findElement(iconThemVaoHoSo).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText(), so_van_ban_den);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[4]//a")).getText(), trich_yeu_vb_den);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[5]")).getText(), ngay_them_vb_vao_hs);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[6]")).getText(), nguoi_tao_hs);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[@role='row']/td[7]/a[1]/img[1]")).getAttribute("src"), "https://daotaoeoffice.petrolimex.com.vn/_layouts/15/Images/VuThao.Petrolimex.Workflow/delete12.png");	
}
public void BoChonVanBanDen() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(iconThemVanBan).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(searchbox).sendKeys(so_van_ban_den);
	driver.findElement(iconSearch).click();
	Thread.sleep(4000);
	driver.findElement(cboxChon).click();
	driver.findElement(iconThemVaoHoSo).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));	
}
public void ThemVanBanBanHanh() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(iconThemVanBan).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(searchbox).sendKeys(so_van_ban_ban_hanh);
	driver.findElement(iconSearch).click();
	Thread.sleep(4000);
	driver.findElement(cboxChon).click();
	driver.findElement(iconThemVaoHoSo).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText(), so_van_ban_ban_hanh);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[4]//a")).getText(), trich_yeu_vb_ban_hanh);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[5]")).getText(), ngay_them_vb_vao_hs);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[6]")).getText(), nguoi_tao_hs);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[@role='row']/td[7]/a[1]/img[1]")).getAttribute("src"), "https://daotaoeoffice.petrolimex.com.vn/_layouts/15/Images/VuThao.Petrolimex.Workflow/delete12.png");	
}
public void BoChonVanBanBanHanh() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(iconThemVanBan).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(searchbox).sendKeys(so_van_ban_ban_hanh);
	driver.findElement(iconSearch).click();
	Thread.sleep(4000);
	driver.findElement(cboxChon).click();
	driver.findElement(iconThemVaoHoSo).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));	
}
public void ThemHoSoTaiLieu() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(iconThemVanBan).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(searchbox).sendKeys(ten_ho_so_tai_lieu);
	driver.findElement(iconSearch).click();
	Thread.sleep(4000);
	driver.findElement(cboxChon).click();
	driver.findElement(iconThemVaoHoSo).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText(), so_ho_so_tai_lieu );
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[4]//a")).getText(), ten_ho_so_tai_lieu);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[5]")).getText(), ngay_them_vb_vao_hs);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[2]/td[6]")).getText(), nguoi_tao_hs);
	assertEquals(driver.findElement(By.xpath("//tbody/tr[@role='row']/td[7]/a[1]/img[1]")).getAttribute("src"), "https://daotaoeoffice.petrolimex.com.vn/_layouts/15/Images/VuThao.Petrolimex.Workflow/delete12.png");	
}
public void BoChonHoSoTaiLieu() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(iconThemVanBan).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
	driver.findElement(searchbox).sendKeys(ten_ho_so_tai_lieu);
	driver.findElement(iconSearch).click();
	Thread.sleep(4000);
	driver.findElement(cboxChon).click();
	driver.findElement(iconThemVaoHoSo).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));	
}
public void XoaVanBanDaThem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(By.xpath("//tbody/tr[@role='row']/td[7]/a[1]/img[1]")).click();
	driver.switchTo().alert().accept();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));	
}
public void SuaHoSo() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(btnSua).click();
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
}
public void XoaHoSo() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(btnXoa).click();
	driver.switchTo().alert().accept();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
	
}

}

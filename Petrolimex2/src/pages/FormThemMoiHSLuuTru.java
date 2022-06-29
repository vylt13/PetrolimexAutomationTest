package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormThemMoiHSLuuTru extends ThuocTinhHoSoLuuTru {
	WebDriver driver;
public FormThemMoiHSLuuTru(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
By maHoSo = By.id("txtMaHoSo");
By tenHoSo = By.id("txtTenHoSo");
By noiDung = By.id("txtNoiDung");
By tuNgay = By.id("dtTuNgay");
By denNgay = By.id("dtDenNgay");
By noiLuu = By.id("txtNoiLuu");
By linhVuc = By.id("txtLinhVuc");
By tinhTrang = By.id("ddlStatus");
By nguoiCapNhat = By.xpath("//div[@id='cppNguoiTheoDoi_TopSpan']//input[2]");
By quyenXem = By.xpath("//div[@id='cppQuyenXem_TopSpan']//input[2]");
By btnLuu = By.xpath("//div[@class='Button-vb Buttons']//input[@class='btn-save']");
// Thực hiện Action Form
public void inputHoSoLuuTru() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(maHoSo).sendKeys(ma_ho_so);
	driver.findElement(tenHoSo).sendKeys(ten_ho_so);
	driver.findElement(noiDung).sendKeys(noi_dung_ho_so);
	driver.findElement(tuNgay).clear();
	driver.findElement(tuNgay).sendKeys(tu_ngay);
	driver.findElement(denNgay).clear();
	driver.findElement(denNgay).sendKeys(den_ngay);
	driver.findElement(noiLuu).sendKeys(noi_luu);
	driver.findElement(linhVuc).sendKeys(linh_vuc);
	driver.findElement(linhVuc).sendKeys(Keys.SPACE);
	driver.findElement(linhVuc).sendKeys(Keys.BACK_SPACE);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")));
	driver.findElement(By.xpath("//ul[@id='txtLinhVuc_listbox']//li[1]")).click();
	Select selectTinhtrang = new Select(driver.findElement(tinhTrang));
	selectTinhtrang.selectByVisibleText(tinh_trang);
	driver.findElement(nguoiCapNhat).sendKeys(nguoi_cap_nhat);
	Thread.sleep(3000);
	driver.findElement(nguoiCapNhat).sendKeys(Keys.SPACE);
	Thread.sleep(3000);
	driver.findElement(nguoiCapNhat).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='cppNguoiTheoDoi_TopSpan_AutoFillDiv_MenuList']//li[1]")));
	driver.findElement(By.xpath("//ul[@id='cppNguoiTheoDoi_TopSpan_AutoFillDiv_MenuList']//li[1]")).click();
	driver.findElement(quyenXem).sendKeys(quyen_xem);
	Thread.sleep(3000);
	driver.findElement(quyenXem).sendKeys(Keys.SPACE);
	Thread.sleep(3000);
	driver.findElement(quyenXem).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@id='cppQuyenXem_TopSpan_AutoFillDiv_MenuList']//li[1]")));
	driver.findElement(By.xpath("//ul[@id='cppQuyenXem_TopSpan_AutoFillDiv_MenuList']//li[1]")).click();
	driver.findElement(btnLuu).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
	}
public void EditHoSoLuuTru() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(maHoSo).clear();
	driver.findElement(maHoSo).sendKeys(ma_ho_so_edit);
	driver.findElement(tenHoSo).clear();
	driver.findElement(tenHoSo).sendKeys(ten_ho_so_edit);
	driver.findElement(btnLuu).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("divLoading")));
}

}

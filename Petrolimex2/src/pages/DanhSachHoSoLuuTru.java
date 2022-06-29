package pages;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DanhSachHoSoLuuTru extends ThuocTinhHoSoLuuTru {
	WebDriver driver;
public DanhSachHoSoLuuTru(WebDriver driver) {
	this.driver = driver;
}
//Tim vi tri cac Element tren Form
By maHoSo = By.id("txtMaHoSo");
By tenHoSo = By.id("txtTenHoSo");
By iconSearch = By.id("btnSearch");
By ketQuaMaHoSo = By.xpath("//td[2]//a");
By ketQuaTenHoSo = By.xpath("//td[3]//a");

// Thực hiện Action Form
public void TimHoSoTheoMa(
		String ma_ho_so,
		String ten_ho_so) {
	driver.findElement(maHoSo).sendKeys(ma_ho_so);
	driver.findElement(iconSearch).click();
	assertEquals(driver.findElement(ketQuaMaHoSo).getText(), ma_ho_so);
	assertEquals(driver.findElement(ketQuaTenHoSo).getText(), ten_ho_so);
}
public void TimHoSoTheoTen(
		String ten_ho_so,
		String trich_yeu) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(tenHoSo).sendKeys(ten_ho_so);
	driver.findElement(iconSearch).click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.elementToBeClickable(ketQuaTenHoSo));
	driver.findElement(ketQuaTenHoSo).click();
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTb.get(1));
    String bodyText = driver.findElement(By.tagName("body")).getText();
    Assert.assertTrue(bodyText.contains(trich_yeu));
    driver.close();
    driver.switchTo().window(newTb.get(0));
}
public void TimHSTLDaXoaKhoiHSLT(
		String ten_ho_so,
		String trich_yeu) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	driver.findElement(tenHoSo).sendKeys(ten_ho_so);
	driver.findElement(iconSearch).click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.elementToBeClickable(ketQuaTenHoSo));
	driver.findElement(ketQuaTenHoSo).click();
	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(newTb.get(1));
    String bodyText = driver.findElement(By.tagName("body")).getText();
    Assert.assertFalse(bodyText.contains(trich_yeu));
    driver.close();
    driver.switchTo().window(newTb.get(0));
}
public void TimHoSoDaXoa(
		String ma_ho_so,
		String ten_ho_so) throws InterruptedException {
	driver.findElement(maHoSo).sendKeys(ma_ho_so);
	driver.findElement(iconSearch).click();
	Thread.sleep(2000);
	assertEquals(driver.findElement(By.xpath("//span[@class='k-pager-info k-label']")).getText(),"Không có mục nào");
}
}

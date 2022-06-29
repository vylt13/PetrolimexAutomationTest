package pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachViecCanXuLyTD {
	WebDriver driver;
public DanhSachViecCanXuLyTD(WebDriver driver) {
	this.driver = driver;
}
By doUuTien = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[2]//td[3]//img");
By tieuDe = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[2]//td[4]//span");
By ngayTao = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[2]//td[7]");
By nhomCongViec = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[3]");
By noiGui = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[2]//td[10]");
By hanHoanThanh = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[5]");

public void ValidateTaskNhanVanBanDenQuaMang(
		String trich_yeu,
		String co_quan_gui) {
	DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String createdTime = myFormatObj.format(LocalDateTime.now());
	assertEquals(driver.findElement(tieuDe).getText(), "Nhận VB đến qua mạng \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đến");
	assertEquals(driver.findElement(ngayTao).getText(), createdTime);
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
}
public void ValidateHoanTatTaskNhanVanBanDenQuaMang(
		String trich_yeu) {
	assertNotEquals(driver.findElement(tieuDe).getText(), "Nhận VB đến qua mạng \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
}

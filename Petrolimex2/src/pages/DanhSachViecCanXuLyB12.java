package pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DanhSachViecCanXuLyB12 {
	WebDriver driver;
public DanhSachViecCanXuLyB12(WebDriver driver) {
	this.driver = driver;
}

By tieuDe = By.xpath("//div[@class='Form ViecCanXuLy']//tbody//tr[1]//td[2]//span");
By nhomCongViec = By.xpath("//div[@class='Form ViecCanXuLy']//tbody//tr[1]//td[4]");
By noiGui = By.xpath("//div[@class='Form ViecCanXuLy']//tbody//tr[1]//td[5]");

public void ValidateTaskNhanVanBanDenQuaMang(
		String trich_yeu,
		String co_quan_gui) {
	assertEquals(driver.findElement(tieuDe).getText(), "Nhận VB đến qua mạng \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đến");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
}
public void ValidateHoanTatTaskNhanVanBanDenQuaMang(
		String trich_yeu) {
	assertNotEquals(driver.findElement(tieuDe).getText(), "Nhận VB đến qua mạng \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
}

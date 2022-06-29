package pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachViecCanXuLyPlxbn {
	WebDriver driver;
public DanhSachViecCanXuLyPlxbn(WebDriver driver) {
	this.driver = driver;
}
By tieuDe = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[1]//span");
By doUuTien = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[2]//img");
By nhomCongViec = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[3]");
By noiGui = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[4]");
By hanHoanThanh = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[5]");

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

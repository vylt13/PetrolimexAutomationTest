package tetsCaseTinhNangChung;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.FormHSLuuTru;
import pages.FormThemMoiHSLuuTru;
import pages.Login;
import pages.ThuocTinhHoSoTaiLieu;

public class CheckXpath extends ThuocTinhHoSoTaiLieu{
	WebDriver driver;
	String noi_dung_hop_dong = "Hợp đồng Luồng Ký số Bình thường Tạo ngày: " + createdTime;
	String noi_dung_hop_dong_edit = "Hợp đồng Luồng Ký số Bình thường Edit Tạo ngày: " + createdTime;
@Test
public void TaoHoSoLuuTru() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Login login = new Login(driver);
	FormThemMoiHSLuuTru formThemMoiHSLuuTru = new FormThemMoiHSLuuTru(driver);
	FormHSLuuTru formHSLuuTru = new FormHSLuuTru(driver);
	login.NavigateToSite();
	login.LoginUserChuTich();
	driver.get("https://daotaoeoffice.petrolimex.com.vn/plxkv1/vanban/SitePages/VanBanDen/VanBanDenEdit.aspx?IDVB=18661");
	WebElement checkbox = driver.findElement(By.id("chkTrinhLanhDao"));
	boolean check = checkbox.isSelected();
//	boolean check = driver.findElement(By.id("chkTrinhLanhDao")).getAttribute("checked");
	System.out.println(check);
	if(check ==true)
	{driver.findElement(By.id("chkTrinhLanhDao")).click();
	} 
}
}
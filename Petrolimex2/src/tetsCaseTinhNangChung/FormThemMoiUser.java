package tetsCaseTinhNangChung;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormThemMoiUser {
	WebDriver driver;	
public FormThemMoiUser(WebDriver driver) {
	this.driver = driver;
}

//Tim vi tri cac Element tren Form
By btnLuu = By.xpath("//input[@id='ctl00_ctl46_g_0d0024ee_e10a_4096_bc58_58fc24457c7f_btnInsert']");
By btnGui = By.xpath("//a[@class='btn btn-send']");
By HoTen = By.id("ctl00_ctl46_g_0d0024ee_e10a_4096_bc58_58fc24457c7f_txtFullName");
By TaiKhoan = By.id("ctl00_ctl46_g_0d0024ee_e10a_4096_bc58_58fc24457c7f_pedAccount_upLevelDiv");
By DonVi = By.id("txtDepartment");
By MaNV = By.id("ctl00_ctl46_g_8986627b_7d02_457f_a92e_ed3bb66e08ae_txtEmployeeID");
By ChucVu = By.xpath("//div[@class='ItemInput']//select[@id='ctl00_ctl46_g_0d0024ee_e10a_4096_bc58_58fc24457c7f_ddlChucVu']");
By SDT = By.id("ctl00_ctl46_g_8986627b_7d02_457f_a92e_ed3bb66e08ae_txtMobile");

public void inputUser(int Row) throws EncryptedDocumentException, IOException, ParseException, InterruptedException {
{
	FileInputStream fileInputStream = new FileInputStream("C:\\Selenium\\User Petro PTCHN.xlsx");
	Workbook wb =WorkbookFactory.create(fileInputStream);
	Sheet sheet= wb.getSheet("Sheet1");
	WebDriverWait wait = new WebDriverWait(driver, 90);
//Khai bao
	String TaiKhoana = sheet.getRow(Row).getCell(1).getStringCellValue();
	String hotenString = sheet.getRow(Row).getCell(0).getStringCellValue();
	String chucVuString = sheet.getRow(Row).getCell(2).getStringCellValue();
	String phongBanString = sheet.getRow(Row).getCell(3).getStringCellValue();
	
//Input
	driver.findElement(TaiKhoan).sendKeys(TaiKhoana);
	
	driver.findElement(TaiKhoan).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(HoTen).clear();
	driver.findElement(HoTen).sendKeys(hotenString);
	Select ChonTpPheDuyet = new Select(driver.findElement(ChucVu));
	ChonTpPheDuyet.selectByVisibleText(chucVuString);
	driver.findElement(DonVi).sendKeys(phongBanString, Keys.SPACE);
	Thread.sleep(1000);
	driver.findElement(DonVi).sendKeys(Keys.BACK_SPACE);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ul[@id='txtDepartment_listbox']//li[1]")).click();
	Thread.sleep(2000);
	driver.findElement(btnLuu).click();

}
}
}
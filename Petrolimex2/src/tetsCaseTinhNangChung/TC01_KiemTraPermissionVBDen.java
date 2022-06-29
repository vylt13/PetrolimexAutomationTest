package tetsCaseTinhNangChung;
import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC01_KiemTraPermissionVBDen {
	WebDriver driver;	
 	String passWord = "VuThao123!@#";
 	String baseUrl = "https://bpm.vuthao.com/";
public TC01_KiemTraPermissionVBDen(WebDriver driver) {
	this.driver = driver;
}

//Tim vi tri cac Element tren Form
By MainForm = By.id("WorkflowFormDefination");
By btnLuu = By.xpath("//a[@class='btn btn-save']");
By btnGui = By.xpath("//a[@class='btn btn-send']");

public void MoFormTaoPhieu() {
	By idQuyTrinh = By.xpath("//span[@id='qt-1313']");
	WebDriverWait wait = new WebDriverWait(driver, 60);
	driver.findElement(idQuyTrinh).click();
	wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='loading']"))));
}
public void ValidateButton() {
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(btnLuu));
	assertTrue(driver.findElement(btnLuu).isEnabled());
	assertTrue(driver.findElement(btnGui).isEnabled());
}
public void NhapThongTinChung(int Row) throws EncryptedDocumentException, IOException, ParseException {
	FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\PNJ\\Data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("QT1");
	String StoreType = sheet.getRow(Row).getCell(1).getStringCellValue();
	String Address = sheet.getRow(Row).getCell(2).getStringCellValue();
	int Salesarea = (int)sheet.getRow(Row).getCell(4).getNumericCellValue();
	int Storearea = (int)sheet.getRow(Row).getCell(5).getNumericCellValue();
	String OfficeSaleTime = String.valueOf((sheet.getRow(Row).getCell(6).getLocalDateTimeCellValue()).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	String Timeforrepair = String.valueOf((sheet.getRow(Row).getCell(7).getLocalDateTimeCellValue()).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	String Businessbrand = sheet.getRow(Row).getCell(8).getStringCellValue();
	String SalesChannel = sheet.getRow(Row).getCell(9).getStringCellValue();
	String Timeforlayoutapproved = String.valueOf((sheet.getRow(Row).getCell(10).getLocalDateTimeCellValue()).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	String Timefordetaillayoutapproved = String.valueOf((sheet.getRow(Row).getCell(11).getLocalDateTimeCellValue()).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	String TimetohandoverstoretoBranch = String.valueOf((sheet.getRow(Row).getCell(12).getLocalDateTimeCellValue()).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	String TimetohandoverstoretoQTHQ = String.valueOf((sheet.getRow(Row).getCell(13).getLocalDateTimeCellValue()).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	String Timeofsale = String.valueOf((sheet.getRow(Row).getCell(14).getLocalDateTimeCellValue()).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	String LevelStore = sheet.getRow(Row).getCell(15).getStringCellValue();
	String OpeningTimetoBranch = String.valueOf((sheet.getRow(Row).getCell(16).getLocalDateTimeCellValue()).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	String OpeningTimetoTTTT = String.valueOf((sheet.getRow(Row).getCell(17).getLocalDateTimeCellValue()).format(DateTimeFormatter.ofPattern("dd/MM/yy")));
	String Newunitname = sheet.getRow(Row).getCell(18).getStringCellValue();
//	Find element
	By ctrStoreType = By.xpath("//div[@class='ItemControl divKDEStoreType']//label[contains(text(),'"+ StoreType + "')]" );
	By ctrAddress = By.xpath("//div[@class='ItemControl divKDEAddress']//input");
	By ctrSalesarea = By.xpath("//div[@class='ItemControl divKDESalesarea']//input[1]");
	By ctrStorearea = By.xpath("//div[@class='ItemControl divKDEStorearea']//input[1]");
	By ctrOfficeSaleTime = By.xpath("//div[@class='ItemControl divKDEOfficeSaleTime']//input[1]");
	By ctrTimeforrepair = By.xpath("//div[@class='ItemControl divKDETimeforrepair']//input[1]");
	By ctrBusinessbrand = By.xpath("//div[@class='ItemControl divKDEBusinessbrand']//input[@data-value='" + Businessbrand + "']");
	By ctrSalesChannel = By.xpath("//div[@class='ItemControl divKDESalesChannel']//label[contains(text(),'"+ SalesChannel + "')]" );
	By ctrTimeforlayoutapproved = By.xpath("//div[@class='ItemControl divKDETimeforlayoutapproved']//input[1]");
	By ctrTimefordetaillayoutapproved = By.xpath("//div[@class='ItemControl divKDETimefordetaillayoutapproved']//input[1]");
	By ctrTimetohandoverstoretoBranch = By.xpath("//div[@class='ItemControl divKDETimetohandoverstoretoBranch']//input[1]");
	By ctrTimetohandoverstoretoQTHQ = By.xpath("//div[@class='ItemControl divKDETimetohandoverstoretoQTHQ']//input[1]");
	By ctrTimeofsale = By.xpath("//div[@class='ItemControl divKDETimeofsale']//input[1]");
	By ctrLevelStore = By.xpath("//div[@class='ItemControl divKDELevelStore']//input[1]");
	By ctrOpeningTimetoBranch = By.xpath("//div[@class='ItemControl divKDEOpeningTimetoBranch']//input[1]");
	By ctrOpeningTimetoTTTT = By.xpath("//div[@class='ItemControl divKDEOpeningTimetoTTTT']//input[1]");
	By ctrNewunitname = By.xpath("//div[@class='ItemControl divKDENewunitname']//input[1]");
//	Input
	driver.findElement(ctrStoreType).click();
	driver.findElement(ctrAddress).sendKeys(Address);
	driver.findElement(ctrSalesarea).sendKeys(String.valueOf(Salesarea));
	driver.findElement(ctrStorearea).sendKeys(String.valueOf(Storearea));
	driver.findElement(ctrOfficeSaleTime).sendKeys(OfficeSaleTime);
	driver.findElement(ctrTimeforrepair).sendKeys(Timeforrepair);
	driver.findElement(ctrBusinessbrand).click();
	driver.findElement(ctrSalesChannel).click();
	driver.findElement(ctrTimeforlayoutapproved).sendKeys(Timeforlayoutapproved);
	driver.findElement(ctrTimefordetaillayoutapproved).sendKeys(Timefordetaillayoutapproved);
	driver.findElement(ctrTimetohandoverstoretoBranch).sendKeys(TimetohandoverstoretoBranch);
	driver.findElement(ctrTimetohandoverstoretoQTHQ).sendKeys(TimetohandoverstoretoQTHQ);
	driver.findElement(ctrTimeofsale).sendKeys(Timeofsale);
	driver.findElement(ctrLevelStore).sendKeys(LevelStore);
	driver.findElement(ctrOpeningTimetoBranch).sendKeys(OpeningTimetoBranch);
	driver.findElement(ctrOpeningTimetoTTTT).sendKeys(OpeningTimetoTTTT);
	driver.findElement(ctrNewunitname).sendKeys(Newunitname);
}
public void NhapDetail() throws EncryptedDocumentException, IOException, ParseException {
	FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\PNJ\\\\Data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("QT1.NCNS");
	LocalDateTime Possition1 = sheet.getRow(1).getCell(1).getLocalDateTimeCellValue();
	String Possition2 = sheet.getRow(2).getCell(1).getStringCellValue();
	int ProposednumberofpersonneltoBranc1 = (int)sheet.getRow(1).getCell(2).getNumericCellValue();
	int ProposednumberofpersonneltoBranc2 = (int)sheet.getRow(2).getCell(2).getNumericCellValue();
	int NumberofreviewpersonneltoKNNL1 = (int)sheet.getRow(1).getCell(3).getNumericCellValue();
	int NumberofreviewpersonneltoKNNL2 = (int)sheet.getRow(2).getCell(3).getNumericCellValue();
	String Opinion1 = sheet.getRow(1).getCell(4).getStringCellValue();
	String Opinion2 = sheet.getRow(2).getCell(4).getStringCellValue();
	
//	Find element
	By iconAdd = By.xpath("//a//span[@class='k-icon k-i-add']");
	By iconUpdate = By.xpath("//a//span[@class='k-icon k-i-update']");
	By ctrProposednumberofpersonneltoBranc1 = By.xpath("//tr[1]//td[@data-container-for='ProposednumberofpersonneltoBranc']//input" );
	By ctrProposednumberofpersonneltoBranc2 = By.xpath("//tr[2]//td[@data-container-for='ProposednumberofpersonneltoBranc']//input" );
	By ctrNumberofreviewpersonneltoKNNL1 = By.xpath("//tr[1]//td[@data-container-for='NumberofreviewpersonneltoKNNL']//input[1]" );
	By ctrNumberofreviewpersonneltoKNNL2 = By.xpath("//tr[2]//td[@data-container-for='NumberofreviewpersonneltoKNNL']//input[1]" );
	By ctrOpinion1 = By.xpath("//tr[1]//td[@data-container-for='Opinion']//input[1]" );
	By ctrOpinion2 = By.xpath("//tr[2]//td[@data-container-for='Opinion']//input[1]" );
//	Input
	driver.findElement(iconAdd).click();
	driver.findElement(ctrProposednumberofpersonneltoBranc1).sendKeys(String.valueOf(ProposednumberofpersonneltoBranc1));
	driver.findElement(ctrNumberofreviewpersonneltoKNNL1).sendKeys(String.valueOf(NumberofreviewpersonneltoKNNL1));
	driver.findElement(ctrOpinion1).sendKeys(Opinion1);
	driver.findElement(iconUpdate).click();
	driver.findElement(iconAdd).click();
	driver.findElement(ctrProposednumberofpersonneltoBranc2).sendKeys(String.valueOf(ProposednumberofpersonneltoBranc2));
	driver.findElement(ctrNumberofreviewpersonneltoKNNL2).sendKeys(String.valueOf(NumberofreviewpersonneltoKNNL2));
	driver.findElement(ctrOpinion2).sendKeys(Opinion2);
	driver.findElement(iconUpdate).click();
}
public void UploadFile() {
	By ctrChooseFile1 = By.xpath("//table[@class='tb-form FileUpload_Old']//tr[2]//input[@name='Attachment']");
	By ctrChooseFile2 = By.xpath("//table[@class='tb-form FileUpload_Old']//tr[3]//input[@name='Attachment']");
	driver.findElement(ctrChooseFile1).sendKeys("C:\\Users\\Admin\\eclipse-workspace\\PNJ\\Data.xlsx");
}

public void Luu() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 100);
	driver.findElement(btnLuu).click();
	wait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElement(By.xpath("//div[@class='loading']"))));
	Thread.sleep(3000);
}
public void Gui() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 100);
	driver.findElement(btnGui).click();
	wait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElement(By.xpath("//div[@class='loading']"))));
	Thread.sleep(3000);
}
public void WaitingLoadingForm() {
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(MainForm));
}
}
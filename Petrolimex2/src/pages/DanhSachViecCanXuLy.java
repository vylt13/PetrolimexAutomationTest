package pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DanhSachViecCanXuLy {
	WebDriver driver;
public DanhSachViecCanXuLy(WebDriver driver) {
	this.driver = driver;
}
By tieuDe = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[2]//span");
By tieuDeRow2 = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[2]//td[2]//span");
By doUuTien = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[3]//img");
By nhomCongViec = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[4]");
By noiGui = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[5]");
By hanHoanThanh = By.xpath("//div[@class='Form ViecCanXuLy']//table[1]//tbody//tr[1]//td[6]");
By vanBanDaXuLy = By.xpath("//div[@class='form-ds VBDeBietTop']//div[2]//table[@class='tbItemView']//tr[2]//td[1]");

public void ValidateTaskChoYKienVBDen(
		String trich_yeu,
		String co_quan_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Cho ý kiến VB đến \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(doUuTien).getAttribute("src"), "https://daotaoeoffice.petrolimex.com.vn/_layouts/15/Images/VuThao.Petrolimex.Notify/ic-flag.png");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đến");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
}
public void ValidateHoanTatTaskChoYKienVBDen(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Cho ý kiến VB đến \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskVBDuocChiaSe(
		String trich_yeu,
		String nguoi_chia_se) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Chia sẻ văn bản đến \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đến");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_chia_se);
}
public void ValidateHoanTatTaskChiaSe(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Chia sẻ văn bản đến \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskThucHienVanBanDi(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Xử lý VB đi \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản nội bộ");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateHoanTatTaskThucHienVanBanDi(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Xử lý VB đi \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskXuLyVanBanDi(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Xử lý VB đi số \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản nội bộ");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskPhatHanhVBDuThaoDaPheDuyet(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Ký số \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateHoanTatPhatHanhVBDuThaoDaPheDuyet(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Ký số \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskNhanChiaSeVBDuThao(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Chia sẻ dự thảo " + "\"" + trich_yeu + "\"");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
	assertNotEquals(driver.findElement(tieuDeRow2).getText(), "Chia sẻ dự thảo " +"\"" + trich_yeu + "\"", "Task không bị Dup");
}
public void ValidateHoanTatNhanChiaSeVBDuThao(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Chia sẻ dự thảo " + trich_yeu +"\"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskNhanVanBanDiDeBiet(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Nhận VB đi để biết \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
	assertNotEquals(driver.findElement(tieuDeRow2).getText(), "Nhận VB đi để biết \"" + trich_yeu + "\"", "Task không bị trùng lắp");
}
public void ValidateHoanTatTaskNhanVanBanDiDeBiet(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Nhận VB đi để biết \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskPhoiHopVBDen(
		String trich_yeu,
		String co_quan_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Nhận VB đến (phối hợp) \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(doUuTien).getAttribute("src"), "https://daotaoeoffice.petrolimex.com.vn/_layouts/15/Images/VuThao.Petrolimex.Notify/ic-flag.png");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đến");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
}
public void ValidateHoanTatTaskPhoiHopVBDen(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Nhận VB đến (phối hợp) \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskNhanVanBanDenQuaMang(
		String trich_yeu,
		String co_quan_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Nhận VB đến qua mạng \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(doUuTien).getAttribute("src"), "https://daotaoeoffice.petrolimex.com.vn/_layouts/15/Images/VuThao.Petrolimex.Notify/ic-flag.png");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đến");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
}
public void ValidateHoanTatTaskNhanVanBanDenQuaMang(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Nhận VB đến qua mạng \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskThucHienVBDen(
		String trich_yeu,
		String co_quan_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Thực hiện VB đến \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(doUuTien).getAttribute("src"), "https://daotaoeoffice.petrolimex.com.vn/_layouts/15/Images/VuThao.Petrolimex.Notify/ic-flag.png");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đến");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
}
public void ValidateHoanTatTaskThuHienVBDen(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Thực hiện VB đến \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskPheDuyetVbDuThao(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskPheDuyetVbDuThaoKySo(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateHoanTatTaskPheDuyetVbDuThao(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskChuyenXuLyPheDuyetVbDuThao(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Xử lý \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateHoanTatTaskChuyenXuLyPheDuyetVbDuThao(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskChuyenXuLyPheDuyetVbDuThaoKySo(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Xử lý \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskThuHoiVbDuThao(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Văn bản được recall \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskYeuCauHieuChinhVbDuThao(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Yêu cầu hiệu chỉnh \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskBoSungThongTin(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Bổ sung thông tin \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đi");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskXuLyVBDen(
		String trich_yeu,
		String co_quan_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Thực hiện VB đến số \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(doUuTien).getAttribute("src"), "https://daotaoeoffice.petrolimex.com.vn/_layouts/15/Images/VuThao.Petrolimex.Notify/ic-flag.png");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đến");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
}
public void ValidateHoanTatTaskXuLyVBDen(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Thực hiện VB đến số \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ValidateTaskYeuCauPheDuyetHSTL(
		String trich_yeu,
		String co_quan_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Thực hiện VB đến số \"" + trich_yeu + "\"");
	assertEquals(driver.findElement(doUuTien).getAttribute("src"), "https://daotaoeoffice.petrolimex.com.vn/_layouts/15/Images/VuThao.Petrolimex.Notify/ic-flag.png");
	assertEquals(driver.findElement(nhomCongViec).getText(), "Văn bản đến");
	assertEquals(driver.findElement(noiGui).getText(), co_quan_gui);
}
public void ValidateTaskYeuCauPheDuyetBienBanThanhToan(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Biên bản thanh toán");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskYeuCauPheDuyetHopDong(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Hợp đồng");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskYeuCauPheDuyetToTrinh(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Tờ trình");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskYeuCauPheDuyetBaoCaoNoiBo(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Báo cáo nội bộ");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskYeuCauPheDuyetBienBanNoiBo(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Biên bản nội bộ");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateTaskYeuCauPheDuyetHSTLKhac(
		String trich_yeu,
		String nguoi_gui) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"");
//	assertEquals(driver.findElement(nhomCongViec).getText(), "Hồ sơ tài liệu khác");
	assertEquals(driver.findElement(noiGui).getText(), nguoi_gui);
}
public void ValidateHoanTatTaskYeuCauPheDuyetHSTL(
		String trich_yeu) {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	assertNotEquals(driver.findElement(tieuDe).getText(), "Yêu cầu phê duyệt \"" + trich_yeu + "\"", "Task đã hoàn tất");
}
public void ClickOnVbDaXuLy() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(vanBanDaXuLy));
	driver.findElement(vanBanDaXuLy).click();
}
public void ClickOnFirstItem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	driver.findElement(tieuDe).click();
}
public void ValidateTaskChuaXem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	 assertEquals(driver.findElement(tieuDe).getCssValue("font-weight"), "700");
}
public void ValidateTaskDaXem() {
	WebDriverWait wait = new WebDriverWait(driver, 90);
	wait.until(ExpectedConditions.elementToBeClickable(tieuDe));
	 assertEquals(driver.findElement(tieuDe).getCssValue("font-weight"), "400");
}
}

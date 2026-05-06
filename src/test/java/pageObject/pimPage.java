package pageObject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class pimPage {
	
	WebDriver driver;
	
	By pimModule = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
	By pimHeading = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6");
	By empMenu = By.linkText("Employee List");
	By addPimList = By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']");
	By addFormHead = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6");
	By empFirstName = By.name("firstName");
	By empMiddleName = By.name("middleName");
	By empLastName = By.name("lastName");
	By empId = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input");
	By createEnable = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span");
	By empUserName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input");
	By empPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input");
	By empConfirmPwd = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input");
	By addEmp = By.xpath("//button[@type='submit']");
	By addProfile = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i");
	By optionalFieldmenu = By.linkText("Optional Fields");
	By enableDeprecatedField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/label/span");
	By enableSsnField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/label/span");
	By enableSinField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/label/span");
	By enableTaxField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/label/span");
	By saveOptionalField = By.xpath("//button[@type='submit']");
	By configurationMenu = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span");
	By customFieldMenu = By.linkText("Custom Fields");
	By addCustomFields = By.xpath("//button[normalize-space()='Add']");
	By nameCustomField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input");
	By screenField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div");
	By typeField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div");
	By submitCustomerField = By.xpath("//button[@type='submit']");
	By dataImportMenu = By.linkText("Data Import");	
	By uploadFile = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div[2]");
	By submitUpload = By.xpath("//button[@type='submit']");
	By reportingMethodMenu = By.linkText("Reporting Methods");
	By addReportingMethod = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button/i");
	By reportName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");
	By submitReport = By.xpath("//button[@type='submit']");
	By terminationReasonMenu = By.linkText("Termination Reasons");
	By addTerminationReason = By.xpath("//button[normalize-space()='Add']");
	By addTerminationName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");
	By submitTermination = By.xpath("//button[@type='submit']");
	By reportMenu = By.linkText("Reports");
	By addNewReport = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button/i");
	By addReportName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input");
	By selectionCriteria = By.xpath("//div[@class='oxd-select-text oxd-select-text--focus']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']");
	By addSelectionCriteria = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div[2]/div[2]/button");
	By addHintSelection = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div");
	By selectDisplayGroup = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[1]");
	By selectDisplayField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div");
	By addDisplayField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[2]/div[2]/button/i");
	By enableHeader = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[5]/div/label/span");
	By submitSaveReport = By.xpath("//button[@type='submit']");
	
	
	public pimPage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void clickPim() {
		driver.findElement(pimModule).click();
	}
	
	public String getHeading() {
		return driver.findElement(pimHeading).getText();
	}
	
	public void selectEmpMenu() {
		driver.findElement(empMenu).click();
	}
	
	public void addEmpList() {
		driver.findElement(addPimList).click();
		}
	
	public String getAddHead() {
		return driver.findElement(addFormHead).getText();
	}
	public void createEmpName(String first, String middle, String last) {
		driver.findElement(empFirstName).sendKeys(first);
		driver.findElement(empMiddleName).sendKeys(middle);
		driver.findElement(empLastName).sendKeys(last);
		
	}
	public void addEmpId() {
		WebElement empNo = driver.findElement(empId);
		if(empNo.isDisplayed()) {
			empNo.getText();
		}else {
			empNo.sendKeys("7646");
		}

	}
	public void enableCreateLogin() {
		driver.findElement(createEnable).click();
	}
	public void addLoginDetails(String userName, String pwd, String confirmPwd) {
		driver.findElement(empUserName).sendKeys(userName);
		driver.findElement(empPassword).sendKeys(pwd);
		driver.findElement(empConfirmPwd).sendKeys(confirmPwd);
	}
	public void uploadProfilePicture() {
		driver.findElement(addProfile).click();
	}
	
	public void uploadDocuments(String filePath) {
		try {
			StringSelection selection = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

			Robot robot = new Robot();
			robot.delay(1000); // wait for popup

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void submitNewEmployee() {
		driver.findElement(addEmp).click();
	}
	
	public void selectConfigurationMenu() {
		driver.findElement(configurationMenu).click();
		
	}
	public void selectOptionalFieldMenu() {
		driver.findElement(optionalFieldmenu).click();
	}
	
	public void clickEnableDep() {
		driver.findElement(enableDeprecatedField).click();
	}
	public void clickEnableSsn() {
		driver.findElement(enableSsnField).click();
	}
	public void clickEnableSin() {
		driver.findElement(enableSinField).click();
	}
	public void clickEnableTax() {
		driver.findElement(enableTaxField).click();
	}
	public void saveOptionalField() {
		driver.findElement(saveOptionalField).click();
	}

	
	public void clickCustomFieldMenu() {
		driver.findElement(customFieldMenu).click();
	}
	public void addCustom() {
		driver.findElement(addCustomFields).click();
	}
	public void addCustomName(String name) {
		driver.findElement(nameCustomField).sendKeys(name);
	}
	public void selectScreenField() {
		
		WebElement screen = driver.findElement(screenField);
		screen.click();
		Actions acts = new Actions(driver);
		acts.keyDown(Keys.ARROW_DOWN).build().perform();
		acts.keyDown(Keys.ARROW_DOWN).build().perform();
		acts.keyDown(Keys.ARROW_DOWN).build().perform();
		acts.keyDown(Keys.ENTER).build().perform();
		
	}
	public void selectTypeField() {
		WebElement type = driver.findElement(typeField);
		type.click();
		Actions acts = new Actions(driver);
		acts.keyDown(Keys.ARROW_DOWN).build().perform();
		acts.keyDown(Keys.ENTER).build().perform();
	}
	public void submitCustom() {
		driver.findElement(submitCustomerField).click();
	}
	
	public void clickDataImport() {
		driver.findElement(dataImportMenu).click();
	}
	public void uploadFileDataImport(String filePath) {
		try {
			StringSelection selection = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			Robot robot = new Robot();
			robot.delay(1000); // wait for popup

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void submitUploadFile() {
		driver.findElement(submitUpload).click();
	}
	
	public void clickReportingMethod() {
		driver.findElement(reportingMethodMenu).click();
	}
	public void addReport() {
		driver.findElement(addReportingMethod).click();
	}
	public void enterReportName(String name) {
		driver.findElement(reportName).sendKeys(name);
	}
	public void submitReport() {
		driver.findElement(submitReport).click();
	}
	
	public void clickTerminationMenu() {
		driver.findElement(terminationReasonMenu).click();
	}
	public void addTerminationOption() {
		driver.findElement(addTerminationReason).click();
	}
	public void addTerminationName(String name) {
		driver.findElement(addTerminationName).sendKeys(name);
	}
	public void saveTermination() {
		driver.findElement(submitTermination).click();
	}
	
	public void clickReportMenu() {
		driver.findElement(reportMenu).click();
	}
	public void clickAddNewReport() {
		driver.findElement(addNewReport).click();
	}
	public void reportName(String name) {
		driver.findElement(addReportName).sendKeys(name);
	}
	public void selectCriteria() {
		WebElement selection = driver.findElement(addSelectionCriteria);
		selection.click();
		Actions acts = new Actions(driver);
		acts.keyDown(Keys.ARROW_DOWN).build().perform();
		acts.keyDown(Keys.ENTER).build().perform();
	}
	
	public void addSelection() {
		driver.findElement(addSelectionCriteria).click();
	}
	
	public void addHint(String hint) {
		driver.findElement(addHintSelection).sendKeys(hint);
	}
	
	public void displayGroup() {
		WebElement disGroup = driver.findElement(selectDisplayGroup);
		disGroup.click();
		Actions acts = new Actions(driver);
		acts.keyDown(Keys.ARROW_DOWN).build().perform();
		acts.keyDown(Keys.ENTER).build().perform();
	}
	public void displayField() throws InterruptedException {
//		WebElement disField = driver.findElement(selectDisplayField);
//		disField.click();
//		Thread.sleep(1000);
//
//		disField.sendKeys("Emp");
//		Thread.sleep(1000);
//		Actions acts = new Actions(driver);
//		acts.keyDown(Keys.ENTER).build().perform();
		
		List<WebElement> disField = driver.findElements(selectDisplayField);
		for(WebElement option:disField) {
			if(option.getText().trim().equals("Employee Name")) {
			option.click();
			}
		}
	}
	public void addDisplays() {
		driver.findElement(addDisplayField).click();
	}
	public void headerEnable() {
		driver.findElement(enableHeader).click();
	}
	
	public void submitNewReport() {
		driver.findElement(submitSaveReport).click();
	}
}

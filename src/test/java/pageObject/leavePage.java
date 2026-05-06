package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class leavePage {

	WebDriver driver;

	By leaveModule = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a");
	By applyMenu = By.linkText("Apply");
	By applyHeading = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/h6");
	By myLeaveMenu = By.linkText("My Leave");
	By MyLeaveHead = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");
	By entitlementMenu = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span");
	By addEntitlementMenu = By.linkText("Add Entitlements");
	By employeeEntitlementMenu = By.linkText("Employee Entitlements");
	By individualEmployeeEnable = By.xpath(
			"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/div/label/span");
	By empName = By.xpath("//input[@placeholder='Type for hints...']");
	By leaveType = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/div[1]");
	By entitlement = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[3]/div/div[2]/input");
	By saveEntitlement = By.xpath("//button[@type='submit']");
	By enableMultipleEmployee = By.xpath(
			"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div[2]/div/label/span");
	By locationSelection = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]");
	By subUnit = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div");
	By entEmpName = By.xpath("//input[@placeholder='Type for hints...']");
	By searchResult = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span");
	By searchBtn = By.xpath("//button[@type='submit']");
	By reportMenu = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span");
	By leaveEntitlementUsageReport=By.linkText("Leave Entitlements and Usage Report");
	By generateForLeaveType = By.xpath("//label[normalize-space()='Leave Type']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']");
	By leaveLocation = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/div[1]");
	By leaveSubUnit = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[4]/div/div[2]/div/div/div[1]");
	By selectJobTitle = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[5]/div/div[2]/div/div/div[1]");
	By enablePastMember = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[6]/div/label/span");
	By generateLeave = By.xpath("//button[@type='submit']");
	By genertateForEmployee = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div/div/div[2]/div[2]/div[2]/div/label/span");
	By leaveEntitleEmpName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input");
	By myLeaveEntitleUsageReport = By.linkText("My Leave Entitlements and Usage Report");
	By generateMyLeaveEntitleUsageReport= By.xpath("//button[@type='submit']");
	By myLeaveExpectedResult = By.xpath("//span[@class='oxd-text oxd-text--span oxd-text--count']");
	By configModule = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/span");
	By leavePeriodMenu = By.linkText("Leave Period");
	By startMonth= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");
	By startDate = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div");
	By endDate = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/p");
	By leavePeriod = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/p");
	By saveLeave = By.xpath("//button[@type='submit']");
	By leaveTypeMenu = By.linkText("Leave Types");
	By addLeaveType = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button");
	By addLeaveTypeName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");
	By enableEntitlementSituation = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div[1]/div[2]/div/label/span");
	By checkInfo = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[1]/i");
	By clickOk = By.xpath("//button[normalize-space()='Ok']");
	By saveLeaveType = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]");
	By workWeekModules = By.linkText("Work Week");
	By monday = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div");
	By tuesday= By.xpath("//div[@class='oxd-select-text oxd-select-text--focus oxd-select-text--error']//div[@class='oxd-select-text-input'][normalize-space()='-- Select --']");
	By wednesday = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div");
	By thursday = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div[2]/div/div");
	By friday = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div/div/div[2]/div/div");
	By saturday = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/div/div");
	By sunday = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/div");
	By saveWorkWeeks = By.xpath("//button[@type='submit']");
	By holidayMenu = By.linkText("Holidays");
	By addHoliday = By.xpath("//button[normalize-space()='Add']");
	By holidayName= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input");
	By dateSelect = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input");
	By dayRange = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div");
	By repeatAnually = By.xpath("//label[normalize-space()='Yes']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']");
	By saveHoliday = By.xpath("//button[@type='submit']");
	By assignLeaveMenu = By.linkText("Assign Leave");
	By leaveEmpName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input");
	By leaveTypeInLeave = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]");
	By leaveBalanceDetails = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[1]/i");
	By leaveDetailsConfirm = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div[2]/div/div/div/div[4]/div/button");
	By leaveFromDate = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/input");
	By leaveToDate = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div/input");
	By leaveDuration = By.xpath("//div[contains(text(),'Full Day')]");
	By comments = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div[2]/textarea");
	By leaveBalanceStatus = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/p//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/p");
	By leaveBalanceConfirmation= By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--subtitle-2']");
	By confirmationOk = By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]");
	By assignLeave = By.xpath("//button[@type='submit']");

	public leavePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickLeaveModule() {
		driver.findElement(leaveModule).click();
	}

	public void selectApplyMenu() {
		driver.findElement(applyMenu).click();
	}

	public String verifyApplyHeading() {
		return driver.findElement(applyHeading).getText();
	}

	public void clickMyLeaveMenu() {
		driver.findElement(myLeaveMenu).click();
	}

	public String verifyMyLeaveHeading() {
		return driver.findElement(MyLeaveHead).getText();
	}

	public void clickEntitlementMenu() {
		driver.findElement(entitlementMenu).click();
	}

	public void selectIndividualEmployee() {
		driver.findElement(individualEmployeeEnable).click();
	}

	public void enterEmpName(String name) throws InterruptedException {
		WebElement selectName = driver.findElement(empName);
		selectName.sendKeys(name);
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}

	public void selectLeaveType() {
		WebElement type = driver.findElement(leaveType);
		type.click();
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();

	}

	public void enterEntitlement(String entitle) {
		driver.findElement(entitlement).sendKeys(entitle);
	}

	public void submitEntitlement() {
		driver.findElement(saveEntitlement).click();
	}

	public void clickEnableMultipleEmployee() {
		driver.findElement(enableMultipleEmployee).click();
	}

	public void selectLocation() {
		WebElement location = driver.findElement(locationSelection);
		location.click();
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}

	public void selectSubUnit() {
		WebElement unit = driver.findElement(subUnit);
		unit.click();
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}

	public void clickAddEntitlementOption() {
		driver.findElement(addEntitlementMenu).click();
	}

	public void clickEmployeeEntitlementOption() {
		driver.findElement(employeeEntitlementMenu).click();
	}

	public void empNameSearch(String emp) throws InterruptedException {
		WebElement selectName = driver.findElement(entEmpName);
		selectName.sendKeys(emp);
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}

	public void clickSearchBtn() {
		driver.findElement(searchBtn).click();
	}

	public String verifySearchResult() {
		return driver.findElement(searchResult).getText();
	}

	public void clickReportMenu() {
		driver.findElement(reportMenu).click();
	}
	public void selectLeaveEntitlementUsageReport() {
		driver.findElement(leaveEntitlementUsageReport).click();
	}
	public void clickGenerateForLeaveType() {
		driver.findElement(generateForLeaveType).click();
	}
	public void selectLeaveLocation() throws InterruptedException {
		WebElement location = driver.findElement(leaveLocation);
		location.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void selectLeaveSubUnit() throws InterruptedException {
		WebElement subUnit = driver.findElement(leaveSubUnit);
		subUnit.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void selectJobtitles() throws InterruptedException {
		WebElement jobTitle = driver.findElement(selectJobTitle);
		jobTitle.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void clickEnablePastMember() {
		driver.findElement(enablePastMember).click();
	}
	public void generateLeaveEntitlement() {
		driver.findElement(generateLeave).click();
	}
	
	public void generateLeaveForEmployee() {
		driver.findElement(genertateForEmployee).click();
	}
	public void enterNameOfEmployee(String gName) throws InterruptedException {
		WebElement selectEmpName = driver.findElement(leaveEntitleEmpName);
		selectEmpName.sendKeys(gName);
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	
	public void clickMyLeaveEntitleUsageReport() {
		driver.findElement(myLeaveEntitleUsageReport).click();
	}
	public void clickGenerateMyLeaveEntitleUsageReport() {
		driver.findElement(generateMyLeaveEntitleUsageReport).click();
	}
	public String verifyMyLeaveExpectedResult() {
		return driver.findElement(myLeaveExpectedResult).getText();
	}
	
	public void clickConfigModule() {
		driver.findElement(configModule).click();
	}
	public void clickLeavePeriodModule() {
		driver.findElement(leavePeriodMenu).click();
	}
	public void selectStartMonth() throws InterruptedException {
		WebElement month = driver.findElement(startMonth);
		month.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void selectEndDate() throws InterruptedException {
		WebElement date = driver.findElement(startDate);
		date.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public String verifyEndDate() {
		return driver.findElement(endDate).getText();
	}
	public String verifyLeavePeriod() {
		return driver.findElement(leavePeriod).getText();
	}
	public void submitSaveLeave() {
		driver.findElement(saveLeave).click();
	}
	
	public void clickLeaveTypeMenu() {
		driver.findElement(leaveTypeMenu).click();
	}
	public void createLeaveType() {
		driver.findElement(addLeaveType).click();
	}
	public void addNameOfLeaveType(String lTname) {
		driver.findElement(addLeaveTypeName).sendKeys(lTname);
	}
	public void clickEnableYes() {
		driver.findElement(enableEntitlementSituation).click();
	}
	public void verifyInfo() {
		driver.findElement(checkInfo).clear();
	}
	public void clickOkInfo() {
		driver.findElement(clickOk).clear();
	}
	public void submitSaveLeaveType() {
		driver.findElement(saveLeaveType).click();
	}
	
	public void clickWorkWeek() {
		driver.findElement(workWeekModules).click();
	}
	public void selectMonday() throws InterruptedException {
		WebElement mon = driver.findElement(monday);
		mon.click();
		Thread.sleep(1000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void selectTuesday() throws InterruptedException {
		WebElement tue = driver.findElement(tuesday);
		tue.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void selectWednesday() throws InterruptedException {
		WebElement wed = driver.findElement(wednesday);
		wed.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void selectThursday() throws InterruptedException {
		WebElement thu= driver.findElement(thursday);
		thu.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void selectFriday() throws InterruptedException {
		WebElement fri = driver.findElement(friday);
		fri.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void selectSaturday() throws InterruptedException {
		WebElement sat = driver.findElement(saturday);
		sat.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void selectSunday() throws InterruptedException {
		WebElement sun = driver.findElement(sunday);
		sun.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void submitSaveWorkWeek() {
		driver.findElement(saveWorkWeeks).click();
	}	
	public void clickHolidayMenu() {
	driver.findElement(holidayMenu).click();
	}
	public void createHoliday() {
		driver.findElement(addHoliday).click();
	}
	public void enterHolidayName(String name) {
		driver.findElement(holidayName).sendKeys(name);
	}
	public void enterHolidayDate(String date) {
		driver.findElement(dateSelect).sendKeys(date);;
	}
	public void selectDayRange() throws InterruptedException {
		WebElement day = driver.findElement(dayRange);
		day.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void selectRepeat() {
		driver.findElement(repeatAnually).click();
	}
	public void submitHoliday() {
		driver.findElement(saveHoliday).click();
		}
	public void clickAssignLeaveMenu() {
		driver.findElement(assignLeaveMenu).click();
	}
	public void enterLeaveEmpName(String leaveName) throws InterruptedException {
		WebElement empName = driver.findElement(leaveEmpName);
		empName.click();
		empName.sendKeys(leaveName);
		Thread.sleep(2500);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void enterLeaveTypeInLeave() throws InterruptedException {
		WebElement leaveType = driver.findElement(leaveTypeInLeave);
		leaveType.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void checkLeaveBalanceDetails() {
		driver.findElement(leaveBalanceDetails).click();
	}
	
	public void confirmLeaveBalance() {
		driver.findElement(leaveBalanceConfirmation).click();
	}
	public void enterFromDate(String from) {
		driver.findElement(leaveFromDate).sendKeys(from);
	}
	public void enterToDate() {
		driver.findElement(leaveToDate).click();
	}
	public void selectLeaveDuration() throws InterruptedException {
		WebElement duration = driver.findElement(leaveDuration);
		duration.click();
		Thread.sleep(2000);
		Actions acts = new Actions(driver);
		acts.sendKeys(Keys.ARROW_DOWN).build().perform();
		acts.sendKeys(Keys.ENTER).build().perform();
	}
	public void enterComments(String comnts) {
		driver.findElement(comments).sendKeys(comnts);
	}

	public String verifyLeaveBalanceStatus() {
		return driver.findElement(leaveBalanceStatus).getText();
	}
	public void submitSaveApplyLeave() {
		driver.findElement(assignLeave).click();
	}
	public String verifyLeaveBalanceConfimation() {
		return driver.findElement(leaveBalanceConfirmation).getText();
	}
	public void clickConfirmationOk() {
		driver.findElement(confirmationOk).click();
	}

}


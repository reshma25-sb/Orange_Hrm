package pageObject;

import java.awt.AWTException;
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

public class adminPage {

	By adminMenu = By.linkText("Admin");
	By userManagement = By.xpath("//span[normalize-space()='User Management']");
	By userRoleField = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
	By addUserMgmt = By.xpath("//button[normalize-space()='Add']");
	By empName = By.xpath("//input[@placeholder='Type for hints...']");
	By selectStatus = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]");
	By userName = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
	By password = By.xpath("//input[@type='password']");
	By confirmPwd = By.xpath(
			"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
	By saveUser = By.xpath("//button[@type='submit']");
	By searchUserName = By
			.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input");
	By searchBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
	By searchResult = By.xpath("//div[contains(text(),'reshmasb25')]");
	By editUser = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[6]/div/button[2]");
	By editHead = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
	By saveEdit = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
	By deleteExist = By.xpath("//div[@role='rowgroup']//div[2]//div[1]//div[6]//div[1]//button[1]//i[1]");
	By deleteAlert = By.xpath("//div[@role='document']");
	By acceptDelete = By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]");
	By job = By.xpath("//span[normalize-space()='Job']");
	By jobTitleHead = By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-main-title']");
	By jobTitles = By.linkText("Job Titles");
	By addJobTitle = By.xpath("//button[normalize-space()='Add']");
	By jobTitleField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");
	By jobDescriptionField = By.xpath("//textarea[@placeholder='Type description here']");
	By jobSpecificationField = By.xpath("//div[@class='oxd-file-div oxd-file-div--active']");
	By addNotesField = By.xpath("//textarea[@placeholder='Add note']");
	By saveJobTitle = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]");
	By payGrades = By.linkText("Pay Grades");
	By addPayGrades = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button");
	By payGradeNameField = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input");
	By savePayGrade = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]");
	By employmentStatus = By.linkText("Employment Status");
	By addEmploymentStatus = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button/i");
	By statusName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");
	By saveEmployement = By.xpath("//button[@type='submit']");
	By organization = By.xpath("//span[normalize-space()='Organization']");
	By location = By.linkText("Locations");
	By addLocation = By.xpath("//button[normalize-space()='Add']");
	By locNameField = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input");
	By locCityfield = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
	By locStateField = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");
	By locPostalCode = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/input");
	By locCountryField = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[4]/div/div[2]/div/div/div[1]");
	By phoneField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[5]/div/div[2]/input");
	By faxField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[6]/div/div[2]/input");
	By addressField = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[7]/div/div[2]/textarea");
	By notesField = By
			.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[8]/div/div[2]/textarea");
	By saveLocation = By.xpath("//button[@type='submit']");
	By qualification = By.xpath("//span[normalize-space()='Qualifications']");
	By licenseMenu = By.linkText("Licenses");
	By addLicenseBtn = By.xpath("//button[normalize-space()='Add']");
	By licenseName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input");
	By saveLicense = By.xpath("//button[@type='submit']");
	By Nationalities = By.xpath("//header[@class='oxd-topbar']//li[5]");
	By corporateBranding = By.xpath("//a[normalize-space()='Corporate Branding']");
	By configuration = By.xpath("//span[normalize-space()='Configuration']");
	By emailConfigurationMenu = By.linkText("Email Configuration");
	By emailField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input");
	By sendMail = By.xpath(
			"//label[normalize-space()='Sendmail']//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']");
	By sendMailToggle = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
	By testEmail = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div[2]/input");
	By saveEmailConfiguration = By.xpath("//button[@type='submit']");
	By emailSubscription = By.linkText("Email Subscriptions");
	By subAction = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button/i");
	By addSubscription = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button");
	By subName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[1]/div/div[2]/input");
	By subEmail = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div/div/form/div[2]/div/div[2]/input");
	By saveConfig = By.xpath("//button[@type='submit']");
	By localizationMenu = By.linkText("Localization");
	By language = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div");
	By dateFormat = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]");
	By saveLocalization = By.xpath("//button[@type='submit']");
	By langPackageMenu = By.linkText("Language Packages");
	By uploadPackage = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[1]/div/div[3]/div/button[1]/i");
	By browsePackage = By.xpath("//div[@class='oxd-file-div oxd-file-div--active']");
	By upload = By.xpath("//button[@type='submit']");
	By socialMediaAuth = By.linkText("Social Media Authentication");
	By addProviderList = By.xpath("//button[normalize-space()='Add']");
	By providerName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input");
	By providerUrl = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input");
	By clientID = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/input");
	By clientSecret = By.xpath("//input[@type='password']");
	By saveProvider = By.xpath("//button[@type='submit']");
	By registerAuthClient = By.linkText("Register OAuth Client");
	By addAuthClient = By.xpath("//button[normalize-space()='Add']");
	By authName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input");
	By authUrl = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/input");
	By enableClient = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div/div/label/span");
	By cofidentialClient = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div/div/label/span");
	By saveAuth = By.xpath("//button[@type='submit']");
	By ldapConfigMenu = By.linkText("LDAP Configuration");
	By enableLdapConfig = By.xpath("//label[normalize-space()='Enable']");
	By encryptionSelection = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div");
	By ldapImplementation =By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/div/div");
	By enableBind= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/label/span");
	By disName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input");
	By disPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input");
	By baseName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[1]/div/div[2]/input");
	By searchScope = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/div/div[2]/div/div");
	By attributeName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[3]/div/div[2]/input");
	By userUniqueId = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[5]/div/div[2]/input");
	By firstName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[5]/div/div[2]/input");
	By lastName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[11]/div/div[2]/input");
	By empId = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[20]/div/div[2]/input");
	By syncHours = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div[2]/div/div[2]/input");
	By testConnection = By.xpath("//button[normalize-space()='Test Connection']");
	By saveLdap = By.xpath("//button[normalize-space()='Save']");
	By closeLdapPopup = By.xpath("//button[@class='oxd-dialog-close-button oxd-dialog-close-button-position']");
	
	String username1 = "reshmasb255";

	WebDriver driver;

	public adminPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickAdmin() {
		driver.findElement(adminMenu).click();

	}

	public void addUserManagement() {
		driver.findElement(addUserMgmt).click();
	}

	public void userRoleField() {
		WebElement userRole = driver.findElement(userRoleField);
		userRole.click();
		Actions role = new Actions(driver);
		role.keyDown(Keys.ARROW_DOWN).build().perform();
		role.keyDown(Keys.ENTER).build().perform();
	}

	public void empNameField() throws InterruptedException {
		WebElement seleName = driver.findElement(empName);
		seleName.sendKeys("Orange ");
		Thread.sleep(10000);
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();

	}

	public void statusField() {
		WebElement selecStatus = driver.findElement(selectStatus);
		selecStatus.click();
		Actions stus = new Actions(driver);
		stus.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();
	}

	public void userNameField() {
		driver.findElement(userName).sendKeys(username1);
	}

	public void passwordField(String pwd, String pwd2) {
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(confirmPwd).sendKeys(pwd2);
	}

	public void submitUser() {
		driver.findElement(saveUser).click();
	}

	public void searchuser() {
		driver.findElement(searchUserName).sendKeys(username1);
	}

	public void clickSearch() {
		driver.findElement(searchBtn).click();
	}

	public String searchResult() {
		return driver.findElement(searchResult).getText();
	}

	public void editUser() {
		driver.findElement(editUser).click();
	}

	public String editForm() {
		return driver.findElement(editHead).getText();
	}

	public void saveEdit() {
		driver.findElement(saveEdit).click();
	}

	public void clickUserManagement() {
		driver.findElement(userManagement);
	}

	public void deleteUser() {
		driver.findElement(deleteExist).click();
	}

	public void confirmDelete() {
		driver.findElement(acceptDelete).click();
	}

	public void clickJob() {
		driver.findElement(job).click();

	}

	public void selectJobTitle() {
		List<WebElement> titles = driver.findElements(jobTitles);

		for (WebElement option : titles) {
			if (option.getText().trim().equals("Job Titles")) {
				option.click();
			}
		}
	}

	public void addNewJob() {
		driver.findElement(addJobTitle).click();
	}

	public void addJobDetails(String title, String description) {
		driver.findElement(jobTitleField).sendKeys(title);
		driver.findElement(jobDescriptionField).sendKeys(description);

	}

	public void clickUpload() {
		driver.findElement(jobSpecificationField).click();
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

	public void createNotes(String notes) {
		driver.findElement(addNotesField).sendKeys(notes);
	}

	public void submitJobTitle() {
		driver.findElement(saveJobTitle).click();
	}

	public void selectPayGrades() {
		List<WebElement> titles = driver.findElements(payGrades);

		for (WebElement option : titles) {
			if (option.getText().trim().equals("Pay Grades")) {
				option.click();
			}
		}
	}

	public void addPayGrades() {
		driver.findElement(addPayGrades).click();
	}

	public void payGradeField(String name) {
		driver.findElement(payGradeNameField).sendKeys(name);
	}

	public void savePayGrade() {
		driver.findElement(savePayGrade).click();
	}

	public void selectEmploymentStatus() {
		List<WebElement> titles = driver.findElements(employmentStatus);
		for (WebElement option : titles) {
			if (option.getText().trim().equals("Employment Status")) {
				option.click();
			}
		}

	}

	public void addEmploymentStatus() {
		driver.findElement(addEmploymentStatus).click();
	}

	public void statusNameField(String status) {
		driver.findElement(statusName).sendKeys(status);
	}

	public void saveEmploymentStatus() {
		driver.findElement(saveEmployement).click();
	}

	public void clickOrganization() {
		driver.findElement(organization).click();
	}

	public void clickLocation() {
		List<WebElement> titles = driver.findElements(location);
		for (WebElement option : titles) {
			if (option.getText().trim().equals("Locations")) {
				option.click();
			}
		}
	}

	public void addLocationBtn() {
		driver.findElement(addLocation).click();
	}

	public void addAddress(String locName, String cityName, String stateName, String postalCode) {
		driver.findElement(locNameField).sendKeys(locName);
		driver.findElement(locCityfield).sendKeys(cityName);
		driver.findElement(locStateField).sendKeys(stateName);
		driver.findElement(locPostalCode).sendKeys(postalCode);
	}

	public void selectCountry() {
		WebElement country = driver.findElement(locCountryField);
		country.click();
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).build().perform();
		act.keyDown(Keys.ENTER).build().perform();
	}

	public void contactDetails(String phone, String fax, String address, String notes) {
		driver.findElement(phoneField).sendKeys(phone);
		driver.findElement(faxField).sendKeys(fax);
		driver.findElement(addressField).sendKeys(address);
		driver.findElement(notesField).sendKeys(notes);

	}

	public void saveLocation() {
		driver.findElement(saveLocation).click();
	}

	public void clickQualification() {
		driver.findElement(qualification).click();
	}

	public void clickLicense() {
		driver.findElement(licenseMenu).click();
	}

	public void addNewLicense() {
		driver.findElement(addLicenseBtn).click();
	}

	public void enterLicenseName(String name) {
		driver.findElement(licenseName).sendKeys(name);
	}

	public void saveNewLicense() {
		driver.findElement(saveLicense).click();
	}

	public void clickNationalities() {
		driver.findElement(Nationalities);
	}

	public void clickCorporateBuilding() {
		driver.findElement(corporateBranding);
	}

	public void clickConfiguration() {
		driver.findElement(configuration).click();
	}

	public void selectEmailConfigurationMenu() {
		driver.findElement(emailConfigurationMenu).click();
	}

	public void sendEmailField(String email) throws AWTException {

		try {
			StringSelection selectMail = new StringSelection(email);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectMail, null);
			WebElement enterEmail = driver.findElement(emailField);
			enterEmail.click();
			Robot robo = new Robot();
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_A);
			robo.keyPress(KeyEvent.VK_DELETE);
			robo.keyRelease(KeyEvent.VK_DELETE);
			enterEmail.sendKeys(email);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void sendMailOption() {
		driver.findElement(sendMail).click();
	}

	public void enableEmail() {
		driver.findElement(sendMailToggle).click();
	}

	public void testMailField(String testMail) {

		driver.findElement(testEmail).sendKeys(testMail);
	}

	public void saveEmailConfig() {
		driver.findElement(saveEmailConfiguration).click();
	}
	
	public void emailSubscriptionMenu()
	{
		List<WebElement> titles = driver.findElements(emailSubscription);
		for(WebElement option:titles) {
			if(option.getText().trim().equals("Email Subscriptions")) {
			option.click();
			}
		}
	}
	
	public void clickAction() {
		driver.findElement(subAction).click();
	}
	public void addSubscriptionBtn() {
		driver.findElement(addSubscription).click();
	}
	public void addMailName(String subNames, String subEmails) {
		driver.findElement(subName).sendKeys(subNames);
		driver.findElement(subEmail).sendKeys(subEmails);
	}
	
	public void submitConfiguration() {
		driver.findElement(saveConfig).click();
	}
		
	public void LocalizationnMenu()
	{
		List<WebElement> titles = driver.findElements(localizationMenu);
		for(WebElement option:titles) {
			if(option.getText().trim().equals("Localization")) {
			option.click();
			}
		}
	}
	
	public void selectLanguage() {
		WebElement lang = driver.findElement(language);
		lang.click();
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).build().perform();
		act.keyDown(Keys.ARROW_DOWN).build().perform();
		act.keyDown(Keys.ENTER).build().perform();

	}
	
	public void selectDate() {
		WebElement date = driver.findElement(dateFormat);
		date.click();
		Actions act = new Actions(driver);
		act.keyDown(Keys.ARROW_DOWN).build().perform();
		act.keyDown(Keys.ARROW_DOWN).build().perform();
		act.keyDown(Keys.ENTER).build().perform();

	}
	
	public void saveLocalization() {
		driver.findElement(saveLocalization).click();
	}
	
	public void selectLangPackageMenu() {
		List<WebElement> titles = driver.findElements(langPackageMenu);
		for(WebElement option:titles) {
			if(option.getText().trim().equals("Language Packages")) {
			option.click();
			}
		}
	}
	public void clickUploadPackage() {
		driver.findElement(uploadPackage).click();
	}
	
	public void browseUploadFile(String uploadPath) throws AWTException{
		try {
			StringSelection selection = new StringSelection(uploadPath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
			WebElement file = driver.findElement(browsePackage);
			file.click();
			Robot robot = new Robot();
			robot.delay(1000); // wait for popup

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(Exception e) {
			e.printStackTrace();

		}
	}
	public void uploadbtn() {
		driver.findElement(upload).click();
	}
		
	public void clickSocialMediaAuthModule() {
		List<WebElement>title = driver.findElements(socialMediaAuth);
		for(WebElement options : title ) {
			if(options.getText().trim().equals("Social Media Authentication")) {
				options.click();
			}
		}
	}
	
	public void addProvider() {
		driver.findElement(addProviderList).click();
	}
	
	public void addProviderDetails(String pName, String pUrl, String pId, String pSecret) {
		driver.findElement(providerName).sendKeys(pName);
		driver.findElement(providerUrl).sendKeys(pUrl);
		driver.findElement(clientID).sendKeys(pId);
		driver.findElement(clientSecret).sendKeys(pSecret);
	}
	
	public void submitProvider() {
		driver.findElement(saveProvider).click();
	}
	
	public void clickRegisterAuthClient() {
		List<WebElement>titles = driver.findElements(registerAuthClient);
		for(WebElement option : titles) {
			if (option.getText().trim().equals("Register OAuth Client")) {
				option.click();
			}
		}
	}
	public void addAuthDetails() {
		driver.findElement(addAuthClient).click();
	}
	public void enterAuthDetails(String aName, String aUrl) {
		driver.findElement(authName).sendKeys(aName);
		driver.findElement(authUrl).sendKeys(aUrl);
	}
	public void enableClientOption() {
		driver.findElement(enableClient).click();
	}
	public void confidentialClientEnabled() {
		driver.findElement(cofidentialClient).click();
	}
	public void submitAuthClient() {
		driver.findElement(saveAuth).click(); 
	}
	
	public void clickLdapConfig() {
		List<WebElement>titles = driver.findElements(ldapConfigMenu);
		for(WebElement options : titles) {
			if(options.getText().trim().equals("LDAP Configuration")) {
				options.click();
			}
			
		}
	}
	public void clickEnableLdap() {
		WebElement enable = driver.findElement(enableLdapConfig);
		if(!enable.isSelected()) {
			enable.click();
		}
				
	}
	public void selectEncryption() {
		WebElement select=driver.findElement(enableLdapConfig);
		select.click();
		Actions acts = new Actions(driver);
		acts.keyDown(Keys.ARROW_DOWN).build().perform();
		acts.keyDown(Keys.ENTER).build().perform();
	}
	public void bindSetting(String dName, String dPwd) {
		driver.findElement(disName).sendKeys(dName);
		driver.findElement(disPassword).sendKeys(dPwd);
	}
	public void baseName(String bName) {
		driver.findElement(baseName).sendKeys(bName);
	}
	
	public void selectSearchScope() {
		driver.findElement(searchScope).click();
		Actions acts = new Actions(driver);
		acts.keyDown(Keys.ARROW_DOWN).build().perform();
		acts.keyDown(Keys.ENTER).build().perform();
	}
	
	public void enterAttributeName(String aName, String uId, String nameFirst, String nameLast, String idEmp,String hours) {
		driver.findElement(attributeName).sendKeys(aName);
		driver.findElement(userUniqueId).sendKeys(uId);
		driver.findElement(firstName).sendKeys(nameFirst);
		driver.findElement(lastName).sendKeys(nameLast);
		driver.findElement(empId).sendKeys(idEmp);
		driver.findElement(syncHours).sendKeys(hours);
	}
	public void clickTestConnection() {
		driver.findElement(testConnection).click();
	}
	
	public void closeConnection() {
		driver.findElement(closeLdapPopup).click();
	}
	
	public void submitLdapConnection() {
		driver.findElement(saveLdap).click();
	}
}
 
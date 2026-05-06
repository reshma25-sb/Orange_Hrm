package testCases;


import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.baseTest;
import pageObject.adminPage;
import pageObject.loginPage;

public class adminTestcases extends baseTest {

	adminPage adminpage;
	loginPage login;

	@Test(priority = 1)

	public void adminModule() throws InterruptedException {


        adminPage admin = new adminPage(driver);
        admin.clickAdmin();
        admin.addUserManagement();
        admin.userRoleField();
        admin.empNameField();
        admin.statusField();
        admin.userNameField();
        admin.passwordField("Orange@1", "Orange@1");
        admin.submitUser();

	}
	
	@Test(priority=2)
	public void findCreatedUser() {
		
        adminPage admin = new adminPage(driver);
        admin.clickAdmin();
        admin.searchuser();
        admin.clickSearch();
        String exp = "reshmasb256";
        String act = admin.searchResult();
        Assert.assertEquals(act, exp);
        
	}
	
	@Test(priority=3)
	public void editExistingUser() {
		
        adminPage admin = new adminPage(driver);
        admin.clickAdmin();
        admin.searchuser();
        admin.clickSearch();
        admin.editUser();
        String exp = "Edit User";
        String act = admin.editForm();
        Assert.assertEquals(act, exp);
        admin.saveEdit();
               
	}
	@Test(priority=4)
	public void deleteExistingUser() {
		
        adminPage admin = new adminPage(driver);
        admin.clickAdmin();
        admin.deleteUser();
        admin.confirmDelete();
               
	}
	
	@Test(priority=5)
	
	public void addJobTitle() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickJob();
		admin.selectJobTitle();
		admin.addNewJob();
		admin.addJobDetails("HR Manager004", "Coordinate all the candidates for the interiew");
		admin.clickUpload();
		admin.uploadDocuments("C:\\Users\\seq_reshma\\Downloads\\SampleText.txt");
		admin.createNotes("Manage all the data");
		admin.submitJobTitle();
	}
	
	@Test(priority=6)
	
	public void addPayGrades() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickJob();
		admin.selectPayGrades(); 
		admin.addPayGrades();
		admin.payGradeField("GradeA");
		admin.savePayGrade();
	}
	
	@Test(priority =7)

	public void employmentStatus() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickJob();
		admin.selectEmploymentStatus();
		admin.addEmploymentStatus();
		admin.statusNameField("Contract Job");
		admin.saveEmploymentStatus();
	}
	
	@Test(priority =8)
	public void addNewLocation() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickOrganization();
		admin.clickLocation();
		admin.addLocationBtn();
		admin.addAddress("Canadian", "Ottawa1", "Canada", "23499");
		admin.selectCountry();
		admin.contactDetails("344433546565", "3456665655", "TC/674 Rose lane", "It is an residential address");
		admin.saveLocation();
	}
	
	@Test(priority=9)
	public void addLicense() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickQualification();
		admin.clickLicense();
		admin.addNewLicense();
		admin.enterLicenseName("Quality Analysit(QA)");
		admin.saveNewLicense();
	}
	
	@Test(priority=10)
	
	public void addEmailConfiguration() throws AWTException {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickConfiguration();
		admin.selectEmailConfigurationMenu();
		admin.sendEmailField("admin@gmail.com");
		admin.sendMailOption();
		admin.enableEmail();
		admin.testMailField("rsb@gmail.com");
		admin.saveEmailConfig();
	}
	
	@Test(priority =11)
	public void addEmailSubscription() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickConfiguration();
		admin.emailSubscriptionMenu();
		admin.clickAction();
		admin.addSubscriptionBtn();
		admin.addMailName("rsb123", "rsb01@gmail.com");
		admin.submitConfiguration();
		
	}
	@Test(priority =12)
	public void addLocalization() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickConfiguration();
		admin.LocalizationnMenu();
		admin.selectLanguage();
		admin.selectDate();
		admin.saveLocalization();
	}
	@Test(priority =13)
	public void uploadFile() throws AWTException {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickConfiguration();
		admin.selectLangPackageMenu();
		admin.clickUploadPackage();
		admin.browseUploadFile("Abc.pdf");
		admin.clickUpload();
		admin.uploadbtn();
	}
	@Test(priority=14)
	public void addProvider() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickConfiguration();
		admin.clickSocialMediaAuthModule();
		admin.addProvider();
		admin.addProviderDetails("Daniel", "https://opensource-demo.orangehrmlive.com/web/index.php/", "CID001", "adcb@qwe1");
		admin.submitProvider();
	}
	
	@Test(priority=15)
	public void addAuthDetails() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickConfiguration();
		admin.clickRegisterAuthClient();
		admin.addAuthDetails();
		admin.enterAuthDetails("Asad", "https://opensource-demo.orangehrmlive.com/web/index.php/");
		admin.enableClientOption();
		admin.confidentialClientEnabled();
		admin.submitAuthClient();
	}
	@Test(priority=16)
	public void setLdapConfiguration() {
		adminPage admin = new adminPage(driver);
		admin.clickAdmin();
		admin.clickConfiguration();
		admin.clickLdapConfig();
		admin.clickEnableLdap();
		admin.selectEncryption();
		admin.bindSetting("Daniel", "adcb@123");
    	admin.baseName("John");
		admin.selectSearchScope();
		admin.enterAttributeName("Jack", "ID209", "Jack", "Daniel", "E09", "2");
		admin.clickTestConnection();
		admin.closeConnection();
		admin.submitLdapConnection();
	}
}


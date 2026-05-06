package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.baseTest;
import pageObject.loginPage;
import pageObject.pimPage;

public class pimTestCases extends baseTest {
	loginPage login;
	pimPage pim;

	@Test(priority = 1)
	public void selectPimModule() {

		pim = new pimPage(driver);
		pim.clickPim();
		String expHead = "PIM";
		String actHead = pim.getHeading();
		Assert.assertEquals(expHead, actHead);

	}

	@Test(priority = 2)
	public void verifyAddEmpForm() {
		pim = new pimPage(driver);
		pim.clickPim();
		pim.selectEmpMenu();
		pim.addEmpList();
		String expHead = "Add Employee";
		String actHead = pim.getAddHead();
		Assert.assertEquals(expHead, actHead);
	}

	@Test(priority = 3)
	public void addEmployee() {
		pim = new pimPage(driver);
		pim.clickPim();
		pim.addEmpList();
		pim.createEmpName("John", "Dan", "Singh");
		pim.addEmpId();
		pim.enableCreateLogin();
		pim.addLoginDetails("john25", "admin123", "admin123");
		pim.uploadProfilePicture();
		pim.uploadDocuments("C:\\Users\\seq_reshma\\Downloads\\Profile");
		pim.submitNewEmployee();
	}

	@Test(priority = 4)
	public void enableOptionalFields() {
		pim = new pimPage(driver);
		pim.clickPim();
		pim.selectConfigurationMenu();
		pim.selectOptionalFieldMenu();
		pim.clickEnableDep();
		pim.clickEnableSsn();
		pim.clickEnableSin();
		pim.clickEnableTax();
		pim.saveOptionalField();
	}

	@Test(priority = 5)
	public void createCustomField() {
		pim = new pimPage(driver);
		pim.clickPim();
		pim.selectConfigurationMenu();
		pim.clickCustomFieldMenu();
		pim.addCustom();
		pim.addCustomName("David Jane");
		pim.selectScreenField();
		pim.selectTypeField();
		pim.submitCustom();
	}
	
	@Test(priority=6)
	public void createDataImport() {
		pim = new pimPage(driver);
		pim.clickPim();
		pim.selectConfigurationMenu();
		pim.clickDataImport();
		pim.uploadFileDataImport("C:\\Users\\seq_reshma\\Downloads\\importData");
		pim.submitUploadFile();
	}
	@Test(priority=7)
	public void createReportingMethod() {
		pim = new pimPage(driver);
		pim.clickPim();
		pim.selectConfigurationMenu();
		pim.clickReportingMethod();
		pim.addReport();
		pim.enterReportName("Summary Report Latest");
		pim.submitReport();
	}
	
	@Test(priority=8)
	
	public void createTerminationReason() {
		pim = new pimPage(driver);
		pim.clickPim();
		pim.selectConfigurationMenu();
		pim.clickTerminationMenu();
		pim.addTerminationOption();
		pim.addTerminationName("Contract Renewed Action");
		pim.saveTermination();
	}
	
	@Test(priority =9)
	
	public void createNewReport() {
		pim = new pimPage(driver);
		pim.clickPim();
		pim.clickReportMenu();
		pim.clickAddNewReport();
		pim.reportName("Daily Report");
		pim.selectCriteria();
		pim.addSelection();
		pim.addHint("Employee details");
//		pim.displayGroup();
//		pim.displayField();
//		pim.addDisplays();
//		pim.headerEnable();
		//pim.submitNewReport();
	}

}

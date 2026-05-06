package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.baseTest;
import pageObject.leavePage;
import pageObject.loginPage;

public class leaveTestCase extends baseTest {

	loginPage login;
	leavePage leave;

	@Test(priority = 1)

	public void verifyApplyModule() {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.selectApplyMenu();
		String act = "Apply Leave";
		String exp = leave.verifyApplyHeading();
		Assert.assertEquals(act, exp);
	}

	@Test(priority = 2)
	public void verifyMyLeaveModule() {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickMyLeaveMenu();
		String exp = leave.verifyMyLeaveHeading();
		String act = "My Leave List";
		Assert.assertEquals(exp, act);
	}

	@Test(priority = 3)
	public void addSingleLeaveEntitlement() throws InterruptedException {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickEntitlementMenu();
		leave.clickAddEntitlementOption();
		leave.selectIndividualEmployee();
		leave.enterEmpName("Joseph");
		leave.selectLeaveType();
		leave.enterEntitlement("567");
		leave.submitEntitlement();
	}

	@Test(priority = 4)
	public void addMultipleLeaveEntitlement() {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickEntitlementMenu();
		leave.clickAddEntitlementOption();
		leave.clickEnableMultipleEmployee();
		leave.selectLocation();
		leave.selectSubUnit();
		leave.selectLeaveType();
		leave.enterEntitlement("987");
		leave.submitEntitlement();
	}

	@Test(priority = 5)
	public void verifySearchResult() throws InterruptedException {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickEntitlementMenu();
		leave.clickEmployeeEntitlementOption();
		leave.empNameSearch("Joseph");
		leave.clickSearchBtn();
		String act = "No Records Found";
		String exp = leave.verifySearchResult();
		Assert.assertEquals(act, exp);

	}

	@Test(priority = 6)
	public void entitlementsUsageReportLeaveType() throws InterruptedException {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickReportMenu();
		leave.selectLeaveEntitlementUsageReport();
		leave.clickGenerateForLeaveType();
		leave.selectLeaveLocation();
		leave.selectLeaveSubUnit();
		leave.selectJobtitles();
		leave.clickEnablePastMember();
		leave.generateLeaveEntitlement();
	}

	@Test(priority = 7)
	public void entitlementsUsageReportEmployee() throws InterruptedException {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickReportMenu();
		leave.selectLeaveEntitlementUsageReport();
		leave.generateLeaveForEmployee();
		leave.enterNameOfEmployee("ABC");
		leave.generateLeaveEntitlement();
	}

	@Test(priority = 8)
	public void entitlementsUsageReportMyLeave() {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickReportMenu();
		leave.clickMyLeaveEntitleUsageReport();
		leave.clickGenerateMyLeaveEntitleUsageReport();
		String exp = leave.verifyMyLeaveExpectedResult();
		String act = "(13) Records Found";
		Assert.assertEquals(exp, act);

	}

	@Test(priority = 9)
	public void verifyLeavePeriod() throws InterruptedException {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickConfigModule();
		leave.clickLeavePeriodModule();
		leave.selectStartMonth();
		leave.selectEndDate();
		String act = leave.verifyEndDate();
		String exp = "February 01 (Following Year)";
		String act1 = leave.verifyLeavePeriod();
		String exp1 = "2026-01-01 to 2026-31-12";
		Assert.assertEquals(act, exp);
		Assert.assertEquals(act1, exp1);
		leave.submitSaveLeave();
	}

	@Test(priority = 10)
	public void createLeaveType() {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickConfigModule();
		leave.clickLeaveTypeMenu();
		leave.createLeaveType();
		leave.addNameOfLeaveType("Casual Compensatory Leave");
		leave.clickEnableYes();
		leave.verifyInfo();
		leave.clickOkInfo();
		leave.submitSaveLeaveType();
	}

	@Test(priority = 11, description = "getting failed need to check")
	public void createWorkWeek() throws InterruptedException {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickConfigModule();
		leave.clickWorkWeek();
		leave.selectMonday();
		leave.selectTuesday();
		leave.selectWednesday();
		leave.selectThursday();
		leave.selectFriday();
		leave.selectSaturday();
		leave.selectSunday();
		leave.submitSaveWorkWeek();
	}

	@Test(priority = 12)
	public void createHoliday() throws InterruptedException {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickConfigModule();
		leave.clickHolidayMenu();
		leave.createHoliday();
		leave.enterHolidayName("Independence Day");
		leave.enterHolidayDate("1947-08-15");
		leave.selectDayRange();
		leave.selectRepeat();
		leave.submitHoliday();
	}

	@Test(priority = 13)
	public void assignCreatedLeave() throws InterruptedException {
		leave = new leavePage(driver);
		leave.clickLeaveModule();
		leave.clickConfigModule();
		leave.clickAssignLeaveMenu();
		leave.enterLeaveEmpName("John");
		leave.enterLeaveTypeInLeave();
		// leave.checkLeaveBalanceDetails();
		// leave.confirmLeaveBalance();
		leave.enterFromDate("2026-05-03");
		// leave.enterToDate();
		// leave.selectLeaveDuration();
		leave.enterComments("Due to personal emergency");
		String act = leave.verifyLeaveBalanceStatus();
		String exp = "Balance not sufficient";
		Assert.assertEquals(act, exp);
		leave.submitSaveApplyLeave();
		String act1 = leave.verifyLeaveBalanceConfimation();
		String exp1 = "Employee does not have sufficient leave balance for leave request. Click OK to confirm leave assignment.";
		Assert.assertEquals(act1, exp1);
		leave.clickConfirmationOk();

	}

}

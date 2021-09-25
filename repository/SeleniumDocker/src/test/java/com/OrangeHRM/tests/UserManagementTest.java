package com.OrangeHRM.tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class UserManagementTest extends Base{

    @Test(priority = 1)
    public void ToggleBarValidation() {
        extentTest = extentReports.startTest("TC_009 : Click on system user toggle bar");
        App().Flow().UserManagement().validateToggleBar(url);
        extentTest.log(LogStatus.INFO, "Navigate at application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Admin tab and select user management");
        extentTest.log(LogStatus.INFO, "Click on system user toggle bar");
        extentReports.endTest(extentTest);
    }

    @Test(priority = 2)
    public void UserSearchValidation() {
        extentTest = extentReports.startTest("TC_010 : Validate user is able to search employee from the table");
        App().Flow().UserManagement().validateUserSearchFlow();
        extentTest.log(LogStatus.INFO, "Navigate at application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Admin tab and select user management");
        extentTest.log(LogStatus.INFO, "Enter user details and click on search button");
        extentReports.endTest(extentTest);
    }

    @Test(priority = 3)
    public void UserResetValidation() {
        extentTest = extentReports.startTest("TC_011 : Verify user is able to reset the fields after inserting user search fields");
        App().Flow().UserManagement().validateUserResetFlow();
        extentTest.log(LogStatus.INFO, "Navigate at application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Admin tab and select user management");
        extentTest.log(LogStatus.INFO, "Enter user details and click on search button");
        extentTest.log(LogStatus.INFO, "Click on reset button");
        extentReports.endTest(extentTest);
    }

    @Test(priority = 4)
    public void AddUserValidation() {
        extentTest = extentReports.startTest("TC_011 : Verify user is able add new employee");
        App().Flow().UserManagement().validateAddButtonFlow(url);
        extentTest.log(LogStatus.INFO, "Navigate at application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Admin tab and select user management");
        extentTest.log(LogStatus.INFO, "Enter user details and click on search button");
        extentTest.log(LogStatus.INFO, "Click on reset button");
        extentReports.endTest(extentTest);
    }

    @Test(priority = 5)
    public void DeleteUserValidation() {
        extentTest = extentReports.startTest("TC_012 : Verify user is able delete employee");
        App().Flow().UserManagement().validateDeleteButtonFlow(url);
        extentTest.log(LogStatus.INFO, "Navigate at application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Admin tab and select user management");
        extentTest.log(LogStatus.INFO, "Enter user details and click on search button");
        extentTest.log(LogStatus.INFO, "Click on reset button");
        extentReports.endTest(extentTest);
    }
}

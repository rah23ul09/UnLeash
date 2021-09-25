package com.OrangeHRM.tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class LoginTest extends Base {

    @Test (priority = 1)
    public void LogoAndLoginImageValidation() {
        extentTest = extentReports.startTest("TC_001 : Validate logo and login image of login page");
        App().Flow().Login().verifyLogoAndLoginImage(url);
        extentTest.log(LogStatus.INFO, "Navigate at login page");
        extentTest.log(LogStatus.INFO, "Verify logo and login image");
        extentReports.endTest(extentTest);
    }

    @Test (priority = 2)
    public void LoginValidation() {
        extentTest = extentReports.startTest("TC_002 : Validate user is able to login into application");
        App().Flow().Login().verifyLoginFlow(url);
        extentTest.log(LogStatus.INFO, "Navigate at login page");
        extentTest.log(LogStatus.INFO, "Enter username and password");
        extentTest.log(LogStatus.INFO, "Click on continue button");
        extentReports.endTest(extentTest);
    }
}

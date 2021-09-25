package com.OrangeHRM.tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class HomeHeaderTest extends Base{

    @Test (priority = 1)
    public void HeaderComponentsValidation() {
        extentTest = extentReports.startTest("TC_003 : Validate home page header components");
        App().Flow().HeaderFlow().validateHeaderComponentsFlow(url);
        extentTest.log(LogStatus.INFO, "Navigate at login page of OrangeHRM");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO,  "Validate components in the header section");
        extentReports.endTest(extentTest);
    }

    @Test (priority = 2)
    public void AboutValidation() {
        extentTest = extentReports.startTest("TC_004 : Validate about from welcome drop down");
        App().Flow().HeaderFlow().validateAbout(url);
        extentTest.log(LogStatus.INFO, "Navigate at login page of OrangeHRM");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "CLick on Welcome and select about from drop down");
        extentReports.endTest(extentTest);
    }

    @Test (priority = 3)
    public void CloseAboutValidation() {
        extentTest = extentReports.startTest("TC_005 : Validate about message box is closed");
        App().Flow().HeaderFlow().validateCloseAbout(url);
        extentTest.log(LogStatus.INFO, "Navigate at login page of OrangeHRM");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "CLick on Welcome and select about from drop down");
        extentTest.log(LogStatus.INFO, "Close the about message box");
        extentReports.endTest(extentTest);
    }

    @Test (priority = 4)
    public void LogoutValidation() {
        extentTest = extentReports.startTest("TC_006 : Validate user is able to logout ");
        App().Flow().HeaderFlow().validateButtonLogout(url);
        extentTest.log(LogStatus.INFO, "Navigate at login page of OrangeHRM");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "CLick on Welcome and select logout from drop down");
        extentReports.endTest(extentTest);
    }
}

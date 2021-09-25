package com.OrangeHRM.tests;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class FirstLevelMenuBarTest extends Base{

    @Test
    public void FirstLeveMenuBarValidation() {
        extentTest = extentReports.startTest("TC_007 : Validate first level menu bar is displayed");
        App().Flow().FirstMenuBar().validateFirstLevelMenuBar(url);
        extentTest.log(LogStatus.INFO, "Navigate at login page of OrangeHRM");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "First Level Menu bar must be displayed");
        extentReports.endTest(extentTest);
    }

}

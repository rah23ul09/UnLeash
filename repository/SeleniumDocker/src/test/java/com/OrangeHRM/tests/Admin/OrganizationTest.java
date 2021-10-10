package com.OrangeHRM.tests.Admin;

import com.OrangeHRM.tests.Base.Base;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class OrganizationTest extends Base {

    @Test(priority = 1)
    public void GeneralInformationValidation() {
        extentTest = extentReports.startTest("TC_018 : Validate general information Flow");
        App().Flow().Organization().validateGeneralInformationFlow(url);
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on organization");
        extentTest.log(LogStatus.INFO, "Click on General Information");
    }

    @Test(priority = 2)
    public void LocationsValidation() {
        extentTest = extentReports.startTest("TC_019 : Validate Locations Flow");
        App().Flow().Organization().validateLocationsFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on organization");
        extentTest.log(LogStatus.INFO, "Click on Locations");
    }

    @Test(priority = 3)
    public void StructureValidation() {
        extentTest = extentReports.startTest("TC_020 : Validate Structure Flow");
        App().Flow().Organization().validateStructureFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on organization");
        extentTest.log(LogStatus.INFO, "Click on Structure");
    }
}

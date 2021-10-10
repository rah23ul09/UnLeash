package com.OrangeHRM.tests.Admin;

import com.OrangeHRM.tests.Base.Base;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class QualificationTest extends Base {

    @Test(priority = 1)
    public void SkillsValidation() {
        extentTest = extentReports.startTest("TC_019 : Validate Skills Flow");
        App().Flow().Qualification().validateSkillsFlow(url);
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on qualifications");
        extentTest.log(LogStatus.INFO, "Click on Skills");
    }

    @Test(priority = 2)
    public void EducationValidation() {
        extentTest = extentReports.startTest("TC_020 : Validate Education Flow");
        App().Flow().Qualification().validateEducationFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on qualifications");
        extentTest.log(LogStatus.INFO, "Click on Education");
    }

    @Test(priority = 3)
    public void LicensesValidation() {
        extentTest = extentReports.startTest("TC_021 : Validate Licenses Flow");
        App().Flow().Qualification().validateLicensesFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on qualifications");
        extentTest.log(LogStatus.INFO, "Click on Licenses");
    }

    @Test(priority = 4)
    public void LanguagesValidation() {
        extentTest = extentReports.startTest("TC_022 : Validate Languages Flow");
        App().Flow().Qualification().validateLanguagesFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on qualifications");
        extentTest.log(LogStatus.INFO, "Click on Languages");
    }

    @Test(priority = 5)
    public void MembershipsValidation() {
        extentTest = extentReports.startTest("TC_023 : Validate Memberships Flow");
        App().Flow().Qualification().validateMembershipFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on qualifications");
        extentTest.log(LogStatus.INFO, "Click on Memberships");
    }
}

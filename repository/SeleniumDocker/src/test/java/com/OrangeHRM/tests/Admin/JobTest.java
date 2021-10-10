package com.OrangeHRM.tests.Admin;

import com.OrangeHRM.tests.Base.Base;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class JobTest extends Base {

    @Test(priority = 1)
    public void JobTitleValidation() {
        extentTest = extentReports.startTest("TC_013 : Validate Job Title flow");
        App().Flow().Job().validateJobTitleFlow(url);
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Job");
        extentTest.log(LogStatus.INFO, "Click on Job Title");
    }

    @Test(priority = 2)
    public void PayGradesValidation() {
        extentTest = extentReports.startTest("TC_014 : Validate Pay Grades flow");
        App().Flow().Job().validatePayGradesFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Job");
        extentTest.log(LogStatus.INFO, "Click on Pay Grades");
    }

    @Test(priority = 3)
    public void EmploymentStatusValidation() {
        extentTest = extentReports.startTest("TC_015 : Validate Employment Status flow");
        App().Flow().Job().validateEmploymentStatusFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Job");
        extentTest.log(LogStatus.INFO, "Click on Employment Status");
    }

    @Test(priority = 4)
    public void JobCategoryValidation() {
        extentTest = extentReports.startTest("TC_016 : Validate Job Category flow");
        App().Flow().Job().validateJobCategoryFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Job");
        extentTest.log(LogStatus.INFO, "Click on Job Category");
    }

    @Test(priority = 5)
    public void WorkShiftValidation() {
        extentTest = extentReports.startTest("TC_017 : Validate Work Shift flow");
        App().Flow().Job().validateWorkShiftFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on Job");
        extentTest.log(LogStatus.INFO, "Click on Work Shift");
    }
}

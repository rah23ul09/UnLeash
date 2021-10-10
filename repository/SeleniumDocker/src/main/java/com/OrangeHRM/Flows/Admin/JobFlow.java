package com.OrangeHRM.Flows.Admin;

import org.openqa.selenium.WebDriver;

public class JobFlow extends AbstractAdminFlow{

    public JobFlow(WebDriver driver) {
        super(driver);
    }

    @Override
    public void validateAdminFlow(String url) {
        validateAdminTab(url);
    }
    @Override
    public void validateAdminFlowOnly() {
        validateAdminTabOnly();
    }

    public void validateJobTitleFlow(String url) {
        validateAdminFlow(url);
        JobP().verifyTabAdminListForStale();
        JobP().verifyJobTitle();
        }

    public void validatePayGradesFlow() {
        validateAdminFlowOnly();
        JobP().verifyTabAdminListForStale();
        JobP().verifyPayGrades();
    }

    public void validateEmploymentStatusFlow() {
        validateAdminFlowOnly();
        JobP().verifyTabAdminListForStale();
        JobP().verifyEmploymentStatus();
    }

    public void validateJobCategoryFlow() {
        validateAdminFlowOnly();
        JobP().verifyTabAdminListForStale();
        JobP().verifyJobCategory();
    }

    public void validateWorkShiftFlow() {
        validateAdminFlowOnly();
        JobP().verifyTabAdminListForStale();
        JobP().verifyWorkShift();
    }
}

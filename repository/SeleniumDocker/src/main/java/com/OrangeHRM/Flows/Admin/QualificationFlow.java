package com.OrangeHRM.Flows.Admin;

import org.openqa.selenium.WebDriver;

public class QualificationFlow extends AbstractAdminFlow {

    public QualificationFlow(WebDriver driver) {
        super(driver);
    }

    @Override
    public void validateAdminFlow(String url) { validateAdminTab(url); }

    @Override
    public void validateAdminTabOnly() { validateAdminTabOnly(); }

    public void validateSkillsFlow(String url) {
        validateAdminFlow(url);
        QualificationP().verifyTabAdminListStale();
        QualificationP().verifySkills();
    }

    public void validateEducationFlow() {
        validateAdminFlowOnly();
        QualificationP().verifyTabAdminListStale();
        QualificationP().verifyEducation();
    }

    public void validateLicensesFlow() {
        validateAdminFlowOnly();
        QualificationP().verifyTabAdminListStale();
        QualificationP().verifyLicenses();
    }

    public void validateLanguagesFlow() {
        validateAdminFlowOnly();
        QualificationP().verifyTabAdminListStale();
        QualificationP().verifyLanguages();
    }

    public void validateMembershipFlow() {
        validateAdminFlowOnly();
        QualificationP().verifyTabAdminListStale();
        QualificationP().verifyMemberships();
    }
}

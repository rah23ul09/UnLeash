package com.OrangeHRM.Flows.Admin;

import org.openqa.selenium.WebDriver;

public class OrganizationFlow extends AbstractAdminFlow{

    public OrganizationFlow(WebDriver driver) {
        super(driver);
    }

    @Override
    public void validateAdminFlow(String url) {
        validateAdminTab(url);
    }
    @Override
    public void validateAdminFlowOnly() { validateAdminTabOnly();}

    public void validateGeneralInformationFlow(String url) {
        validateAdminFlow(url);
        OrganizationP().verifyTabAdminListForStale();
        OrganizationP().verifyGeneralInformation();
    }

    public void validateLocationsFlow() {
        validateAdminFlowOnly();
        OrganizationP().verifyTabAdminListForStale();
        OrganizationP().verifyLocations();
    }

    public void validateStructureFlow() {
        validateAdminFlowOnly();
        OrganizationP().verifyTabAdminListForStale();
        OrganizationP().verifyLocations();
    }
}

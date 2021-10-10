package com.OrangeHRM.Pages.Admin;

import com.OrangeHRM.Elements.Admin.OrganizationElement;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrganizationPage extends AbstractAdminPage{
    OrganizationElement organizationElement;

    public OrganizationPage(WebDriver driver) {
        super(driver);
        organizationElement = new OrganizationElement(this.driver);
    }

    @Override
    public void verifyTabAdminList() {
        waitAll("visible" , adminElement.tabAdminList);
        for (WebElement org : adminElement.tabAdminList) {
            String organization = org.getText().trim();
            if(organization.equals("Organization")) {
                waitAction("action" , org);
            }
        }
    }

    public void verifyTabAdminListForStale() {
        try {
            verifyTabAdminList();
        }catch (StaleElementReferenceException e) {
            verifyTabAdminList();
        }
    }

    public void verifyGeneralInformation() {
        waitAction("click" , organizationElement.optionGeneralInformation);
        organizationElement.optionGeneralInformation.click();
    }

    public void verifyLocations() {
        waitAction("click" , organizationElement.optionLocations);
        organizationElement.optionLocations.click();
    }

    public void verifyStructure() {
        waitAction("click" , organizationElement.optionStructure);
        organizationElement.optionStructure.click();
    }
}

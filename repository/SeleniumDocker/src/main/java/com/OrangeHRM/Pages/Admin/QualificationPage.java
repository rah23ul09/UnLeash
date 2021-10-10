package com.OrangeHRM.Pages.Admin;

import com.OrangeHRM.Elements.Admin.QualificationElement;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QualificationPage extends AbstractAdminPage{
    QualificationElement qualificationElement;

    public QualificationPage(WebDriver driver) {
        super(driver);
        qualificationElement = new QualificationElement(this.driver);
    }

    @Override
    public void verifyTabAdminList() {
        waitAll("visible" , adminElement.tabAdminList);
        for (WebElement qualification: adminElement.tabAdminList) {
            String qualify = qualification.getText().trim();
            if (qualify.equals("Qualifications")) {
                waitAction("action" , qualification);
            }
        }
    }

    public void verifyTabAdminListStale() {
        try {
            verifyTabAdminList();
        }catch (StaleElementReferenceException e) {
            verifyTabAdminList();
        }
    }

    public void verifySkills() {
        waitAction("click" , qualificationElement.optionSkills);
        qualificationElement.optionSkills.click();
    }

    public void verifyEducation() {
        waitAction("click" , qualificationElement.optionEducation);
        qualificationElement.optionEducation.click();
    }

    public void verifyLicenses() {
        waitAction("click" , qualificationElement.optionLicenses);
        qualificationElement.optionLicenses.click();
    }

    public void verifyLanguages() {
        waitAction("click" , qualificationElement.optionLanguages);
        qualificationElement.optionLanguages.click();
    }

    public void verifyMemberships() {
        waitAction("click" , qualificationElement.optionMemberships);
        qualificationElement.optionMemberships.click();
    }
}

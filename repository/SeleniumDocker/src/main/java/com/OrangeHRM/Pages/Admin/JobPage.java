package com.OrangeHRM.Pages.Admin;

import com.OrangeHRM.Elements.Admin.JobElement;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobPage extends AbstractAdminPage{
    JobElement jobElement;

    public JobPage(WebDriver driver) {
        super(driver);
        jobElement = new JobElement(this.driver);
    }

        @Override
        public void verifyTabAdminList() {
        waitAll("visible", adminElement.tabAdminList);
        for (WebElement job : adminElement.tabAdminList) {
            String jobs = job.getText().trim();
            if (jobs.equals("Job")) {
                waitAction("action" , job);
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

    public void verifyJobTitle() {
        waitAction("click" , jobElement.optionJobTitle);
        jobElement.optionJobTitle.click();
    }

    public void verifyPayGrades() {
        waitAction("click" , jobElement.optionPayGrades);
        jobElement.optionPayGrades.click();
    }

    public void verifyEmploymentStatus() {
        waitAction("click" , jobElement.optionEmploymentStatus);
        jobElement.optionEmploymentStatus.click();
    }

    public void verifyJobCategory() {
        waitAction("click" , jobElement.optionJobCategory);
        jobElement.optionJobCategory.click();
    }

    public void verifyWorkShift() {
        waitAction("click" , jobElement.optionWorkShift);
        jobElement.optionWorkShift.click();
    }
}

package com.OrangeHRM.Elements.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class JobElement {
    WebDriver driver;
    @FindBy(css = "a#menu_admin_viewJobTitleList") public WebElement optionJobTitle;
    @FindBy(css = "a#menu_admin_viewPayGrades") public WebElement optionPayGrades;
    @FindBy(css = "a#menu_admin_employmentStatus") public WebElement optionEmploymentStatus;
    @FindBy(css = "a#menu_admin_jobCategory") public WebElement optionJobCategory;
    @FindBy(css = "a#menu_admin_workShift") public WebElement optionWorkShift;

    public JobElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

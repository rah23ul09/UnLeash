package com.OrangeHRM.Elements.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QualificationElement {
    WebDriver driver;

    @FindBy(css = "a#menu_admin_viewSkills") public WebElement optionSkills;
    @FindBy(css = "a#menu_admin_viewEducation") public WebElement optionEducation;
    @FindBy(css = "a#menu_admin_viewLicenses") public WebElement optionLicenses;
    @FindBy(css = "a#menu_admin_viewLanguages") public WebElement optionLanguages;
    @FindBy(css = "a#menu_admin_membership") public WebElement optionMemberships;

    public QualificationElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

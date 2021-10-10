package com.OrangeHRM.Elements.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationElement {
    WebDriver driver;

    @FindBy(css = "a#menu_admin_viewOrganizationGeneralInformation") public WebElement optionGeneralInformation;
    @FindBy(css = "a#menu_admin_viewLocations") public WebElement optionLocations;
    @FindBy(css = "a#menu_admin_viewCompanyStructure") public WebElement optionStructure;

    public OrganizationElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

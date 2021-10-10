package com.OrangeHRM.Elements.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigurationElement {
    WebDriver driver;

    @FindBy(css = "a#menu_admin_listMailConfiguration") public WebElement optionEmailConfiguration;
    @FindBy(css = "a#menu_admin_viewEmailNotification") public WebElement optionEmailSubscription;
    @FindBy(css = "a#menu_admin_localization") public WebElement optionLocalization;
    @FindBy(css = "a#menu_admin_languagePackage") public WebElement optionLanguagePackages;
    @FindBy(css = "a#menu_admin_viewModules") public WebElement optionModules;
    @FindBy(css = "a#menu_admin_openIdProvider") public WebElement optionSocialMediaAuth;
    @FindBy(css = "a#menu_admin_registerOAuthClient") public WebElement optionRegisterOAuthClient;

    public ConfigurationElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

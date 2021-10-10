package com.OrangeHRM.Pages.Admin;

import com.OrangeHRM.Elements.Admin.ConfigurationElement;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfigurationPage extends AbstractAdminPage{
    ConfigurationElement configurationElement;

    public ConfigurationPage(WebDriver driver) {
        super(driver);
        configurationElement = new ConfigurationElement(this.driver);
    }

    @Override
    public void verifyTabAdminList() {
        waitAll("visible" , adminElement.tabAdminList);
        for (WebElement configuration: adminElement.tabAdminList) {
            String configure = configuration.getText().trim();
            if (configure.equals("Configuration")) {
                waitAction("action" , configuration);
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

    public void verifyEmailConfiguration() {
        waitAction("click" , configurationElement.optionEmailConfiguration);
        configurationElement.optionEmailConfiguration.click();
    }

    public void verifyEmailSubscription() {
        waitAction("click" , configurationElement.optionEmailSubscription);
        configurationElement.optionEmailSubscription.click();
    }

    public void verifyLocalization() {
        waitAction("click" , configurationElement.optionLocalization);
        configurationElement.optionLocalization.click();
    }

    public void verifyLanguagePackages() {
        waitAction("click" , configurationElement.optionLanguagePackages);
        configurationElement.optionLanguagePackages.click();
    }

    public void verifyModules() {
        waitAction("click" , configurationElement.optionModules);
        configurationElement.optionModules.click();
    }

    public void verifySocialMediaAuth() {
        waitAction("click" , configurationElement.optionSocialMediaAuth);
        configurationElement.optionSocialMediaAuth.click();
    }

    public void verifyRegisterOAuthClient() {
        waitAction("click" , configurationElement.optionRegisterOAuthClient);
        configurationElement.optionRegisterOAuthClient.click();
    }
}

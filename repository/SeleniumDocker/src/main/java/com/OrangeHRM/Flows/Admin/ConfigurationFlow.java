package com.OrangeHRM.Flows.Admin;

import org.openqa.selenium.WebDriver;

public class ConfigurationFlow extends AbstractAdminFlow{

    public ConfigurationFlow(WebDriver driver) {
        super(driver);
    }

    @Override
    public void validateAdminFlow(String url) {
        validateAdminTab(url);
    }
    @Override
    public void validateAdminFlowOnly() { validateAdminTabOnly();}

    public void validateEmailConfigurationFlow(String url) {
        validateAdminFlow(url);
        ConfigurationP().verifyTabAdminListStale();
        ConfigurationP().verifyEmailConfiguration();
    }

    public void validateEmailSubscriptionFlow() {
        validateAdminFlowOnly();
        ConfigurationP().verifyTabAdminListStale();
        ConfigurationP().verifyEmailSubscription();
    }

    public void validateLocalizationFlow() {
        validateAdminFlowOnly();
        ConfigurationP().verifyTabAdminListStale();
        ConfigurationP().verifyLocalization();
    }

    public void validateLanguagePackagesFlow() {
        validateAdminFlowOnly();
        ConfigurationP().verifyTabAdminListStale();
        ConfigurationP().verifyLanguagePackages();
    }

    public void validateModulesFlow() {
        validateAdminFlowOnly();
        ConfigurationP().verifyTabAdminListStale();
        ConfigurationP().verifyModules();
    }

    public void validateSocialMediaAuthFlow() {
        validateAdminFlowOnly();
        ConfigurationP().verifyTabAdminListStale();
        ConfigurationP().verifySocialMediaAuth();
    }

    public void validateRegisterOAuthClientFlow() {
        validateAdminFlowOnly();
        ConfigurationP().verifyTabAdminListStale();
        ConfigurationP().verifyRegisterOAuthClient();
    }
}

package com.OrangeHRM.tests.Admin;

import com.OrangeHRM.tests.Base.Base;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class ConfigurationTest extends Base {

    @Test(priority = 1)
    public void EmailConfigurationValidation() {
        extentTest = extentReports.startTest("TC_024 : Validate Email Configuration Flow");
        App().Flow().Configuration().validateEmailConfigurationFlow(url);
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on configuration");
        extentTest.log(LogStatus.INFO, "Click on Email configuration");
    }

    @Test(priority = 2)
    public void EmailSubscriptionValidation() {
        extentTest = extentReports.startTest("TC_025 : Validate Email Subscription Flow");
        App().Flow().Configuration().validateEmailSubscriptionFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on configuration");
        extentTest.log(LogStatus.INFO, "Click on Email Subscription");
    }

    @Test(priority = 3)
    public void LocalizationValidation() {
        extentTest = extentReports.startTest("TC_026 : Validate Localization Flow");
        App().Flow().Configuration().validateLocalizationFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on configuration");
        extentTest.log(LogStatus.INFO, "Click on Localization");
    }

    @Test(priority = 4)
    public void LanguagePackagesValidation() {
        extentTest = extentReports.startTest("TC_027 : Validate Language Packages Flow");
        App().Flow().Configuration().validateLanguagePackagesFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on configuration");
        extentTest.log(LogStatus.INFO, "Click on Language Packages");
    }

    @Test(priority = 5)
    public void ModulesValidation() {
        extentTest = extentReports.startTest("TC_028 : Validate Modules Flow");
        App().Flow().Configuration().validateModulesFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on configuration");
        extentTest.log(LogStatus.INFO, "Click on Modules Packages");
    }

    @Test(priority = 6)
    public void SocialMediaAuthValidation() {
        extentTest = extentReports.startTest("TC_029 : Validate social media authentication Flow");
        App().Flow().Configuration().validateSocialMediaAuthFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on configuration");
        extentTest.log(LogStatus.INFO, "Click on social media authentication");
    }

    @Test(priority = 7)
    public void RegisterOAuthClientValidation() {
        extentTest = extentReports.startTest("TC_030 : Validate Register OAuth Client Flow");
        App().Flow().Configuration().validateRegisterOAuthClientFlow();
        extentTest.log(LogStatus.INFO, "Navigate to OrangeHRM application");
        extentTest.log(LogStatus.INFO, "Login into application");
        extentTest.log(LogStatus.INFO, "Click on configuration");
        extentTest.log(LogStatus.INFO, "Click on Register OAuth Client");
    }
}

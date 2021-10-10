package com.OrangeHRM.Flows.Base;

import com.OrangeHRM.Libs.ImplicitLib;
import com.OrangeHRM.Libs.InterfaceLib;
import com.OrangeHRM.Libs.NavLib;
import com.OrangeHRM.Libs.PageLib;
import org.openqa.selenium.WebDriver;

public class FirstLevelMenuBarFlow extends PageLib implements InterfaceLib{
    WebDriver driver;
    ImplicitLib implicitLib;
    NavLib navLib;

    public FirstLevelMenuBarFlow(WebDriver driver) {
        super(driver);
        this.driver = driver;
        implicitLib = new ImplicitLib(this.driver);
        navLib = new NavLib(this.driver);
    }

    @Override
    public void navigateToApplication(String url) {
        navLib.openURL(url);
        implicitLib.implicitWait(3000);
        Login().cred();
        implicitLib.implicitWait(1000);
    }
    @Override
    public void navigateToApplicationOnce(String url) {
        navLib.openURL(url);
        implicitLib.implicitWait(3000);
    }

    public void validateFirstLevelMenuBar(String url) {
        navigateToApplication(url);
        FirstLeveMenuBar().verifyFirstLeveMenuBar();
        FirstLeveMenuBar().verifyFirstMenuBarList();
    }

    public void validateAdminTab(String url) {
        navigateToApplication(url);
        FirstLeveMenuBar().verifyAdminTab();
    }

    public void validateAdminTabOnly() {
        FirstLeveMenuBar().verifyAdminTab();
    }
}

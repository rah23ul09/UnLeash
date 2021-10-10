package com.OrangeHRM.Flows.Base;

import com.OrangeHRM.Libs.ImplicitLib;
import com.OrangeHRM.Libs.InterfaceLib;
import com.OrangeHRM.Libs.NavLib;
import com.OrangeHRM.Libs.PageLib;
import org.openqa.selenium.WebDriver;

public class HomeHeaderFlow implements InterfaceLib {
    WebDriver driver;
    ImplicitLib implicitLib;
    PageLib Page;
    NavLib navLib;

    @Override
    public void navigateToApplication(String url) {
        navLib.openURL(url);
        implicitLib.implicitWait(3000);
        Page.Login().cred();
        implicitLib.implicitWait(1000);
    }

    @Override
    public void navigateToApplicationOnce(String url) {
        navLib.openURL(url);
        implicitLib.implicitWait(3000);
    }

    public HomeHeaderFlow(WebDriver driver) {
        this.driver = driver;
        Page = new PageLib(this.driver);
        implicitLib = new ImplicitLib(this.driver);
        navLib = new NavLib(this.driver);
    }

    public void validateHeaderComponentsFlow(String url) {
        navigateToApplication(url);
        Page.HeaderPage().verifyHeader();
        Page.HeaderPage().verifyHeaderComponents();
    }

    public void validateAbout(String url) {
        navigateToApplicationOnce(url);
        Page.HeaderPage().navigateToAbout();
        implicitLib.implicitWait(3000);
    }

    public void validateCloseAbout(String url) {
        navigateToApplicationOnce(url);
        Page.HeaderPage().verifyCloseAbout();
        implicitLib.implicitWait(3000);
    }

    public void validateButtonLogout(String url) {
        navigateToApplicationOnce(url);
        Page.HeaderPage().verifyButtonLogout();
        implicitLib.implicitWait(3000);
    }
}

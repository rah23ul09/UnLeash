package com.OrangeHRM.Flows.Base;

import com.OrangeHRM.Libs.ImplicitLib;
import com.OrangeHRM.Libs.InterfaceLib;
import com.OrangeHRM.Libs.NavLib;
import com.OrangeHRM.Libs.PageLib;
import org.openqa.selenium.WebDriver;

public class LoginFlow implements InterfaceLib {
    WebDriver driver;
    PageLib Page;
    NavLib navLib;
    ImplicitLib implicitLib;

    public LoginFlow(WebDriver driver) {
        this.driver = driver;
        Page = new PageLib(this.driver);
        navLib = new NavLib(this.driver);
        implicitLib = new ImplicitLib(this.driver);
    }

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

    public void verifyLogoAndLoginImage(String url) {
        navigateToApplicationOnce(url);
        Page.Login().verifyLogo();
        Page.Login().verifyImage();
        implicitLib.implicitWait(1000);

    }

    public void verifyLoginFlow(String url) {
        navigateToApplication(url);
        implicitLib.implicitWait(3000);
    }
}

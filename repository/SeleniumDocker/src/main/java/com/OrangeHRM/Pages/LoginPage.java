package com.OrangeHRM.Pages;

import com.OrangeHRM.Elements.LoginElement;
import com.OrangeHRM.Libs.ExplicitLib;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    LoginElement loginElement;
    ExplicitLib explicitLib;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginElement = new LoginElement(this.driver);
        explicitLib = new ExplicitLib(this.driver);
    }

    public boolean verifyLogo() {
        explicitLib.waitAction("visible", loginElement.logo);
        if(loginElement.logo.isDisplayed())
            return true;
        else
            return false;
    }

    public boolean verifyImage() {
        explicitLib.waitAction("visible", loginElement.imageLogin);
        if(loginElement.imageLogin.isDisplayed())
            return true;
        else
            return false;
    }

    public void verifyTextUsername() {
        explicitLib.waitAction("visible", loginElement.textUsername);
        if(loginElement.textUsername.isDisplayed())
        loginElement.textUsername.sendKeys("Admin");
    }

    public void verifyTextPassword() {
        explicitLib.waitAction("visible", loginElement.textPassword);
        if(loginElement.textPassword.isDisplayed())
        loginElement.textPassword.sendKeys("admin123");
    }

    public void verifyButtonLogin() {
        explicitLib.waitAction("click", loginElement.buttonLogin);
        loginElement.buttonLogin.click();
    }

    public void cred() {
        verifyTextUsername();
        verifyTextPassword();
        verifyButtonLogin();
    }
}

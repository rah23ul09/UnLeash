package com.OrangeHRM.Elements.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElement {
    WebDriver driver;
    @FindBy(css = "div#divLogo") public WebElement logo;
    @FindBy(css = "div#divLoginImage") public WebElement imageLogin;
    @FindBy(css = "input#txtUsername") public WebElement textUsername;
    @FindBy(css = "input#txtPassword") public WebElement textPassword;
    @FindBy(css = "input#btnLogin") public WebElement buttonLogin;

    public LoginElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

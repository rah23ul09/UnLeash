package com.OrangeHRM.Libs;

import org.openqa.selenium.WebDriver;

public class NavLib {
    WebDriver driver;

    public NavLib(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        this.driver.get(url);
    }

    public void maxWindow() {
        this.driver.manage().window().maximize();;
    }

    public void openURL(String url) {
        navigateToUrl(url);
        maxWindow();
    }

    public String getCurrentUrl() {
        return this.driver.getCurrentUrl();
    }
    public String getCurrentTitle() {
        return this.driver.getTitle();
    }
}

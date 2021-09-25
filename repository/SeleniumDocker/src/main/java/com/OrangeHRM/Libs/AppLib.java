package com.OrangeHRM.Libs;

import org.openqa.selenium.WebDriver;

public class AppLib {
    WebDriver driver;
    private FlowLib flowLib;

    public AppLib(WebDriver driver) {
        this.driver = driver;
        flowLib = new FlowLib(this.driver);
    }

    public FlowLib Flow() { return flowLib; }
}

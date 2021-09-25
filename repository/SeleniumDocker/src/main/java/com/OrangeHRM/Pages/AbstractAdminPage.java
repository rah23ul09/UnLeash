package com.OrangeHRM.Pages;

import com.OrangeHRM.Elements.AdminElement;
import com.OrangeHRM.Libs.ExplicitLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractAdminPage extends ExplicitLib {
    WebDriver driver;
    AdminElement adminElement;

    public AbstractAdminPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        adminElement = new AdminElement(this.driver);
    }

    public void verifyTabAdminList() {
    }
}

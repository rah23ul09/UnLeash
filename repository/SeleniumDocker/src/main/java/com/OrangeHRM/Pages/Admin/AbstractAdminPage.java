package com.OrangeHRM.Pages.Admin;

import com.OrangeHRM.Elements.Admin.AdminElement;
import com.OrangeHRM.Libs.ExplicitLib;
import org.openqa.selenium.WebDriver;

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

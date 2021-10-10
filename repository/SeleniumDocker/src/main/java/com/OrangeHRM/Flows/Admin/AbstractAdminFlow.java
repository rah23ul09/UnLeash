package com.OrangeHRM.Flows.Admin;

import com.OrangeHRM.Flows.Base.FirstLevelMenuBarFlow;
import org.openqa.selenium.WebDriver;

public abstract class AbstractAdminFlow extends FirstLevelMenuBarFlow {

    public AbstractAdminFlow(WebDriver driver) {
        super(driver);
    }

    public void validateAdminFlow(String url) {}
    public void validateAdminFlowOnly() {}
}

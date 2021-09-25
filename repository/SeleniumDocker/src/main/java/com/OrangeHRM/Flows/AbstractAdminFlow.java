package com.OrangeHRM.Flows;

import com.OrangeHRM.Libs.ImplicitLib;
import com.OrangeHRM.Libs.InterfaceLib;
import com.OrangeHRM.Libs.NavLib;
import com.OrangeHRM.Libs.PageLib;
import org.openqa.selenium.WebDriver;

public abstract class AbstractAdminFlow extends FirstLevelMenuBarFlow {

    public AbstractAdminFlow(WebDriver driver) {
        super(driver);
    }

    public void validateAdminFlow(String url) {}
    public void validateAdminFlowOnly() {}
}

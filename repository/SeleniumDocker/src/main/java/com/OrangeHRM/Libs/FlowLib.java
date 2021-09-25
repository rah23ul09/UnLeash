package com.OrangeHRM.Libs;

import com.OrangeHRM.Flows.FirstLevelMenuBarFlow;
import com.OrangeHRM.Flows.HomeHeaderFlow;
import com.OrangeHRM.Flows.LoginFlow;
import com.OrangeHRM.Flows.UserManagementFlow;
import org.openqa.selenium.WebDriver;

public class FlowLib {
    WebDriver driver;
    private LoginFlow loginFlow;
    private HomeHeaderFlow headerFlow;
    private FirstLevelMenuBarFlow firstLevelMenuBarFlow;
    private UserManagementFlow userManagementFlow;

    public FlowLib(WebDriver driver) {
        this.driver = driver;
        loginFlow = new LoginFlow(this.driver);
        headerFlow = new HomeHeaderFlow(this.driver);
        firstLevelMenuBarFlow = new FirstLevelMenuBarFlow(this.driver);
        userManagementFlow = new UserManagementFlow(this.driver);
    }

    public LoginFlow Login() { return loginFlow; }
    public HomeHeaderFlow HeaderFlow() { return headerFlow; }
    public FirstLevelMenuBarFlow FirstMenuBar() { return firstLevelMenuBarFlow; }
    public UserManagementFlow UserManagement() { return userManagementFlow; }
}

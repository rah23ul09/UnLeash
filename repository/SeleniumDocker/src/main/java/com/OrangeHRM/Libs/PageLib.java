package com.OrangeHRM.Libs;

import com.OrangeHRM.Pages.*;
import org.openqa.selenium.WebDriver;

public class PageLib {
    WebDriver driver;
    private LoginPage loginPage;
    private HomeHeaderPage headerPage;
    private FirstLevelMenuBarPage firstLevelMenuBarPage;
    private UserManagementPage userManagementPage;

    public PageLib(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        headerPage = new HomeHeaderPage(this.driver);
        firstLevelMenuBarPage = new FirstLevelMenuBarPage(this.driver);
        userManagementPage = new UserManagementPage(this.driver);
    }

    public LoginPage Login() { return loginPage; }
    public HomeHeaderPage HeaderPage() { return headerPage; }
    public FirstLevelMenuBarPage FirstLeveMenuBar() { return firstLevelMenuBarPage; }
    public UserManagementPage UserManagementP() { return userManagementPage; }
}

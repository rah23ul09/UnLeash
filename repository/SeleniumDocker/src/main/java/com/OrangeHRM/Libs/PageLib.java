package com.OrangeHRM.Libs;

import com.OrangeHRM.Pages.Admin.*;
import com.OrangeHRM.Pages.Base.FirstLevelMenuBarPage;
import com.OrangeHRM.Pages.Base.HomeHeaderPage;
import com.OrangeHRM.Pages.Base.LoginPage;
import org.openqa.selenium.WebDriver;

public class PageLib {
    WebDriver driver;
    private LoginPage loginPage;
    private HomeHeaderPage headerPage;
    private FirstLevelMenuBarPage firstLevelMenuBarPage;
    private UserManagementPage userManagementPage;
    private JobPage jobPage;
    private OrganizationPage organizationPage;
    private QualificationPage qualificationPage;
    private ConfigurationPage configurationPage;

    public PageLib(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        headerPage = new HomeHeaderPage(this.driver);
        firstLevelMenuBarPage = new FirstLevelMenuBarPage(this.driver);
        userManagementPage = new UserManagementPage(this.driver);
        jobPage = new JobPage(this.driver);
        organizationPage = new OrganizationPage(this.driver);
        qualificationPage = new QualificationPage(this.driver);
        configurationPage = new ConfigurationPage(this.driver);
    }

    public LoginPage Login() { return loginPage; }
    public HomeHeaderPage HeaderPage() { return headerPage; }
    public FirstLevelMenuBarPage FirstLeveMenuBar() { return firstLevelMenuBarPage; }
    public UserManagementPage UserManagementP() { return userManagementPage; }
    public JobPage JobP() { return jobPage; }
    public OrganizationPage OrganizationP() { return organizationPage; }
    public QualificationPage QualificationP() { return qualificationPage; }
    public ConfigurationPage ConfigurationP() { return configurationPage; }
}

package com.OrangeHRM.Libs;

import com.OrangeHRM.Flows.Admin.*;
import com.OrangeHRM.Flows.Base.FirstLevelMenuBarFlow;
import com.OrangeHRM.Flows.Base.HomeHeaderFlow;
import com.OrangeHRM.Flows.Base.LoginFlow;
import org.openqa.selenium.WebDriver;

public class FlowLib {
    WebDriver driver;
    private LoginFlow loginFlow;
    private HomeHeaderFlow headerFlow;
    private FirstLevelMenuBarFlow firstLevelMenuBarFlow;
    private UserManagementFlow userManagementFlow;
    private JobFlow jobFlow;
    private OrganizationFlow organizationFlow;
    private QualificationFlow qualificationFlow;
    private ConfigurationFlow configurationFlow;

    public FlowLib(WebDriver driver) {
        this.driver = driver;
        loginFlow = new LoginFlow(this.driver);
        headerFlow = new HomeHeaderFlow(this.driver);
        firstLevelMenuBarFlow = new FirstLevelMenuBarFlow(this.driver);
        userManagementFlow = new UserManagementFlow(this.driver);
        jobFlow = new JobFlow(this.driver);
        organizationFlow = new OrganizationFlow(this.driver);
        qualificationFlow = new QualificationFlow(this.driver);
        configurationFlow = new ConfigurationFlow(this.driver);
    }

    public LoginFlow Login() { return loginFlow; }
    public HomeHeaderFlow HeaderFlow() { return headerFlow; }
    public FirstLevelMenuBarFlow FirstMenuBar() { return firstLevelMenuBarFlow; }
    public UserManagementFlow UserManagement() { return userManagementFlow; }
    public JobFlow Job() { return  jobFlow; }
    public OrganizationFlow Organization() { return organizationFlow; }
    public QualificationFlow Qualification() { return qualificationFlow; }
    public ConfigurationFlow Configuration() { return configurationFlow; }
}

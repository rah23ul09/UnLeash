package com.OrangeHRM.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UserManagementElement {
    WebDriver driver;

    @FindBy(css = "a[class*=toggle]") public WebElement toggleBar;
    @FindBy(css = "input#searchSystemUser_userName") public WebElement textUsername;
    @FindBy(xpath = "//select[@id='searchSystemUser_userType']/child::*") public List <WebElement> dropDownUserRole;
    @FindBy(css = "input#searchSystemUser_employeeName_empName") public WebElement textEmployeeName;
    @FindBy(xpath = "//select[@id='searchSystemUser_status']/child::*") public List <WebElement> dropDownStatus;
    @FindBy(css = "input#searchBtn") public WebElement buttonSearch;
    @FindBy(css = "input#resetBtn") public WebElement buttonReset;
    @FindBy(css = "input#btnAdd") public WebElement buttonAdd;
    @FindBy(css = "input#btnDelete") public WebElement buttonDelete;
    @FindBy(css = "input[type='checkbox']") public List <WebElement> options;
    @FindBy(css ="td.left") public List <WebElement> optionsName;

    //elements for adding new user
    @FindBy(xpath = "//select[@id='systemUser_userType']/child::*") public List <WebElement> dropDownAddUserRole;
    @FindBy(css = "input#systemUser_employeeName_empName") public WebElement textAddUserEmployeeName;
    @FindBy(css = "input#systemUser_userName") public WebElement textAddUserUsername;
    @FindBy(xpath = "//select[@id='systemUser_status']/child::*") public List <WebElement> dropDownAddUserStatus;
    @FindBy(css = "input#systemUser_password") public WebElement textPassword;
    @FindBy(css = "input#systemUser_confirmPassword") public WebElement textConfirmPassword;
    @FindBy(css = "input#btnSave") public WebElement buttonSave;

    public UserManagementElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
}

package com.OrangeHRM.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdminElement extends FirstLevelMenuBarElement{
    WebDriver driver;

    @FindBy(xpath = "((//a[@id='menu_admin_viewAdminModule']/following::ul)[1])/child::*") public List<WebElement> tabAdminList;

    public AdminElement(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

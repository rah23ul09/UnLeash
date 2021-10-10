package com.OrangeHRM.Elements.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FirstLevelMenuBarElement {
    WebDriver driver;

    @FindBy(css = "ul#mainMenuFirstLevelUnorderedList") public WebElement menuBarFirst;
    @FindBy(css= "li.main-menu-first-level-list-item") public List <WebElement> menuBarFirstList;

    public FirstLevelMenuBarElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

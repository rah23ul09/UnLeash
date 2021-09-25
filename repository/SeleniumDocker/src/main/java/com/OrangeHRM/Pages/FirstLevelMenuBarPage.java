package com.OrangeHRM.Pages;

import com.OrangeHRM.Elements.FirstLevelMenuBarElement;
import com.OrangeHRM.Libs.ExplicitLib;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstLevelMenuBarPage extends ExplicitLib {
    WebDriver driver;
    FirstLevelMenuBarElement firstLevelMenuBarElement;

    public FirstLevelMenuBarPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        firstLevelMenuBarElement = new FirstLevelMenuBarElement(this.driver);
    }

    public boolean verifyFirstLeveMenuBar() {
        waitAction("visible" , firstLevelMenuBarElement.menuBarFirst);
        if(firstLevelMenuBarElement.menuBarFirst.isDisplayed())
            return true;
        else
            return false;
    }

    public void verifyFirstMenuBarList() {
        waitAll("visible" , firstLevelMenuBarElement.menuBarFirstList);
        for (WebElement firstBarList: firstLevelMenuBarElement.menuBarFirstList) {
            String barList = firstBarList.getText().trim();
            System.out.println(barList);
        }
    }

    public void verifyAdminTab() {
        try {
            waitAll("visible", firstLevelMenuBarElement.menuBarFirstList);
            for (WebElement firstTab : firstLevelMenuBarElement.menuBarFirstList) {
                String admin = firstTab.getText().trim();
                if (admin.equals("Admin")) {
                    waitAction("click", firstTab);
                    firstTab.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            waitAll("visible", firstLevelMenuBarElement.menuBarFirstList);
            for (WebElement firstTab : firstLevelMenuBarElement.menuBarFirstList) {
                String admin = firstTab.getText().trim();
                if (admin.equals("Admin")) {
                    waitAction("click", firstTab);
                    firstTab.click();
                }
            }
        }
    }
}

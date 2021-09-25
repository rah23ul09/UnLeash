package com.OrangeHRM.Libs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;
import java.util.Set;

public class ExplicitLib {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;
    JavascriptExecutor executor;

    public ExplicitLib(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 20);
        action = new Actions(this.driver);
        executor = (JavascriptExecutor) this.driver;
    }

    public void waitAction(String operation, WebElement element) {
        switch(operation.toLowerCase()) {
            case "click":
                wait.until(ExpectedConditions.elementToBeClickable(element));
                break;
            case "visible" :
                wait.until(ExpectedConditions.visibilityOf(element));
                break;
            case "action" :
                action.moveToElement(element).perform();
                break;
        }
    }

    public void waitAll(String visible, List<WebElement> elements) {
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }
}

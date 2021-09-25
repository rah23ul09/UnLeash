package com.OrangeHRM.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.Pageable;
import java.util.List;

public class HomeHeaderElement {
    WebDriver driver;

    @FindBy(css = "div#branding") public WebElement header;
    @FindBy(css = "img[alt='OrangeHRM']") public WebElement logoOrangeHRM;
    @FindBy(css = "input#MP_link") public WebElement labelMarketplace;
    @FindBy(css = "a.panelTrigger") public WebElement Welcome;
    @FindBy(css = "a#aboutDisplayLink") public WebElement linkAbout;
    @FindBy(xpath = "(//a[@class='close'])[1]") public WebElement iconClose;
    @FindBy(xpath = "//a[contains(text(),'Logout')]") public WebElement buttonLogout;

    public HomeHeaderElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

package com.OrangeHRM.Pages.Base;

import com.OrangeHRM.Elements.Base.HomeHeaderElement;
import com.OrangeHRM.Libs.ExplicitLib;
import org.openqa.selenium.WebDriver;

public class HomeHeaderPage {
    WebDriver driver;
    HomeHeaderElement headerElement;
    ExplicitLib explicitLib;

    public HomeHeaderPage(WebDriver driver) {
        this.driver = driver;
        headerElement = new HomeHeaderElement(this.driver);
        explicitLib = new ExplicitLib(this.driver);
    }

    public boolean verifyHeader() {
        explicitLib.waitAction("visible", headerElement.header);
        if(headerElement.header.isDisplayed())
            return true;
        else
            return false;
    }

    public boolean verifyHeaderComponents() {
        explicitLib.waitAction("visible" , headerElement.logoOrangeHRM);
        explicitLib.waitAction("visible" , headerElement.labelMarketplace);
        if(headerElement.logoOrangeHRM.isDisplayed()
                && headerElement.labelMarketplace.isDisplayed())
            return true;
        else
            return false;
    }

    public void navigateToAbout() {
        explicitLib.waitAction("click", headerElement.Welcome);
        headerElement.Welcome.click();
        explicitLib.waitAction("click" , headerElement.linkAbout);
        headerElement.linkAbout.click();
    }

    public void verifyCloseAbout() {
        navigateToAbout();
        explicitLib.waitAction("click" , headerElement.iconClose);
        headerElement.iconClose.click();
    }

    public void verifyButtonLogout() {
        explicitLib.waitAction("click", headerElement.Welcome);
        headerElement.Welcome.click();
        explicitLib.waitAction("click" , headerElement.buttonLogout);
        headerElement.buttonLogout.click();
    }
}

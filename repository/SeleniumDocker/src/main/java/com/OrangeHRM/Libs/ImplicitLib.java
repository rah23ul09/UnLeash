package com.OrangeHRM.Libs;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitLib {
    WebDriver driver;

    public ImplicitLib(WebDriver driver) {
        this.driver = driver;
    }

    public void implicitWait(int num) {
        switch(num) {
            case 1000 :
                this.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
                break;
            case 3000 :
                this.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
                break;
            case 5000 :
                this.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
                break;
            case 7000 :
                this.driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
                break;
            case 9000 :
                this.driver.manage().timeouts().implicitlyWait(9000, TimeUnit.MILLISECONDS);
                break;
            case 15000 :
                this.driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
                break;
        }
    }
}

package in.amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.amazon.element.HomeElement;



public class HomePage {

	WebDriver driver;
	HomeElement homeEle;
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 0);
		homeEle = new HomeElement(driver);
	}

	public boolean verifyLinkSignIn() {
		if(homeEle.linkSignIn.isEnabled()){
		wait.until(ExpectedConditions.visibilityOf(homeEle.linkSignIn));
		homeEle.linkSignIn.click();
		return true;
		}
		else
		{
			return false;
		}
	}

}

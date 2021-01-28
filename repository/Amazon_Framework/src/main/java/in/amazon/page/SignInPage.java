package in.amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import in.amazon.element.SignInElement;

public class SignInPage {
	
	WebDriver driver;
	SignInElement signInEle;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		signInEle = new SignInElement(driver);
	}
	
	public void verifyLinkSignIn() {
		Actions action = new Actions(driver);
		action.moveToElement(signInEle.navAccntList).perform();
		action.moveToElement(signInEle.linkSignIn).click().perform();
	}

}

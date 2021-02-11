package in.amazon.page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import in.amazon.element.SignInElement;

public class SignInPage {

	public WebDriver driver;
	WebDriverWait wait;
	public SignInElement signInEle;
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		signInEle =new SignInElement(driver);
		wait = new WebDriverWait(this.driver, 10);
	}
	
	public boolean verifyAmazonLogo() {
		if(signInEle.logoAmazon.isDisplayed()
				&& signInEle.logoAmazon.isEnabled()) {
			wait.until(ExpectedConditions.visibilityOf(signInEle.logoAmazon));
			signInEle.logoAmazon.click();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifyTitleAmazon() {
		if(signInEle.titleAmazon.isDisplayed()) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifyLabelInformation() {
		if(signInEle.labelInfo.isDisplayed()) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifyTextEmailIdAndButtonContinue() {
		if(signInEle.textEmailId.isEnabled()
				&& signInEle.buttonContinue.isEnabled()) {
			
			signInEle.textEmailId.sendKeys("9075796901");
			signInEle.buttonContinue.click();
			wait.until(ExpectedConditions.elementToBeClickable(signInEle.buttonContinue));
			return true;
		}
		else
		{
			return false;
		}
	}
}

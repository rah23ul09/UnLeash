package in.amazon.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInElement {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	public WebElement navAccntList;
	
	@FindBy(linkText = "Sign in")
	public WebElement linkSignIn;
	
	//span[@class='nav-action-inner']/ancestor::div[@id='nav-flyout-ya-signin']
	
	public SignInElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

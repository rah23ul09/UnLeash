package in.amazon.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInElement {

	public WebDriver driver;
	
	@FindBy(xpath = "//i[@class='a-icon a-icon-logo']")
	public WebElement logoAmazon;
	
	@FindBy(xpath = "//h1[contains(text(),'Sign-In')]")
	public WebElement titleAmazon;
	
	@FindBy(xpath = "//label[contains(text(),'Email or mobile phone number')]")
	public WebElement labelInfo;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	public WebElement textEmailId;
	
	@FindBy(xpath = "//input[@id='continue']")
	public WebElement buttonContinue;
	
	public SignInElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

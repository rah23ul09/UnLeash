package in.amazon.lib;

import org.openqa.selenium.WebDriver;

import in.amazon.page.SignInPage;

public class PageLib {
	
	private WebDriver driver;
	private SignInPage signInPage;
	
	public PageLib(WebDriver driver) {
		this.driver = driver;
		signInPage = new SignInPage(this.driver);
	}
	
	public SignInPage SignInPage() {
		return signInPage;
	}
}

package in.amazon.lib;

import org.openqa.selenium.WebDriver;

import in.amazon.page.HomePage;
import in.amazon.page.SignInPage;

public class PageLib {
	
	private WebDriver driver;
	private HomePage homePage;
	private SignInPage signInPage;
	
	public PageLib(WebDriver driver) {
		this.driver = driver;
		homePage = new HomePage(this.driver);
		signInPage = new SignInPage(this.driver);
	}
	
	public HomePage HomePage() {
		return homePage;
	}
	
	public SignInPage SignInPage() {
		return signInPage;
	}
}

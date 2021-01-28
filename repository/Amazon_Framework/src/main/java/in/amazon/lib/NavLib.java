package in.amazon.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class NavLib {

	private WebDriver driver;
	
	public NavLib(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigateToUrl(String url) {
		this.driver.get(url);
	}
	
	public void maxWindow() {
		this.driver.manage().window().maximize();
	}
	
	public void implicitWait() {
		this.driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MICROSECONDS);
	}
}

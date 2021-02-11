package in.amazon.lib;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavLib {

	 WebDriverWait wait;
	private WebDriver driver;

	public NavLib(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 10);
	}

	public void navigateToUrl(String url) {
		this.driver.get(url);
	}

	public void maxWindow() {
		this.driver.manage().window().maximize();
	}
	
	public String getCurrentPageTitle() {
		return this.driver.getTitle();
	}
	
	public String getCurrentPageUrl() {
		return this.driver.getCurrentUrl();
	}

	public void windowHandle() {
		String parentWindow = this.driver.getWindowHandle();
		/*Set<String> windows = this.driver.getWindowHandles();
		
		for(String window : windows) {
			if(!window.equals(parentWindow)){
				this.driver.switchTo().window(window);
			}
			
		}
		this.driver.switchTo().window(parentWindow);
		*/
		
		this.driver.switchTo().window(parentWindow);
	}
	
	public void implicitWait() {
		this.driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
	}	
}

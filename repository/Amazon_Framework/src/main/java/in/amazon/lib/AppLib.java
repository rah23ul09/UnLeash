package in.amazon.lib;

import org.openqa.selenium.WebDriver;

public class AppLib {

	private WebDriver driver;
	private PageLib page;
	private NavLib nav;
	//private MetLib met;
	
	public AppLib(WebDriver driver) {
		this.driver = driver;
		page = new PageLib(this.driver);
		nav = new NavLib(this.driver);
	}
	
	public PageLib Page() {
		return page;
	}
	
	public NavLib Nav() {
		return nav;
	}
	
}

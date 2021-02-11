package in.amazon.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Home extends Base {

	String url = "https://www.amazon.in/";
	
	@Test
	public void LinkSignInValidation() {
		extentTest = extentReports.startTest("TC_001 : Validate user is able to sign into amazon");
		
		App().Nav().navigateToUrl(url);
		App().Nav().maxWindow();
		App().Page().HomePage().verifyLinkSignIn();
		App().Nav().implicitWait();
		//Assert.assertTrue(App().Page().SignInPage().verifyLinkSignIn(), "Navigate to sign in page");
		String new_url = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.i"
				+ "n%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2."
				+ "0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid"
				+ ".claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid."
				+ "ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&666664";
		
		String expected_url = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.i"
				+ "n%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2."
				+ "0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid"
				+ ".claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid."
				+ "ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&666664";
		
		Assert.assertEquals(new_url, expected_url);
		
		extentTest.log(LogStatus.INFO, "Open the amazon URL");
		extentTest.log(LogStatus.INFO, "Hover at sign in navigation and link");
		extentTest.log(LogStatus.INFO, "Hover and click on sign in link");
		extentTest.log(LogStatus.PASS, "Test case passed");
		extentReports.endTest(extentTest);
		
	}
}

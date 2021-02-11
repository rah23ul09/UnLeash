package in.amazon.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class SignIn extends Base {
	private String url = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2F"
			+ "www.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2"
			+ "Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id="
			+ "http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns="
			+ "http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";

	@Test
	public void amazonLogoValidation() {
		extentTest = extentReports.startTest("TC_001: Logo amazon validation");

		App().Nav().navigateToUrl(url);
		App().Nav().maxWindow();
		Assert.assertTrue(App().Page().SignInPage().verifyAmazonLogo(), "Logo validation");
		App().Nav().implicitWait();

		String expected_Url ="https://www.amazon.in/ref=ap_frn_logo";
		String actual_Url = App().Nav().getCurrentPageUrl();
		Assert.assertEquals(actual_Url, expected_Url);

		extentTest.log(LogStatus.INFO, "Verify actual and expected amazon logo");
		extentTest.log(LogStatus.INFO, "Verify amazon logo is enabled and clicked");
		extentTest.log(LogStatus.INFO, "Verify valid is displayed after click");
		extentTest.log(LogStatus.PASS, "Test case passed");
		extentReports.endTest(extentTest);
	}

	@Test
	public void amazonTitleValidation() {
		extentTest = extentReports.startTest("TC_002: Title amazon validation");

		App().Nav().navigateToUrl(url);
		App().Nav().maxWindow();
		String expected_Title = "Amazon Sign In";
		String actual_Title = App().Nav().getCurrentPageTitle();
		Assert.assertEquals(actual_Title, expected_Title);

		extentTest.log(LogStatus.INFO, "Verify valid is displayed and matched");
		extentTest.log(LogStatus.PASS, "Test case passed");
		extentReports.endTest(extentTest);	
	}

	@Test
	public void informationLabelValidation() {
		extentTest = extentReports.startTest("TC_003: Information label validation");

		App().Nav().navigateToUrl(url);
		App().Nav().maxWindow();

		Assert.assertTrue(App().Page().SignInPage().verifyLabelInformation(), "Label must be displayed");
		App().Nav().implicitWait();

		extentTest.log(LogStatus.INFO, "Verify information label is displayed");
		extentTest.log(LogStatus.PASS, "Test case passed");
		extentReports.endTest(extentTest);
	}

	@Test
	public void textEmailAndButtonContinueValidation() {
		extentTest = extentReports.startTest("TC_004: Verify email id text box and continue button");

		App().Nav().navigateToUrl(url);
		App().Nav().maxWindow();
		App().Page().SignInPage().verifyTextEmailIdAndButtonContinue();
		App().Nav().implicitWait();
		App().Nav().windowHandle();
		extentTest.log(LogStatus.INFO, "Verify information label is displayed");
		extentTest.log(LogStatus.PASS, "Test case passed");
		extentReports.endTest(extentTest);
	}
}

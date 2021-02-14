package in.amazon.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import in.amazon.lib.AppLib;

public class Base {
	public  WebDriver driver;
	ChromeOptions option = new ChromeOptions();
	public ExtentReports extentReports;
	public ExtentTest extentTest;
	private AppLib app;
	
	public AppLib App() {
		return app;
	}
	
	@BeforeSuite
	public void reportStart() {
		extentReports = new ExtentReports(System.getProperty("user.dir")+"/src/test/resources/Reports/report.html",true);
	}
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		//BROWSER => chrome/firefox
		//HUB_HOST => localhost / 172.18.0.4 /hostname
		String host = "localhost";
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		if(System.getProperty("BROWSER")!= null 
				&& System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
			dc =DesiredCapabilities.firefox();
		}
		
		if(System.getProperty("HUB_HOST")!= null) {
			host = System.getProperty("HUB_HOST");
		}
		
		String completeUrl = "http://" + host + ":4444/wd/hub";
		this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
		
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		option.setBinary(System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");*/
		driver = new ChromeDriver();
		app = new AppLib(driver);
	}
	
	@AfterMethod
	public void screenshotReport(ITestResult result) throws Throwable {
		if(result.getStatus() == ITestResult.FAILURE)
			try {
				{
					extentTest.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
					extentTest.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
					//To capture screenshot path and store of the screenshot in the string "screenshotPath"
					//We do pass the path captured by this method in to the extent reports using "logger.addScreenCapture" method.
					String screershotPath = Base.getScreenShot(driver, result.getName());
					//To add it in extent report.
					extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screershotPath));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else if(result.getStatus() == ITestResult.SKIP){
			extentTest.log(LogStatus.SKIP, "Test case skipped is "+result.getName());
		}
	}
	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	@AfterSuite
	public void endReport() {
		extentReports.flush();
	}
	
	private static String getScreenShot(WebDriver driver, String screenshotName) throws IOException {
		//below line is to append the date format with the screenshot name to avoid duplicate name
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//after execution, folder is created for faied screenshot
		String destination = System.getProperty("user.dir")+"/FailedTestCasesScreenShots/"+screenshotName+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
}

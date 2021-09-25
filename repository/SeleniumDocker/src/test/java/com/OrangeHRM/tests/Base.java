package com.OrangeHRM.tests;

import com.OrangeHRM.Libs.AppLib;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Base {

    public static WebDriver driver;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;
    public final String url = "https://opensource-demo.orangehrmlive.com/";
    private AppLib appLib;

    @BeforeSuite(alwaysRun = true)
    public void startReport(){
        extentReports = new ExtentReports(System.getProperty("user.dir")+"/src/test/Report/report.html");
    }

    //Browser Setup
    @BeforeClass(alwaysRun = true)
    public void setUp(){
        //BROWSER => chrome/firefox
        ChromeOptions option = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        option.addArguments("--disable-dev-shm-usage", "--no-sandbox");
        capabilities.setCapability("applicationCacheEnabled", false);
        capabilities.setCapability(ChromeOptions.CAPABILITY, option);
        capabilities.setCapability("acceptInsecureCerts", true);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

        //selenium Webdriver setup
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/eclipse-workspace/DesignPatter/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
       // driver.get("chrome://settings/clearBrowserData");
       // driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
        appLib = new AppLib(driver);
    }

    //Capturing Screenshot for passed test cases
    public static String capturePassedScreenShots(WebDriver driver, String screenShotName) throws IOException {
        //Appending date format with the screenshot name to avoid duplicate
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        String passDestination = System.getProperty("user.dir") + "/PassedScreenShots/" + screenshot + dateName + ".png";
        ImageIO.write(screenshot.getImage(), "PNG", new File(passDestination));
        return passDestination;
    }

    //Capturing Screenshot for failed test cases
    public static String captureFailedScreenShots(WebDriver driver, String screenShotName) throws IOException {
        //Appending date format with the screenshot name to avoid duplicate
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        String failDestination = System.getProperty("user.dir") + "/FailedScreenShots/" + screenshot + dateName + ".png";
        ImageIO.write(screenshot.getImage(), "PNG", new File(failDestination));
        return failDestination;
    }

    //Attaching screenshot in the extent report
    @AfterMethod(alwaysRun = true)
    public void attachScreenShot(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.SUCCESS){
            extentTest.log(LogStatus.PASS, "Test Case is passed" +result.getName());
            String screenShotPath = Base.capturePassedScreenShots(driver, result.getName());
            //add screenshot to extent report
            extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(screenShotPath));
        }
        else if (result.getStatus() == ITestResult.FAILURE){
            extentTest.log(LogStatus.FAIL, "Test case is failed" +result.getName());
            extentTest.log(LogStatus.FAIL, "Test case failed is " +result.getThrowable());
            String screenShotPath = Base.captureFailedScreenShots(driver, result.getName());
            //add screenshot to extent report
            extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenShotPath));
        }
        else if (result.getStatus() == ITestResult.SKIP){
            extentTest.log(LogStatus.SKIP, "Test case is skipped" +result.getName());
        }
    }

    public AppLib App() {
        return appLib;
    }

    //Execution completed
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    //Reporting completed
    @AfterSuite(alwaysRun = true)
    public void endReport() {
        extentReports.flush();
    }
}

package test1.com;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test789 {

	public static ExtentReports extent;
	public ExtentTest test;
	@BeforeTest
	public void exec() throws Throwable {
		Test_Browser.init_Browser("https://ksah.in/introduction-to-chrome-headless/");
	}
	
	//@Parameters({ "browser" })
	@Test(priority = 1)
	public void test() throws Throwable {
		WebDriver driver=Test_Browser.driver;
		String extentReport="D:\\Ext\\ext.html";
		String extentImage="D:\\Ext\\ext.png";
		extent= new ExtentReports(extentReport, true);
		test=extent.startTest("My first Test");
	
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
        driver=new ChromeDriver(options);*/
		/*ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");
        WebDriver driver = new ChromeDriver(options);*/
		
		System.out.println(driver.getTitle());
		String expected="Google";
		String actual=driver.getTitle();

		try {
			Assert.assertEquals(actual, expected);
			test.log(LogStatus.PASS, "Title Verified");
		}
		catch(Exception e) {
			test.log(LogStatus.FAIL, "Title not Verified");
			test.addScreenCapture(extentImage);
		}
	}

	@AfterTest
	public void EndTest() {
		extent.endTest(test);
		extent.flush();
		//Test_Browser.close_Browser();
	}
}

package test1.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_Browser {
	public static WebDriver driver;
	
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Test_Practice\\Sample\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public static void init_Browser(String url) throws Throwable {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@AfterSuite
	public static void close_Browser() {
		driver.quit();
	}
}

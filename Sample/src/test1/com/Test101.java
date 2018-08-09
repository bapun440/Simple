package test1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test101 {
	@BeforeTest
	public void exec() throws Throwable {
		Test_Browser.init_Browser("https://www.seleniumhq.org/download/");
	}
	
	
	//@Parameters({ "browser" })
	@Test
	public void sts() throws Throwable {
		WebDriver driver=Test_Browser.driver;
		System.out.println(driver.getTitle());
		//WebElement ele=driver.findElement(By.xpath("//*[text()='Donate to Selenium']"));
		Thread.sleep(2000);
	}
	
	/*@AfterTest
	public void EndTest() {
		//Test_Browser.close_Browser();
	}*/


}

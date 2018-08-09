package test1.com;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test910 {
	
	@BeforeTest
	public void exec() throws Throwable {
		Test_Browser.init_Browser("https://google.co.in");
	}
	
	
	//@Parameters({ "browser" })
	@Test
	public void sts() throws Throwable {
		WebDriver driver=Test_Browser.driver;
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	/*@AfterTest
	public void EndTest() {
		//Test_Browser.close_Browser();
	}
*/
}

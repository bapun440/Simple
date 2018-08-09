package COM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	@Parameters({"Browser"})
	@Test
	
	public void Fun1(String user) {
		
		System.out.println("Fun1 Test"+user);
		//System.setProperty("webdriver.chrome.driver","D:\\geck\\geckodriver.exe");
		WebDriver driver1= new FirefoxDriver();
		driver1.close();
	}
	
	
@Parameters({"Browser"})
@Test
	
	public void Fun2(String pass) {
		
		System.out.println("Fun2 Test"+pass);
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver2= new ChromeDriver();
		driver2.close();
	}
}

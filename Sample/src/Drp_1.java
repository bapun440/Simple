import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Drp_1 {
	public static WebDriver driver;
	@Test
	public void htm() {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Test_Practice\\Sample\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Bhanu/drp.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"Drp\"]/option[1]"));
		String value=wb.getAttribute("value");
		System.out.println(driver.getTitle());
		System.out.println(value);
	}
}
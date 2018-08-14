import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slider {
	public static WebDriver driver;
	@Test
	public void slid() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Test_Practice\\Sample\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(5000);
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Blog']")).click();
		act.pause(11345l);
		
		driver.navigate().back();
		Thread.sleep(5000);
		//WebElement wb1=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		WebElement wb1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(wb1);
		Thread.sleep(5000);
		WebElement wb=driver.findElement(By.xpath("//*[@id='slider']/span"));
		
		act.moveToElement(wb).clickAndHold().dragAndDropBy(wb, 30, 0).build().perform();
		act.release();
	}
}

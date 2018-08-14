import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TextBox {
	public static WebDriver driver;
	@Test
	public void Entr() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Test_Practice\\Sample\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/24492795/how-to-enter-characters-one-by-one-in-to-a-text-field-in-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"wmd-input\"]"));
		Thread.sleep(5000);
		
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", wb);*/
		
		Thread.sleep(5000);
		wb.click();
		Thread.sleep(5000);
		List<String> list = new ArrayList<String>();
		 
	        //Adding values to the ArrayList
	        list.add("test1");
	        list.add("test2");
	        list.add("test3");
	        list.add("test4");
	        list.add("test5");
	        list.add("test6");
	        
	        Iterator itr = list.iterator();
	        while(itr.hasNext())
	        {
	        	String data = String.valueOf(itr.next());
	            wb.sendKeys(data);
	            wb.sendKeys(Keys.ENTER);
	            
	        }  
	        
	        /*List<Integer> nums2 = Arrays.asList(4,5,6);

	       // List<Integer> allNums = new ArrayList<Integer>();
	        //int size = allNums.size();
	        for (int i = 0; i < nums2.size(); i++) {
	        	wb.sendKeys(String.valueOf(i));
	            wb.sendKeys(Keys.ENTER);
	        }*/
	}
}

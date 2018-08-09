package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.listeners.MyListner;



public class Pom_Logn {
	WebDriver driver=MyListner.driver;
	@FindBy(name = "userName") WebElement username;
	@FindBy(how = How.NAME, using = "password") WebElement password;
	@FindBy(how = How.XPATH, using = "//input[@value='Login']") WebElement signin;
	@FindBy(how = How.XPATH, using = "//*[text()='REGISTER']") WebElement register;
	public Pom_Logn(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public void clickLogin() {
		username.sendKeys("askmail29");
		password.sendKeys("askmail29");
		signin.click();
	}
	public void clickRegister() {
		register.click();
	}
	public void loadWebPage(String url) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Test_Practice\\M_Practice\\Resourcseee\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}

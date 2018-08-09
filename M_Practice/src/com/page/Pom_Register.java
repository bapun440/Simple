package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Pom_Register  {
	
	@FindBy(xpath = "//input[@name='email']") WebElement email;
	@FindBy(xpath = "//input[@name='password']") WebElement password;
	@FindBy(css = "input[name='confirmPassword']") WebElement confirmPassword;
	@FindBy(name = "register") WebElement register;
	@FindBy(linkText = "SIGN-OFF") WebElement signoff;
	/*public Pom_Register(WebDriver driver) {
		super();
		this.driver = driver;
	}*/
	public void clickUserInfo() {
		email.sendKeys("askmail29");
		password.sendKeys("askmail29");
		confirmPassword.sendKeys("askmail29");
		register.click();
	}
	public void clickSignOff() {
		signoff.click();
	}
}

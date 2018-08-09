package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.listeners.MyListner;
import com.page.Pom_Logn;
import com.page.Pom_Register;
import com.relevantcodes.extentreports.LogStatus;


public class Regression extends MyListner{
	Pom_Logn mlp;
	Pom_Register mrp;
	@BeforeTest
	public void beforeTest() {
		WebDriver driver=MyListner.driver;
		mlp = PageFactory.initElements(driver, Pom_Logn.class);
		mrp = PageFactory.initElements(driver, Pom_Register.class);
	}
	
	@Test
	public void testMercuryTours() {
		System.out.println("in test method");
		mlp.loadWebPage("http://newtours.demoaut.com");
		mlp.clickRegister();
		mrp.clickUserInfo();
		driver.getTitle();
		mrp.clickSignOff();
		mlp.clickLogin();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Find a Flight: Mercury Tours:");
		test.log(LogStatus.INFO, "the test tours is passed");
	}

}

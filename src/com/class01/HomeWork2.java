package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.utels.CommonMethods;
import com.utels.ConfigsReader;

public class HomeWork2  extends CommonMethods{
	
	@BeforeMethod
	public void navigateBrowser() {
		setUp();
	}
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
	@Test
	public void ligin() {
	  WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("btnLogin")).click();
		boolean isDisplay=driver.findElement(By.id("spanMessage")).isDisplayed();
		if (isDisplay) {
			System.out.println("It is displayed");
		}else {
			System.out.println("it is not dispayed");
		}
		
	}

}

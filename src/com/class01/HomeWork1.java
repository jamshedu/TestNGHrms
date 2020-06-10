package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utels.CommonMethods;

public class HomeWork1 extends CommonMethods {
	
	@BeforeMethod
	public void openBrowser() {
		setUp();
	}
	
	@Test
	public void login() {
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		 WebElement pass=driver.findElement(By.id("txtPassword"));
		 pass.sendKeys("Hum@nhrm123");
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		boolean  isDisplayed=driver.findElement(By.xpath("//div[@id='branding']/a/img")).isDisplayed();
		if(isDisplayed) {
			System.out.println("The test Case is passed");
		}else {
			System.out.println("The test Case is failed");
		}
	}
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}

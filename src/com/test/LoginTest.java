package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utels.CommonMethods;
import com.utels.ConfigsReader;
import com.utels_1.DashboardPageElements;
import com.utels_1.LoginPageElements;

public class LoginTest extends CommonMethods{
	
	
	
	@BeforeMethod
	public void openBrowser() {
		setUp();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
//	@BeforeMethod
//	public void openBrowser() {
//		setUp();
//		initialize();
//	}
//	
//	@AfterMethod
//	public void closeBrowser() {
//		tearDown();
//	}

	@Test
	public void validAdminLogin() {
		//LoginPageElements login = new LoginPageElements();
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		DashboardPageElements db = new DashboardPageElements();
		//DashboardPageElements dashboard = new DashboardPageElements();
		String expectedUser="Welcome Admin";
		Object dashboard;
		//String actualUser=dashboard.welcome.getText();
		String actualUser1=db.welcome.getText();
		Assert.assertEquals(actualUser1, expectedUser, "Admin is NOT Logged in");
		Assert.assertTrue(actualUser1.contains(ConfigsReader.getProperty("username")));
	}

	@Test
	public void invalidPasswordLogin() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "uiuguig");
		click(login.loginBtn);

		String expected="Invalid credentials";
		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

	@Test(enabled=true)
	public void emptyUsernameLogin() {
		LoginPageElements login = new LoginPageElements();
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);

		String expected="Username cannot be empty";

		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text is not matched");
	}

	
	

}

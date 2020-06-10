package com.class02;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.utels.CommonMethods;
import com.utels.ConfigsReader;
import com.utels_1.DashboardPageElements;
import com.utels_1.LoginPageElements;

public class AddEmpolyee extends CommonMethods {

//	@BeforeMethod()
//	public void loginBrowser() {
//		setUp();// open browser
//		LoginPageElements login = new LoginPageElements();
//
//		boolean loginDisplayed = login.loginBtn.isDisplayed();
//		loginDisplayed = true;
//		// using hard assertion
//		// Assert.assertTrue(loginDisplayed,"login is not displayed");
//		// using soft assertion
//		SoftAssert soft = new SoftAssert();
//		soft.assertTrue(loginDisplayed, "login is not displayed");
//
//		sendText(login.username, ConfigsReader.getProperty("username"));
//		sendText(login.password, ConfigsReader.getProperty("password"));
//		click(login.loginBtn);
//
//		soft.assertAll();
//	}
//
//	
//
//	@Test
//	public void employeeAdd() throws InterruptedException {
//		DashboardPageElements dashbored= new DashboardPageElements();
//		moveHoverToElement(dashbored.PIM);
//		click(dashbored.AddEmployee);
//		Assert.assertTrue(dashbored.FullName.isDisplayed() && dashbored.EmployeeId.isDisplayed() && dashbored.Photograph.isDisplayed());
//		dashbored.employeeDatails("Conor", "McGregor");
//		String expected="Conor McGregor";
//		String filePath="/Users/dzhamshedumarov/Desktop/Conar.jpeg";
//		dashbored.chooseFile.sendKeys(filePath);
//		dashbored.save.click();
//		Thread.sleep(3000);
//		
//		
//		//Assert.assertEquals(dashbored.verefy.getText(), expected);
//	}
//	@AfterMethod
//	public void closeBrowser() {
//		 tearDown();
//	}
//	

}

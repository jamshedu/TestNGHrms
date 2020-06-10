package com.class04;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utels.CommonMethods;
import com.utels.ConfigsReader;

public class HW extends CommonMethods {

	@Test(dataProvider = "userData")
	public void test(String firstName, String lastName, String username, String password) {
		// System.out.println(firstName + " " + lastName + " " + username + " " +
		// password);

		// login into HRMS
		loginTest.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));

		// navigate to Add Employee page
		dashboard.navigateToAddEmployee();
		wait(1);

		// add employee information
		sendText(addEmp.FirstName, firstName);
		sendText(addEmp.lastname, lastName);
		// get EmployeeID
		String expectedEmpId = addEmp.employeeId.getAttribute("value");

		// click on Create Login Details
		 //click(addEmp.checkboxLoginDetails);
		dashboard.navigateToAddEmployee();
		wait(1);
		sendText(addEmp.creditUserName, username);
		sendText(addEmp.creditPassWord, password);
		sendText(addEmp.credReEnterPassWord, password);
		wait(1);
		click(addEmp.buttonSave);
		wait(1);

		// validation
		waitForVisibility(pdetails.natiinaleDD);
		String actualEmpId = addEmp.employeeId.getAttribute("value");
		Assert.assertEquals(actualEmpId, expectedEmpId, "Employee ID did not match!");

		// take screeshot
		screenShotObject(firstName + "_" + lastName);
	}

	@DataProvider(name = "userData")
	public Object[][] getData() {
		Object[][] data = { { "Raj", "Capoor", "raj1237", "AmirKhan_@123" },
				{ "John", "Smith", "john1238", "AmirKhan_@123" }, { "Mary", "Ann", "mary1239", "AmirKhan_@123" },
				{ "Rohani", "Sakhi", "rohani1236", "AmirKhan_@123" },
				{ "Ali", "Tarlaci", "ali1230", "AmirKhan_@123" }, };
		return data;
	}

}

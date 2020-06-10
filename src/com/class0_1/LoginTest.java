package com.class0_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utels.CommonMethods;
import com.utels.ConfigsReader;
import com.utels_1.DashboardPageElements;

public class LoginTest extends CommonMethods {

	@Test(dataProvider = "userData")
	public void validLogin(String name, String lastNM, String email, String passwD) {
		// login into HRMS
		loginTest.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmployee();
		wait(2);
		//click in PIM
		dashboard.navigateToAddEmployee();
		// add employee info
		sendText(employee.firstName, name);
		sendText(employee.lastName, lastNM);
		// get id value
		String expectedValue = employee.employeeID.getAttribute("value");
		System.out.println(expectedValue);
		//click in the checking box
		click(employee.chkBox);
		wait(2);
		// send userName and password
		sendText(employee.userName, email);
        sendText(employee.passWordD, passwD);
        sendText(employee.confirmPSWD,passwD);
        //click in the save buttom
        jsClick(employee.btnSave);
        wait(5);
	}

	@DataProvider(name = "userData")
	public Object[][] getData() {

		Object[][] data = { { "Raj", "Capoor", "raj1237", "AmirKhan_@123" },
				{ "John", "Smith", "john1238", "AmirKhan_@123" }, { "Mary", "Ann", "mary1239", "AmirKhan_@123" },
				{ "Rohani", "Sakhi", "rohani1236", "AmirKhan_@123" },
				{ "Ali", "Tarlaci", "ali1230", "AmirKhan_@123" },
		};
		return data;
	}

}

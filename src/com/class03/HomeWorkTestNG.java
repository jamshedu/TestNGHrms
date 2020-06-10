package com.class03;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utels.CommonMethods;
import com.utels.ConfigsReader;

public class HomeWorkTestNG extends CommonMethods{
	
	@Test(dataProvider = "getData")
	public void addEmployee(String firstName,String lastName,String userName,String passWord,String confirmPass,
			String screenShot)  {
		
		loginTest.login(ConfigsReader.getProperty("username"),ConfigsReader.getProperty("password"));	
	dashboard.navigateToAddEmployee();
	sendText(addEmp.FirstName,firstName );
	sendText(addEmp.lastname, lastName);
	//String expected=addEmp.displayId.getAttribute("value");
	click(addEmp.cridentialsButtom);
	sendText(addEmp.creditUserName, userName);
	sendText(addEmp.creditPassWord, passWord);
	sendText(addEmp.credReEnterPassWord, confirmPass);
	//Thread.sleep(5000);
	click(addEmp.buttonSave);
	String expectedValue=firstName+" "+lastName;
	Assert.assertEquals(addEmp.profilePic.getText(), expectedValue);
	wait(3);
	
	screenShotObject(screenShot);
	
	}
	@DataProvider
	public Object [][] getData() {
		
		
		Object [][]data= {
				{"John","Smith","John1899","John1988$99@S","John1988$99@S","screenshots/HRMS/image1.png"},
				{"Nick","Alex","Nick2020","Nick2020@88$","Nick2020@88$","screenshots/HRMS/image2.png"},
				{"Ali","Malik","AliMalik99","AliMalik99@99","AliMalik99@99","screenshots/HRMS/image3.png"},
				{"Mansur","Mahbub","Mahbub000","Mansur&&88$","Mansur&&88$","screenshots/HRMS/image4.png"},
				{"Firdavs","Rasulov","Rasulov88","Firdavs88$99","Firdavs88$99","screenshots/HRMS/image5.png"}};
		return data;
	}
	
	

}

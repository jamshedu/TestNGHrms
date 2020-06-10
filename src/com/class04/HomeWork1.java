package com.class04;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utels.CommonMethods;
import com.utels.ConfigsReader;
import com.utels.ExcelUtility;

public class HomeWork1  extends CommonMethods{
	
	@Test(dataProvider="userDataFromExce",groups= {"homework","addEmp","regression"})
	public void test1(String firstNm,String lastNm,String userNm,String passWord,String confirmPass,String screenShots) {
		System.out.println(firstNm+""+lastNm+""+userNm+""+passWord);
		
		loginTest.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		
		dashboard.navigateToAddEmployee();
		wait(2);
		//add employee information
		sendText(addEmp.FirstName, firstNm);
		sendText(addEmp.lastname, lastNm);
		//get employee id
		String expected=addEmp.employeeId.getAttribute("value");
		
		
		click(addEmp.cridentialsButtom);
		wait(2);
		
		sendText(addEmp.creditUserName, userNm);
		sendText(addEmp.creditPassWord, passWord);
		sendText(addEmp.credReEnterPassWord,confirmPass );
		wait(2);
		click(addEmp.buttonSave);
		wait(2);
		waitForVisibility(pdetails.natiinaleDD);
		String expectedID=pdetails.employeeId.getAttribute("value");
		Assert.assertEquals(expectedID, expected,"Employee ID didtn match");
		screenShotObject(screenShots);
		
		
	}
	
	
	
	@DataProvider(name = "userData")
	public Object [][]getData1(){
		Object[][] data= {
				{"James","Umarov","James1988@mail.ru","James88#99$","James88#99$"},
				{"John","Smith","John88@gmail.com","John&&7788$","John&&7788$"},
				{"Mike","Mekhail","Mike99","Mike**33$$","Mike**33$$"},
				
				};
		return data;
	}
	@DataProvider(name = "userDataFromExce")
	public Object [][] getData2(){
	return	ExcelUtility.excelIntoArray(System.getProperty("user.dir")+"/testdata/TestData.xlsx","Sheet4");
	}

}

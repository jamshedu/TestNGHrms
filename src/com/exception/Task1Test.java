package com.exception;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utels.CommonMethods;

public class Task1Test extends CommonMethods{
	
	
	
	@DataProvider(name = "dataProvider")
	public Object [][] setUpData(){
		
		Object [][] data=new Object[4][2];
		
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
		
		data[1][0]="problem_user";
		data[1][1]="secret_sauce";
		
		data [2][0]="performance_glitch_user";
		data[2][1]="secret_sauce";
		
		data[3][0]="locked_out_user" ;
		data[2][1]="secret_sauce";
		return data;
				
	}
	
	
	
	@Test(dataProvider="dataProvider")
	public void loginTosauceDemo(String username,String password) {
		sendText(test.userName,username);
		sendText(test.passWord, password);
		click(test.loginButton);
		wait(3);
		if (username.equals("locked_out_user")) {
			Assert.assertTrue(test.errorMsg.isDisplayed());
		}else {
			
		}
	}

}

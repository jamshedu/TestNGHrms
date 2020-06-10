package com.class0_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utels.BaseClass;
import com.utels.CommonMethods;

public class LoginPage extends CommonMethods {
	
	@FindBy(id = "txtUsername")
	public WebElement userName;
	
	@FindBy(id = "txtPassword")
	public WebElement passWord;
	
	@FindBy(id = "btnLogin")
	public WebElement liginButton;
	
	
	public void senduserNmae(String uid) {
		sendText(userName, uid);
			
	}
	public WebElement getNameOfUserName() {
		return userName;
	}
	public void loginPageElement(String userNM,String passWD) {
		
		
		sendText(userName, userNM);
		sendText(passWord, passWD);
		click(liginButton);
	}
	
	
		
		

}



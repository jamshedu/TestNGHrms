package com.class0_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.utels.BaseClass;
import com.utels.CommonMethods;

public class AddEmployee  extends CommonMethods{
	
	@FindBy(id = "welcome")
	public WebElement welcomeAdmin;
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement clickPIM;
	//Employee List
//	@FindBy(xpath = "Employee List")
//	public WebElement EmployeeList;
//	
	@FindBy(xpath = "//a[text()='Add Employee']")
	public WebElement addEmployee;
	
	@FindBy(id = "firstName")
	public WebElement firstName;
	
	@FindBy(id = "lastName")
	public WebElement lastName;
	
	@FindBy(id = "employeeId")
	public WebElement employeeID;
	
	@FindBy(id = "chkLogin")
	public WebElement chkBox;
	
	@FindBy(id = "user_name")
	public WebElement userName;
	
	@FindBy(id = "user_password")
	public WebElement passWordD;
	
	@FindBy(id = "re_password")
	public WebElement confirmPSWD;
	
	@FindBy(id = "btnSave")
	public WebElement btnSave;
	
	
	public AddEmployee() {
		PageFactory.initElements(BaseClass.driver,this);
	}
//	public void senduserNmae(String uid) {
//		sendText(userName, uid);
//			
//	}
//	public WebElement getNameOfUserName() {
//		return userName;
//	}
//	public void loginPageElement(String userNM,String passWD) {
//		
//		
//		sendText(userName, userNM);
//		sendText(passWordD, passWD);
//		
//	}
	

}

package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utels.BaseClass;
import com.utels.CommonMethods;

public class AddEmployeePageElements extends CommonMethods{
	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement Pim;
	
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmployee;
	
	@FindBy(xpath = "//label[@class='hasTopFieldHelp']")
	public WebElement nameDisplayed;
	
	@FindBy(xpath = "//label[@for='employeeId']")
	public WebElement displayId;
	
	@FindBy(xpath = "//label[text()='Photograph']")
	public WebElement Photograph;
	
	@FindBy(css = "input#firstName" )
	public WebElement FirstName;
	
	@FindBy(id = "lastName")
	public WebElement lastname;
	
	@FindBy(id = "employeeId")
	public WebElement employeeId;
	
	@FindBy(xpath = "//input[@id='photofile']")
	public WebElement chooseFile;
	
	@FindBy(id = "profile-pic")
	public WebElement profilePic;
	
	@FindBy(id = "btnSave")
	public WebElement save;
	
	@FindBy(id = "chkLogin")
	public WebElement cridentialsButtom;
	
	@FindBy(id ="user_name" )
	public WebElement creditUserName;
	
	@FindBy(id = "user_password")
	public WebElement creditPassWord;
	
	@FindBy(id = "re_password")
	public WebElement credReEnterPassWord;
	
	@FindBy(xpath = "//span[@for='firstName']")
	public WebElement reqFirstName;
	
	@FindBy(xpath = "//span[@for='lastName']")
	public WebElement reqLastName;
	
	@FindBy(id = "btnSave")
	public WebElement buttonSave;
	
//	@FindBy(id = "employeeId")
//	public WebElement employeeId;

	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	

}

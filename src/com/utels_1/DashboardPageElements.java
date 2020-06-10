package com.utels_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utels.BaseClass;
import com.utels.CommonMethods;

public class DashboardPageElements extends CommonMethods{
	
	
	
	
	
	@FindBy(id = "welcome")
	public WebElement welcome;

	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
	public WebElement logo;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;

	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement PIM;

	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);
	}
	
//	@FindBy(id = "welcome")
//	public WebElement welcome;
//	
//	@FindBy(xpath = "//div[@id='branding']/a[1]/img")
//	public WebElement logo;
//	
//	
//	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
//	public WebElement Pim;
//	
//	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
//	public WebElement addEmployee;
//	
//	@FindBy(xpath = "//label[@class='hasTopFieldHelp']")
//	public WebElement FullName;
//	
//	@FindBy(xpath = "//label[@for='employeeId']")
//	public WebElement firstName;
//	
//	@FindBy(xpath = "//label[text()='Photograph']")
//	public WebElement Photograph;
//	
//	@FindBy(css = "input#firstName" )
//	public WebElement FirstName;
//	
//	@FindBy(id = "lastName")
//	public WebElement lastname;
//	
//	@FindBy(xpath = "//input[@id='photofile']")
//	public WebElement chooseFile;
//	
//	@FindBy(id = "btnSave")
//	public WebElement save;
//	
//	
//
//	public DashboardPageElements() {
//		PageFactory.initElements(BaseClass.driver, this);
//	}
//	
//	public void employeeDatails(String firsN, String lastN) {
//	CommonMethods.sendText(firstName, firsN);
//	CommonMethods.sendText(lastname, lastN);
//		
//	}

}

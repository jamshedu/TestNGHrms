package com.class02;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeWork {
	
	
	
	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	public WebElement Pin;
	
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement AddEloyee;
	
	@FindBy(xpath = "//label[@class='hasTopFieldHelp']")
	public WebElement FullName;
	
	@FindBy(xpath = "//label[@for='employeeId']")
	public WebElement EmploeeId;
	
	@FindBy(xpath = "//label[text()='Photograph']")
	public WebElement Photograph;
	
	@FindBy(css = "input#firstName" )
	public WebElement firstName;
	
	@FindBy(id = "lastName")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@id='photofile']")
	public WebElement chooseFile;
	
	@FindBy(id = "btnSave")
	public WebElement save;
	
	

}

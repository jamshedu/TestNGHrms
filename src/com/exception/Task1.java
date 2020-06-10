package com.exception;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utels.BaseClass;
import com.utels.CommonMethods;

public class Task1 extends CommonMethods {

	@FindBy(id = "user-name")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement passWord;

	@FindBy(xpath = "//input[@class='btn_action']")
	public WebElement loginButton;

	@FindBy(xpath = "//h3[@data-test='error']")
	public WebElement errorMsg;
	
	
	
	public Task1() {

		PageFactory.initElements(BaseClass.driver, this);

	}

}

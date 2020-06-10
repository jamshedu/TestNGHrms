package com.class0_1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utels.BaseClass;

public class PersonalDetails {
	
	
	
	
	@FindBy(id = "personal_cmbNation")
	public WebElement personNationality;
	
	@FindBy(name = "personal[cmbNation]")
	public List<WebElement> genderRadioGroup;
	
	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
    public WebElement personalDetails;
	
	
	
	public PersonalDetails () {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}

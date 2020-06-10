package com.utels_1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utels.BaseClass;

public class PersonalDetailsPageElements {
	
	
	@FindBy(id="personal_cmbNation")
	public WebElement natiinaleDD;
	
	@FindBy(name="personal[optGender]")
    public List<WebElement>genderRad;
	
	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;

	
	public PersonalDetailsPageElements() {
		
		PageFactory.initElements(BaseClass.driver, this);
	}
}

package com.utels;

import com.class0_1.AddEmployee;
import com.class0_1.PersonalDetails;
import com.exception.Task1;
import com.page.AddEmployeePageElements;
import com.utels_1.DashboardPageElements;
import com.utels_1.LoginPageElements;
import com.utels_1.PersonalDetailsPageElements;

public class PageInitializer extends BaseClass{
	
	public static LoginPageElements loginTest;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static Task1 test;
	public static AddEmployee employee;
	public static PersonalDetails detailsPage;
	public static void initialize() {
		
		loginTest=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		employee=new AddEmployee();
		test=new Task1();
		detailsPage=new PersonalDetails();
				
	}
	
	
}

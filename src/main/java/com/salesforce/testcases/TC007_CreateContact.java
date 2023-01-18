package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC007_CreateContact extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateContact";
		testDescription ="Verify the contact created with positive data";
		authors="Hari";
		category ="Smoke";
		excelFileName="CreateContact";
		
	}
	
	@Test( dataProvider = "fetchData")
	public void runCreateContact(String fname,String lname) {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.typeSales()
		.clickSales()
		.clickContact()
		.clickNewContact()
	    .selectSalutation()
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickSave()
		.verifyToastMeassage();
	}

}

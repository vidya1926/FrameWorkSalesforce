package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC003_EditIndividuals extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_002_Edit Individuals";
		testDescription ="Verify Individuals are edited";
		authors="Ranjini";
		category ="Individuals";
		excelFileName="EditIndividuals";
		
	}
	
	@Test( dataProvider = "fetchData")
	public void runLogin(String search,String fName,String lName) {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSearchField(search)
		.clickIndividualsLink()
		.clickShowActionDD()
		.clickEditLink()
		.selectSalutation()
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSaveButton()
		.verifyEditIndividuals(fName);
		
	}


}

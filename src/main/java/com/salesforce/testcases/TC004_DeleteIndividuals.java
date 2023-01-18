package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC004_DeleteIndividuals extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC_003_Delete Individuals";
		testDescription ="Verify Individuals are deleted";
		authors="Ram";
		category ="Individuals";
		excelFileName="DeleteIndividuals";
		
		
	}
	
	@Test( dataProvider = "fetchData")
	public void runLogin(String search,String name,String verifyMsg) {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.enterSearchField(search)
		.clickIndividualsLink()
		.enterIndividualSearchField(name)
		.clickShowActionDD()
		.clickDeleteLink()
		.clickPoupDeleteButton()
		.verifyDeleteIndividuals(verifyMsg);
		
	

	}

}

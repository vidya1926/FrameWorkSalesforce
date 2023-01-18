package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC008_EditContact extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "EditContact";
		testDescription ="Verify the updated contact";
		authors="Hari";
		category ="Smoke";
		excelFileName="EditContact";
		
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateContact(String contactName,String phno) {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.typeSales()
		.clickSales()
		.clickContact()
		.searchContact(contactName)
		.selectEdit()
		.clickDropdown()
		.clickEdit()
		.enterPhoneNumber(phno)
		.clickSaveOnEdit()
		.verifyToastMessage();
	}

}

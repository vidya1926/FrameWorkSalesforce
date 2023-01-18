package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC009_CreateTasks extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC01_CreateTasks";
		testDescription ="Verify Login functionality with positive data";
		authors="Easwar";
		category ="Smoke";
		excelFileName="CreateNewTask";
	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateTasks(String subject,String status,String verifyText) {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.clickSales()
		.clickTasksTab()
		.clickNewTask()
		.enterSubject(subject)
		.selectContact()
		.selectStatus(status)
		.clickSaveButton()
		.verifyTasksCreated(verifyText);

	}

}

package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC011_DeleteTasks extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC02_EditTasks";
		testDescription ="Verify Login functionality with positive data";
		authors="Easwar";
		category ="Smoke";
		excelFileName="DeleteTask";
	}
	
	@Test(dataProvider = "fetchData")
	public void runDeleteTasks(String text) {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickAppLauncher()
		.clickViewAll()
		.clickSales()
		.clickTasksTab()
		.selectRecentlyViewed()
		.selectTableView()
		.clickEditDropdown()
		.clickDeleteButton()
		.verifyTaskDeleted(text);

	}

}

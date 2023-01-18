package com.salesforce.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.salesforce.pages.LoginPage;

public class TC010_EditTasks extends ProjectSpecificMethods{
	@BeforeTest
	public void setValues() {
		testcaseName = "TC02_EditTasks";
		testDescription ="Verify Login functionality with positive data";
		authors="Easwar";
		category ="Smoke";
		excelFileName="EditTask";
	}
	
	@Test(dataProvider = "fetchData")
	public void runEditTasks(String priority,String text) {
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
		.clickEditButton()
		.enterDate(1)
		.selectPriority(priority)
		.clickSaveEditButton()
		.verifyEditIsSaved(text);

	}

}

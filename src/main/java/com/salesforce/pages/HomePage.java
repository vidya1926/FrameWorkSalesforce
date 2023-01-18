package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[text()='Home']"));
		reportStep("Homepage is loaded", "pass");
		return this;
	}

	public HomePage clickAppLauncher() {

		click(locateElement(Locators.XPATH, "//div[@class='slds-icon-waffle']"));
		reportStep("Toggle Menu button clicked successfully", "pass");
		return this;
	}

	public HomePage clickViewAll() {

		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("View All link clicked successfully", "pass");
		return this;
	}

	public HomePage enterSearchField(String search) {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']"), search);
		reportStep("Search Field entered successfully", "pass");
		return this;
	}

	public IndividualsPage clickIndividualsLink() {

		click(locateElement(Locators.XPATH, "//mark[text()='Individuals']"));
		reportStep("Individuals link clicked successfully", "pass");
		return new IndividualsPage();
	}
	
	public WorkTypeGroupPage clickWorkTypeGroupLink() {

		click(locateElement(Locators.XPATH, "//mark[text()='Work Type']"));
		reportStep("Work Type Groups link clicked successfully", "pass");
		return new WorkTypeGroupPage();
	}

	public HomePage clickSales() {
		click(locateElement(Locators.XPATH, "(//p[@class='slds-truncate']/mark[text()='Sales'])[3]"));
		reportStep("Sales is clicked sucessfully", "pass");
		return this;
	}
	
	public TasksPage clickTasksTab() {
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Tasks']"));
		reportStep("Tasks Tab is clicked sucessfully", "pass");
		return new TasksPage();
	}
	
	public HomePage typeSales() {
		typeAndEnter(locateElement(Locators.XPATH, "//div[contains(@class,'slds-form-element__control slds-grow')]//input[1]") ,"Sales");
		reportStep("Search for sales is done successfully", "pass");

		return this;
		
	}
	
	public ContactPage clickContact() {
		
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='Contacts']"));
		reportStep("Clicked Contacts Successfully", "pass");

	    		 return new ContactPage();
	}
		
	
}

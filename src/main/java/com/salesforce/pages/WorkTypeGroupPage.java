package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class WorkTypeGroupPage extends ProjectSpecificMethods {

	public WorkTypeGroupPage clickWorkTypeGroupTab() {

		click(locateElement(Locators.XPATH, "//span[contains(text(),'Work Type Groups')]/following::a[1]"));
		reportStep("Work Type Tab DD is clicked successfully", "pass");
		return this;
	}
	
	public WorkTypeGroupPage clickNewWorkTypeGroup() {

		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='New Work Type Group']"));
		reportStep("New Work Type Group is clicked successfully", "pass");
		return this;
	}
	
	public WorkTypeGroupPage enterWorkTypeGroupName(String gName) {
		clearAndType(locateElement(Locators.XPATH, "(//span[text()='Work Type Group Name']/following::input[1])[2]"), gName);
		reportStep(gName + "Work Type Group Name entered successfully", "pass");
		return this;
	}
	
	public WorkTypeGroupPage enterWorkTypeDesc(String desc) {
		clearAndType(locateElement(Locators.XPATH, "//span[text()='Description']/following::textarea[1]"), desc);
		reportStep(desc + "Description entered successfully", "pass");
		return this;
	}
	
	public WorkTypeGroupPage selectGroupType() {

		click(locateElement(Locators.XPATH, "//span[text()='Group Type']/following::a[1]"));
		click(locateElement(Locators.XPATH, "//a[text()='Capacity']"));
		reportStep( "Capacity selected successfully", "pass");
		return this;
	}
	
	public WorkTypeGroupPage clickWorkTypeSaveButton() {

		click(locateElement(Locators.XPATH, "//button[@title='Save']"));
		reportStep("Save Button clicked successfully", "pass");
		return this;
	}
	
	public WorkTypeGroupPage verifyWorkTypeGroups(String text) {
		verifyPartialText(locateElement(Locators.XPATH,
				"//div[@class='slds-align-middle slds-hyphenate']//span"), text);
		reportStep(text + "Work Type Created Successfully", "pass");
		return this;
	}
	
	public WorkTypeGroupPage enterWorkTypeSearchField(String search) {
		typeAndEnter(locateElement(Locators.XPATH, "//input[@placeholder='Search this list...']"), search);
		reportStep(search + "Search Field entered successfully", "pass");
		return this;
	}
	
	public WorkTypeGroupPage clickShowActionDD() {

		click(locateElement(Locators.XPATH,
				"//div[@class='forceVirtualActionMarker forceVirtualAction']/a[@role='button']"));
		reportStep("Show Actions DD clicked successfully", "pass");
		return this;
	}
	
	public WorkTypeGroupPage clickEditLink() {

        click(locateElement(Locators.XPATH, "//a[@title='Edit']"));
        reportStep("Edit Link is clicked successfully", "pass");
        return this;
    }
	

}

package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditContactPage extends ProjectSpecificMethods {

	public EditContactPage clickDropdown() {

		clickUsingJs(locateElement(Locators.XPATH, "//span[@class='slds-icon_container slds-icon-utility-down']/span"));
		reportStep("Clicked dropdown Successfully", "pass");
		return this;

	}

	public EditContactPage clickEdit() {        
		clickUsingJs(locateElement(Locators.XPATH, "//a[@title='Edit']//div"));
		reportStep("Clicked Edit Successfully", "pass");

		return this;

	}

	public EditContactPage enterPhoneNumber(String Phno) {
		typeAndEnter(locateElement(Locators.XPATH, "//input[@name='Phone']"), Phno);
		reportStep("Entered "+Phno+"successfully ", "pass");

		return this;

	}

	public VerifyEditContactPage clickSaveOnEdit() {
		click(locateElement(Locators.XPATH, "//button[text()='Save']"));
		reportStep("Clicked Save button Successfully", "pass");

		return new VerifyEditContactPage();

	}

}

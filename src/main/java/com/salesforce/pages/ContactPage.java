package com.salesforce.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class ContactPage extends ProjectSpecificMethods {

	public CreateContactPage clickNewContact() {
		click(locateElement(Locators.XPATH, "//div[text()='New']"));
		reportStep("Cliked New button Successfully", "pass");

		return new CreateContactPage();
	}
	
	
	public ContactPage searchContact(String contactName) {
		
		typeAndEnter(locateElement(Locators.XPATH, "(//input[@type='search'])[2]"), contactName);
		reportStep("Search for Existing Contact is Successful", "pass");

			return this;
	}
     public EditContactPage selectEdit() {
		pause(3000);
		click(locateElement(Locators.XPATH, "//span[@class='slds-icon_container slds-icon-utility-down']/span"));
		reportStep("Edit Contact is selelcted Successfully", "pass");
	
		return new EditContactPage();
	}

	
}

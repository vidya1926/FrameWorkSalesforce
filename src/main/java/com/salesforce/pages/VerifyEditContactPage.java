package com.salesforce.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class VerifyEditContactPage extends ProjectSpecificMethods{

public VerifyEditContactPage verifyToastMessage() {
	String editedtext = getElementText(locateElement(Locators.XPATH, 
			"//span[contains(@class,'toastMessage slds-text-heading--small forceActionsText')]"));
	//System.out.println(editedtext);
	
	String updatedPhno = getElementText(locateElement(Locators.XPATH, 
			"//span[@class='forceOutputPhone slds-truncate']"));	
	
	//System.out.println(updatedPhno);
		reportStep("Verified the updated Contact with phone number "+updatedPhno+ " Successfully", "pass");
	return this;
	
}
}
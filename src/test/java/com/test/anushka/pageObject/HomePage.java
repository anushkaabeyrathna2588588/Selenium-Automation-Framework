package com.test.anushka.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;

	public HomePage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(id = "customer_login_link")
	@CacheLookup
	WebElement addinbutton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/main/div/div/div[2]/div/p/a")
	@CacheLookup
	WebElement viewAddresses;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/main/div/div[1]/div[2]/div/p/button")
	@CacheLookup
	WebElement addNewAdresses;

	public void clikAddSubmit() {
		addinbutton.click();

	}
	
	public void clikViewAddressSubmit() {
		viewAddresses.click();

	}
	
	public void clikaddNewAdressesSubmit() {
		addNewAdresses.click();

	}
	
	
	

}

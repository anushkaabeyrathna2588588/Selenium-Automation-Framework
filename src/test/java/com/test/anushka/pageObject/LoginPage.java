package com.test.anushka.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(how = How.ID, using = "CustomerEmail")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(how = How.ID, using = "CustomerPassword")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(how = How.XPATH, using = "//*[@id=\"customer_login\"]/p[1]/input")
	@CacheLookup
	WebElement loginbutton;

	public void setEmail(String nemail) {
		txtEmail.sendKeys(nemail);

	}

	public void setPassword(String npassword) {
		txtPassword.sendKeys(npassword);

	}

	public void clikSubmit() {
		loginbutton.click();

	}

}

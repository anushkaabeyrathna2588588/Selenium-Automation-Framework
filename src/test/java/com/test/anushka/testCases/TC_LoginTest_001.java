package com.test.anushka.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.test.anushka.pageObject.HomePage;
import com.test.anushka.pageObject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException {

		
		HomePage homePage =  new HomePage(driver);
		homePage.clikAddSubmit();
		
		logger.info("URL is opened");

		LoginPage loginPage = new LoginPage(driver);

		loginPage.setEmail(username);

		logger.info("Enter Username");

		loginPage.setPassword(password);

		logger.info("Enter Password");

		loginPage.clikSubmit();
		
		logger.info("clikSubmit");
		
		captureScreen(driver, "loginTest");

	}

}

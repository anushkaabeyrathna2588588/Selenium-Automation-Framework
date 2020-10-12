package com.test.anushka.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.test.anushka.pageObject.HomePage;
import com.test.anushka.pageObject.LoginPage;

public class TC_AddNewAdressTest_002 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException, IOException {

		
		HomePage homePage =  new HomePage(driver);
		homePage.clikAddSubmit();
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.setEmail(username);
		logger.info("Enter Username");

		loginPage.setPassword(password);
		logger.info("Enter Password");

		loginPage.clikSubmit();
		logger.info("clikSubmit");

		
		homePage.clikViewAddressSubmit();
		logger.info("clikViewAddressSubmit");
		
		homePage.clikaddNewAdressesSubmit();
		logger.info("clikaddNewAdressesSubmit");
		
		
		captureScreen(driver, "testAddNewAddress");
	
	}
}

package com.test.anushka.testCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.test.anushka.utilities.ReadConfig;

public class BaseClass {

	ReadConfig config = new ReadConfig();

	public String baseURL = config.getApplicationURL();
	public String username = config.getUsername();
	public String password = config.getPassword();
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {

		logger = Logger.getLogger("ANF");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", config.getChromePath());
			driver = new ChromeDriver();

		} else if (br.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", config.getFirefoxPath());
			driver = new FirefoxDriver();

		} else if (br.equals("ie")) {

			System.setProperty("webdriver.ie.driver", config.getIEPath());
			driver = new InternetExplorerDriver();

		}

		driver.get(baseURL);

	}

	@AfterClass
	public void tearDown() {

		driver.quit();

	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}

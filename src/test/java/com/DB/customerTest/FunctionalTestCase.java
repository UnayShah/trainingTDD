package com.DB.customerTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTestCase {

	// Made static because accessing in beforeTest function, which needs to be
	// static as function called only once. No need to make this WebDriver static
	// otherwise
	static WebDriver webDriver;
	static String searchQuery = "youtube";

	@BeforeClass
	public static void beforeTest() {

		// Change chrome webdriver path here
		// Set path according to your PC" 
		String chromeWebDriverPath = "E:\\Downloads\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeWebDriverPath);
		webDriver = new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		webDriver.manage().deleteAllCookies();
		webDriver.manage().window().fullscreen();
		
	}

	@Test
	public void checkTitleOfGoogleWebsite() {
		assertNotNull(webDriver);

		String expectedValue = searchQuery + " - Google Search";

		// Navigate to google.com
		webDriver.navigate().to("https://www.google.com");

		// type in google search bar
		// google search bar has name "q"
		webDriver.findElement(By.name("q")).sendKeys(searchQuery);

		// click the search button
		// the search button has name "btnk"
		webDriver.findElement(By.name("btnK")).click();

		// gets the title of the webpage
		// other elements can also be search for
		System.out.println(webDriver.getTitle());
		assertEquals(expectedValue, webDriver.getTitle());
	}

	// closes the opened web browser
	// remove if you want to see the process
	@AfterClass
	public static void afterTest() {
		webDriver.close();
	}
}

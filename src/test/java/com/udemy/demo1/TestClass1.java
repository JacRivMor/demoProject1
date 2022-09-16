package com.udemy.demo1;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class TestClass1 {
	
	static final Logger logger = Logger.getLogger(TestClass1.class);
	private WebDriver driver;
	String url = "https://automationtalks.com/";
	String title = "AutomationTalks - Learn Automation Testing";
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/jacob/Documents/Jacobo/Drivers/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void test1() {
		logger.debug("Test 1: Started");
		driver.get(url);
		try{
			assertEquals(driver.getTitle(), title); //TestNG: Assert.assertEquals(String actual,String expected)
			}
		catch(AssertionError e){
			logger.debug("Test 1: Failed, the title is not equal");
			throw e;
			} 
		logger.debug("Test 1: Passed, the title is " + driver.getTitle());
	}
	
	@Test
	public void test2() {
		logger.debug("Test 2: Started");
		driver.get(url);
		try{
			assertEquals(driver.getTitle(), title); //TestNG: Assert.assertEquals(String actual,String expected)
			}
		catch(AssertionError e){
			logger.debug("Test 2: Failed, the title is not equal");
			throw e;
			} 
		logger.debug("Test 2: Passed, the title is " + driver.getTitle());
	}
	
	@Test
	public void test3() {
		logger.debug("Test 3: Started");
		driver.get(url);
		try{
			assertEquals(driver.getTitle(), title); //TestNG: Assert.assertEquals(String actual,String expected)
			}
		catch(AssertionError e){
			logger.debug("Test 3: Failed, the title is not equal");
			throw e;
			} 
		logger.debug("Test 3: Passed, the title is " + driver.getTitle());
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}

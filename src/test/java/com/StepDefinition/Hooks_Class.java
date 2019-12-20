package com.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.resources.BaseClass;

import cucumber.api.java.*;


public class Hooks_Class extends BaseClass {
	
	@Before
	public void launchBrowser() throws InterruptedException {
		
		System.out.println("LaunchBrowser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad Muralidharan\\eclipse-workspace\\StuArtSupplies\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
	
	}
	
	@After
	public void quitBrowser() {
		
		System.out.println("QuitBrowser");
		driver.quit();
	}

}

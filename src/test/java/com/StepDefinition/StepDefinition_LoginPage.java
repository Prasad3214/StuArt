package com.StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.resources.BaseClass;

import cucumber.api.java.en.*;

public class StepDefinition_LoginPage extends BaseClass {
	
		
	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	@Given("User enter the URL and click LogIn")
	public void user_enter_the_URL_and_click_LogIn() throws IOException, InterruptedException {
	    
	
		System.out.println("user_enter_the_URL_and_click_LogIn");
		driver.get("https://www.stu-artsupplies.com/");
		takeScreenShot();
		
		WebElement loginbtn=driver.findElement(By.xpath("//a[@href='https://www.stu-artsupplies.com/customer/account/login/']"));
		loginbtn.click();
	    takeScreenShot();
	}

	@When("User enter email_id and password {string}{string}")
	public void user_enter_email_id_and_password(String string, String string2) throws IOException {
	   
		System.out.println("user_enter_email_id_and_password"+string +string2);
		
	}

	@When("User manually type captcha")
	public void user_manually_type_captcha() {
	    
		System.out.println("user_manually_type_captcha");
	}

	@Then("User click login button")
	public void user_click_login_button() {
	    
		System.out.println("user_click_login_button");
	}

	@Then("User click logout button")
	public void user_click_logout_button() {
	   
		System.out.println("user_click_logout_button");
	}


}

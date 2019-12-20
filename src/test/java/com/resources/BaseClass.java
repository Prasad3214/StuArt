package com.resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static void takeScreenShot() throws IOException {
		
		System.out.println("Inside take screenshot");
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		//File desc = new File("C:\\Users\\Prasad Muralidharan\\Desktop\\Selinium_Greens\\Materials\\Manual Testing\\Stu-Art Suplies\\LoginPage_Screenshot"+System.currentTimeMillis()+".png");
		File desc = new File("C:\\Users\\Prasad Muralidharan\\Desktop\\Selinium_Greens\\Materials\\Manual Testing\\Stu-Art Suplies\\LoginPage_Screenshot\\Screenshot"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(src,desc);
		
	}
}

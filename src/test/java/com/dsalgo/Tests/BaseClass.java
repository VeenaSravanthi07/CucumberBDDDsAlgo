package com.dsalgo.Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
		  
		 public static  WebDriver driver;
		
		 @BeforeSuite 
		public void setup() throws Exception{
			
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\shrav\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://dsportalapp.herokuapp.com");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		 }
		//Call take screenshot function
		 /* this.takeSnapShot(driver, "c://test.png") ;
		 }
		  public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
			//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot =((TakesScreenshot)webdriver);
			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination
			File DestFile=new File(fileWithPath);
			//Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
			}
*/
	  
	 
	  @AfterSuite
	  public void teardown() {
	  
	driver.close();
	driver.quit();
	}
	}


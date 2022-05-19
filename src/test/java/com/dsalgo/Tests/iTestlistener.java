package com.dsalgo.Tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class iTestlistener implements ITestListener {
	// When Test case get Started, this method is called.
	WebDriver driver;
	public void onTestStart(ITestResult result) {
	
		 System.out.println(result.getName()+" test case started");
			
	}


    // When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :"+result.getName());
		
	}

    // When Test case get failed, this method is called.	
	public void onTestFailure(ITestResult result) {
		//Take the screenshot
		this.driver=((BaseClass)result.getInstance()).driver;
	      File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	      
	      //Copy the file to a location and use try catch block to handle exception
	      try {
	          FileUtils.copyFile(screenshot, new File("C:\\Users\\shrav\\eclipse-workspace\\SeleniumDemoProject\\screenshot.error.png")); //C:\\Screenshots\\dsalgoscreenshot.bmp
	      } catch (IOException e) {
	          System.out.println(e.getMessage());
	      }
	 
	 /* public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
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
		
		/* TakesScreenshot  t = (TakesScreenshot) testCases.driver;
		  
	     File srcFile = t.getScreenshotAs(OutputType.FILE);
	  
	     try {
	     FileUtils.copyFile(srcFile, new File("./ScreenShot/"+arg0.getName()+".jpg"));
	     Reporter.log("<a href='"+ destFile.getAbsolutePath() + "'> <img src='"+ destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
	  } 
	     catch (IOException e) {
	     e.printStackTrace();
	  }
	           
	                  
	*/
		
		System.out.println("The name of the testcase failed is :"+result.getName());

	}

    // When Test case get skipped, this method is called.	
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the testcase Skipped is :"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	// When Test case get Started, this method is called.
	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

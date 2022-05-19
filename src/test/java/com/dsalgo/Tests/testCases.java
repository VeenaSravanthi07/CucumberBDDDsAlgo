package com.dsalgo.Tests;

import org.testng.annotations.Test;


import com.dsalgo.Pages.ArrayPage;
import com.dsalgo.Pages.getstartedPage;
import com.dsalgo.Pages.logoutPage;
import com.dsalgo.Pages.signinPage;


import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

@Listeners(com.dsalgo.Tests.iTestlistener.class)	
public class testCases extends BaseClass {
	/*static com.aventstack.extentreports.model.Test test;
	static ExtentReports report;
	/*public static void startTest()
	{
		report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
		test = report.startTest("testCases");
		}*/
  @Test
  public void init() throws Exception {
	 
	  getstartedPage startpage= PageFactory.initElements( driver,getstartedPage.class);
	  startpage.getstartedbuttonclick();
	  
	  
	  
	  signinPage loginpage= PageFactory.initElements( driver,signinPage.class);
	  loginpage.signinclick();
	  loginpage.setUsername("username");
	  loginpage.setPassword("dsalgo123");
	  loginpage.clickOnsignIn();
	  
	  ArrayPage Arraypage= PageFactory.initElements( driver,ArrayPage.class);
	  Arraypage.Arraygetstartedbuttonclick();
	  //Arraypage.ArraysinPythonButtonclick();
	  
	  logoutPage logoutpage= PageFactory.initElements( driver,logoutPage.class);
	  logoutpage. signOutButtonclick();
	  
  }
  @Test		
  public void TestToFail()				
  {		
      System.out.println("This method to test fail");					
      Assert.assertTrue(false);			
  }
}
 /* @AfterClass
  public static void endTest()
  {
  report.endTest(test);
  report.flush();
  }
  }
*/
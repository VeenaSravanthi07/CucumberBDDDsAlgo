package scrapers;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class webDriverDemo {
	//WebDriver driver;
  @Test
  public void f() {
	  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 // ChromeOptions chromeoptions=new ChromeOptions();
	  WebDriver driver=WebDriverManager.chromedriver().create();
	  //WebDriver driver=new ChromeDriver(); 
	  driver.get("https://www.google.com");
	  Thread.sleep(10);
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
	 // driver.quit();
  }

}

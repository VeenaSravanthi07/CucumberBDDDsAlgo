package scrapers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class suratScraper {
	
WebDriver driver ;
  @Test
  public void scrape () {
	  
	   WebElement row = driver.findElement(By.xpath("//div[@Class='container']"));
	   System.out.println(row.getSize());
	  List< WebElement> cardDetails=driver.findElements(By.xpath("//*[@id='accordionExample']/div"));
	 List <WebElement>hospitalName=driver.findElements(By.xpath("//*[@id='headingOne-+i+']/div/div/div/div[1]/a/text()"));
	  for(int i=0;i<hospitalName.size();i++)
	  {
		  System.out.println(hospitalName);
	  }
  }
  @BeforeTest
	  
	  public void setup() throws Exception{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\shrav\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://office.suratsmartcity.com/SuratCOVID19/Home/COVID19BedAvailabilitydetails");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize(); 
	  
  }

		 

		 
  @AfterTest
  public void afterTest() {
	  driver.close();
	  driver.quit();
	 
  }

}

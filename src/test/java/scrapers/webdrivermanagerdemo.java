package scrapers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;



import io.github.bonigarcia.wdm.WebDriverManager;

   class webdrivermanagerdemo {
	   static WebDriver driver;
	   
	   public static void main(String args[]) throws InterruptedException 

       {

                      WebDriverManager.chromedriver().setup();

                       WebDriver driver = new ChromeDriver();

                      Logger logger = LoggerFactory.getLogger(webdrivermanagerdemo.class);

          logger.info("WebDriverManager Example");


                      driver.get("https://www.google.com");

                      Thread.sleep(5000);           

                      driver.quit();

       }

}



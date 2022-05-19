package com.dsalgo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class getstartedPage {
	WebDriver driver;
	
	public getstartedPage(WebDriver driver) {
		this.driver=driver;
	}
		
		//using findby for locating elements
		
		@FindBy(how=How.XPATH,using="//button[@class=\"btn\"]") WebElement getStartedButton;
		public void getstartedbuttonclick() {
		getStartedButton.click();
	}


}
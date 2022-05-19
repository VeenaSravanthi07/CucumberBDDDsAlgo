package com.dsalgo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logoutPage {
	WebDriver driver;

	public logoutPage(WebDriver driver) {
		this.driver=driver;
	}
		
		//using findby for locating elements
		
		@FindBy(how=How.LINK_TEXT,using="Sign out") WebElement signOutButton;
		public void signOutButtonclick() {
		signOutButton.click();
	}

}

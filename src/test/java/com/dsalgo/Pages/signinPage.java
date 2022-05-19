package com.dsalgo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signinPage {
	WebDriver driver;

	public signinPage(WebDriver driver) {
		this.driver=driver;
	}
		
		//using findby for locating elements
		
		@FindBy(how=How.LINK_TEXT,using="Sign in") WebElement signin;
		@FindBy(how=How.XPATH,using="//input[@name=\"username\"]") WebElement usernameTextBox;
		@FindBy(how=How.XPATH,using="//input[@name=\"password\"]") WebElement passwordTextBox;
		@FindBy(how=How.XPATH,using="//input[@type=\"submit\"]") WebElement loginClick;
		
		
		
		public void signinclick() {
		signin.click();
	}
        public void setUsername(String strUsername) {
        	usernameTextBox.sendKeys(strUsername);
        }
        
        public void setPassword(String strSetPassword) {
        	passwordTextBox.sendKeys(strSetPassword);
        }
        
        public void clickOnsignIn() {
        	loginClick.click();
        }



}

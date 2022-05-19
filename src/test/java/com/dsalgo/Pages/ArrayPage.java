package com.dsalgo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ArrayPage {
	WebDriver driver;

	public ArrayPage(WebDriver driver) {
		this.driver=driver;
	}
		
		//using findby for locating elements
		
		@FindBy(how=How.LINK_TEXT,using="Get Started") WebElement ArraygetStartedButton;
		//@FindBy(how=How.LINK_TEXT,using="Arrays in Python") WebElement ArraysinPythonButton;
		//@FindBy(how=How.LINK_TEXT,using="Try here") WebElement tryhereButton;
		//@FindBy(how=How.XPATH,using="//div[@class=\"CodeMirror-scroll\"]") WebElement tryEditor;	
		public void Arraygetstartedbuttonclick() {
		ArraygetStartedButton.click();
		}
		//public void ArraysinPythonButtonclick() {
//ArraysinPythonButton.click();
	//}
		/*public void tryhereButton() {
			tryhereButton.click();
			}
		
		public void tryEditor(String enterText) {
			tryEditor.sendKeys(enterText);
			}*/
}

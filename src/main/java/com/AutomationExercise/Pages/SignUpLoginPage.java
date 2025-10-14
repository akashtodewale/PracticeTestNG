package com.AutomationExercise.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpLoginPage {
	//declared driver we want to use as protected 
      protected WebDriver driver;
      
    // Constructor - initializes the driver for this page
      public SignUpLoginPage(WebDriver driver) {
    	  this.driver = driver;
      }
      
     //Declaring the Elements on the page. 
      private By LoginMenu = By.cssSelector("a[href='/login']");
	
	//Creating getter and setter methods to access elements -->
      public void ClickLoginMenu() 
      {
    	  driver.findElement(LoginMenu).click();
  	  }
        
	
}

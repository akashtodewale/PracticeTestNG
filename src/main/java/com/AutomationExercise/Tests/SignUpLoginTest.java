package com.AutomationExercise.Tests;

import org.testng.annotations.Test;

import com.AutomationExercise.Pages.SignUpLoginPage;

public class SignUpLoginTest extends BaseTest{
	@Test
	public void SignUptest() {
	
		SignUpLoginPage page = new SignUpLoginPage(driver);	
		page.ClickLoginMenu();
	
	}
}

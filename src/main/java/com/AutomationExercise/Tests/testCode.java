package com.AutomationExercise.Tests;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#google_vignette");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label[normalize-space()=\"First Name\"]/following-sibling::input[@name=\"name\"])[1]")).sendKeys("Akash");
		driver.findElement(By.xpath("")).sendKeys("Todewale");
		driver.findElement(By.xpath("")).sendKeys("Email");
		driver.findElement(By.xpath("")).sendKeys("Password");
		driver.findElement(By.xpath("")).sendKeys("repeated Pass");
		driver.findElement(By.xpath("")).click(); //for checkbox
		
		driver.findElement(By.xpath("")).click(); //for submit
		//Asserts;
		driver.quit();



		
		
	}

}

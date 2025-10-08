package com.AutomationExercise.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.AutomationExercise.Utils.ConfigReader;
import com.AutomationExercise.Utils.WebDriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        ConfigReader.loadConfig();
        String browser = ConfigReader.get("browser");
        driver = WebDriverFactory.createDriver(browser);
        driver.get(ConfigReader.get("baseUrl"));
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

	
	


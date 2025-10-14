package UdemyCode;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		//https://dev.automationtesting.in/shadow-dom
		
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		shadow.findElement(By.cssSelector("#input")).sendKeys("Akash");
		SearchContext shadow1 = shadow.findElement(By.cssSelector("book-home[class='_page']")).getShadowRoot();
		String text = shadow1.findElement(By.cssSelector("div[class='books-desc']")).getText();
        System.out.println(text);
        driver.close();
//        driver.get("https://Google.com");
//		driver.findElement(By.cssSelector("textarea[title='Search']")).sendKeys("Akash");

		
	}

}

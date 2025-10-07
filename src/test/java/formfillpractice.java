import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class formfillpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.name("name")).sendKeys("Akash");
        driver.findElement(By.name("email")).sendKeys("akashtest@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Akash@123");
        driver.findElement(By.id("exampleCheck1")).click();
        WebElement Dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select abc = new Select(Dropdown);
        abc.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio1")).click();

        driver.findElement(By.name("bday")).sendKeys("02/02/1992");

        driver.findElement(By.cssSelector(".btn-success")).click();

        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		
		
	}

	
}

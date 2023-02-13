

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Test1 {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	
		
		String text="Matin";

		System.setProperty("webdriver.edge.driver", "/Users/mashaikh/Documents/SeleniumDrivers/msedgedriver");
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		
		driver.findElement(By.id("alertbtn")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		String alertText=driver.switchTo().alert().getText();
		if(alertText.contains(text)) {
			
			Assert.assertTrue(true);
		}
		else {
			
			Assert.assertTrue(false);
		}
		driver.switchTo().alert().accept();
		

	}

}

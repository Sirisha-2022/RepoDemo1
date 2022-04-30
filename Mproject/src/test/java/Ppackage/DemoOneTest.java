package Ppackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoOneTest {
	WebDriver driver;
	@Test
	
	public void mOne() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://surendrareddy1248.github.io/WebElementsTesting/");
		
		String actualtxt = driver.findElement(By.id("testtext-1")).getText();
		Assert.assertEquals(actualtxt, "Sample Text for testing by user2.");
		
	}
	@AfterMethod
	public void closure() {
	driver.close();
	}
}

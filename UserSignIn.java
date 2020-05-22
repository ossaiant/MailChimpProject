package signinFlow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserSignIn {
	WebDriver driver;
	
	@Test(priority=1)
	public void testSignUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mcanthony\\Desktop\\browserdrivere\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test(priority=2)
	public void launchBrowser(){
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ton");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ton");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("angelo.8520a775@nicoric.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("AnotherTestng123");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
		driver.findElement(By.xpath("//span[2]//input[1]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		driver.quit();
		
	}
}

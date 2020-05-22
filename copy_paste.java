package ActionKeys;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copy_paste {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mcanthony\\Desktop\\browserdrivere\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ton");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Oss");
		act.click(driver.findElement(By.xpath("//input[@name='firstName']")));
		act.keyDown(org.openqa.selenium.Keys.CONTROL);
		act.sendKeys("a");
		act.sendKeys("c");
		act.keyUp(org.openqa.selenium.Keys.CONTROL);
		act.click(driver.findElement(By.xpath("//input[@name='lastName']")));
		act.keyDown(org.openqa.selenium.Keys.CONTROL);
		Thread.sleep(300);
		act.sendKeys("v");
		driver.quit();
		

	}

}

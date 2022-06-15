package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("yogita");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yogita123@gmail.com");
		driver.findElement(By.xpath("//input[@id='qvmqjf7rn1e_146917605549304831']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//span[.='Start the chat']")).sendKeys();
		
		
		

	}

}

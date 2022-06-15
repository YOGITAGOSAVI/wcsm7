package GoogleClassroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S10 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='chat-widgetrehbdheweb']"));
		driver.switchTo().frame(frameElement);
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[.='Leave a message']")).click();
		
   
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Divyashree");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='k030vky2rs_146917605549304831']")).sendKeys("676878765");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}

package GoogleClassroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("gh-ac")).sendKeys("Apple Watches");
		Thread.sleep(3000);
		driver.findElement(By.id("gh-btn")).click();
		
		driver.findElement(By.xpath("//input[@aria-label='Apple Watch Series SE']")).click();
		driver.findElement(By.xpath("//input[@aria-label='40 mm']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gh-btn")).click();		
		
		//printing 10th suggestion
		
		String priceof10thsuggestion = driver.findElement(By.xpath("//h3[.='Force Touch Sensor for Apple Watch Series 4 (40mm) Module Piece Part Repair Fix']/ancestor:: div[@class='s-item__info clearfix']/descendant::span[.='$6.49']")).getText();
		System.out.println(priceof10thsuggestion);
		
		

	}

}

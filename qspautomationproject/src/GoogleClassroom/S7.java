package GoogleClassroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click();
		WebElement web1 = driver.findElement(By.xpath("//a[contains(text(),'All Jewellery ')]"));
		Actions act=new Actions(driver);		
		act.moveToElement(web1).perform();
		
		driver.findElement(By.xpath("//span[.='Kadas']")).click();
		
		driver.findElement(By.xpath("//a[@id=\"pid_8967\"]")).click();
		driver.findElement(By.xpath(" //input[@value=\"Buy Now\"]")).click();

	}

}

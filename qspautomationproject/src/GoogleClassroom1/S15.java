package GoogleClassroom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S15 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		
		WebElement AllJwellery= driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(AllJwellery).perform();
		
		driver.findElement(By.xpath("//a[.='Gold Coins']")).click();
		driver.findElement(By.xpath("//span[.='2']")).click();
		
		driver.findElement(By.xpath("//a[@id='pid_5921']/ancestor::div[@class='p-image']")).click();
		
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//span[@id='short_desc_goldWt']")).getText();
		System.out.println(text);
	}

}

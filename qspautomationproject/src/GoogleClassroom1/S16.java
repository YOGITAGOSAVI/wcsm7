package GoogleClassroom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S16 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click();
		WebElement web = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(web).perform();
		
		driver.findElement(By.xpath("//a[.='Gold Coins']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='20']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id=\"pid_5924\"]/ancestor::div[@class=\"p-image\"]")).click();
		String testing = driver.findElement(By.xpath("//span[@id=\"short_desc\"]")).getText();
		System.out.println(testing);


	}

}

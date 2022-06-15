package GoogleClassroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierId")).sendKeys("yogita88gosavi@gmail.com");
		driver.findElement(By.xpath("//span[.='Next']")).click();

	}

}

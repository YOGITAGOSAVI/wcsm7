package GoogleClassroom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S12 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click();
		WebElement web = driver.findElement(By.xpath("//span[.='Offers ']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(web).perform();
		
		driver.findElement(By.xpath("//span[.='Additional 50% Off on your 1st Installment on GMS']")).click();
		System.out.println("Testcase has been successfully passed");

	}

}

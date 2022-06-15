package GoogleClassroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S6 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(3000);
		
		WebElement targetToMouseOver= driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(targetToMouseOver).perform();
	    
		 WebElement list = driver.findElement(By.xpath("(//div[text()='By Price Range'])[1]"));
		 Select sel = new Select(list);
		 
		 for(int i=1;i<=4;i++)
		 {
			 sel.selectByIndex(i);
			 Thread.sleep(1000);
		 }
		 
		 System.out.println();
		 }

}



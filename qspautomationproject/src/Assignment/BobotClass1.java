package Assignment;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BobotClass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		WebElement targetToClick = driver.findElement(By.xpath("//h1.[.='Downloads']"));;
		
		Actions act = new Actions(driver);
		act.doubleClick(targetToClick).perform();
		
		//Robot robot = new Robot();
	//	robot.keyPress(KeyEvent.VK_CONTROL);
		//robot.keyPress(KeyEvent.VK_C);
	//	robot.keyRelease(KeyEvent.VK_CONTROL);
	//	robot.keyRelease(KeyEvent.VK_C);
		
		
		
		
		
		
		//for()
		{
			
		}

	}

}

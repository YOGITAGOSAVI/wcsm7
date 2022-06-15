package GoogleClassroom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S18 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Not now')]")).click();
		WebElement web1 = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(web1).perform();
		
		driver.findElement(By.xpath("//a[.='Gold Coins']")).click();
		Thread.sleep(5000);
		
		WebElement web2 = driver.findElement(By.xpath("//a[.='Coins ']"));
		act.moveToElement(web2).perform();
		
		driver.findElement(By.xpath("//span[@data-p=\"l-gold-coins-weight-2gms,m\"]")).click();
		
		String text = driver.findElement(By.xpath("//input[@id=\"product_type_name\"]")).getText();
		System.out.println(text);

	}

}

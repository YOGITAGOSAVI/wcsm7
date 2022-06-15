package Logins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dell-pc/login.do;jsessionid=2eo1ppt2ifq3c");
		driver.switchTo().activeElement().sendKeys("Chandler Bing", Keys.ENTER);
		
		driver.findElement(By.className("INPNe")).click();

	}

}
//donee...

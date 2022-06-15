package Logins;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inatagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		
		
		driver.findElement(By.name("username")).sendKeys("yogita");
		driver.findElement(By.name("password")).sendKeys("yogita123");
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
		

	}

}

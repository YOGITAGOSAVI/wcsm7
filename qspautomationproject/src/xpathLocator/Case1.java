package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://orangehrmlive.com/");
		//login operation 
		//Case 1:
		//syntax: driver.findElement(By xpath(//tagname[attribute name='attribute value'])
//		driver.findElement(By.xpath())
		
		

	}

}

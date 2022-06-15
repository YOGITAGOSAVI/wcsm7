package testngflags;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXml {
 
	@Test
	@Parameters("browser")
	
	public void OpenBrowser(String browserValue)
	{
		WebDriver driver;
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("I am chrome ");
			driver.quit();
			
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("I am firefox ");
			driver.close();
		}
		else
		{
			Reporter.log("Enter valid value",true);
		}
	}
}

package keywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant  {
	static WebDriver driver;
	
	//method to open a browser
	public void openBrowser() throws IOException {
		Flib flib = new Flib(); 
		
		// read data from properties file(browser)
		String browserValue = flib.readPropertyFile(PROPL_PATH,"browser");
		
		 //read the data from property file (url)
		 String url = flib.readPropertyFile(PROPL_PATH, "url"); 
		 
		//use the value of browser
		 if(browserValue.equalsIgnoreCase("chrome"))
		 { 
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		 driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		 driver.get(url); 
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS); 
		}
		 else if(browserValue.equalsIgnoreCase("firefox")) 
		{ 
		System.setProperty(GECKO_KEY , GECKO_VALUE); 
		driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		 driver.get(url);
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS); 
		} 
		else
		 { 
		System.out.println("enter the correct choice");
		 }
		 } 
		//method to close the browsers
		 public void closeBrowser()
		 { 
		driver.quit(); 
		
		

	}

}

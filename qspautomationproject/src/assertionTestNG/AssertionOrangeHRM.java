package assertionTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionOrangeHRM {
  
	WebDriver driver;
	@BeforeTest
	
  public void setProperty() 
  {
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  }
  
	@BeforeMethod
	public void lunchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");	
	}
	
	@Test
	public void testCase() throws InterruptedException
	{
		SoftAssert softAssert = new SoftAssert(); //softAssert object created
		String actualLoginPageTitle = driver.getTitle();
		softAssert.assertEquals(actualLoginPageTitle, "OrangeHRM"); //softAssert
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement dashBord = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statusOfDashBord = dashBord.isDisplayed();
		Assert.assertEquals(statusOfDashBord, true); //hardAssert
		Thread.sleep(2000);
		
		
		String actualHomePageTitle = driver.getTitle();
		softAssert.assertEquals(actualHomePageTitle, "OrangeHRM"); //softAssert
		
		Reporter.log("creat user", true);
		Reporter.log("creat contact", true);
		
		softAssert.assertAll();		
		
	}
  
  
  
  
  
}

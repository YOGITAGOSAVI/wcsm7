package testNGAnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DataProviderCode {
	WebDriver driver;
	
 
  @BeforeMethod
  public void setUp() 
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://dell-pc/login.do;jsessionid=1p4sdq05j3gfl");
  }

  
 @DataProvider(name="testActiTimeData")
  public Object[][] dataProvider()
  {
	  Object[][] data=new Object[5][2];
	  
	  data[0][0]="admin1";
	  data[0][1]="manager1";
	  
	  data[1][0]="admin1";
	  data[1][1]="manager1";
	  
	  data[2][0]="admin1";
	  data[2][1]="manager1";
	  
	  data[3][0]="admin1";
	  data[3][1]="manager1";
	  
	  data[4][0]="admin1";
	  data[4][1]="manager1";
	  
	  data[5][0]="admin1";
	  data[5][1]="manager1";
	  
	  
	  
	return data;
  }
  
  
  
  
  
  @Test
  public void loginToActiTime(String username, String password) throws InterruptedException 
  {
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("pwd")).sendKeys(username);
	  driver.findElement(By.id("loginbutton")).click();;
  }
  
  
  
  @AfterMethod
  public void afterMethod() {
  }

}

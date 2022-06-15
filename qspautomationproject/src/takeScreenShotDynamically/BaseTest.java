package takeScreenShotDynamically;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest {
	WebDriver driver;
  @Test
  public void intilization()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/");
  }
  
  public void failed(String methodName)
  {
	  try
	  {
		  TakesScreenshot ts = (TakesScreenshot)driver;
		 File scr = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("./Screenshoot/"+methodName+".png");
		 Files.copy(scr, dest); 
		
	  }
	  catch(Exception e)
	  {}
  }
  
}

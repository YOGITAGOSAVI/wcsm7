package takeScreenShotDynamically;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Listeners(CustomListner.class)


public class TestCase extends BaseTest  {
	@BeforeMethod
	public void setUp()
	{
		intilization();
	}
	
	
  @Test
  public void validLogin() throws InterruptedException 
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
  }
  
  
  @Test
  public void testCase2()
  {
	  Assert.fail();
  }
  
  @Test
  public void testCase3()
  {
	  Assert.fail();
  }
  @Test
  public void testCase4()
  {
	  Assert.fail();
  }
  @Test
  public void testCase5()
  {
	  Assert.fail();
  }
  
  
  @AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
  
 
  
  
}

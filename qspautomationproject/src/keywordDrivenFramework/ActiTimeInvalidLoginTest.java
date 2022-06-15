package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidLoginTest extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
	 BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		Flib flib = new Flib();
		int rc = flib.getrowCount(null, null);
		
		for( int i=1; i<=rc; i++)
		{
			String username = flib.readExcelData(null, null, i, 0);
			String password = flib.readExcelData(null, null, i, 1);
			
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
		

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		}
		
	bt.closeBrowser();
		
		

	}

}


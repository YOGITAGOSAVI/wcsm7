package dataDrivenframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin {


		public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://laptop-smc8hiai/login.do");

			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

			Flib flib = new Flib();
			int rc = flib.getrowCount("./Data/ActiTimeTestData.xlsx","InValidCreds");


			for(int i=1;i<=rc;i++)
			{
				String username = flib.readExcelData("./Data/ActiTimeTestData.xlsx","InValidCreds", i, 0);
				String password = flib.readExcelData("./Data/ActiTimeTestData.xlsx","InValidCreds", i, 1);

				driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("pwd")).sendKeys(password);
			

				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("username")).clear();
			}

	}

}

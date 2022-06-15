package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	
		
		@FindBy(name="username") private WebElement usn;
		@FindBy(name="pwd") private WebElement pass;
		@FindBy(id="loginButton") private WebElement login;;
		
		@FindBy(id="keepLoggedInLabel") private WebElement loggedin;
		@FindBy(name="pwd") private WebElement pass1;

}

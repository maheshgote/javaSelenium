/**
 * 
 */
package ecommerce.saucedemo.pages;
import ecommerce.saucedemo.base.TestBase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author maheshgote
 *
 */
public class LoginPage extends TestBase{

	
	@FindBy(id="user-name")
	WebElement uname;
	
	@FindBy(id ="password")
	WebElement pass;
	
	@FindBy(id ="login-button")
	WebElement loginbutton;
	
	public LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String username, String password) throws IOException {
		uname.sendKeys(username);
//		uname.sendKeys("abc@gmail.com");
		pass.sendKeys(password);
		loginbutton.click();
		return new HomePage();
		
	}
	
	
	


}

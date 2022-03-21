package ecommerce.ecommerce.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ecommerce.saucedemo.base.TestBase;
import ecommerce.saucedemo.pages.HomePage;
import ecommerce.saucedemo.pages.LoginPage;
import ecommerce.saucedemo.pages.UserInformationPage;
import ecommerce.saucedemo.pages.YourCartPage;
import ecommerce.saucedemo.pages.CheckoutCompletePage;
import ecommerce.saucedemo.pages.ChecoutOverviewPage;
public class CheckoutOverviewtest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	YourCartPage yourcartpage;
	ChecoutOverviewPage checkoutoverviewpage;
	UserInformationPage userinformationpage;
	CheckoutCompletePage checkoutcompletepage;
	

	public CheckoutOverviewtest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
//	@BeforeSuite
//	public void setup() throws IOException {
//		initialize();
//		loginpage = new LoginPage();
//		
//	}
	
	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		loginpage = new LoginPage();
		
	}
	
	
	@Test(dataProvider = "data")
	public void validatecheckout(String username, String password) throws IOException {
		homepage= loginpage.login(username, password);
//		homepage= loginpage.login("locked_out_user", "secret_sauce");
//		homepage= loginpage.login("problem_user", "secret_sauce");
		homepage.addItemToCart();
		yourcartpage = homepage.goToShoppingCart();
		userinformationpage =yourcartpage.clickCheckoutButton();
		userinformationpage.fillUserInformation("sachin", "Tendulkar", "5545");
		checkoutoverviewpage = userinformationpage.clickContinueButton();
		checkoutcompletepage = checkoutoverviewpage.clickFinishButton();
		boolean successful = checkoutcompletepage.verifyCheckoutCompletePageDisplayed();
		Assert.assertEquals(successful, true);
	}
	
	@DataProvider(name = "data")
	public Object[][] dataSupplier() throws IOException{
		return new Object[][] {
			   { "standard_user", "secret_sauce" },
			   { "locked_out_user", "secret_sauce"},
			   { "problem_user", "secret_sauce"},
			   { "performance_glitch_user", "secret_sauce"}
			 };

	}
	
	
	
//	@AfterSuite
//	public void teardown() {
//		driver.quit();
//	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}

package ecommerce.ecommerce.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ecommerce.saucedemo.base.TestBase;
import ecommerce.saucedemo.pages.CheckoutCompletePage;
import ecommerce.saucedemo.pages.HomePage;
import ecommerce.saucedemo.pages.LoginPage;
import ecommerce.saucedemo.pages.UserInformationPage;
import ecommerce.saucedemo.pages.YourCartPage;

public class AddToCarttest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	YourCartPage yourcartpage;
	UserInformationPage userinformationpage;
	CheckoutCompletePage checkoutcompletepage;

	public AddToCarttest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeSuite
	public void setup() throws IOException {
		initialize();
		loginpage = new LoginPage();
		
	}
	
	@Test(priority=1)
	public void validateCartValueShown() throws IOException {
//		homepage= loginpage.login("standard_user", "secret_sauce");
		homepage= loginpage.login("locked_out_user", "secret_sauce");
		homepage.addItemToCart();
		String value = homepage.getItemCountInCarts();
		System.out.println(value);
		Assert.assertEquals(Integer.parseInt(value), 1);
	}
	
	@Test(priority=2)
	public void validateYourCartPage() throws IOException {
		yourcartpage = homepage.goToShoppingCart();
		String itemName = yourcartpage.getInventoryItemName();
		Assert.assertEquals(itemName, "Sauce Labs Backpack");
	}
	
	@Test(priority=3)
	public void validateUserInformationPage() throws IOException {
		userinformationpage =yourcartpage.clickCheckoutButton();
		boolean userinfopagedisplayed = userinformationpage.verifyUserInfromationPageDisplayed();
		Assert.assertEquals(userinfopagedisplayed, true);
	}
	
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}

package ecommerce.ecommerce.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecommerce.saucedemo.base.TestBase;
import ecommerce.saucedemo.pages.HomePage;
import ecommerce.saucedemo.pages.LoginPage;

public class Logintest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public Logintest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		loginpage = new LoginPage();
	}
	
	@Test
	public void validateLogin() throws IOException {
		homepage= loginpage.login("standard_user", "secret_sauce");
		boolean homepageDisplayed = homepage.checkHomepageDisplayed();
		assertEquals(homepageDisplayed, true);
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}

package ecommerce.saucedemo.pages;
import ecommerce.saucedemo.pages.YourCartPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.saucedemo.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(className="app_logo")
	WebElement logo;
	
	@FindBy(id ="add-to-cart-sauce-labs-backpack")
	WebElement SauceLabsBackpackAddtoCartButton;
	
	@FindBy(linkText ="shopping_cart_link")
	WebElement shoppingCart;
	
	@FindBy(className ="shopping_cart_badge")
	WebElement shoppingCartBadge;
	

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void addItemToCart() {
		SauceLabsBackpackAddtoCartButton.click();
	}
	
	public String getItemCountInCarts() {
		
		return shoppingCartBadge.getText();
	}
	
	public YourCartPage goToShoppingCart() throws IOException {
		shoppingCartBadge.click();
		return new YourCartPage();
	}
	
	public boolean checkHomepageDisplayed() {
		return logo.isDisplayed();	
	}
	
	

}

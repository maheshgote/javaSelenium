package ecommerce.saucedemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.saucedemo.base.TestBase;

public class CheckoutCompletePage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Checkout: Complete!')]")
	WebElement checkoutComplete;
	
//	@FindBy(id ="password")
//	WebElement pass;

	public CheckoutCompletePage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyCheckoutCompletePageDisplayed() {
		return checkoutComplete.isDisplayed();
		
	}

}

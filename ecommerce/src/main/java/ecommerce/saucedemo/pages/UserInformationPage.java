package ecommerce.saucedemo.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ecommerce.saucedemo.base.TestBase;

public class UserInformationPage extends TestBase{

	@FindBy(xpath="//span[contains(text(),'Checkout: Your Information')]")
	WebElement yourInformationPage;
	
	@FindBy(id ="first-name")
	WebElement firstName;
	
	@FindBy(id ="last-name")
	WebElement lastName;
	
	@FindBy(id ="postal-code")
	WebElement postalCode;
	
	@FindBy(id ="continue")
	WebElement continueButton;
	
	

	public UserInformationPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyUserInfromationPageDisplayed() {
		return yourInformationPage.isDisplayed();
	}
	
	
	public void fillUserInformation(String name, String lastname, String code) {
		firstName.sendKeys(name);
		lastName.sendKeys(lastname);
		postalCode.sendKeys(code);
	}
	
	public ChecoutOverviewPage clickContinueButton() throws IOException {
		continueButton.click();
		return new ChecoutOverviewPage();
	}
	
	
	

}

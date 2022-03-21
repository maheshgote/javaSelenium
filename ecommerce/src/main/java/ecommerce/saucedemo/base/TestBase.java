package ecommerce.saucedemo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import ecommerce.saucedemo.utility.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListiner;
	
	public TestBase() throws IOException {
		FileInputStream configfile = new FileInputStream("C:\\Users\\mg22250\\OneDrive-Deere&Co\\OneDrive - Deere & Co\\Desktop\\Common\\Workspace\\javaSelenium\\ecommerce\\src\\main\\java\\ecommerce\\saucedemo\\config/config.properties");
		prop = new Properties();
		prop.load(configfile);
		System.out.println("properties file loaded");
		
	}
	
	
	public static void initialize() throws IOException {
		
		String url = prop.getProperty("url");
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")){
			String driverpath= "C:\\Users\\mg22250\\OneDrive-Deere&Co\\OneDrive - Deere & Co\\Desktop\\Common\\Workspace\\javaSelenium\\ecommerce\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			driver = new ChromeDriver();
			
			e_driver = new EventFiringWebDriver(driver);
			eventListiner = new WebEventListener();
			e_driver.register(eventListiner);
			driver=e_driver;
			
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			
			
		}
	}
	
	

}

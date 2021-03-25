package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties OR = new Properties();
	public static FileInputStream fis;
	
	
	
	
//	public static void setup() throws FileNotFoundException {
//		fis = new FileInputStream(System.getProperty("./src/test/resources/property/OR.properties"));
//		ChromeOptions options = new ChromeOptions();
//		options.setHeadless(true);
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(options);
//
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		System.out.println("Chrome has started");
//		 Assert.assertEquals(browserName(), "Chrome");
//		}
	
	public static String  browserName() {
			// Capabilities cap;
			// cap = ((RemoteWebDriver) driver).getCapabilities();
			// String browserName = cap.getBrowserName(); 
			 return ((RemoteWebDriver) driver).getCapabilities().getBrowserName();
	}
	

	public static void get(String url) {
		driver.get(url);
	}

	public static void click(String locator) {
		if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).click();
		} 
		else if (locator.endsWith("_ID")) {
			driver.findElement(By.id(OR.getProperty(locator))).click();
		}
	}

	

	public static void sendKeys(By locator, String value) {
		driver.findElement(locator).sendKeys(value + Keys.ENTER);
	}

	public void tierDown() {
		//driver.close();
	}
	
}

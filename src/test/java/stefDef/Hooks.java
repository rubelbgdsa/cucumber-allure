package stefDef;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base  {
	@Before
	public void setup() {
		System.out.println("Cucumber Before");
		ChromeOptions cOption = new ChromeOptions();
		cOption.setHeadless(false);
		
		WebDriverManager.chromedriver().setup();  
		driver = new ChromeDriver(cOption);  //here we use ChromeDriver to instantiate driver variable
		get("https://newyork.craigslist.org");
	}
	
	
	@After
	public void tearDown() {
		System.out.println("Cucumber After");
	//	driver.quit();
	}	
}



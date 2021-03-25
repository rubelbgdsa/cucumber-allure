package stefDef;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Verify_Search_Camera extends Base {
	
	
	@Given("I am in the Craigslist login Page1")
	public void i_am_in_the_Craigslist_login_Page1() throws FileNotFoundException {
	
		
		boolean logo = driver.findElement(By.xpath("//h1[@id='logo']/a")).isDisplayed();
		System.out.println("I am in Craigslist Page");
			Assert.assertEquals(logo, true);  
	}

	@When("I am in the Craigslist Page1 then click Camera")
	public void i_am_in_the_Craigslist_Page1_then_click_Camera() {
		sendKeys(By.id("query"), "Camera");
		String expected = "https://newyork.craigslist.org/d/for-sale/search/sss?query=Camera&sort=rel";
		String url = driver.getCurrentUrl();
			Assert.assertEquals(url, expected);  
			System.out.println("You are in Camera page");
	}

	@Then("I will write Nikon Camera in search box")
	public void i_will_write_Nikon_Camera_in_search_box() {
	    driver.findElement(By.xpath("//input[@id='query']")).clear();
	    sendKeys(By.xpath("//input[@id='query']"), "Nikon");
	}

	@Then("I can check Nikon Camera Price")
	public void i_can_check_Nikon_Camera_Price() {
	    
	}
}

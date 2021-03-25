package stefDef;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Search_Car extends Base {
	

	@Given("I am in the Craigslist login Page")
	public void i_am_in_the_Craigslist_login_Page() throws FileNotFoundException {
	  
	  //  get("https://newyork.craigslist.org");
	  //ul[@id='sss1']/li/a/span[1]      
	}

	@When("I Write Car in Search Box and hit Enter")
	public void i_Write_Car_in_Search_Box_and_hit_Enter() {
	  //  sendKeys(By.id("query"), "Car");
		System.out.println("Car Box");
	}

	@Then("I can see Car list")
	public void i_can_see_Car_list() {

		//click("FIRSTCAR_XPATH");
		
		
		//click(By.id("134"));
	  //  click("//*[@click(By locator)\"]/ul/li[1]/div/span[2]");
	}

	@Then("I can check Camry Price")
	public void i_can_check_Camry_Price() {
	   
	}
}

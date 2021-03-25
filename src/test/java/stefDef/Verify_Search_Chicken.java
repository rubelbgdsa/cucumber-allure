package stefDef;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Search_Chicken extends Base {
	@Given("I am in the Craigslist Page")
	public void i_am_in_the_Craigslist_Page() {
	    System.out.println("Garden Page");
	}

	@When("I am in the Craigslist Page then click farm+garden")
	public void i_am_in_the_Craigslist_Page_then_click_farm_garden() {
	    
	}

	@Then("I will write Chicken in search box")
	public void i_will_write_Chicken_in_search_box() {
	   
	}

	@Then("I can check Chicken Price")
	public void i_can_check_Chicken_Price() {
	   
	}

}

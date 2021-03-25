package stefDef;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Search_Furniture extends Base {
	@When("I am in the Craigslist Page then click Furnitue")
	public void i_am_in_the_Craigslist_Page_then_click_Furnitue() {
	   System.out.println("Furniture Page");
	}

	@Then("I will write Chair in search box")
	public void i_will_write_Chair_in_search_box() {
	    
	}

	@Then("I can check Chair Price")
	public void i_can_check_Chair_Price() {
	    
	}

}

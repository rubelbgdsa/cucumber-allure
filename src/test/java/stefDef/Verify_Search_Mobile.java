package stefDef;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Search_Mobile extends Base {
	@When("I am in the Craigslist Page then click Electronics")
	public void i_am_in_the_Craigslist_Page_then_click_Electronics() {
	   System.out.println("Mobile page");
	}

	@Then("I will write Mobile in search box")
	public void i_will_write_Mobile_in_search_box() {
	    
	}

	@Then("I can check Iphone Price")
	public void i_can_check_Iphone_Price() {
	   
	}
}

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionCP_005 {

	@When("^I search this product \"([^\"]*)\"$")
	public void i_search_this_product(String arg1) throws Throwable {
		System.out.println("Search item in principal page");
	}

	@When("^I press add to cart$")
	public void i_press_add_to_cart() throws Throwable {
		System.out.println("press add to cart");
	}

	@Then("^Show popup with message Product successfully added to your shopping cart$")
	public void show_popup_with_message_Product_successfully_added_to_your_shopping_cart() throws Throwable {
		System.out.println("Show message successfully added");
	}
}

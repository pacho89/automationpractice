import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionCP_008 {

	@When("^I press Cart$")
	public void i_press_Cart() throws Throwable {
	    System.out.println("press button cart");
	}

	@Then("^Redirect to cart page$")
	public void redirect_to_cart_page() throws Throwable {
		System.out.println("Redirect to page cart");
	}

	@Then("^I search \"([^\"]*)\"$")
	public void i_search(String arg1) throws Throwable {
		System.out.println("Search the item");
	}

	@Then("^I press icon of trash$")
	public void i_press_icon_of_trash() throws Throwable {
		System.out.println("press icon trash");
	}

	@Then("^Show message Your shopping cart is empty\\.$")
	public void show_message_Your_shopping_cart_is_empty() throws Throwable {
		System.out.println("Show empty cart");
	}

}

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionCP_019 {

	@When("^I press MY ADDRESS$")
	public void i_press_MY_ADDRESS() throws Throwable {
		System.out.println("Press my address");
	}

	@When("^I press Add new address$")
	public void i_press_Add_new_address() throws Throwable {
		System.out.println("Press Add new Address");
	}

	@Then("^show MY ADDRESS(\\d+)$")
	public void show_MY_ADDRESS(int arg1) throws Throwable {
		System.out.println("Show MY ADDRESS2");
	}


}

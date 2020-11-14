import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionCP_010 {


	@When("^I dont enter email \"([^\"]*)\"$")
	public void i_dont_enter_email(String arg1) throws Throwable {
		System.out.println("Dont Type email");
	}


	@Then("^Show invalid email address$")
	public void show_invalid_email_address() throws Throwable {
		System.out.println("Show alert message");
	}

}

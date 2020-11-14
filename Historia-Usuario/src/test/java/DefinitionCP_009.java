import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionCP_009 {

	@Given("^I am in sign in page$")
	public void i_am_in_sign_in_page() throws Throwable {
	    System.out.println("Open sign in url");
	}

	@When("^I enter email \"([^\"]*)\"$")
	public void i_enter_email(String arg1) throws Throwable {
		System.out.println("Type email");
	}

	@When("^I press Create an account$")
	public void i_press_Create_an_account() throws Throwable {
		System.out.println("Press create an account");
	}

	@Then("^Redirect to account-creation page$")
	public void redirect_to_account_creation_page() throws Throwable {
		System.out.println("Open create account url");
	}

	@Then("^check Mrs$")
	public void check_Mrs() throws Throwable {
		System.out.println("Press check box Mrs");
	}

	@Then("^fill in Firts Name\\(required\\) with \"([^\"]*)\"$")
	public void fill_in_Firts_Name_required_with(String arg1) throws Throwable {
		System.out.println("Type Name");
	}

	@Then("^fill in Last Name\\(required\\) with \"([^\"]*)\"$")
	public void fill_in_Last_Name_required_with(String arg1) throws Throwable {
		System.out.println("Type Last Name");
	}

	@Then("^fill in Email\\(required\\) with \"([^\"]*)\"$")
	public void fill_in_Email_required_with(String arg1) throws Throwable {
		System.out.println("Type Email");
	}

	@Then("^fill in Password\\(required\\) with \"([^\"]*)\"$")
	public void fill_in_Password_required_with(String arg1) throws Throwable {
		System.out.println("Type Password");
	}

	@Then("^Select in Date of Birth with \"([^\"]*)\"$")
	public void select_in_Date_of_Birth_with(String arg1) throws Throwable {
		System.out.println("Select Date of birth");
	}

	@Then("^fill in Company with \"([^\"]*)\"$")
	public void fill_in_Company_with(String arg1) throws Throwable {
		System.out.println("Type company name");
	}

	@Then("^fill in Address\\(required\\) with \"([^\"]*)\"$")
	public void fill_in_Address_required_with(String arg1) throws Throwable {
		System.out.println("Type address");
	}

	@Then("^fill in Address \\(Line(\\d+)\\) with \"([^\"]*)\"$")
	public void fill_in_Address_Line_with(int arg1, String arg2) throws Throwable {
		System.out.println("Type aditive address");
	}

	@Then("^fill in City\\(required\\) with \"([^\"]*)\"$")
	public void fill_in_City_required_with(String arg1) throws Throwable {
		System.out.println("Type City");
	}

	@Then("^Select in State with \"([^\"]*)\"$")
	public void select_in_State_with(String arg1) throws Throwable {
		System.out.println("Select state");
	}

	@Then("^fill in Zip/Postal Code\\(required\\) with \"([^\"]*)\"$")
	public void fill_in_Zip_Postal_Code_required_with(String arg1) throws Throwable {
		System.out.println("Type postal code");
	}

	@Then("^Select in Country with \"([^\"]*)\"$")
	public void select_in_Country_with(String arg1) throws Throwable {
		System.out.println("Select country");
	}

	@Then("^fill in Additional information with \"([^\"]*)\"$")
	public void fill_in_Additional_information_with(String arg1) throws Throwable {
		System.out.println("Type information");
	}

	@Then("^fill in Home phone with \"([^\"]*)\"$")
	public void fill_in_Home_phone_with(String arg1) throws Throwable {
		System.out.println("Type home number");
	}

	@Then("^fill in Mobile phone\\(required\\) with \"([^\"]*)\"$")
	public void fill_in_Mobile_phone_required_with(String arg1) throws Throwable {
		System.out.println("Type mobile number");
	}

	@Then("^fill in Assign an address alias for future reference\\. with \"([^\"]*)\"$")
	public void fill_in_Assign_an_address_alias_for_future_reference_with(String arg1) throws Throwable {
		System.out.println("Type name for Address");
	}
	
	@Then("^press Create an Account$")
	public void press_Create_an_Account() throws Throwable {
		System.out.println("Press create account");
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) throws Throwable {
	    System.out.println("Welcome to your account. Here you can manage all of your personal information and orders.");
	}

}

import cucumber.api.java.en.Then;

public class DefinitionCP_004 {

	@Then("^show (\\d+) results have been found\\.$")
	public void show_results_have_been_found(int arg1) throws Throwable {
	    System.out.println("Show 0 items");
	}

}

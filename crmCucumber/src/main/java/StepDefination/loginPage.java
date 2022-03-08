package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginPage {
	
	@Given("^user go to crm page \"([^\"]*)\"$")
	public void user_go_to_crm_page(String a) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("open crm page "+ a);
	    
	}

	@Given("^wait for (\\d+) second$")
	public void wait_for_second(int arg1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("wait for 5 second : "+ arg1);
		Thread.sleep(5);
	}

	@When("^user enters the username mahesh$")
	public void user_enters_the_username(){
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter the user name");
	}

	@When("^user enters the password$")
	public void user_enters_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter the password");
	    
	}

	@When("^user click on login button$")
	public void user_click_on_login_button()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
	}
	@Then("^check home page is open with welcome username$")
	public void check_home_page_is_open_with_welcome_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on home page");
	}

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to write a step with name: "+ arg1);
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I want to write a step with name: "+ arg1);
	}

//	@Then("^I verify the (\\d+) in step$")
//	public void i_verify_the_success_in_step(String arg1) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("I verify the: "+ arg1);
//	}
	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I verify the: ");
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I verify the: ");
	
	}
}

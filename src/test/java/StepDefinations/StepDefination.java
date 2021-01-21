package StepDefinations;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("on Netbanking landing pag");
    }

    @When("^User login into application using username and password$")
    public void user_login_into_application_using_username_and_password() throws Throwable {
    	 System.out.println("application using username and password");
    }
    
    @When("^User login into application using \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_using_something_and_password_something(String strArg1, String strArg2) throws Throwable {
       System.out.println("User name " + strArg1 +" " + "Password is " + strArg2);
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page is populatedd");
    }

    @And("^Cards displayed is \"([^\"]*)\"$")
    public void cards_displayed_is(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       System.out.println(arg1);
    }

}
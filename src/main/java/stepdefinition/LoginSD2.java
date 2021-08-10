package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSD2 {

    @Given("^login page should be opened$")
    public void login_page_should_be_opened() throws Throwable {
        System.out.println("login page is opened");
    }

    @When("^we enter valid username and valid password$")
    public void we_enter_valid_username_and_valid_password() throws Throwable {
        System.out.println("We enter valid username and valid password");
    }

    @Then("^we redirect to home page$")
    public void we_redirect_to_home_page() throws Throwable {
        System.out.println("we redirect to home page");
    }

    @And("^we click on login button$")
    public void we_click_on_login_button() throws Throwable {
        System.out.println("we click on login button");
    }


    @When("^we enter invalid username and valid password$")
    public void we_enter_invalid_username_and_valid_password() throws Throwable {
        System.out.println("we enter invalid username and valid password");
    }

    @Then("^we should get error$")
    public void we_should_get_error() throws Throwable {
        System.out.println("We should get error");
    }

    @When("^we enter blank username and password$")
    public void we_enter_blank_username_and_password() throws Throwable {
        System.out.println("we enter blank username and password");
    }

    @Then("^we should get another error$")
    public void we_should_get_another_error() throws Throwable {
        System.out.println("we should get another error");
    }

    /*@When("^we enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void we_enter_something_and_something(String username, String password)
             {
                 System.out.println("Username:"+username);
                 System.out.println("Password:"+password);

             }*/
}
package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserInfoSD {
    @Given("^I am on user info addition page$")
    public void i_am_on_user_info_addition_page() throws Throwable {
        System.out.println("I am on user info addition page");
    }

    @When("^I enter (.+) , (.+) , (.+)$")
    public void i_enter_(String name, String phone, String email)
            {
                System.out.println("Name="+name);
                System.out.println("Phone="+phone);
                System.out.println("Email="+email);
            }

    @Then("^user should be added$")
    public void user_should_be_added() throws Throwable {
        System.out.println("user should be added");
    }

    @And("^click on save$")
    public void click_on_save() throws Throwable {
        System.out.println("click on save");
    }
}

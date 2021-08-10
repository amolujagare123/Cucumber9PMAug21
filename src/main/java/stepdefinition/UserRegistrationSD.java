package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class UserRegistrationSD {

    @Given("Add User page should be opened")
    public void add_user_page_should_be_opened() {
        System.out.println("Add User page should be opened");
    }
    @When("I enter below Data")
    public void i_enter_below_data(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.


        List<String> data = dataTable.asList();

        System.out.println("Name="+data.get(0));
        System.out.println("Email="+data.get(1));
        System.out.println("Phone="+data.get(2));
        System.out.println("City="+data.get(3));


    }
    @When("I click on submit button")
    public void i_click_on_submit_button() {
        System.out.println("I click on submit button");
    }
    @Then("data should be addded")
    public void data_should_be_addded() {
        System.out.println("data should be addded");
    }

}

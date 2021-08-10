package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSD {

    WebDriver driver;

    @Given("login page is opened")
    public void login_page_is_opened() {

        System.out.println("login page is opened");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.net");

    }
    @When("I enter valid username and valid password")
    public void i_enter_valid_username_and_valid_password() {

        System.out.println("I enter valid username and valid password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");

    }
    @When("I click on login button")
    public void i_click_on_login_button() {

        System.out.println("I click on login button");
        driver.findElement(By.name("submit")).click();
    }
    @Then("I am redirected to home page")
    public void i_am_redirected_to_home_page() {
        System.out.println("I am redirected to home page");

        String expected="https://stock.scriptinglogic.net/dashboard.php";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals("this is not hompage",expected,actual);

    }
}

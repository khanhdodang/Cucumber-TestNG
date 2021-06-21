package heroku;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    WebDriver driver;

    @Given("^I have open the browser$")
    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^I open Heroku website$")
    public void goToHerokuPage() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successfully");
    }

    @Then("^Message1$")
    public void msg1() throws Throwable {
        System.out.println("Message1");
    }

    @Then("^Message2$")
    public void msg2() throws Throwable {
        System.out.println("Message22");
    }

    @Then("^Close browser$")
    public void close_browser() throws Throwable {
        driver.quit();
        System.out.println("Close browser Successfully");
    }
}

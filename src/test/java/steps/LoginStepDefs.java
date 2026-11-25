package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class LoginStepDefs {

    @Managed
    LoginPage loginPage;

    @Given("i am on the Login Page")
    public void iAmOnTheLoginPage() {
       loginPage.open();
    }

    @When("i enter my email address {string} and my password {string}")
    public void iEnterMyEmailAddressAndMyPassword(String email, String password) {
        loginPage.setLoginDetails(email, password);
    }

    @And("i click the sign in button")
    public void iClickTheSignInButton() {
        loginPage.signIn();
    }

    @Then("i should be redirected to the SauceDemo homepage")
    public void iShouldBeRedirectedToTheSauceDemoHomepage() {  assertThat(loginPage.getDriver().getCurrentUrl(), is("https://www.saucedemo.com/inventory.html"));
    }
}

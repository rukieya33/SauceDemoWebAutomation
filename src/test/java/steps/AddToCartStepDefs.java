package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.AddToCartPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

@ExtendWith(SerenityJUnit5Extension.class)
public class AddToCartStepDefs {

    @Managed
    AddToCartPage addToCartPage;

    @Given("i am on the Product Page")
    public void iAmOnTheProductPage() {
        addToCartPage.open();
    }

    @When("i click add to cart")
    public void iClickAddToCart() {
        addToCartPage.addProduct();
    }

    @Then("the cart should display a number greater than or equal to an increment of {int}")
    public void theCartShouldDisplayANumberGreaterThanOrEqualToAnIncrementOf(int increment) {
       assertThat(addToCartPage.getCartNumAddedProduct(), greaterThanOrEqualTo(increment));
    }
}

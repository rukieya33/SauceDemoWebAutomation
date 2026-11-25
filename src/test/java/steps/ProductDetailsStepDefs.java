package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.ProductDetialsPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@ExtendWith(SerenityJUnit5Extension.class)
public class ProductDetailsStepDefs {

    @Managed
    ProductDetialsPage productDetialsPage;

    @Given("i am on the All Products Page")
    public void iAmOnTheAllProductsPage() {
       productDetialsPage.open();
    }

    @When("i click on a title for the product id {string}")
    public void iClickOnATitleForTheProductId(String productId) {
      productDetialsPage.getSpecificInventory();
    }

    @Then("i should be redirected to the Product details page for the product with the given id {string}")
    public void iShouldBeRedirectedToTheProductDetailsPageForTheProductWithTheGivenId(String productId) {
       assertThat(productDetialsPage.getDriver().getCurrentUrl(), containsString(productId));
    }

}

package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class AddToCartPage extends PageObject {

  @FindBy(className = "shopping_cart_badge")
  private WebElement cart;

  @FindBy(css =  ".pricebar")
  private WebElement priceBar;

  public void addProduct() {
    priceBar.findElement(By.className("btn")).click();
  }
  public int getCartNumAddedProduct(){
     return Integer.parseInt(cart.getText());
  }
}

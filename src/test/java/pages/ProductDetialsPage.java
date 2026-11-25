package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ProductDetialsPage extends PageObject {

    @FindBy(className =  "inventory-item-name")
    private WebElement inventoryItemName;

    @FindBy(id =  "inventory_container")
    private WebElement inventoryList;

    public void getSpecificInventory(){
       inventoryList.findElement(By.tagName("a")).click();
    }

}


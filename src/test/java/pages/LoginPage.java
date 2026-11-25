package pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElement authEmail;

    @FindBy(id = "password")
    private WebElement authPassword;

    @FindBy(id = "login-button")
    private WebElement signInSubmit;

    public void setLoginDetails(String email, String password ){
        authEmail.sendKeys(email);
        authPassword.sendKeys(password);
    }

    public void signIn(){
        signInSubmit.click();
    }
}

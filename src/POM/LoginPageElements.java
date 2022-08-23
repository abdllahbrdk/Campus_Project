package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {

    public LoginPageElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[name='username']")
    public WebElement userNameInput;

    @FindBy(css = "input[name='password']")
    public WebElement passwordInput;

    @FindBy(css = "input[value='Log In']")
    public WebElement logInButton;
}

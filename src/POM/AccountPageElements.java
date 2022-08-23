package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPageElements {
    public AccountPageElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Open New Account']")
    public WebElement openNewAccountButton;

    @FindBy(id = "type")
    public WebElement accountDropDown;

    @FindBy(id = "fromAccountId")
    public WebElement depositAccountButton;

    @FindBy(css = "input[class='button']")
    public WebElement openNewAccountButton2;

    @FindBy(xpath = "//h1[text()='Account Opened!']")
    public WebElement accountOpenedMessage;
}

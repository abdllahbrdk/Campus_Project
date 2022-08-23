package TEST;

import POM.HomePageElements;
import POM.LoginPageElements;
import UTILS.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginFunctionalTest extends BaseDriver {

    LoginPageElements loginPageElements;

    HomePageElements homePageElements;

    @Parameters({"userName","password"})
    @Test
    public void loginTest(String userName,String password){
        loginPageElements = new LoginPageElements(driver);
        homePageElements = new HomePageElements(driver);
        loginPageElements.userNameInput.sendKeys(userName);
        loginPageElements.passwordInput.sendKeys(password);
        loginPageElements.logInButton.click();

        Assert.assertTrue(homePageElements.welcomeMessage.getText().equals("Welcome"));

    }
}

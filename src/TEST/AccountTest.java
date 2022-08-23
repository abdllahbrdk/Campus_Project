package TEST;

import POM.AccountPageElements;
import POM.HomePageElements;
import POM.LoginPageElements;
import UTILS.BaseDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AccountTest extends BaseDriver {

    LoginPageElements loginPageElements;

    HomePageElements homePageElements;

    AccountPageElements accountPageElements;

    @Parameters({"userName","password"})
    @Test
    public void accountTest(String userName,String password){
        loginPageElements = new LoginPageElements(driver);
        homePageElements = new HomePageElements(driver);
        accountPageElements = new AccountPageElements(driver);
        loginPageElements.userNameInput.sendKeys(userName);
        loginPageElements.passwordInput.sendKeys(password);
        loginPageElements.logInButton.click();

        Assert.assertTrue(homePageElements.welcomeMessage.getText().equals("Welcome"));
        accountPageElements.openNewAccountButton.click();

        Select select = new Select(accountPageElements.accountDropDown);
        select.selectByIndex(0);

        Select select1 = new Select(accountPageElements.depositAccountButton);
        select1.selectByIndex(0);

        accountPageElements.openNewAccountButton2.click();


        Assert.assertTrue(accountPageElements.accountOpenedMessage.getText().equals("Account Opened!"));



    }


}

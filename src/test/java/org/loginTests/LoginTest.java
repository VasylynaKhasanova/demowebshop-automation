package org.loginTests;

import org.baseTest.BaseTest;
import org.junit.Test;
import static org.data.TestData.*;

public class LoginTest extends BaseTest {

    @Test
    public void T0001_validLoginTest() {
        pageProvider.getHomePage()
                .openHomePage()
                .getHeaderElement()
                .clickOnHeaderButtonLogIn()
                .checkIsRedirectToLoginPage()
                .enterTextIntoInputEmail(VALID_EMAIL)
                .enterTextIntoInputPassword(VALID_PASSWORD)
                .clickOnButtonLogIn()
                .checkIsRedirectToHomePage()
                .checkIsWelcomeMessageVisible()
                .getHeaderElement()
                .checkIsButtonLogOutVisible();

        pageProvider.getHomePage().getHeaderElement().checkIsButtonCustomerInfoVisible();
        pageProvider.getHomePage().getHeaderElement().checkIsHeaderButtonLogInInvisible();
    }

    @Test
    public void T0002_loginWithInvalidPasswordTest() {
        pageProvider.getHomePage()
                .openHomePage()
                .getHeaderElement()
                .clickOnHeaderButtonLogIn()
                .checkIsRedirectToLoginPage()
                .enterTextIntoInputEmail(VALID_EMAIL)
                .enterTextIntoInputPassword(INVALID_PASSWORD)
                .clickOnButtonLogIn()
                .getHeaderElement()
                .checkIsButtonRegisterVisible();

        pageProvider.getLoginPage()
                .checkIsRedirectToLoginPage()
                .checkIsIncorrectCredentialsErrorVisible()
                .checkIsLogInButtonVisible()
        ;

        pageProvider.getHomePage().getHeaderElement().checkIsButtonLogOutInvisible();
    }

    @Test
    public void T0003_loginWithNotRegisteredEmailTest() {
        pageProvider.getHomePage()
                .openHomePage()
                .getHeaderElement()
                .clickOnHeaderButtonLogIn()
                .checkIsRedirectToLoginPage()
                .enterTextIntoInputEmail("notRegisteredEmail@gmail.com")
                .enterTextIntoInputPassword("invalidPassword2324")
                .clickOnButtonLogIn()
                .getHeaderElement()
                .checkIsButtonRegisterVisible();

        pageProvider.getLoginPage()
                .checkIsRedirectToLoginPage()
                .checkIsNoCustomerAccountErrorVisible()
                .checkIsLogInButtonVisible()
        ;

        pageProvider.getHomePage().getHeaderElement().checkIsButtonLogOutInvisible();
    }
}

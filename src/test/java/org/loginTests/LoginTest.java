package org.loginTests;

import org.baseTest.BaseTest;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void T0001_validLoginTest() {
        pageProvider.getHomePage()
                .openHomePage()
                .getHeaderElement()
                .clickOnButtonLogIn()
                .checkIsRedirectToLoginPage()
                .enterTextIntoInputEmail("autotestva@gmail.com")
                .enterTextIntoInputPassword("ewedce33434")
                .clickOnButtonLogIn()
                .checkIsRedirectToHomePage()
                .checkIsWelcomeMessageVisible()
                .getHeaderElement()
                .checkIsButtonLogOutVisible();

        pageProvider.getHomePage().getHeaderElement().checkIsButtonCustomerInfoVisible();
        pageProvider.getHomePage().getHeaderElement().checkIsButtonLogInInvisible();
    }
}

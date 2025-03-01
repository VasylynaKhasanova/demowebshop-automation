package org.loginTests;

import org.baseTest.BaseTest;
import org.junit.Test;

import static org.data.TestData.VALID_EMAIL;
import static org.data.TestData.VALID_PASSWORD;

public class LoginTest extends BaseTest {

    @Test
    public void T0001_validLoginTest() {
        pageProvider.getHomePage()
                .openHomePage()
                .getHeaderElement()
                .clickOnButtonLogIn()
                .checkIsRedirectToLoginPage()
                .enterTextIntoInputEmail(VALID_EMAIL)
                .enterTextIntoInputPassword(VALID_PASSWORD)
                .clickOnButtonLogIn()
                .checkIsRedirectToHomePage()
                .checkIsWelcomeMessageVisible()
                .getHeaderElement()
                .checkIsButtonLogOutVisible();

        pageProvider.getHomePage().getHeaderElement().checkIsButtonCustomerInfoVisible();
        pageProvider.getHomePage().getHeaderElement().checkIsButtonLogInInvisible();
    }
}

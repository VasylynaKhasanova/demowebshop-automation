package org.loginTests;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.baseTest.BaseTest;
import org.junit.Test;
import org.data.LoginAuthenticationErrors;
import org.junit.runner.RunWith;

import static org.data.TestData.*;

@RunWith(JUnitParamsRunner.class)
public class AuthenticationErrorsTest extends BaseTest {

        @Test
        @Parameters(method = "parametersForValidationErrorTest")
        public void T0004_authenticationErrorTest(String email, String password, String expectedMessage) {
            pageProvider.getHomePage()
                    .openHomePage()
                    .getHeaderElement()
                    .clickOnHeaderButtonLogIn()
                    .checkIsRedirectToLoginPage()
                    .enterTextIntoInputEmail(email)
                    .enterTextIntoInputPassword(password)
                    .clickOnButtonLogIn();
            pageProvider.getLoginPage().checkAuthenticationErrorsText(expectedMessage);
        }

    public Object[][] parametersForAuthenticationErrorTest() {
        return new Object[][]{
                {VALID_EMAIL, INVALID_PASSWORD, LoginAuthenticationErrors.INCORRECT_CREDENTIALS},
                {NOT_REGISTERED_EMAIL, INVALID_PASSWORD, LoginAuthenticationErrors.NO_CUSTOMER_ACCOUNT}
        };
    }

}

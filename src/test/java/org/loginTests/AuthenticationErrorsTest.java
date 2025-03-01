package org.loginTests;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.baseTest.BaseTest;
import org.junit.Test;
import org.data.LoginAuthenticationErrors;
import org.junit.runner.RunWith;

import static org.data.TestData.VALID_EMAIL;

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
                {VALID_EMAIL, "invalidPassword2324", LoginAuthenticationErrors.INCORRECT_CREDENTIALS},
                {"notRegisteredEmail@gmail.com", "invalidPassword2324", LoginAuthenticationErrors.NO_CUSTOMER_ACCOUNT}
        };
    }

}

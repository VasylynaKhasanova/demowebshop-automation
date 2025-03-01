package org.loginTests;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.baseTest.BaseTest;
import org.junit.Test;
import org.data.LoginValidationErrors;
import org.junit.runner.RunWith;

import static org.data.TestData.VALID_EMAIL;

@RunWith(JUnitParamsRunner.class)
public class ValidationErrorsTest extends BaseTest {

        @Test
        @Parameters(method = "parametersForValidationErrorTest")
        public void T0004_validationErrorTest( String email, String password, String expectedMessage) {
            pageProvider.getHomePage()
                    .openHomePage()
                    .getHeaderElement()
                    .clickOnHeaderButtonLogIn()
                    .checkIsRedirectToLoginPage()
                    .enterTextIntoInputEmail(email)
                    .enterTextIntoInputPassword(password)
                    .clickOnButtonLogIn();
            pageProvider.getLoginPage().checkValidationErrorsText(expectedMessage);
        }

    public Object[][] parametersForValidationErrorTest() {
        return new Object[][]{
                {VALID_EMAIL, "invalidPassword2324", LoginValidationErrors.INCORRECT_CREDENTIALS},
                {"notRegisteredEmail@gmail.com", "invalidPassword2324", LoginValidationErrors.NO_CUSTOMER_ACCOUNT}
        };
    }

}

package org.registrationTests;

import org.baseTest.BaseTest;
import org.data.TestData;
import org.junit.Test;
import org.utils.Utils_Custom;

public class RegistrationTest extends BaseTest {
    @Test
    public void T0007_validRegistrationTest() {
        String randomFirstName = TestData.getRandomFirstName();
        String randomLastName = TestData.getRandomLastName();
        String randomEmail = "test" + Utils_Custom.getDateAndTimeFormattedOnlyNumbers() + "@gmail.com";
        String randomPassword = TestData.getRandomPassword();

        pageProvider.getHomePage()
                .openHomePage()
                .getHeaderElement()
                .clickOnButtonRegister()
                .checkIsRedirectToRegistrationPage()
                .clickOnGenderRadioButton(TestData.getRandomGender())
                .enterTextIntoInputFirstName(randomFirstName)
                .enterTextIntoInputLastName(randomLastName)
                .enterTextIntoInputEmail(randomEmail)
                .enterTextIntoInputPassword(randomPassword)
                .enterTextIntoInputConfirmPassword(randomPassword)
                .clickOnButtonRegister()
                .checkIsRedirectToRegistartionResultPage()
                .checkIsSuccessRegistrationMessageDisplayed()
                .checkTextInSuccessRegistrationMessage("Your registration completed")
                .checkIsButtonContinueVisible()
                .clickOnButtonContinue()
                .checkIsRedirectToHomePage()
                .checkIsWelcomeMessageVisible()
                .getHeaderElement()
                .checkIsButtonLogOutVisible();

        pageProvider.getHomePage().getHeaderElement().checkIsButtonCustomerInfoVisible();
        pageProvider.getHomePage().getHeaderElement().checkIsHeaderButtonLogInInvisible();
    }
}

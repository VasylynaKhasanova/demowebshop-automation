package org.registrationTests;

import org.baseTest.BaseTest;
import org.data.TestData;
import org.junit.Test;

public class RegistrationTest extends BaseTest {
    @Test
    public void T0007_validRegistrationTest() {
        TestData testData = new TestData();
        String randomFirstName = testData.getRandomFirstName();
        String randomLastName = testData.getRandomLastName();
        String randomEmail = testData.getRandomEmail();
        String randomPassword = testData.getRandomPassword();
        String randomGender = testData.getRandomGender();

        pageProvider.getHomePage()
                .openHomePage()
                .getHeaderElement()
                .clickOnButtonRegister()
                .checkIsRedirectToRegistrationPage()
                .clickOnGenderRadioButton(randomGender)
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

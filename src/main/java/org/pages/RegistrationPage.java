package org.pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends ParentPage {
    private Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//input[@id='gender-male']")
    private WebElement radioButtonMale;

    @FindBy(xpath = "//input[@id='gender-female']")
    private WebElement radioButtonFemale;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement inputLastName;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    private WebElement inputConfirmPassword;

    @FindBy(xpath = "//input[@id='register-button']")
    private WebElement buttonRegister;

    public RegistrationPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/register";
    }

    public RegistrationPage clickOnGenderRadioButton(String gender) {
        if (gender.equals("Male")) {
            clickOnElement(radioButtonMale);
        } else if (gender.equals("Female")) {
            clickOnElement(radioButtonFemale);
        } else {
            logger.error("Gender should be only 'Male' or 'Female'");
            Assert.fail("Gender should be only 'Male' or 'Female'");
        }
        return this;
    }

    public RegistrationPage enterTextIntoInputFirstName(String firstName) {
        clearAndEnterTextIntoElement(inputFirstName, firstName);
        return this;
    }

    public RegistrationPage enterTextIntoInputLastName(String lastName) {
        clearAndEnterTextIntoElement(inputLastName, lastName);
        return this;
    }

    public RegistrationPage enterTextIntoInputEmail(String email) {
        clearAndEnterTextIntoElement(inputEmail, email);
        return this;
    }

    public RegistrationPage enterTextIntoInputPassword(String password) {
        clearAndEnterTextIntoElement(inputPassword, password);
        return this;
    }

    public RegistrationPage enterTextIntoInputConfirmPassword(String confirmPassword) {
        clearAndEnterTextIntoElement(inputConfirmPassword, confirmPassword);
        return this;
    }

    public RegistartionResultPage clickOnButtonRegister() {
        clickOnElement(buttonRegister);
        return new RegistartionResultPage(webDriver);
    }

    public RegistrationPage checkIsRedirectToRegistrationPage() {
        checkUrl();
        return this;
    }
}

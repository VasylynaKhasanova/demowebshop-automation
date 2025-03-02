package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends ParentPage {

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

    public RegistrationPage clickOnRadioButtonMale() {
        clickOnElement(radioButtonMale);
        return this;
    }

    public RegistrationPage clickOnRadioButtonFemale() {
        clickOnElement(radioButtonFemale);
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

    public HomePage clickOnButtonRegister() {
        clickOnElement(buttonRegister);
        return new HomePage(webDriver);
    }

}

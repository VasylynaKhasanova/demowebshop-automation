package org.pages;

import org.apache.log4j.Logger;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.data.TestData.VALID_EMAIL;
import static org.data.TestData.VALID_PASSWORD;

public class LoginPage extends ParentPage {
    private Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log in']")
    private WebElement buttonLogIn;

    @FindBy(xpath = "//li[text()='The credentials provided are incorrect']")
    private WebElement incorrectCredentialsError;

    @FindBy(xpath = "//li[text()='No customer account found']")
    private WebElement noCustomerAccountError;

    @FindBy(xpath = "//div[@class='validation-summary-errors']//li")
    private WebElement authenticationErrorMessage;

    @FindBy(xpath = "//span[@for='Email']")
    private WebElement invalidEmailError;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/login";
    }

    public LoginPage checkIsRedirectToLoginPage() {
        checkUrl();
        return this;
    }

    public LoginPage enterTextIntoInputEmail(String email) {
        clearAndEnterTextIntoElement(inputEmail, email);
        return this;
    }

    public LoginPage enterTextIntoInputPassword(String password) {
        clearAndEnterTextIntoElement(inputPassword, password);
        return this;
    }

    public HomePage clickOnButtonLogIn() {
        clickOnElement(buttonLogIn);
        return new HomePage(webDriver);
    }

    public LoginPage checkIsLogInButtonVisible() {
        checkIsElementVisible(buttonLogIn);
        return this;
    }

    public LoginPage checkIsIncorrectCredentialsErrorVisible() {
        checkIsElementVisible(incorrectCredentialsError);
        return this;
    }

    public LoginPage checkIsNoCustomerAccountErrorVisible() {
        checkIsElementVisible(noCustomerAccountError);
        return this;
    }

    public LoginPage checkAuthenticationErrorsText(String expectedError) {
        webDriverWait15.until(ExpectedConditions.visibilityOf(authenticationErrorMessage));

        String actualErrorText = authenticationErrorMessage.getText();
        logger.info("Verifying error message: '" + actualErrorText + "' (Expected: '" + expectedError + "')");

        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(actualErrorText)
                .as("Check error message")
                .isEqualTo(expectedError);

        softAssertions.assertAll();
        return this;
    }

    public LoginPage checkInvalidEmailErrorText(String expectedError) {
        checkTextInElement(invalidEmailError, expectedError);
        return this;
    }

    public LoginPage checkIsInvalidEmailErrorIsVisible() {
        checkIsElementVisible(invalidEmailError);
        return this;
    }

    public LoginPage openLoginPage() {
        webDriver.get(baseUrl + getRelativeUrl());
        logger.info("Home Page was opened with url " + baseUrl + getRelativeUrl());
        return this;
    }

    public HomePage openLoginPageAndFillLoginFormWithValidCred() {
        openLoginPage();
        enterTextIntoInputEmail(VALID_EMAIL);
        enterTextIntoInputPassword(VALID_PASSWORD);
        clickOnButtonLogIn();
        return new HomePage(webDriver);
    }

}

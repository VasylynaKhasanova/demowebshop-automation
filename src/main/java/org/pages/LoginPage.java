package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
}
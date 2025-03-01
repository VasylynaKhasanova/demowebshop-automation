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

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/login";
    }

    public LoginPage openPage() {
        webDriver.get(baseUrl);
        logger.info("Login Page was opened with url " + baseUrl);
        return this;
    }

}

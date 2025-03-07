package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistartionResultPage extends ParentPage {

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement buttonContinue;

    @FindBy(xpath = "//div[@class='result']")
    private WebElement successRegistrationMessage;

    public RegistartionResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/registerresult/1";
    }

    public RegistartionResultPage checkIsRedirectToRegistartionResultPage() {
        checkUrl();
        return this;
    }

    public HomePage clickOnButtonContinue() {
        clickOnElement(buttonContinue);
        return new HomePage(webDriver);
    }

    public RegistartionResultPage checkIsButtonContinueVisible() {
        checkIsElementVisible(buttonContinue);
        return this;
    }

    public RegistartionResultPage checkIsSuccessRegistrationMessageDisplayed() {
        checkIsElementVisible(successRegistrationMessage);
        return this;
    }

    public RegistartionResultPage checkTextInSuccessRegistrationMessage() {
        checkTextInElement(successRegistrationMessage, "Your registration completed");
        return this;
    }
}

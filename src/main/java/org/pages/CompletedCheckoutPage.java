package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletedCheckoutPage extends ParentPage {
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='title']/strong]")
    private WebElement successMessage;

    public CompletedCheckoutPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/checkout/completed/";
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void checkSuccessMessage() {
        checkIsElementVisible(successMessage);
    }

    public CompletedCheckoutPage checkIsRedirectToCompletedCheckoutPage() {
        checkUrl();
        return this;
    }


}

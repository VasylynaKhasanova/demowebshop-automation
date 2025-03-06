package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompletedCheckoutPage extends ParentPage {
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement completedCheckoutContinueButton;

    @FindBy(xpath = "//div[@class='title']/strong")
    private WebElement orderCompletedSuccessMessage;

    public CompletedCheckoutPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/checkout/completed/";
    }

    public void clickOnCompletedCheckoutContinueButton() {
        clickOnElement(completedCheckoutContinueButton);
    }

    public void checkOrderCompletedSuccessMessage() {
        checkIsElementVisible(orderCompletedSuccessMessage);
    }

    public void checkIsOrderCompletedSuccessMessageVisible() {
        checkIsElementVisible(orderCompletedSuccessMessage);
    }

    public CompletedCheckoutPage checkIsRedirectToCompletedCheckoutPage() {
        webDriverWait15.until(ExpectedConditions.urlContains(getRelativeUrl()));
        checkUrl();
        return this;
    }


}

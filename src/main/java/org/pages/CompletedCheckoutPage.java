package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CompletedCheckoutPage extends ParentPage {
    private String orderNumber;
    private Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement completedCheckoutContinueButton;

    @FindBy(xpath = "//div[@class='title']/strong")
    private WebElement orderCompletedSuccessMessage;

    @FindBy(xpath = "//a[contains(@href, '/orderdetails/')]")
    private WebElement orderDetailsLink;

    @FindBy(xpath = "//li[contains(text(), 'Order number: ')]")
    private WebElement orderNumberDetails;

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

    public CompletedCheckoutPage checkOrderCompletedSuccessMessage() {
        checkTextInElement(orderCompletedSuccessMessage, "Your order has been successfully processed!");
        return this;
    }

    public CompletedCheckoutPage checkIsOrderCompletedSuccessMessageVisible() {
        checkIsElementVisible(orderCompletedSuccessMessage);
        return this;
    }

    public CompletedCheckoutPage checkIsRedirectToCompletedCheckoutPage() {
        webDriverWait15.until(ExpectedConditions.urlContains(getRelativeUrl()));
        checkUrl();
        return this;
    }

    public CompletedCheckoutPage checkIsOrderDetailsLinkVisible() {
        checkIsElementVisible(orderDetailsLink);
        return this;
    }

    public OrderInformationPage clickOnOrderDetailsLink() {
        orderNumber = extractOrderNumber();
        clickOnElement(orderDetailsLink);
        webDriverWait15.until(ExpectedConditions.urlContains("/orderdetails/"));
        OrderInformationPage orderInformationPage = new OrderInformationPage(webDriver, orderNumber);
        return orderInformationPage;
    }


    public CompletedCheckoutPage checkIsOrderNumberDetailsVisible() {
        checkIsElementVisible(orderNumberDetails);
        return this;
    }

    public String extractOrderNumber() {
        orderNumber = extractDigits(orderNumberDetails.getText());
        logger.info("Order number is: " + orderNumber);
        return orderNumber;
    }
}

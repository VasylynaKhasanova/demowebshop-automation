package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class PaymentMethodElements extends CommonActionsWithElements {
    @FindBy(id="paymentmethod_0")
    private WebElement cashOnDeliveryPaymentMethod;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    public PaymentMethodElements(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkCashOnDeliveryPaymentMethod() {
        makeCheckboxChecked(cashOnDeliveryPaymentMethod);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}

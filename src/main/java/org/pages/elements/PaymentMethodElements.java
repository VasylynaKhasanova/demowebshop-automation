package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class PaymentMethodElements extends CommonActionsWithElements {
    @FindBy(xpath = "//li[@class='tab-section allow active']//h2[text()='Payment method']")
    private WebElement paymentMethodTitle;

    @FindBy(id="paymentmethod_0")
    private WebElement cashOnDeliveryPaymentMethod;

    @FindBy(xpath = "//div[@id='payment-method-buttons-container']//input[@value='Continue']")
    private WebElement paymentMethodContinueButton;

    public PaymentMethodElements(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkCashOnDeliveryPaymentMethod() {
        makeCheckboxChecked(cashOnDeliveryPaymentMethod);
    }

    public void clickOnPaymentMethodContinueButton() {
        clickOnElement(paymentMethodContinueButton);
    }

    public void checkIsPaymentMethodTitleVisible() {
        checkIsElementVisible(paymentMethodTitle);
    }
}

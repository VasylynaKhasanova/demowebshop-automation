package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class PaymentInformationElements extends CommonActionsWithElements {
    @FindBy(xpath = "//li[@class='tab-section allow active']//h2[text()='Payment information']")
    private WebElement paymentInformationTitle;

    @FindBy(xpath = "//div[@id='payment-info-buttons-container']//input[@value='Continue']")
    private WebElement paymentInformationContinueButton;

    public PaymentInformationElements(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnPaymentInformationContinueButton() {
        clickOnElement(paymentInformationContinueButton);
    }

    public void checkIsPaymentInformationTitleVisible() {
        checkIsElementVisible(paymentInformationTitle);
    }
}

package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class PaymentInformationElements extends CommonActionsWithElements {
    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    public PaymentInformationElements(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}

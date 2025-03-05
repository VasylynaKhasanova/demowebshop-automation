package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class ShippingAddressElements extends CommonActionsWithElements {
    @FindBy(id="PickUpInStore")
    private WebElement pickUpInStoreCheckbox;

    @FindBy(xpath = "//input[@type='button']")
    private WebElement continueButton;

    public ShippingAddressElements(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkPickUpInStoreCheckbox() {
        makeCheckboxChecked(pickUpInStoreCheckbox);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }
}

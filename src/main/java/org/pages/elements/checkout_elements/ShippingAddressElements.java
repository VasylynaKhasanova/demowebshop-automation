package org.pages.elements.checkout_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pages.CommonActionsWithElements;

public class ShippingAddressElements extends CommonActionsWithElements {
    @FindBy(xpath = "//li[@class='tab-section allow active']//h2[text()='Shipping address']")
    private WebElement shippingAddressTitle;

    @FindBy(id = "PickUpInStore")
    private WebElement pickUpInStoreCheckbox;

    @FindBy(xpath = "//li[@id='opc-shipping']//input[@title='Continue']")
    private WebElement shippingAddressContinueButton;

    public ShippingAddressElements(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkPickUpInStoreCheckbox() {
        makeCheckboxChecked(pickUpInStoreCheckbox);
    }

    public void clickOnShippingAddressContinueButton() {
        clickOnElement(shippingAddressContinueButton);
    }

    public void checkIsShippingAddressTitleVisible() {
        webDriverWait15.until(ExpectedConditions.visibilityOf(shippingAddressTitle));
        checkIsElementVisible(shippingAddressTitle);
    }
}

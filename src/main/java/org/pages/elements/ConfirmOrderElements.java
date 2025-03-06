package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class ConfirmOrderElements extends CommonActionsWithElements {
    @FindBy(xpath = "//li[@class='tab-section allow active']//h2[text()='Confirm order']")
    private WebElement confirmOrderTitle;

    @FindBy(xpath = "//input[@value='Confirm']")
    private WebElement confirmButton;

    public ConfirmOrderElements(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmButton);
    }

    public void checkIsConfirmOrderTitleVisible() {
        checkIsElementVisible(confirmOrderTitle);
    }
}

package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends ParentPage {
    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(id = "termsofservice")
    private WebElement termsOfServiceCheckbox;

    public ShoppingCartPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/cart";
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
    }

    public void checkIsCheckoutButtonVisible() {
        checkIsElementVisible(checkoutButton);
    }

    public void checkTermsOfServiceCheckbox(){
        makeCheckboxChecked(termsOfServiceCheckbox);
    }

}

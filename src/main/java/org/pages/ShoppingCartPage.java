package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.elements.HeaderElements;

import java.util.List;

public class ShoppingCartPage extends ParentPage {
    private Logger logger = Logger.getLogger(getClass());

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    @FindBy(id = "termsofservice")
    private WebElement termsOfServiceCheckbox;

    @FindBy(xpath = "//input[@name='removefromcart']")
    private List<WebElement> removeFromCartCheckboxes;

    @FindBy(xpath = "//input[@name='updatecart']")
    private WebElement updateShoppingCartButton;

    @FindBy(xpath = "//div[@class='order-summary-content']")
    private WebElement emptyShoppingCartMessage;

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

    public void checkTermsOfServiceCheckbox() {
        makeCheckboxChecked(termsOfServiceCheckbox);
    }

    public void checkIsRedirectToShoppingCartPage() {
        checkUrl();
    }

    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(updateShoppingCartButton);
    }

    public void checkIsEmptyShoppingCartMessageVisible() {
        checkIsElementVisible(emptyShoppingCartMessage);
    }

    public void checkTextInEmptyShoppingCartMessage(String text) {
        checkTextInElement(emptyShoppingCartMessage, text);
    }

    public void checkAllRemoveFromCartCheckboxes() {
        for (WebElement checkbox : removeFromCartCheckboxes) {
            makeCheckboxChecked(checkbox);
        }
    }

    public void checkAndRemoveAllProductsFromCart() {
        HeaderElements headerElements = new HeaderElements(webDriver);
        if (!headerElements.getCartQuantity().equals("(0)")) {
            headerElements.clickOnButtonShoppingCart();
            checkAllRemoveFromCartCheckboxes();
            clickOnUpdateShoppingCartButton();
            checkIsEmptyShoppingCartMessageVisible();
            checkTextInEmptyShoppingCartMessage("Your Shopping Cart is empty!");
            logger.info("All products were removed from the shopping cart");
        }
    }

}

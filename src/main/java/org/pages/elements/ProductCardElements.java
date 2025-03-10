package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class ProductCardElements extends CommonActionsWithElements {

    @FindBy(xpath = "//h2[@class='product-title']/a")
    private WebElement productName;

    @FindBy(xpath = "//div[@class='picture']/a/img")
    private WebElement productImage;

    @FindBy(xpath = "//span[@class='price old-price']")
    private WebElement productOldPrice;

    @FindBy(xpath = "//span[@class='price actual-price']")
    private WebElement productActualPrice;

    @FindBy(xpath = "//div[@class='rating']")
    private WebElement productRating;

    @FindBy(xpath = "//input[@value='Add to cart']")
    private WebElement addToCartButton;

    private WebElement productCardElement;

    public ProductCardElements(WebDriver webDriver, WebElement productCardElement) {
        super(webDriver);
        this.productCardElement = productCardElement;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public void checkIsAddToCartButtonVisible() {
        checkIsElementVisible(addToCartButton);
    }
}



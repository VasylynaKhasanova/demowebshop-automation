package org.pages.categories;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCard {
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

}

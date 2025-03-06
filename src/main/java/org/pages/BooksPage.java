package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pages.elements.ProductCardElements;

import java.util.ArrayList;
import java.util.List;

public class BooksPage extends ParentPage {
    private Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//div[@class='item-box']")
    private List<WebElement> productCards;

    @FindBy(xpath = "//p[@class='content']")
    private WebElement productAddedToCartSuccessMessage;

    public BooksPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/books";
    }

    public List<ProductCardElements> getAllProductCards() {
        List<ProductCardElements> cards = new ArrayList<>();

        for (WebElement card : productCards) {
            cards.add(new ProductCardElements(webDriver, card));
        }
        return cards;

    }

    public void addFirstAvailableProductToShoppingCart() {
        List<ProductCardElements> cards = getAllProductCards();

        for (ProductCardElements card : cards) {
            WebElement addToCartButton = card.getAddToCartButton();

            try {
                checkIsElementVisible(addToCartButton);
                addToCartButton.click();
                logger.info("Product added to cart successfully.");
                return;
            } catch (AssertionError e) {
                logger.info("Add to cart button is not visible for this product.");
            }
        }

        logger.info("No available 'Add to cart' button found.");
    }

    public BooksPage checkIsRedirectToBooksPage() {
        checkUrl();
        return this;
    }

    public void checkIsProductAddedToCartSuccessMessageIsVisible() {
        webDriverWait15.until(ExpectedConditions.visibilityOf(productAddedToCartSuccessMessage));
        checkIsElementVisible(productAddedToCartSuccessMessage);
    }

    public void checkTextInProductAddedToCartSuccessMessage() {
        checkTextInElement(productAddedToCartSuccessMessage, "The product has been added to your shopping cart");
    }


}

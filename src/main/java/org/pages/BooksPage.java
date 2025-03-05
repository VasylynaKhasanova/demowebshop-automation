package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.elements.ProductCardElements;

import java.util.ArrayList;
import java.util.List;

public class BooksPage extends ParentPage {
    private Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//div[@class='item-box']")
    private List<WebElement> productCards;

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

    public void addFirstProductToShoppingCart() {
        if (!productCards.isEmpty()) {
            ProductCardElements firstCard = new ProductCardElements(webDriver, productCards.get(0));
            firstCard.clickOnAddToCart();
        } else {
            logger.info("No product cards found on the page.");
        }
    }

    public BooksPage checkIsRedirectToBooksPage() {
        checkUrl();
        return this;
    }
}

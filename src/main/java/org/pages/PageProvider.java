package org.pages;

import org.openqa.selenium.WebDriver;

public class PageProvider {
    private WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public HomePage getHomePage() {
        return new HomePage(webDriver);
    }

    public LoginPage getLoginPage() {
        return new LoginPage(webDriver);
    }

    public BooksPage getBooksPage() {
        return new BooksPage(webDriver);
    }

    public ShoppingCartPage getShoppingCartPage() {
        return new ShoppingCartPage(webDriver);
    }

    public CheckoutPage getCheckoutPage() {
        return new CheckoutPage(webDriver);
    }

    public CompletedCheckoutPage getCompletedCheckoutPage() {
        return new CompletedCheckoutPage(webDriver);
    }


}

package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BooksPage;
import org.pages.CommonActionsWithElements;

public class NavigationMenuElements extends CommonActionsWithElements {
    @FindBy(xpath = "//ul[@class='top-menu']//a[@href='/books']")
    private WebElement buttonBooks;

    public NavigationMenuElements(WebDriver webDriver) {
        super(webDriver);
    }

    public BooksPage clickOnButtonBooks() {
        clickOnElement(buttonBooks);
        return new BooksPage(webDriver);
    }

    public void checkIsButtonBooksVisible() {
        checkIsElementVisible(buttonBooks);
    }
}

package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class NavigationMenuElement extends CommonActionsWithElements {
    @FindBy(xpath = "//ul[@class='top-menu']//a[@href='/books']")
    private WebElement buttonBooks;

    public NavigationMenuElement(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnButtonBooks() {
        clickOnElement(buttonBooks);
    }

    public void checkIsButtonBooksVisible() {
        checkIsElementVisible(buttonBooks);
    }
}

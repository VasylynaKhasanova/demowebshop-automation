package org.pages.categories;

import org.openqa.selenium.WebDriver;
import org.pages.ParentPage;


public class BooksPage extends ParentPage {
    public BooksPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/books";
    }

}

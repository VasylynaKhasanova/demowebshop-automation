package org.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.elements.HeaderElements;
import org.pages.elements.NavigationMenuElements;

public class HomePage extends ParentPage {
    private Logger logger = Logger.getLogger(getClass());

    @FindBy(xpath = "//h2[@class='topic-html-content-header']")
    private WebElement welcomeMessage;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage openHomePage() {
        webDriver.get(baseUrl);
        logger.info("Home Page was opened with url " + baseUrl);
        return this;
    }

    @Override
    protected String getRelativeUrl() {
        return "/";
    }

    public HeaderElements getHeaderElement() {
        return new HeaderElements(webDriver);
    }

    public HomePage checkIsRedirectToHomePage() {
        checkUrl();
        return this;
    }

    public HomePage checkIsWelcomeMessageVisible() {
        checkIsElementVisible(welcomeMessage);
        return this;
    }

    public NavigationMenuElements getNavigationMenuElement() {
        return new NavigationMenuElements(webDriver);
    }
}

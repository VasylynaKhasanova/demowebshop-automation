package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;
import org.pages.LoginPage;

public class HeaderElements extends CommonActionsWithElements {

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement buttonLogIn;

    @FindBy(xpath = "//a[@href='/register']")
    private WebElement buttonRegister;

    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement buttonLogOut;

    @FindBy(xpath = "//div[@class='header-links']//a[@href='/customer/info']")
    private WebElement buttonCustomerInfo;

    public HeaderElements(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage clickOnButtonLogIn() {
        clickOnElement(buttonLogIn);
        return new LoginPage(webDriver);
    }

    // check is button log in invisible
    public void checkIsButtonLogInInvisible() {
        checkIsElementInvisible(buttonLogIn);
    }

    public void clickOnButtonRegister() {
        clickOnElement(buttonRegister);
    }

    public void clickOnButtonLogOut() {
        clickOnElement(buttonLogOut);
    }

    public void checkIsButtonLogOutVisible() {
        checkIsElementVisible(buttonLogOut);
    }

    public void clickOnButtonCustomerInfo() {
        clickOnElement(buttonCustomerInfo);
    }

    public void checkIsButtonCustomerInfoVisible() {
        checkIsElementVisible(buttonCustomerInfo);
    }


}

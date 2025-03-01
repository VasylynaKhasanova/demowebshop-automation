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

    public LoginPage clickOnHeaderButtonLogIn() {
        clickOnElement(buttonLogIn);
        return new LoginPage(webDriver);
    }

    public void checkIsHeaderButtonLogInInvisible() {
        checkIsElementInvisible(buttonLogIn);
    }

    public void clickOnButtonRegister() {
        clickOnElement(buttonRegister);
    }

    public void checkIsButtonRegisterVisible() {
        checkIsElementVisible(buttonRegister);
    }

    public void clickOnButtonLogOut() {
        clickOnElement(buttonLogOut);
    }

    public void checkIsButtonLogOutInvisible() {
        checkIsElementInvisible(buttonLogOut);
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

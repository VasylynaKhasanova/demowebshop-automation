package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderInformationPage extends ParentPage {
    private CompletedCheckoutPage completedCheckoutPage = new CompletedCheckoutPage(webDriver);
    private String orderNumber;

    @FindBy(xpath = "//div[@class='order-number']/strong")
    private WebElement informationOrderNumber;

    public OrderInformationPage(WebDriver webDriver, String orderNumber) {
        super(webDriver);
        this.orderNumber = orderNumber;

    }

    @Override
    protected String getRelativeUrl() {
        return "/orderdetails/" + orderNumber;
    }

    public OrderInformationPage checkIsOrderNumberVisible() {
        checkIsElementVisible(informationOrderNumber);
        return this;
    }

    public void checkIsRedirectToOrderInformationPage() {
        checkUrl();
    }

    public OrderInformationPage checkIfOrderNumberIsCorrect() {
        checkIfElementContainsText(informationOrderNumber, orderNumber);
        return this;
    }
}

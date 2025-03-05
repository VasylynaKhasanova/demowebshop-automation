package org.pages;

import org.openqa.selenium.WebDriver;
import org.pages.elements.*;

public class CheckoutPage extends ParentPage {

    public CheckoutPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    protected String getRelativeUrl() {
        return "/onepagecheckout";
    }

    public CheckoutPage checkIsRedirectToCheckoutPage() {
        checkUrl();
        return this;
    }

    public BillingAddressElements getBillingAddressElements() {
        return new BillingAddressElements(webDriver);
    }

    public ConfirmOrderElements getConfirmOrderElements() {
        return new ConfirmOrderElements(webDriver);
    }

    public PaymentInformationElements getPaymentInformationElements() {
        return new PaymentInformationElements(webDriver);
    }

    public PaymentMethodElements getPaymentMethodElements() {
        return new PaymentMethodElements(webDriver);
    }

    public ShippingAddressElements getShippingAddressElements() {
        return new ShippingAddressElements(webDriver);
    }

}

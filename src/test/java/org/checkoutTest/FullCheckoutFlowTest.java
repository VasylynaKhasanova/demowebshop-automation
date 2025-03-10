package org.checkoutTest;

import org.baseTest.BaseTest;
import org.categories.SmokeTestsFilter;
import org.junit.Test;
import org.data.TestData;
import org.junit.experimental.categories.Category;

public class FullCheckoutFlowTest extends BaseTest {

    @Test
    @Category(SmokeTestsFilter.class)
    public void T0008_fullValidCheckoutFlowTest() {
        String randomFirstName = TestData.getRandomFirstName();
        String randomLastName = TestData.getRandomLastName();
        String randomEmail = TestData.getRandomEmail();
        String randomCompany = TestData.getRandomCompany();
        String randomCity = TestData.getRandomCity();
        String randomAddress = TestData.getRandomAddress();
        String randomZipCode = TestData.getRandomZipCode();
        String randomPhoneNumber = TestData.getRandomPhoneNumber();
        String randomFaxNumber = TestData.getRandomFaxNumber();

        pageProvider.getLoginPage()
                .openLoginPageAndFillLoginFormWithValidCred()
                .checkIsRedirectToHomePage();
        pageProvider.getShoppingCartPage().checkAndRemoveAllProductsFromCart();
        pageProvider.getHomePage()
                .getNavigationMenuElement()
                .checkIsButtonBooksVisible();
        pageProvider.getHomePage()
                .getNavigationMenuElement()
                .clickOnButtonBooks()
                .checkIsRedirectToBooksPage()
                .addFirstAvailableProductToShoppingCart();
        pageProvider.getBooksPage().checkIsProductAddedToCartSuccessMessageIsVisible();
        pageProvider.getBooksPage().checkTextInProductAddedToCartSuccessMessage();
        pageProvider.getHomePage().getHeaderElement().clickOnButtonShoppingCart();
        pageProvider.getShoppingCartPage().checkIsRedirectToShoppingCartPage();
        pageProvider.getShoppingCartPage().checkTermsOfServiceCheckbox();
        pageProvider.getShoppingCartPage().clickOnCheckoutButton();
        pageProvider.getCheckoutPage().checkIsRedirectToCheckoutPage();
        pageProvider.getCheckoutPage().getBillingAddressElements().checkIsBillingAddressTitleVisible();
        pageProvider.getCheckoutPage().getBillingAddressElements()
                .selectValueInBillingAddressDropdownIfItVisible("");
        pageProvider.getCheckoutPage().getBillingAddressElements()
                .fillInBillingAddressForm(
                        randomFirstName,
                        randomLastName,
                        randomEmail,
                        randomCompany,
                        "1",
                        "3",
                        randomCity,
                        randomAddress,
                        randomAddress,
                        randomZipCode,
                        randomPhoneNumber,
                        randomFaxNumber)
                .clickOnBillingAddressContinueButton();
        pageProvider.getCheckoutPage().getShippingAddressElements().checkIsShippingAddressTitleVisible();
        pageProvider.getCheckoutPage().getShippingAddressElements().checkPickUpInStoreCheckbox();
        pageProvider.getCheckoutPage().getShippingAddressElements().clickOnShippingAddressContinueButton();
        pageProvider.getCheckoutPage().getPaymentMethodElements().checkIsPaymentMethodTitleVisible();
        pageProvider.getCheckoutPage().getPaymentMethodElements().checkCashOnDeliveryPaymentMethod();
        pageProvider.getCheckoutPage().getPaymentMethodElements().clickOnPaymentMethodContinueButton();
        pageProvider.getCheckoutPage().getPaymentInformationElements().checkIsPaymentInformationTitleVisible();
        pageProvider.getCheckoutPage().getPaymentInformationElements().clickOnPaymentInformationContinueButton();
        pageProvider.getCheckoutPage().getConfirmOrderElements().checkIsConfirmOrderTitleVisible();
        pageProvider.getCheckoutPage().getConfirmOrderElements().clickOnConfirmButton();
        pageProvider.getCompletedCheckoutPage().checkIsRedirectToCompletedCheckoutPage();
        pageProvider.getCompletedCheckoutPage().checkIsOrderCompletedSuccessMessageVisible()
                .checkOrderCompletedSuccessMessage()
                .checkIsOrderNumberDetailsVisible()
                .checkIsOrderDetailsLinkVisible();
        pageProvider.getCompletedCheckoutPage().clickOnOrderDetailsLink()
                .checkIsOrderNumberVisible()
                .checkIfOrderNumberIsCorrect()
                .checkIsRedirectToOrderInformationPage()
        ;
    }
}

package org.pages.elements.checkout_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class BillingAddressElements extends CommonActionsWithElements {
    @FindBy(xpath = "//li[@class='tab-section allow active']//h2[text()='Billing address']")
    private WebElement billingAddressTitle;

    @FindBy(id = "BillingNewAddress_FirstName")
    private WebElement firstNameInput;

    @FindBy(id = "BillingNewAddress_LastName")
    private WebElement lastNameInput;

    @FindBy(id = "BillingNewAddress_Email")
    private WebElement emailInput;

    @FindBy(id = "BillingNewAddress_Company")
    private WebElement companyInput;

    @FindBy(id = "BillingNewAddress_CountryId")
    private WebElement countryDropDown;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    private WebElement stateDropDown;

    @FindBy(id = "BillingNewAddress_City")
    private WebElement cityInput;

    @FindBy(id = "BillingNewAddress_Address1")
    private WebElement address1Input;

    @FindBy(id = "BillingNewAddress_Address2")
    private WebElement address2Input;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    private WebElement zipPostalCodeInput;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    private WebElement phoneNumberInput;

    @FindBy(id = "BillingNewAddress_FaxNumber")
    private WebElement faxNumberInput;

    @FindBy(xpath = "//div[@id='billing-buttons-container']//input[@title='Continue']")
    private WebElement billingAddressContinueButton;

    @FindBy(id="billing-address-select")
    private WebElement billingAddressDropdown;

    public BillingAddressElements(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterFirstName(String firstName) {
        clearAndEnterTextIntoElement(firstNameInput, firstName);
    }

    public void enterLastName(String lastName) {
        clearAndEnterTextIntoElement(lastNameInput, lastName);
    }

    public void enterEmail(String email) {
        clearAndEnterTextIntoElement(emailInput, email);
    }

    public void enterCompany(String company) {
        clearAndEnterTextIntoElement(companyInput, company);
    }

    public void selectCountry(String country) {
        selectValueInDropdown(countryDropDown, country);
    }

    public void selectState(String state) {
        selectValueInDropdown(stateDropDown, state);
    }

    public void enterCity(String city) {
        clearAndEnterTextIntoElement(cityInput, city);
    }

    public void enterAddress1(String address1) {
        clearAndEnterTextIntoElement(address1Input, address1);
    }

    public void enterAddress2(String address2) {
        clearAndEnterTextIntoElement(address2Input, address2);
    }

    public void enterZipPostalCode(String zipPostalCode) {
        clearAndEnterTextIntoElement(zipPostalCodeInput, zipPostalCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        clearAndEnterTextIntoElement(phoneNumberInput, phoneNumber);
    }

    public void enterFaxNumber(String faxNumber) {
        clearAndEnterTextIntoElement(faxNumberInput, faxNumber);
    }

    public void clickOnBillingAddressContinueButton() {
        clickOnElement(billingAddressContinueButton);
    }

    public void checkIsBillingAddressTitleVisible() {
        checkIsElementVisible(billingAddressTitle);
    }

    public BillingAddressElements fillInBillingAddressForm(String firstName, String lastName, String email, String company, String country,
                                         String state, String city, String address1, String address2, String zipPostalCode, String phoneNumber, String faxNumber) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterCompany(company);
        selectCountry(country);
        selectState(state);
        enterCity(city);
        enterAddress1(address1);
        enterAddress2(address2);
        enterZipPostalCode(zipPostalCode);
        enterPhoneNumber(phoneNumber);
        enterFaxNumber(faxNumber);
        return this;
    }


  public void selectValueInBillingAddressDropdown(String address) {
    selectValueInDropdown(billingAddressDropdown, address);
  }

    public void selectValueInBillingAddressDropdownIfItVisible (String address) {
        if (isElementVisible(billingAddressDropdown)) {
            selectValueInBillingAddressDropdown(address);
        }
    }
}

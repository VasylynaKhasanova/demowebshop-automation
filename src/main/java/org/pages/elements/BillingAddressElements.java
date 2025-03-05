package org.pages.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.CommonActionsWithElements;

public class BillingAddressElements extends CommonActionsWithElements {
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

    @FindBy(xpath = "//input[@type='button']")
    private WebElement continueButton;

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
        selectValueInDropDawn(countryDropDown, country);
    }

    public void selectState(String state) {
        selectValueInDropDawn(stateDropDown, state);
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

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

}

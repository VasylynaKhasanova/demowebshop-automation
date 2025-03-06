package org.data;

import org.utils.Utils_Custom;

import java.util.Random;

public class TestData {
    public static final String VALID_EMAIL = "autotestva@gmail.com";
    public static final String VALID_PASSWORD = "ewedce33434";
    public static final String NOT_REGISTERED_EMAIL = "notRegisteredEmail@gmail.com";
    public static final String INVALID_PASSWORD = "invalidPassword2324";

    private static final String[] FIRST_NAMES = {"John", "Alice", "Michael", "Emma", "David", "Olivia"};
    private static final String[] LAST_NAMES = {"Doe", "Smith", "Brown", "Taylor", "Wilson", "Lee"};
    private static final String[] GENDERS = {"Male", "Female"};
    private static final String[] STREETS = {"Maple Street", "Oak Avenue", "Pine Lane", "Cedar Road",
            "Elm Drive", "Willow Boulevard", "Chestnut Court"};
    private static final String[] CITIES = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia"};
    private static final String[] ZIP_CODES = {"10001", "90001", "60601", "77001", "85001", "19101"};
    private static final String[] PHONE_NUMBERS = {"1234567890", "2345678901", "3456789012", "4567890123", "5678901234", "6789012345"};
    private static final String[] COMPANIES = {"Google", "Amazon", "Facebook", "Apple", "Microsoft", "Oracle"};
    private static final String[] ADDRESSES = {"Maple Street", "Oak Avenue", "Pine Lane", "Cedar Road",
            "Elm Drive", "Willow Boulevard", "Chestnut Court"};
    private static final String[] FAX_NUMBERS = {"1234567890", "2345678901", "3456789012", "4567890123", "5678901234", "6789012345"};
    private static final Random RANDOM = new Random();

    public static String getRandomFirstName() {
        return FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)];
    }

    public static String getRandomLastName() {
        return LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];
    }

    public static String getRandomPassword() {
        int length = RANDOM.nextInt(5) + 8;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            password.append(chars.charAt(RANDOM.nextInt(chars.length())));
        }
        return password.toString();
    }

    public static String getRandomGender() {
        return GENDERS[RANDOM.nextInt(GENDERS.length)];
    }

    public static String getRandomStreet() {
        return STREETS[RANDOM.nextInt(STREETS.length)];
    }

    public static String getRandomCity() {
        return CITIES[RANDOM.nextInt(CITIES.length)];
    }

    public static String getRandomZipCode() {
        return ZIP_CODES[RANDOM.nextInt(ZIP_CODES.length)];
    }

    public static String getRandomPhoneNumber() {
        return PHONE_NUMBERS[RANDOM.nextInt(PHONE_NUMBERS.length)];
    }

    public static String getRandomEmail() {
        return "test" + Utils_Custom.getDateAndTimeFormattedOnlyNumbers() + "@gmail.com";
    }

    public static String getRandomCompany() {
        return COMPANIES[RANDOM.nextInt(COMPANIES.length)];
    }

    public static String getRandomAddress() {
        return ADDRESSES[RANDOM.nextInt(ADDRESSES.length)];
    }

    public static String getRandomFaxNumber() {
        return FAX_NUMBERS[RANDOM.nextInt(FAX_NUMBERS.length)];
    }
}

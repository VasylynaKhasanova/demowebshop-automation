package org.data;

import java.util.Random;

public class TestData {
    public static final String VALID_EMAIL = "autotestva@gmail.com";
    public static final String VALID_PASSWORD = "ewedce33434";
    public static final String NOT_REGISTERED_EMAIL = "notRegisteredEmail@gmail.com";
    public static final String INVALID_PASSWORD = "invalidPassword2324";

    private static final String[] FIRST_NAMES = {"John", "Alice", "Michael", "Emma", "David", "Olivia"};
    private static final String[] LAST_NAMES = {"Doe", "Smith", "Brown", "Taylor", "Wilson", "Lee"};
    private static final String[] GENDERS = {"Male", "Female"};
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
}

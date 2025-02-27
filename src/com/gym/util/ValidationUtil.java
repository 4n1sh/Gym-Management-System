package com.gym.util;

import java.util.regex.Pattern;

/**
 * Utility class for validating user input fields in the gym management system.
 * This class provides various methods to validate common fields such as 
 * names, emails, phone numbers, fees, and IDs using regular expressions (regex).
 * It also includes a method to validate gender values.
 * Each validation method ensures that the input data adheres to the required 
 * format and constraints, improving the overall data integrity of the system.
 * 
 * Author: Anish Shrestha (23048634)
 */

public class ValidationUtil {

    private static final String NAME_REGEX = "^[A-Za-z ]{2,50}$"; // Letters and spaces, 2-50 characters
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"; // Standard email format
    private static final String PHONE_REGEX = "^98\\d{8}$"; // Exactly 10 digits
    private static final String FEE_REGEX = "^[0-9]{4,6}$"; // Numeric, up to 6 digits
    private static final String ID_REGEX = "^[0-9]{1,4}$";

    // Validation Methods
    public static boolean validateName(String name) {
        return Pattern.matches(NAME_REGEX, name);
    }

    public static boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static boolean validatePhone(String phone) {
        return Pattern.matches(PHONE_REGEX, phone);
    }

    public static boolean validateFee(String fee) {
        return Pattern.matches(FEE_REGEX, fee);
    }

    public static boolean validateId(String id) {
        return Pattern.matches(ID_REGEX, id);
    }

    public static boolean validateGender(String gender) {
        return gender.equals("male") || gender.equals("female");
    }
}

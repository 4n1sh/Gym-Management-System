/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gym.util;

import java.util.regex.Pattern;

/**
 *
 * @author Anish
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

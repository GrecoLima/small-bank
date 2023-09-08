package com.sample.smallbank.util;

public class PhoneNumberFormatter {

    private PhoneNumberFormatter() {
    }

    private static final String PHONE_NUMBER_PATTERN = "(\\d{3})(\\d{3})(\\d{4})";

    public static String formatPhoneNumber(String phoneNumber) {
        // Remove any non-numeric characters from the phone number
        phoneNumber = phoneNumber.replaceAll("[^0-9]", "");

        // Check if the phone number has at least 10 digits (XXX-XXX-XXXX)
        if (phoneNumber.length() >= 10) {
            // Use replaceFirst to apply the desired format (XXX-XXX-XXXX)
            phoneNumber = phoneNumber.replaceFirst(PHONE_NUMBER_PATTERN, "$1-$2-$3");
        }

        return phoneNumber;
    }
}

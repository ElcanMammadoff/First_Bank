package com.musdon.first_bank_application.utils;

import java.time.Year;
import java.util.Random;
import java.util.RandomAccess;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account created1";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account has been successfully created1";
    public static final String ACCOUNT_NOT_EXIST_CODE="003";
    public static final String ACCOUNT_NOT_EXISTS_MESSAGE="User with the provided Account Number doesn't exist";
    public static final String ACCOUNT_FOUND_CODE= "004";
    public static final String ACCOUNT_FOUND_SUCCESS= "User Account Found";
    public static final String ACCOUNT_CREDITED_SUCCESS_CODE="005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE="User Account Was Credited Successfully";
    public static final String INSUFFICIENT_BALANCE_CODE="006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE="Insufficent Balance";
    public static final String ACCOUNT_DEBITED_SUCCESS_CODE="007";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE="User Account Has Been  Successfully Debited";


    public static String generatedAccountNumber() {
        //my strategy is this:year +6 random digits
        Year year = Year.now();
        String yearString = String.valueOf(year);
        Random random = new Random();
        int randomNumber = 100000 + random.nextInt(900000);
        String randomNumberString = String.valueOf(randomNumber);

        return yearString + randomNumberString;
    }


}

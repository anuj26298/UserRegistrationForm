package com.userregistrationform;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationForm registrationform = new UserRegistrationForm();
        boolean isValidName;

        System.out.println("--++-- User Registration --++--");
        System.out.println("Enter your Details below:");

        System.out.println("First Name: ");
        String firstName = scanner.nextLine();
        isValidName = registrationform.usersValidFirstName(firstName);
        System.out.println(isValidName);

        System.out.println("Last Name: ");
        String lastName = scanner.nextLine();
        isValidName = registrationform.usersValidLastName(lastName);
        System.out.println(isValidName);

        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        boolean isValidEmail = registrationform.usersValidEmail(email);
        System.out.println(isValidEmail);

        System.out.println("Enter Mobile Number along with country code:");
        String mobileNumber = scanner.nextLine();
        boolean isValidNum = registrationform.usersValidMobileNum(mobileNumber);
        System.out.println(isValidNum);

        System.out.println("Enter Password:");
        String password = scanner.nextLine();
        boolean isValidPassword = registrationform.usersValidPassword(password);
        System.out.println(isValidPassword);

    }

    public static boolean usersValidFirstName(String firstName) {
        String regEx = "^[A-Z][a-z]{3,16}";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public static boolean usersValidLastName(String lastName) {
        String regEx = "^[A-Z][a-z]{3,16}";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public static boolean usersValidEmail(String email) {
        String regEx = "[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean usersValidMobileNum(String mobileNumber) {
        String regEx = "^[0-9]{2} [0-9]{10}";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public static boolean usersValidPassword(String password){
        String regEx = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
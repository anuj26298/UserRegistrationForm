package com.userregistrationform;

import java.util.regex.Pattern;

import com.*;
import com.userregistrationexceptions.UserRegistrationFormExceptions;

public class UserRegistrationForm {

    private static final String NAME_REGEX = "^[A-Z][a-z]{3,16}";
    private static final String MOBILE_NUMBER_REGEX = "^[0-9]{2} [0-9]{10}";
    private static final String EMAIL_REGEX = "[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
    private static final String PASSWORD_REGEX = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?" +
            "[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

    public boolean usersValidName(String name) throws UserRegistrationFormExceptions {
        try {
            if (name == null)
                throw new UserRegistrationFormExceptions(UserRegistrationFormExceptions.ExceptionType.NULL_ENTRY,
                        "Null Value Not Allowed");

            if (name.length() == 0)
                throw new UserRegistrationFormExceptions(UserRegistrationFormExceptions.ExceptionType.EMPTY_ENTRY,
                        "First Name cannot be empty");

            if (name.length() < 3)
                throw new UserRegistrationFormExceptions(UserRegistrationFormExceptions.ExceptionType.SHORT_ENTRY,
                        "Name should have atleast 3 characters");
            Pattern pattern = Pattern.compile(NAME_REGEX);
            if (pattern.matcher((name)).matches())
                return true;
            else
                throw new UserRegistrationFormExceptions(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY,
                        "Enter Valid First Name");
        } catch (UserRegistrationFormExceptions e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean usersValidEmail(String email) throws UserRegistrationFormExceptions{
        try {
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
            if (pattern.matcher(email).matches())
                return true;
            else
                throw new UserRegistrationFormExceptions(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY,
                        "Enter Valid Email");
        } catch (UserRegistrationFormExceptions e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean usersValidMobileNum(String mobileNumber) throws UserRegistrationFormExceptions {
        try {
            Pattern pattern = Pattern.compile(MOBILE_NUMBER_REGEX);
            if (pattern.matcher(mobileNumber).matches())
                return true;
            else
                throw new UserRegistrationFormExceptions(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY,
                        "Enter Valid Mobile Number");
        } catch (UserRegistrationFormExceptions e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean usersValidPassword(String password)  throws  UserRegistrationFormExceptions{
        try {
            if (password.length() < 8)
                throw new UserRegistrationFormExceptions(UserRegistrationFormExceptions.ExceptionType.SHORT_ENTRY,
                        "Minimum lenght should be 8.");
            Pattern pattern = Pattern.compile(PASSWORD_REGEX);
            if (pattern.matcher(password).matches())
                return true;
            else
                throw new UserRegistrationFormExceptions(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY,
                        "Enter Valid Password.");
        }catch (UserRegistrationFormExceptions e){
            e.printStackTrace();
            return false;
        }
    }
}
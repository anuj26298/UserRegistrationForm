package com.userregistrationform;

import com.userregistrationexceptions.UserRegistrationFormExceptions;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationFormTesting {
    @Test
    public void givenName_WhenCorrect_ReturnTrue() throws UserRegistrationFormExceptions {
            UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        Assert.assertTrue(userRegistrationForm.usersValidName("Anuj"));
    }

    @Test
    public void givenName_WhenNull_ReturnNullEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidName(null);
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.NULL_ENTRY, e.type);
        }
    }

    @Test
    public void givenName_WhenShortName_ReturnShortEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidName("An");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.SHORT_ENTRY, e.type);
        }
    }

    @Test
    public void givenName_WhenEmpty_ReturnShortEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidName("");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.SHORT_ENTRY, e.type);
        }
    }

    @Test
    public void givenName_WhenInvalidChar_ReturnInvalidEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidName("Anuj234");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY, e.type);
        }
    }

    @Test
    public void givenEmail_WhenCorrect_ReturnTrue() throws UserRegistrationFormExceptions {
            UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
            Assert.assertTrue(userRegistrationForm.usersValidEmail("anuj.kumar1@gmail.com"));
    }

    @Test
    public void givenEmail_WhenMultipleId_ReturnInvalidEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidEmail("asd.34cs@gmail.ac.ina");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY, e.type);
        }
    }

    @Test
    public void givenEmail_WhenLastContainsNumber_ReturnInvalidEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidEmail("asd.34cs@gmail.ac.1na");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY, e.type);
        }
    }

    @Test
    public void givenEmail_WhenSymbolNotPresent_RetrunInvalidEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidEmail("anuj.kumargmail.com");
        } catch (UserRegistrationFormExceptions e) {
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY, e.type);
        }
    }

    @Test
    public void givenMobNum_WhenCorrect_RetrunTrue() throws UserRegistrationFormExceptions {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        Assert.assertTrue(userRegistrationForm.usersValidMobileNum("91 9876543210"));
    }

    @Test
    public void givenMobNum_WhenShort_ReturnShortEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidMobileNum("91 943");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.SHORT_ENTRY,e.type);
        }
    }

    @Test
    public void givenMobNum_WhenNoCountryCode_ReturnInvalidEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidMobileNum("9876543210");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY, e.type);
        }
    }

    @Test
    public void givenMobNum_WhenNospaceBetweenCodeAndNum_ReturnInvalidEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidMobileNum("919876543210");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY, e.type);
        }
    }

    @Test
    public void givenPassword_WhenCorrect_ReturnTrue() throws UserRegistrationFormExceptions {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        Assert.assertTrue(userRegistrationForm.usersValidPassword("P@ssword123"));
    }

    @Test
    public void givenPassword_WhenShortLength_RetrunShortEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidPassword("P@ss4");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.SHORT_ENTRY, e.type);
        }
    }

    @Test
    public void givenPassword_WhenInvalidPassword_ReturnInvalidEntryException() {
        UserRegistrationForm userRegistrationForm = new UserRegistrationForm();
        try {
            userRegistrationForm.usersValidPassword("Password23");
        }catch (UserRegistrationFormExceptions e){
            Assert.assertEquals(UserRegistrationFormExceptions.ExceptionType.INVALID_ENTRY, e.type);
        }
    }
}

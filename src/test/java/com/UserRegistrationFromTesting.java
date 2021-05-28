package com;
import com.userregistrationform.UserRegistrationForm;
import org.junit.jupiter.api.Test;

public class UserRegistrationFromTesting {

    @Test
    public void givenFirstName_WhenCorrectName_ReturnTrue(){
        UserRegistrationForm registrationForm = new UserRegistrationForm();
        boolean result = registrationForm.usersValidFirstName("Anuj");

    }
}

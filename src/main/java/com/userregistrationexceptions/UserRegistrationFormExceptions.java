package com.userregistrationexceptions;

public class UserRegistrationFormExceptions extends Exception{

    public enum ExceptionType{
        NULL_ENTRY, EMPTY_ENTRY, SHORT_ENTRY, INVALID_ENTRY
    }

    public ExceptionType type;

    public UserRegistrationFormExceptions(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}

package com.learning.exceptionhandling;

public class newException extends Exception{
    String message="Wrong code";

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    newException(String message){
        this.message = message;
    }

}

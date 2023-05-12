package com.learning.exceptionhandling;

public class MyException extends RuntimeException{

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

package com.dayang.rest.basic.auth;

public class AuthenticationBean {

    private String message;

	public AuthenticationBean(String string) {
        this.setMessage(message);
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("AuthenticationBean [message=%s]", message);
    }

}

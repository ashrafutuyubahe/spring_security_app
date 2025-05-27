package com.spring_security.spring_security.Dto;


public class ForgotPasswordRequest {
    private String userEmail;

   
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}

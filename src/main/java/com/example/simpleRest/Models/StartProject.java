package com.example.simpleRest.Models;

public  class StartProject {
    private String message;
    public StartProject() {
        message = "My first experience in java rest";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

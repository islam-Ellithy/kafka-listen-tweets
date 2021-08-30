package com.lamaa.kafkatwitter.models;

public class Tweet {
    private String message;
    private int id;
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

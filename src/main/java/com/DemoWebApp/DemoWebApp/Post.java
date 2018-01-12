package com.DemoWebApp.DemoWebApp;


public class Post {


    private long id;
    private String message;

    public Post(){
    }

    public Post(String message){
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
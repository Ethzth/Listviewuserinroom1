package com.example.quocnguyen.customlistviewexample;

public class userdetail {
    private String image;
    private String name;

    public userdetail(String image, String username) {
        this.image = image;
        this.name = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package com.mhasancse15.firebasetestpro;

import java.io.Serializable;

public class Upload implements Serializable {
    private String imageURI,title,describtion;

    public Upload(String imageURI, String title, String describtion) {
        this.imageURI = imageURI;
        this.title = title;
        this.describtion = describtion;
    }

    public Upload() {
    }

    public String getImageURI() {
        return imageURI;
    }

    public void setImageURI(String imageURI) {
        this.imageURI = imageURI;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }
}

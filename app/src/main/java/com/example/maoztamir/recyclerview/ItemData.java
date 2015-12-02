package com.example.maoztamir.recyclerview;

/**
 * Created by maoztamir on 01/12/15.
 */
public class ItemData {

    private String title;
    private int imageUrl;

    public ItemData(String title,int imageUrl){

        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
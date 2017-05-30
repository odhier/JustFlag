package com.odhier.justflag;

/**
 * Created by ayumuni on 5/18/2017.
 */

public class CountryItem {
    String name;
    int image;
    public CountryItem(String name, int image){
        this.name = name;
        this.image = image;
    }
    public String getName(){
        return name;
    }
    public int getImage() { return image; }
}

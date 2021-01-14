package com.company.customspinner;



public class Country {
    private String country;
    private int imageId;


    public Country(String country, int imageId){
        this.country=country;
        this.imageId=imageId;
    }
    public String getCountry(){
        return country;
    }

    public int getImageId(){
        return imageId;
    }
}

package com.example.extravaganza;

public class CustomPlaces {
    private String place;
    private String date;
    // Drawable resource ID
    private int ImageId;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CustomPlaces(String place, String date){
        this.place=place;
        this.date=date;
    }
}

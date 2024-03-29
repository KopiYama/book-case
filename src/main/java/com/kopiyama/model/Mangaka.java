package com.kopiyama.model;

public class Mangaka extends Author {
    private String rating;

    public Mangaka(){

    }

    public Mangaka(String rating) {
        this.rating = rating;
    }

    public Mangaka(String firstName, String lastName, String country, int age, String rating) {
        super(firstName, lastName, country, age);
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return
                "Name     = " + getFullName() + '\n' +
                "Country  = " + getCountry() + '\n' +
                "Age      = " + getAge() + " Years Old" + '\n' +
                "Rating   = " + getRating() + '\n';
    }
}

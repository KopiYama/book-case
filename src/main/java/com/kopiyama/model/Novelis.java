package com.kopiyama.model;

public class Novelis extends Author{
    private boolean serial;
    private String rating;

    public Novelis() {

    }
    public Novelis(boolean serial, String rating) {
        this.serial = serial;
        this.rating = rating;
    }

    public Novelis(String firstName, String lastName, String country, int age, boolean serial, String rating) {
        super(firstName, lastName, country, age);
        this.serial = serial;
        this.rating = rating;
    }

    public boolean isSerial() {
        return serial;
    }

    public void setSerial(boolean serial) {
        this.serial = serial;
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
                "Name       = " + getFullName() + '\n' +
                "Country    = " + getCountry() + '\n' +
                "Age        = " + getAge() + '\n' +
                "Serial     = " + isSerial() + '\n' +
                "Rating     = " + getRating() + '\n';
    }
}

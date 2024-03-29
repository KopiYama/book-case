package com.kopiyama.model;

public class EBook {
    private String bookCode;
    private String title;
    private Author author;
    private Publisher publisher;
    private double price;

    public EBook() {

    }

    public EBook(String bookCode, String title, Author author, Publisher publisher, double price) {
        this.bookCode = bookCode;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        calculatePrice();
    }

    public void calculatePrice() {
        double productoinCost = publisher.getProductionCost();
        this.price = productoinCost * 1.2;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(String budi) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Book Code          = " + getBookCode()+ '\n' +
                "Title              = " + getTitle() + '\n' +
                "Author             = " + author.getFullName() + '\n' +
                "Publisher          = " + publisher.getPublisherName() + '\n' +
                "Publisher Country  = " + publisher.getCountry() + '\n' +
                "Price              = " + getPrice() + '\n';
    }
}

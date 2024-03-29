package com.kopiyama.model;

public class Comic extends EBook{
    private Mangaka author;
    private Publisher publisher;
    private boolean volumeSeries;
    private double tax;

    public Comic() {

    }

    public Comic(Mangaka author, Publisher publisher, boolean volumeSries, double tax) {
        this.author = author;
        this.publisher = publisher;
        this.volumeSeries = volumeSries;
        this.tax = tax;
    }

    public Comic(String bookCode, String title, Author author, Publisher publisher, double price, Mangaka author1, Publisher publisher1, boolean volumeSries, double tax) {
        super(bookCode, title, author, publisher, price);
        this.author = author1;
        this.publisher = publisher1;
        this.volumeSeries = volumeSries;
    }

    @Override
    public void calculatePrice() {
        double productionCost = publisher.getProductionCost();
        String rating = ((Mangaka) author).getRating();

        if (rating.equals("New Commer")) {
            this.setPrice(volumeSeries ? productionCost * 1.35 : productionCost * 1.25);
        } else if (rating.equals("Good")) {
            this.setPrice(volumeSeries ? productionCost * 1.45 : productionCost * 1.30);
        } else if (rating.equals("Best Seller")) {
            this.setPrice(volumeSeries ? productionCost * 1.50 : productionCost * 1.40);
        }
    }

    public void calculateTax() {
        this.tax = this.getPrice() * 0.05;
    }

    @Override
    public Mangaka getAuthor() {
        return author;
    }

    public void setAuthor(Mangaka author) {
        this.author = author;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public boolean isVolumeSeries() {
        return volumeSeries;
    }

    public void setVolumeSeries(boolean volumeSeries) {
        this.volumeSeries = volumeSeries;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Title               = " + getTitle() + '\n' +
                "Book Code           = " + getBookCode() + '\n' +
                "Author              = " + author.getFullName()+ '\n' +
                "Publisher           = " + publisher.getPublisherName() + '\n' +
                "Publisher Country   = " + publisher.getCountry() + '\n' +
                "Volume Series       = " + isVolumeSeries() + '\n' +
                "Price               = " + getPrice() + '\n' +
                "Tax                 = " + getTax() + '\n';
    }
}

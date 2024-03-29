package com.kopiyama.model;

public class Novel extends EBook{
    private Novelis author;
    private Publisher publisher;
    private String genre;

    public Novel() {

    }

    public Novel(Novelis author, Publisher publisher, String genre) {
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }

    public Novel(String bookCode, String title, Author author, Publisher publisher, double price, Novelis author1, Publisher publisher1, String genre) {
        super(bookCode, title, author, publisher, price);
        this.author = author1;
        this.publisher = publisher1;
        this.genre = genre;
    }

    public void calculatePrice() {
        double productionCost = publisher.getProductionCost();
        String rating = ((Novelis) author).getRating();

        if (rating.equals("New Commer")) {
            this.setPrice(productionCost * 1.25);
        } else if (rating.equals("Good")) {
            this.setPrice(productionCost * 1.35);
        } else if (rating.equals("Best Seller")) {
            this.setPrice(productionCost * 1.50);
        }
    }

    @Override
    public Novelis getAuthor() {
        return author;
    }

    public void setAuthor(Novelis author) {
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Title              = " + getTitle() +  '\n' +
                "Book Code          = " + getBookCode() +  '\n' +
                "Author             = " + author.getFullName() +  '\n' +
                "Publisher          = " + publisher.getPublisherName() +  '\n' +
                "Publisher Country  = " + publisher.getCountry() +  '\n' +
                "Price              = " + getPrice() +  '\n' +
                "Genre              = " + getGenre() + '\n';
    }
}

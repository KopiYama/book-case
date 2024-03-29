package com.kopiyama.repository;

import com.kopiyama.model.CommercialBook;
import com.kopiyama.model.Publisher;
import com.kopiyama.model.Author;
import com.kopiyama.model.Mangaka;
import com.kopiyama.model.Novelis;

import java.util.ArrayList;
import java.util.List;

public class RepositoryBook {
    private List<CommercialBook> books;

    // Default Constructor
    public RepositoryBook() {
        this.books = new ArrayList<>();
        // Isi list buku jika diperlukan
        initializeBooks();
    }

    // Method untuk mengambil semua buku
    public List<CommercialBook> getAllBook() {
        return books;
    }

    // Method untuk menambahkan buku ke repository
    public void addBook(CommercialBook book) {
        books.add(book);
    }

    // Method untuk menginisialisasi list buku (contoh)
    private void initializeBooks() {
        // Contoh pengisian list buku
        // this.addBook(new CommercialBook(...));
        // this.addBook(new CommercialBook(...));
        // Objek Author
        Author author1 = new Author("Haidar", "Musyafa", "Indoneisa", 30);
        Author author2 = new Author("Bert", "Bates", "United State", 50);
        Author author3 = new Author("Barry", "Burd", "United State", 52);
        Author author4 = new Author("Mark", "Manson", "United State", 38);
        Author author5 = new Author("Andi", "Susanto", "Indonesia", 32);
        Author author6 = new Author("Adi", "Sutanto", "Indonesia", 27);

        // Objek Novelis
        Novelis novelis1 = new Novelis(true, "Best Seller");
        novelis1.setFirstName("J.K");
        novelis1.setLastName("Rowling");
        novelis1.setCountry("England");
        novelis1.setAge(57);

        Novelis novelis2 = new Novelis(true, "Best Seller");
        novelis2.setFirstName("Tere");
        novelis2.setLastName("Liye");
        novelis2.setCountry("Indonesia");
        novelis2.setAge(35);

        Novelis novelis3 = new Novelis(true, "Good");
        novelis3.setFirstName("Dee");
        novelis3.setLastName("Lestari");
        novelis3.setCountry("Indonesia");
        novelis3.setAge(30);

        Novelis novelis4 = new Novelis(true, "New Commer");
        novelis4.setFirstName("Faisal");
        novelis4.setLastName("Syahreza");
        novelis4.setCountry("Indonesia");
        novelis4.setAge(40);

        Novelis novelis5 = new Novelis(false, "Best Seller");
        novelis5.setFirstName("Julia");
        novelis5.setLastName("Golding");
        novelis5.setCountry("England");
        novelis5.setAge(41);

        // Objek Mangaka
        Mangaka mangaka1 = new Mangaka("Best Seller");
        mangaka1.setFirstName("Masashi");
        mangaka1.setLastName("Kisimoto");
        mangaka1.setCountry("Japan");
        mangaka1.setAge(48);

        Mangaka mangaka2 = new Mangaka("Good");
        mangaka2.setFirstName("Yoshihiro");
        mangaka2.setLastName("Togashi");
        mangaka2.setCountry("Japan");
        mangaka2.setAge(56);

        Mangaka mangaka3 = new Mangaka("Best Seller");
        mangaka3.setFirstName("Eiichiro");
        mangaka3.setLastName("Oda");
        mangaka3.setCountry("Japan");
        mangaka3.setAge(57);

        Mangaka mangaka4 = new Mangaka("New Commer");
        mangaka4.setFirstName("Rizki");
        mangaka4.setLastName("Anwar");
        mangaka4.setCountry("Indonesia");
        mangaka4.setAge(25);

        Mangaka mangaka5 = new Mangaka("New Commer");
        mangaka5.setFirstName("Yusuf");
        mangaka5.setLastName("Fadli");
        mangaka5.setCountry("Indonesia");
        mangaka5.setAge(32);

        // Objek Publisher
        Publisher publisher1 = new Publisher("Bloomsbury", "United Kingdom", 30.0);
        Publisher publisher2 = new Publisher("Gramedia", "Indonesia", 50.0);
        Publisher publisher3 = new Publisher("Mizan", "Indonesia", 25.0);
        Publisher publisher4 = new Publisher("Shueisha", "Japan", 25.0);
        Publisher publisher5 = new Publisher("Elex Media Komputindo", "Indonesia", 12.0);
        Publisher publisher6 = new Publisher("Gramedia Pustaka Utama", "Indonesia", 15.0);
        Publisher publisher8 = new Publisher("Lion Hudson", "England", 15.0);
        Publisher publisher9 = new Publisher("O Reilly Media", "United State", 30.0);
        Publisher publisher10 = new Publisher("Harper One", "United State", 25.0);

        // Membuat objek EBook CommercialBook dan menambahkannya ke list
        this.addBook(new CommercialBook("Book-001", "Memahami Hamka", author1, publisher3, publisher3.getProductionCost()));
        this.addBook(new CommercialBook("Book-002", "Head First Java: Your Brain on Java - A Learner's Guide", author2, publisher9, publisher9.getProductionCost()));
        this.addBook(new CommercialBook("Book-003", "Java For Dummies", author3, publisher9, publisher9.getProductionCost()));
        this.addBook(new CommercialBook("Book-004", "Flutter For Dummies", author3, publisher9, publisher9.getProductionCost()));
        this.addBook(new CommercialBook("Book-005", "The Subtle Art of Not Giving", author4, publisher10, publisher10.getProductionCost()));
        this.addBook(new CommercialBook("Book-006", "Will", author4, publisher10, publisher10.getProductionCost()));
        this.addBook(new CommercialBook("Book-007", "Sejarah Indonesia", author5, publisher6, publisher6.getProductionCost()));
        this.addBook(new CommercialBook("Book-008", "Teknologi Baru", author6, publisher5, publisher5.getProductionCost()));

        // Membuat objek Novel CommercialBook dan menambahkannya ke list
        this.addBook(new CommercialBook("Novel-001", "Harry Potter and the Philosopher's Stone", novelis1, publisher1, publisher1.getProductionCost()));
        this.addBook(new CommercialBook("Novel-002", "Harry Potter and the Chamber of Secrets", novelis1, publisher1, publisher1.getProductionCost()));
        this.addBook(new CommercialBook("Novel-003", "Harry Potter and the Prisoner of Azkaban", novelis1, publisher1, publisher1.getProductionCost()));
        this.addBook(new CommercialBook("Novel-004", "Ayah Aku Berbeda", novelis2, publisher2, publisher2.getProductionCost()));
        this.addBook(new CommercialBook("Novel-005", "Madre", novelis3, publisher2, publisher2.getProductionCost()));
        this.addBook(new CommercialBook("Novel-006", "Lagu untuk Renjana", novelis4, publisher3, publisher3.getProductionCost()));
        this.addBook(new CommercialBook("Novel-007", "Semoga Lekas Lega", novelis4, publisher3, publisher3.getProductionCost()));
        this.addBook(new CommercialBook("Novel-008", "The Abbey Mystery", novelis5, publisher8, publisher8.getProductionCost()));

        //Membuat objek Comic CommercialBook dan menambahkannya ke list
        this.addBook(new CommercialBook("Comic-001", "Uzumaki Naruto", mangaka1, publisher4, publisher4.getProductionCost()));
        this.addBook(new CommercialBook("Comic-002", "The Worst Client", mangaka1, publisher4, publisher4.getProductionCost()));
        this.addBook(new CommercialBook("Comic-003", "For the Sake of Dreams...!!", mangaka1, publisher4, publisher4.getProductionCost()));
        this.addBook(new CommercialBook("Comic-004", "Hunter X Hunter : The Day of Departure", mangaka2, publisher4, publisher4.getProductionCost()));
        this.addBook(new CommercialBook("Comic-005", "Hunter X Hunter : A Struggle in the Mist", mangaka2, publisher4, publisher4.getProductionCost()));
        this.addBook(new CommercialBook("Comic-006", "One Piece", mangaka3, publisher2, publisher2.getProductionCost()));
        this.addBook(new CommercialBook("Comic-007", "Petualangan di Indonesia", author4, publisher6, publisher6.getProductionCost()));
        this.addBook(new CommercialBook("Comic-008", "Petualangan di Jakarta", author5, publisher5, publisher5.getProductionCost()));
    }
}

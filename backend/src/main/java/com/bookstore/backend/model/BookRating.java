package com.bookstore.backend.model;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;
//import java.lang.Boolean;

class Book {
    private String Author;
    private String Publisher;
    private int ISBN;
    private Date yearPublished;
    private String date;


public Book(String Author, String Publisher, int ISBN, Date yearPublished) {
    this.Author = Author;
    this.Publisher = Publisher;
    this.ISBN = ISBN;
    this.yearPublished = yearPublished;
    this.date = LocalDateTime.now().toString();
}
}
public class BookRating {   

    private int id;
    private String name;
    private String bookid;
    private String date;
   
    
    public void setId() {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    private String publisher; 
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    private String Author;
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getDate (){
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }


    
    public BookRating () {

        addBookRating();
    }

    public void addBookRating () {
        int r = 0;

        if (id == 0) { //This if should check if the user is logged in

        }

        if (r > 5 || r < 1) { //This should make sure the user inputs a rating between 1 and 5

                System.out.println("Error: Rating must be between 1-5.\n");
        }

        System.out.format("Rating: %d", r); //Dummy test

    }
}

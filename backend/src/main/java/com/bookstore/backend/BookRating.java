package com.bookstore.backend;

import java.util.Date;
import java.time.LocalDateTime;
import java.lang.Boolean;

class Book {
    private String Author;
    private int ISBN;
    private Date yearPublished;


public Book(String Author, int ISBN, Date yearPublished) {
    this.Author = Author;
    this.ISBN = ISBN;
    this.yearPublished = yearPublished;
}
}
public class BookRating {   

    private int id;
    private String name;

    
    

    public void setId() {
        this.id = id;
    }

    public int getID() {
        return id;
    }
    
    public BookRating () {


    }

    public void addBookRating () {
        int r;

        if (id == false) { //This if should check if the user is logged in

        }

        if (r > 5 || r < 1) { //This should make sure the user inputs a rating between 1 and 5

                System.out.println("Error: Rating exceeds the limit.\n");
        }

    }
}

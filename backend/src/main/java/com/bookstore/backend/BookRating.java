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
        
        if (id == false) {

        }

    }
}

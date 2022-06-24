package com.bookstore.backend;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

//comment
@Entity
public class BookDetails implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)


        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        private int iSBN;

        public int getiSBN() {
            return iSBN;
        }

        public void setiSBN(int iSBN) {
            this.iSBN = iSBN;
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

        private String Genre;

        public String getGenre() {
            return Genre;
        }

        public void setGenre(String genre) {
            Genre = genre;
        }

       
        private Double price;

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        private Date yearPublished;

        public Date getYearPublished() {
            return yearPublished;
        }

        public void setYearPublished(Date yearPublished) {
            this.yearPublished = yearPublished;
        }

        private int copiesSold = 0;
           
        public int getCopiesSold() {
            return copiesSold;
        }

        public void setCopiesSold(int copiesSold) {
            this.copiesSold = copiesSold;
        }

    public BookDetails(String name, int id, int iSBN, String publisher , String Author , String Genre , Double price , Date yearPublished, int copiesSold )
    {
        this.name = name;
        this.id = id;
        this.iSBN = iSBN;
        this.publisher = publisher;
        this.Author = Author;
        this.Genre = Genre;
        this.price = price;
        this.yearPublished = yearPublished;
        this.copiesSold = copiesSold;

    }

    @Override
    public String toString()
    {
        return         
        "Book Details:" + '\'' +
        "Book Name: " + name + '\'' +
        "ID: " +id + '\'' +
        "ISBN: " + iSBN + '\'' +
        "Publisher: " + publisher + '\'' +
        "Author: " + Author + '\'' +
        "Genre: " + Genre + '\'' +
        "Price: " + price + '\'' +
        "Year Published: " + yearPublished + '\'' +
        "Copies Sold: " + copiesSold; 
    }

    
}

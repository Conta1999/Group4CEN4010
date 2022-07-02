package com.bookstore.backend.service;

import java.util.List;
import java.util.UUID;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.backend.exception.BookNotFoundException;
import com.bookstore.backend.model.BookDetails;
import com.bookstore.backend.repo.BookStoreRepo;



@Service
public class BookStoreService 
{

    private final BookStoreRepo bookStoreRepo;

    //@Autowired
    public BookStoreService(BookStoreRepo bookStoreRepo)
    {
        this.bookStoreRepo = bookStoreRepo;
    }
    
    public BookDetails addBookDetails(BookDetails details)
    {
        details.setBookCode(UUID.randomUUID().toString());
        return bookStoreRepo.save(details);
    }

    public List<BookDetails> findALLBooks(){
        return bookStoreRepo.findAll();

    }

    public BookDetails updateBookDetails(BookDetails details){
        return bookStoreRepo.save(details);

    }

    
    public BookDetails findBookDetails(Long id)
    {
        return bookStoreRepo.findBookDetails(id).orElseThrow(() -> new BookNotFoundException("Book was not found " + id)); 
    }

    public void deleteBookDetails(Long id){
        bookStoreRepo.deleteBookDetailsId(id);
    }


}

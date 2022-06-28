package com.bookstore.backend.model;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.backend.repo.BookStoreRepo;
import com.bookstore.backend.service.BookStoreService;

@RestController
@RequestMapping("/bookstore")
@CrossOrigin
public class HomeController 
{
    
    private final BookStoreService bookStoreService;

    public HomeController(BookStoreService bookStoreService)
    {
        this.bookStoreService = bookStoreService;
    }

    @GetMapping
    public ResponseEntity<List<BookDetails>> getAllBookDetils()
    {
        List<BookDetails> bookDetails = bookStoreService.findALLBooks();
        return new ResponseEntity<>(bookDetails, HttpStatus.OK);
    }



}

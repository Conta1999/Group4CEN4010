package com.bookstore.backend.model;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.bookstore.backend.repo.BookStoreRepo;
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

    @GetMapping("/all")
    public ResponseEntity<List<BookDetails>> getAllBookDetils()
    {
        List<BookDetails> bookDetails = bookStoreService.findALLBooks();
        return new ResponseEntity<>(bookDetails, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<BookDetails> getBookDetilsById(@PathVariable("id") Long id)
    {
        BookDetails bookDetails = bookStoreService.findBookDetails(id);
        return new ResponseEntity<>(bookDetails, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<BookDetails> addBookDetails(@RequestBody BookDetails bookDetails)
    {
        BookDetails newBookDetails = bookStoreService.addBookDetails(bookDetails);
        return new ResponseEntity<>(newBookDetails, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<BookDetails> updateBookDetails(@RequestBody BookDetails bookDetails)
    {
        BookDetails updateBookDetails = bookStoreService.addBookDetails(bookDetails);
        return new ResponseEntity<>(updateBookDetails, HttpStatus.OK);
    }

}

package com.bookstore.backend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookstore.backend.model.BookDetails;

public interface BookStoreRepo extends JpaRepository<BookDetails, Long> {

    void deleteBookDetailsId(Long id);

    Optional<BookDetails> findBookDetails(Long id);
    
}

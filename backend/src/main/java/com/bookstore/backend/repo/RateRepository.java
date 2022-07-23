package com.bookstore.backend.repo;
import com.bookstore.backend.model.BookRating;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@Repository

public interface RateRepository  extends JpaRepository<BookRating, String>{
    @Query("{'id': ?0}")
    Optional<BookRating> findById(String id);

    @Query("{'userid': ?0}")
    Optional<List<BookRating>> findByUserId(String userid);

    @Query("{'bookid': ?0}")
    Optional<List<BookRating>> findByBookId(String bookid);
}

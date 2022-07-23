package com.bookstore.backend.model;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service

public class RateService {
    
    public List<Rate> getAllRatings() {
        return rateRepository.findAll();
    }

    public void deleteRating (String id) {
        rateRepository.deleteID(id);
    }

    public void addRating(BookRating rating) {

        // validate the user through a call to the User Controller
        if (!isUserValid(rating.getID())) {
            throw new RuntimeException(String.format("User with ID %s is invalid!", rating.getID()));
        }

        // validate the book through a call to the Book Controller
        if (!isBookValid(rating.getBookid())) {
            throw new RuntimeException(String.format("Book with ID %s is invalid!", rating.getBookid()));
        }

        // validate the value passed for the rating (1-5 stars)
        int v = rating.getValue();
        if (v > 5 || v < 1) {
            throw new RuntimeException(String.format("Invalid value. Ratings must be between 1-5."));
        }

    }
    public void updateRating (BookRating rating) {

    }
    
    private boolean isUserValid(String userID) {
        String uri = "";
        uri += userID;

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, boolean.class);
    }

    private boolean isBookValid(String bookID) {

        String uri = "";
        uri += bookID;

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, boolean.class);
    }
}

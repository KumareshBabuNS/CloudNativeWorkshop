package io.springbox.reviews.controllers;

import io.springbox.reviews.domain.Review;
import io.springbox.reviews.repositories.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by agnisa on 31.08.2016.
 */
@RestController
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @RequestMapping(value = "/reviews", method = RequestMethod.GET)
    public Iterable<Review> reviews() {
        return reviewRepository.findAll();
    }

    @RequestMapping(value = "/reviews/{mlId}", method = RequestMethod.GET)
    public Iterable<Review> reviews(@PathVariable String mlId) {
        return reviewRepository.findByMlId(mlId);
    }

    @RequestMapping(value = "/reviews", method = RequestMethod.POST)
    public ResponseEntity<Review> createReview(@RequestBody Review review) {
        reviewRepository.save(review);
        return new ResponseEntity<>(review, HttpStatus.CREATED);
    }

}

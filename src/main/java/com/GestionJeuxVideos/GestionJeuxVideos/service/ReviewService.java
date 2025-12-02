package com.GestionJeuxVideos.GestionJeuxVideos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionJeuxVideos.GestionJeuxVideos.model.Review;
import com.GestionJeuxVideos.GestionJeuxVideos.repository.ReviewRepository;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review updateReview(Long id, Review reviewDetails) {
        Review review = reviewRepository.findById(id).orElseThrow();
        review.setAuthorName(reviewDetails.getAuthorName());
        review.setRating(reviewDetails.getRating());
        review.setComment(reviewDetails.getComment());
        review.setVideoGame(reviewDetails.getVideoGame());
        return reviewRepository.save(review);
    }

    public Review deleteReview(Long id) {
        Review review = reviewRepository.findById(id).orElseThrow();
        reviewRepository.delete(review);
        return review;
    }
}

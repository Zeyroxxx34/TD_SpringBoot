package com.GestionJeuxVideos.GestionJeuxVideos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionJeuxVideos.GestionJeuxVideos.model.Review;
import com.GestionJeuxVideos.GestionJeuxVideos.service.ReviewService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class ReviewController {
 @Autowired
 private ReviewService reviewService;

 @GetMapping("/reviews")
 public List<Review> getAllReviews() {
     return reviewService.getAllReviews();
 }

 @GetMapping("/review")
 public Review getReviewById(@RequestParam Long id) {
     return reviewService.getReviewById(id);
 }
 
 @PostMapping("/createReview")
 public Review createReview(@RequestBody Review review) {
      return reviewService.createReview(review);
 }

 @PutMapping("/updateReview")
 public Review updateReview(@RequestParam Long id, @RequestBody Review reviewDetails) {
     return reviewService.updateReview(id, reviewDetails);
 }

 @DeleteMapping("/deleteReview")
 public Review deleteReview(@RequestParam Long id) {
     return reviewService.deleteReview(id);
 }
}


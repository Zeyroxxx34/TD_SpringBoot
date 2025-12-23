package com.GestionJeuxVideos.GestionJeuxVideos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.GestionJeuxVideos.GestionJeuxVideos.model.Review;
import com.GestionJeuxVideos.GestionJeuxVideos.service.ReviewService;



@RestController
@RequestMapping("/api")
public class ReviewController {
 @Autowired
 private ReviewService reviewService;

 @GetMapping("/public/reviews")
 public List<Review> getAllReviews() {
     return reviewService.getAllReviews();
 }

 @GetMapping("/public/review")
 public Review getReviewById(@RequestParam Long id) {
     return reviewService.getReviewById(id);
 }
 
 @PostMapping("/admin/createReview")
 public Review createReview(@RequestBody Review review) {
      return reviewService.createReview(review);
 }

 @PutMapping("/admin/updateReview")
 public Review updateReview(@RequestParam Long id, @RequestBody Review reviewDetails) {
     return reviewService.updateReview(id, reviewDetails);
 }

 @DeleteMapping("/admin/deleteReview")
 public Review deleteReview(@RequestParam Long id) {
     return reviewService.deleteReview(id);
 }
}


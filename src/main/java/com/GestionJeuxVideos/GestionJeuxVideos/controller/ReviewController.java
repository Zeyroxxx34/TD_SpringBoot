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

 //Récupérer la liste de tous les avis
 @GetMapping("/public/reviews")
 public List<Review> getAllReviews() {
     return reviewService.getAllReviews();
 }

 //Récupérer un avis par son ID
 @GetMapping("/public/review")
 public Review getReviewById(@RequestParam Long id) {
     return reviewService.getReviewById(id);
 }
 
 //Créer un nouvel avis
 @PostMapping("/admin/createReview")
 public Review createReview(@RequestBody Review review) {
      return reviewService.createReview(review);
 }

 //Mettre à jour un avis existant
 @PutMapping("/admin/updateReview")
 public Review updateReview(@RequestParam Long id, @RequestBody Review reviewDetails) {
     return reviewService.updateReview(id, reviewDetails);
 }

 //Supprimer un avis
 @DeleteMapping("/admin/deleteReview")
 public Review deleteReview(@RequestParam Long id) {
     return reviewService.deleteReview(id);
 }
}


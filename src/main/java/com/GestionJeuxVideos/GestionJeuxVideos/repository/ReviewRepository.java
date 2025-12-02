package com.GestionJeuxVideos.GestionJeuxVideos.repository;

import com.GestionJeuxVideos.GestionJeuxVideos.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}

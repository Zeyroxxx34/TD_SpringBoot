package com.GestionJeuxVideos.GestionJeuxVideos.repository;

import com.GestionJeuxVideos.GestionJeuxVideos.model.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoGameRepository extends JpaRepository<VideoGame, Long> {
}

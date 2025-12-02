package com.GestionJeuxVideos.GestionJeuxVideos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionJeuxVideos.GestionJeuxVideos.model.VideoGame;
import com.GestionJeuxVideos.GestionJeuxVideos.repository.VideoGameRepository;

@Service
public class VideoGameService {
    @Autowired
    private VideoGameRepository videoGameRepository;

    public List<VideoGame> getAllVideoGames() {
        return videoGameRepository.findAll();
    }

    public VideoGame getVideoGameById(Long id) {
        return videoGameRepository.findById(id).orElse(null);
    }

    public VideoGame createVideoGame(VideoGame videoGame) {
        return videoGameRepository.save(videoGame);
    }

    public VideoGame updateVideoGame(Long id, VideoGame videoGameDetails) {
        VideoGame videoGame = videoGameRepository.findById(id).orElseThrow();
        videoGame.setName(videoGameDetails.getName());
        videoGame.setDescription(videoGameDetails.getDescription());
        return videoGameRepository.save(videoGame);
    }

    public VideoGame deleteVideoGame(Long id) {
        VideoGame videoGame = videoGameRepository.findById(id).orElseThrow();
        videoGameRepository.delete(videoGame);
        return videoGame;
    }
}

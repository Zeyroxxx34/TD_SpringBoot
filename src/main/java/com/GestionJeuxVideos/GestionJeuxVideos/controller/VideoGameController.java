package com.GestionJeuxVideos.GestionJeuxVideos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionJeuxVideos.GestionJeuxVideos.model.VideoGame;
import com.GestionJeuxVideos.GestionJeuxVideos.service.VideoGameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class VideoGameController {
 @Autowired
 private VideoGameService videoGameService;

 @GetMapping("/videoGames")
 public List<VideoGame> getAllVideoGames() {
     return videoGameService.getAllVideoGames();
 }

 @GetMapping("/videoGame")
 public VideoGame getVideoGameById(@RequestParam Long id) {
     return videoGameService.getVideoGameById(id);
 }
 
 @PostMapping("/createVideoGame")
 public VideoGame createVideoGame(@RequestBody VideoGame videoGame) {
      return videoGameService.createVideoGame(videoGame);
 }

 @PutMapping("/updateVideoGame")
 public VideoGame updateVideoGame(@RequestParam Long id, @RequestBody VideoGame videoGameDetails) {
     return videoGameService.updateVideoGame(id, videoGameDetails);
 }

 @DeleteMapping("/deleteVideoGame")
 public VideoGame deleteVideoGame(@RequestParam Long id) {
     return videoGameService.deleteVideoGame(id);
 }
}


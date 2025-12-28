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

import com.GestionJeuxVideos.GestionJeuxVideos.model.VideoGame;
import com.GestionJeuxVideos.GestionJeuxVideos.service.VideoGameService;



@RestController
@RequestMapping("/api")
public class VideoGameController {
 @Autowired
 private VideoGameService videoGameService;

 //Récupérer la liste de tous les jeux vidéos
 @GetMapping("/public/videoGames")
 public List<VideoGame> getAllVideoGames() {
     return videoGameService.getAllVideoGames();
 }

 //Récupérer un jeu vidéo par son ID
 @GetMapping("/public/videoGame")
 public VideoGame getVideoGameById(@RequestParam Long id) {
     return videoGameService.getVideoGameById(id);
 }
 
 //Créer un nouveau jeu vidéo
 @PostMapping("/admin/createVideoGame")
 public VideoGame createVideoGame(@RequestBody VideoGame videoGame) {
      return videoGameService.createVideoGame(videoGame);
 }

 //Mettre à jour un jeu vidéo existant
 @PutMapping("/admin/updateVideoGame")
 public VideoGame updateVideoGame(@RequestParam Long id, @RequestBody VideoGame videoGameDetails) {
     return videoGameService.updateVideoGame(id, videoGameDetails);
 }

 //Supprimer un jeu vidéo
 @DeleteMapping("/admin/deleteVideoGame")
 public VideoGame deleteVideoGame(@RequestParam Long id) {
     return videoGameService.deleteVideoGame(id);
 }
}


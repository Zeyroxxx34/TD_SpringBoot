package com.GestionJeuxVideos.GestionJeuxVideos.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Category {

    //Champs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //Une catégrorie peut contenir plusieurs jeux vidéo
    @ManyToMany(mappedBy = "categories")
    private Set<VideoGame> videoGames;

    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<VideoGame> getVideoGames() {
        return videoGames;
    }
    public void setVideoGames(Set<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }
}
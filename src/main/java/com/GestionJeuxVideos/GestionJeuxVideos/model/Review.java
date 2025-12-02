package com.GestionJeuxVideos.GestionJeuxVideos.model;

import java.sql.Date;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authorName;
    private int rating;
    private String comment;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "videoGame_id")
    private VideoGame videoGame;

    public Long getId() { 
        return id; 
    }
    public void setId(Long id) { 
        this.id = id; 
    }

    public String getAuthorName() { 
        return authorName; 
    }
    public void setAuthorName(String authorName) { 
        this.authorName = authorName; 
    }

    public int getRating() { 
        return rating; 
    }
    public void setRating(int rating) { 
        this.rating = rating; 
    }

    public String getComment() { 
        return comment; 
    }
    public void setComment(String comment) { 
        this.comment = comment; 
    }

    public Date getDate() { 
        return date; 
    }
    public void setDate(Date date) { 
        this.date = date; 
    }

    public VideoGame getVideoGame() {
        return videoGame;
    }
    public void setVideoGame(VideoGame videoGame) {
        this.videoGame = videoGame;
    }
}

package com.GestionJeuxVideos.GestionJeuxVideos.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class VideoGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Date releaseDate;
    private String image;

    @OneToMany(mappedBy = "videoGame")
    private List<Review> reviews;

    @ManyToMany
    @JoinTable(
        name = "videoGame_category",
        joinColumns = @JoinColumn(name = "videoGame_id"),
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;

    public VideoGame() {
    }

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

    public String getDescription() { 
        return description; 
    }
    public void setDescription(String description) { 
        this.description = description; 
    }

    public Date getReleaseDate() { 
        return releaseDate; 
    }
    public void setReleaseDate(Date releaseDate) { 
        this.releaseDate = releaseDate; 
    }

    public String getImage() { 
        return image; 
    }
    public void setImage(String image) { 
        this.image = image; 
    }

    public List<Review> getReviews() { 
        return reviews; 
    }
    public void setReviews(List<Review> reviews) { 
        this.reviews = reviews; 
    }

    public Set<Category> getCategories() { 
        return categories; 
    }
    public void setCategories(Set<Category> categories) { 
        this.categories = categories;
    }
}

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

import com.GestionJeuxVideos.GestionJeuxVideos.model.Category;
import com.GestionJeuxVideos.GestionJeuxVideos.service.CategoryService;



@RestController
@RequestMapping("/api")
public class CategoryController {
 @Autowired
 private CategoryService categoryService;

 //Récupérer la liste de toutes les catégories
 @GetMapping("/public/categories")
 public List<Category> getAllCategories() {
     return categoryService.getAllCategories();
 }

 //Récupérer une catégorie par son ID
 @GetMapping("/public/category")
 public Category getCategoryById(@RequestParam Long id) {
     return categoryService.getCategoryById(id);
 }
 
 //Créer une nouvelle catégorie
 @PostMapping("/admin/createCategory")
 public Category createCategory(@RequestBody Category category) {
      return categoryService.createCategory(category);
 }

 //Mettre à jour une catégorie existante
 @PutMapping("/admin/updateCategory")
 public Category updateCategory(@RequestParam Long id, @RequestBody Category categoryDetails) {
     return categoryService.updateCategory(id, categoryDetails);
 }

 //Supprimer une catégorie
 @DeleteMapping("/admin/deleteCategory")
 public Category deleteCategory(@RequestParam Long id) {
     return categoryService.deleteCategory(id);
 }
}



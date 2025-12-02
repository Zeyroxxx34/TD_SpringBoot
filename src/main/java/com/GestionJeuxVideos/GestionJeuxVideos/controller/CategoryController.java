package com.GestionJeuxVideos.GestionJeuxVideos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionJeuxVideos.GestionJeuxVideos.model.Category;
import com.GestionJeuxVideos.GestionJeuxVideos.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class CategoryController {
 @Autowired
 private CategoryService categoryService;

 @GetMapping("/categories")
 public List<Category> getAllCategories() {
     return categoryService.getAllCategories();
 }

 @GetMapping("/category")
 public Category getCategoryById(@RequestParam Long id) {
     return categoryService.getCategoryById(id);
 }
 
 @PostMapping("/createCategory")
 public Category createCategory(@RequestBody Category category) {
      return categoryService.createCategory(category);
 }

 @PutMapping("/updateCategory")
 public Category updateCategory(@RequestParam Long id, @RequestBody Category categoryDetails) {
     return categoryService.updateCategory(id, categoryDetails);
 }

 @DeleteMapping("/deleteCategory")
 public Category deleteCategory(@RequestParam Long id) {
     return categoryService.deleteCategory(id);
 }
}



package com.mherb.recipemanager.controller;

import com.mherb.recipemanager.domain.Recipe;
import com.mherb.recipemanager.service.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")

public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Recipe> findAll() {
        return recipeService.findAll();
    }

    @GetMapping ("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Recipe findById(@PathVariable String id) {
        return recipeService.findById(id);
    }

    @GetMapping("/findByContributor")
    @ResponseStatus(HttpStatus.OK)
    public Recipe findByContributor(@RequestParam String contributor) {
        return recipeService.findByContributorName(contributor);
    }

    @GetMapping("/findByTitle")
    @ResponseStatus(HttpStatus.OK)
    public Recipe findByTitle(@RequestParam String title) {
        return recipeService.findByTitle(title);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeService.createRecipe(recipe);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Recipe replaceRecipe(@PathVariable String id, @RequestBody Recipe recipe) {
        return recipeService.replaceRecipe(recipe);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRecipe(@PathVariable String id) {
         recipeService.deleteRecipe(id);
    }
}

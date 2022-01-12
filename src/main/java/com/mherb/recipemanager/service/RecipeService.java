package com.mherb.recipemanager.service;

import com.mherb.recipemanager.domain.Recipe;
import com.mherb.recipemanager.exception.RecipeNotFoundException;
import com.mherb.recipemanager.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> findAll() {
        log.info("Received request to get all recipes");
        return recipeRepository.findAll();
    }

    public Recipe findById(String id) {
        log.info("Received request to find Recipe with id: {}", id);
        return recipeRepository.findById(id).orElseThrow(() -> new RecipeNotFoundException("Could not find Recipe with id: " + id));
    }

    public Recipe createRecipe(Recipe recipe) {
        log.info("Received request to create a new Recipe: {}", recipe);
        return recipeRepository.save(recipe);
    }

    public Recipe replaceRecipe(Recipe recipe) {
        Recipe r = findById(recipe.getId());
        log.info("Received request to replace a Recipe, old Recipe: {}  new Recipe: {}", r, recipe);

        r.setTitle(recipe.getTitle());
        r.setContributorName(recipe.getContributorName());
        r.setInstructions(recipe.getInstructions());
        r.setNotes(recipe.getNotes());

        return recipeRepository.save(r);
    }

    public void deleteRecipe(String id) {
        log.info("Received request to delete Recipe with id: {}", id);

        Recipe r = recipeRepository.findById(id).orElseThrow(() -> new RecipeNotFoundException("Could not find Recipe with id: " + id));
        recipeRepository.deleteById(id);
    }

    public Recipe findByTitle(String title) {
        log.info("Received request to find Recipe with title: {}", title);

        return recipeRepository.findByTitle(title).orElseThrow(() -> new RecipeNotFoundException("Could not find Recipe with title: " + title));
    }

    public Recipe findByContributorName(String contributorName) {
        log.info("Received request to find Recipe with contributerName: {}", contributorName);

        return recipeRepository.findByContributorName(contributorName).orElseThrow(() -> new RecipeNotFoundException("Could not find Recipe with contributor name: " + contributorName));
    }
}

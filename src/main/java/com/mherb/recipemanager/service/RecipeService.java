package com.mherb.recipemanager.service;

import com.mherb.recipemanager.domain.Recipe;
import com.mherb.recipemanager.exception.RecipeNotFoundException;
import com.mherb.recipemanager.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

        return recipeRepository.save(Recipe.builder()
                .contributorName(recipe.getContributorName())
                .title(recipe.getTitle())
                .instructions(recipe.getInstructions())
                .notes(recipe.getNotes())
                .build()
        );
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

        Optional<Recipe> r = recipeRepository.findById(id);
        if (r.isPresent()) {
            recipeRepository.deleteById(id);
        }
        else {
            log.error("Could not delete Recipe with id: {} because its not there!", id);
        }
    }

    public List<Recipe> findByTitle(String title) {
        log.info("Received request to find Recipe with title: {}", title);

        return recipeRepository.findByTitle(title);
    }

    public List<Recipe> findByContributorName(String contributorName) {
        log.info("Received request to find Recipe with contributerName: {}", contributorName);

        return recipeRepository.findByContributorName(contributorName);
    }
}

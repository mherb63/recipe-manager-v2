package com.mherb.recipemanager.repository;

import com.mherb.recipemanager.domain.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
    List<Recipe> findByContributorName(String contributorName);
    List<Recipe> findByTitle(String title);
}
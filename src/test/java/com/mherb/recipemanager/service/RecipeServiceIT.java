package com.mherb.recipemanager.service;

import com.mherb.recipemanager.domain.Recipe;
import com.mherb.recipemanager.exception.RecipeNotFoundException;
import com.mherb.recipemanager.repository.RecipeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RecipeServiceIT {
    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    RecipeService recipeService;

    @Test
    public void testCreateRecipe() {
        Recipe r = new Recipe();
        r.setContributorName("Recipe IT Contributor Name");
        r.setTitle("Recipe IT Title");
        r.setInstructions("bla bla bla");
        r.setNotes("notes go here");

        r = recipeService.createRecipe(r);

        Recipe savedRecipe = recipeService.findById(r.getId());
        Assertions.assertEquals(r.getId(), savedRecipe.getId());
        Assertions.assertEquals(r.getContributorName(), savedRecipe.getContributorName());
        Assertions.assertEquals(r.getTitle(), savedRecipe.getTitle());

        recipeService.deleteRecipe(r.getId());
    }

    @Test
    public void testFindByTitle() {
        String title = "Recipe IT Title";
        Recipe r = new Recipe();
        r.setContributorName("Recipe IT Contributor Name");
        r.setTitle(title);
        r.setInstructions("bla bla bla");
        r.setNotes("notes go here");

        r = recipeService.createRecipe(r);

        List<Recipe> recipes = recipeService.findByTitle(title);
        Recipe findByTitleRecipe = recipes.get(0);

        Assertions.assertEquals(title, findByTitleRecipe.getTitle());

        recipeService.deleteRecipe(findByTitleRecipe.getId());
    }

    @Test
    public void testFindByContributorName() {
        String contributorName = "Recipe IT Contributor Name";
        Recipe r = new Recipe();
        r.setContributorName(contributorName);
        r.setTitle("Recipe IT Title");
        r.setInstructions("bla bla bla");
        r.setNotes("notes go here");

        r = recipeService.createRecipe(r);

        List<Recipe> recipes  = recipeService.findByContributorName(contributorName);
        Recipe findByContributorNameRecipe = recipes.get(0);
        Assertions.assertEquals(contributorName, findByContributorNameRecipe.getContributorName());

        recipeService.deleteRecipe(findByContributorNameRecipe.getId());
    }


    @Test
    public void testReplaceRecipe() {
        Recipe r = new Recipe();
        r.setContributorName("Recipe IT Contributor Name");
        r.setTitle("Recipe IT Title");
        r.setInstructions("bla bla bla");
        r.setNotes("notes go here");

        r = recipeService.createRecipe(r);

        r.setTitle("I changed the Recipe Title");

        Recipe updatedRecipe = recipeService.replaceRecipe(r);
        Assertions.assertEquals(r.getTitle(), updatedRecipe.getTitle());

        recipeService.deleteRecipe(r.getId());
    }

    @Test
    public void testRecipeNotFoundException() {
        Assertions.assertThrows(RecipeNotFoundException.class, () -> {
            recipeService.findById("nonExistingId");
        });
    }

    @Test
    public void testDeleteRecipe() {
        Recipe r = new Recipe();
        r.setContributorName("Recipe IT Contributor Name");
        r.setTitle("Recipe IT Title");
        r.setInstructions("bla bla bla");
        r.setNotes("notes go here");

        Recipe createdRecipe = recipeService.createRecipe(r);

        Assertions.assertNotNull(createdRecipe.getId());

        recipeService.deleteRecipe(createdRecipe.getId());

        Assertions.assertThrows(RecipeNotFoundException.class, () -> {
            recipeService.findById(createdRecipe.getId());
        });
    }
}

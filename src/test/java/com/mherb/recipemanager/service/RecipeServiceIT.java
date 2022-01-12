package com.mherb.recipemanager.service;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RecipeServiceIT {
// needs updating to Junit 5
//    @Autowired
//    RecipeRepository recipeRepository;
//
//    @Autowired
//    RecipeService recipeService;
//
//    @Test
//    public void testCreateRecipe() {
//        Recipe r = new Recipe();
//        r.setContributorName("Recipe IT Contributor Name");
//        r.setTitle("Recipe IT Title");
//        r.setInstructions("bla bla bla");
//        r.setNotes("notes go here");
//
//        r = recipeService.createRecipe(r);
//
//        Recipe savedRecipe = recipeService.findById(r.getId());
//        assertEquals(r.getId(), savedRecipe.getId());
//        assertEquals(r.getContributorName(), savedRecipe.getContributorName());
//        assertEquals(r.getTitle(), savedRecipe.getTitle());
//
//        recipeService.deleteRecipe(r.getId());
//    }
//
//    @Test
//    public void testFindByTitle() {
//        String title = "Recipe IT Title";
//        Recipe r = new Recipe();
//        r.setContributorName("Recipe IT Contributor Name");
//        r.setTitle(title);
//        r.setInstructions("bla bla bla");
//        r.setNotes("notes go here");
//
//        r = recipeService.createRecipe(r);
//
//        Recipe findByTitleRecipe = recipeService.findByTitle(title);
//        assertEquals(title, findByTitleRecipe.getTitle());
//
//        recipeService.deleteRecipe(findByTitleRecipe.getId());
//    }
//
//    @Test
//    public void testFindByContributorName() {
//        String contributorName = "Recipe IT Contributor Name";
//        Recipe r = new Recipe();
//        r.setContributorName(contributorName);
//        r.setTitle("Recipe IT Title");
//        r.setInstructions("bla bla bla");
//        r.setNotes("notes go here");
//
//        r = recipeService.createRecipe(r);
//
//        Recipe findByContributorNameRecipe = recipeService.findByContributorName(contributorName);
//        assertEquals(contributorName, findByContributorNameRecipe.getContributorName());
//
//        recipeService.deleteRecipe(findByContributorNameRecipe.getId());
//    }
//
//
//    @Test
//    public void testReplaceRecipe() {
//        Recipe r = new Recipe();
//        r.setContributorName("Recipe IT Contributor Name");
//        r.setTitle("Recipe IT Title");
//        r.setInstructions("bla bla bla");
//        r.setNotes("notes go here");
//
//        r = recipeService.createRecipe(r);
//
//        r.setTitle("I changed the Recipe Title");
//
//        Recipe updatedRecipe = recipeService.replaceRecipe(r);
//        assertEquals(r.getTitle(), updatedRecipe.getTitle());
//
//        recipeService.deleteRecipe(r.getId());
//    }
//
//    @Test
//    public void testRecipeNotFoundException() {
//        assertThrows(RecipeNotFoundException.class, () -> {
//            recipeService.findById("nonExistingId");
//        });
//    }
//
//    @Test
//    public void testDeleteRecipe() {
//        Recipe r = new Recipe();
//        r.setContributorName("Recipe IT Contributor Name");
//        r.setTitle("Recipe IT Title");
//        r.setInstructions("bla bla bla");
//        r.setNotes("notes go here");
//
//        Recipe createdRecipe = recipeService.createRecipe(r);
//
//        assertNotNull(createdRecipe.getId());
//
//        recipeService.deleteRecipe(createdRecipe.getId());
//
//        assertThrows(RecipeNotFoundException.class, () -> {
//            recipeService.findById(createdRecipe.getId());
//        });
//    }

}

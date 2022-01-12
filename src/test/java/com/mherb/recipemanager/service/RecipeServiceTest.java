package com.mherb.recipemanager.service;

public class RecipeServiceTest {
// needs updating to JUnit 5
//    RecipeService recipeService;
//
//    @Mock
//    RecipeRepository recipeRepository;
//
//    @BeforeAll
//    public void setUp() {
//        MockitoAnnotations.initMocks(this);
//
//        recipeService = new RecipeService(recipeRepository);
//    }
//
//    @Test
//    public void findRecipeByIdTest() {
//        Recipe recipe = new Recipe();
//        recipe.setId("recipeOne");
//        Optional<Recipe> recipeOptional = Optional.of(recipe);
//
//        when(recipeRepository.findById(anyString())).thenReturn(recipeOptional);
//
//        Recipe recipeReturned = recipeService.findById("recipeOne");
//
//        assertNotNull("Null recipe returned", recipeReturned);
//        verify(recipeRepository, times(1)).findById(anyString());
//        verify(recipeRepository, never()).findAll();
//    }
//
//    @Test
//    public void findRecipeByIdTestRecipeNotFound() {
//        assertThrows(RecipeNotFoundException.class, () -> {
//            recipeService.findById("1");
//        });
//    }
//
//    @Test
//    public void findAllRecipesTest() {
//        Recipe recipe = new Recipe();
//        recipe.setId("recipeOne");
//        List<Recipe> recipeList = new ArrayList<>();
//        recipeList.add(recipe);
//
//        when(recipeService.findAll()).thenReturn(recipeList);
//
//        List<Recipe> recipes = recipeService.findAll();
//
//        assertEquals(recipes.size(), 1);
//        verify(recipeRepository, times(1)).findAll();
//    }
//
//    @Test
//    public void testDeleteById() {
//        Recipe recipe = new Recipe();
//        recipe.setId("recipeOne");
//        Optional<Recipe> recipeOptional = Optional.of(recipe);
//
//        when(recipeRepository.findById(anyString())).thenReturn(recipeOptional);
//
//        recipeService.deleteRecipe("recipeTwo");
//
//        verify(recipeRepository, times(1)).deleteById(anyString());
//    }
//
//    @Test
//    public void testFindByTitle() {
//        String recipeTitle = "testRecipeTitle";
//        Recipe recipe = new Recipe();
//        recipe.setTitle(recipeTitle);
//        Optional<Recipe> recipeOptional = Optional.of(recipe);
//
//        when(recipeRepository.findByTitle(anyString())).thenReturn(recipeOptional);
//
//        Recipe recipeReturned = recipeService.findByTitle(recipeTitle);
//
//        assertNotNull("Null recipe returned", recipeReturned);
//        assertEquals(recipeTitle, recipeReturned.getTitle());
//    }
//
//    @Test
//    public void testFindByContributorName() {
//        String contributorName = "testRecipeContributorName";
//        Recipe recipe = new Recipe();
//        recipe.setContributorName(contributorName);
//        Optional<Recipe> recipeOptional = Optional.of(recipe);
//
//        when(recipeRepository.findByContributorName(anyString())).thenReturn(recipeOptional);
//
//        Recipe recipeReturned = recipeService.findByContributorName(contributorName);
//
//        assertNotNull("Null recipe returned", recipeReturned);
//        assertEquals(contributorName, recipeReturned.getContributorName());
//    }

}

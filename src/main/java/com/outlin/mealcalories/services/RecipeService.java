package com.outlin.mealcalories.services;

import com.outlin.mealcalories.exceptions.NotFoundException;
import com.outlin.mealcalories.models.Recipe;
import com.outlin.mealcalories.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public Recipe getRecipe(Long id) {
        return recipeRepository.findById(id).orElseThrow(() -> new NotFoundException("There is no recipe with the given id " + id));
    }
}

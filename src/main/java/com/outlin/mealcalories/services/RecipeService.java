package com.outlin.mealcalories.services;

import com.outlin.mealcalories.models.Recipe;

public interface RecipeService {
    Recipe createRecipe(Recipe recipe);

    Recipe getRecipe(Long id);
}

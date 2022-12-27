package com.outlin.mealcalories.services.impl;

import com.outlin.mealcalories.exceptions.NotFoundException;
import com.outlin.mealcalories.models.Recipe;
import com.outlin.mealcalories.repositories.IngredientRepository;
import com.outlin.mealcalories.repositories.RecipeRepository;
import com.outlin.mealcalories.services.RecipeService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final IngredientRepository ingredientRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {
        this.recipeRepository = recipeRepository;
        this.ingredientRepository = ingredientRepository;
    }

    public Recipe createRecipe(Recipe recipe) {
        recipe.getIngredientsWithAmounts().forEach(ingredientAmount -> {
            var name = ingredientAmount.getIngredient().getName();
            if (ingredientRepository.findByName(name).isEmpty()) {
                ingredientRepository.save(ingredientAmount.getIngredient());
            }
        });
        return recipeRepository.save(recipe);
    }

    public Recipe getRecipe(Long id) {
        return recipeRepository.findById(id).orElseThrow(() -> new NotFoundException("There is no recipe with the given id " + id));
    }
}

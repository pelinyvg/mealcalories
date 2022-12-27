package com.outlin.mealcalories.util;

import com.outlin.mealcalories.dtos.RecipeDTO;
import com.outlin.mealcalories.models.Recipe;

import java.util.List;

import static com.outlin.mealcalories.util.IngredientAmountUtil.getFlour;
import static com.outlin.mealcalories.util.IngredientAmountUtil.getFlourDto;

public class RecipeUtil {
    public static Recipe getCorrectRecipe() {
        return Recipe.builder()
                .name("bread")
                .calorieIn100gr(100.00)
                .ingredientsWithAmounts(List.of(getFlour()))
                .build();
    }

    public static RecipeDTO getRecipeDTO() {
        return RecipeDTO.builder()
                .name("bread")
                .calorieIn100gr(20.20)
                .ingredientsWithAmounts(
                        List.of(getFlourDto()))
                .build();
    }
}

package com.outlin.mealcalories.util;

import com.outlin.mealcalories.dtos.AmountDTO;
import com.outlin.mealcalories.dtos.IngredientAmountDTO;
import com.outlin.mealcalories.dtos.IngredientDTO;
import com.outlin.mealcalories.models.Amount;
import com.outlin.mealcalories.models.Ingredient;
import com.outlin.mealcalories.models.IngredientAmount;

public class IngredientAmountUtil {
    public static IngredientAmount getFlour() {
        return IngredientAmount.builder()
                .amount(Amount.builder()
                        .unit("gr")
                        .value(100.00)
                        .build())
                .ingredient(Ingredient.builder()
                        .name("flour")
                        .calorieIn100gr(150.00)
                        .build())
                .build();
    }

    public static IngredientAmountDTO getFlourDto() {
        return IngredientAmountDTO.builder()
                .amount(AmountDTO.builder()
                        .unit("gr")
                        .value(100.00)
                        .build())
                .ingredient(IngredientDTO.builder()
                        .name("flour")
                        .calorieIn100gr(150.00)
                        .build())
                .build();
    }
}

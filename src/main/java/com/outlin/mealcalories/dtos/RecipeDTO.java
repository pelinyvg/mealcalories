package com.outlin.mealcalories.dtos;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class RecipeDTO {
    private String name;
    private Double calorieIn100gr;
    private List<IngredientAmountDTO> ingredientsWithAmounts;
}

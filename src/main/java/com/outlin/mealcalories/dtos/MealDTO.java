package com.outlin.mealcalories.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MealDTO {
    private String name;
    private Double calorieTotal;
    private AmountDTO amount;
    private RecipeDTO recipe;
}

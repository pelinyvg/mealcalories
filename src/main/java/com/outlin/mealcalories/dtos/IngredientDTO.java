package com.outlin.mealcalories.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientDTO {
    private String name;
    private Double calorieIn100gr;
}

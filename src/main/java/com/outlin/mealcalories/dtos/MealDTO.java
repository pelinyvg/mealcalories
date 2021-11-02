package com.outlin.mealcalories.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MealDTO {
    private String name;
    private Double calorieIn100gr;
    private Double value;
    private String unit;
}

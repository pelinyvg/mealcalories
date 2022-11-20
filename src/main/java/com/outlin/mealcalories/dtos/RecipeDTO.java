package com.outlin.mealcalories.dtos;

import com.outlin.mealcalories.models.IngredientAmount;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import java.util.List;

public class RecipeDTO {
    private Long id;
    private String name;
    private Double calorieIn100gr;
    private List<IngredientAmount> ingredientsWithAmounts;
}

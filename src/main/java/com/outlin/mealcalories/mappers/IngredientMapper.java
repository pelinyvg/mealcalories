package com.outlin.mealcalories.mappers;

import com.outlin.mealcalories.dtos.IngredientDTO;
import com.outlin.mealcalories.dtos.MealDTO;
import com.outlin.mealcalories.models.Ingredient;
import com.outlin.mealcalories.models.Meal;
import org.mapstruct.Mapper;

@Mapper
public interface IngredientMapper {
    Ingredient dtoToEntity(IngredientDTO dto);
    IngredientDTO entityToDto(Ingredient ingredient);
}

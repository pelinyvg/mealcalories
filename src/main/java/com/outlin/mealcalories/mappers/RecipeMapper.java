package com.outlin.mealcalories.mappers;

import com.outlin.mealcalories.dtos.RecipeDTO;
import com.outlin.mealcalories.models.Recipe;
import org.mapstruct.Mapper;

@Mapper(uses = IngredientAmountMapper.class)
public interface RecipeMapper {
    Recipe dtoToEntity(RecipeDTO recipeDTO);
    RecipeDTO entityToDto(Recipe recipe);
}

package com.outlin.mealcalories.mappers;

import com.outlin.mealcalories.dtos.IngredientAmountDTO;
import com.outlin.mealcalories.models.IngredientAmount;
import org.mapstruct.Mapper;

@Mapper(uses = {AmountMapper.class, IngredientMapper.class})
public interface IngredientAmountMapper {
    IngredientAmount dtoToEntity(IngredientAmountDTO dto);
    IngredientAmountDTO entityToDto(IngredientAmount ingredientAmount);
}

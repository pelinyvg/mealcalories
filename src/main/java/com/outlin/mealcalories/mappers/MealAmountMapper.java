package com.outlin.mealcalories.mappers;

import com.outlin.mealcalories.dtos.MealDTO;
import com.outlin.mealcalories.models.MealAmount;
import org.mapstruct.Mapper;

@Mapper(uses = {AmountMapper.class, RecipeMapper.class})
public interface MealAmountMapper {
    MealAmount dtoToEntity(MealDTO dto);
    MealDTO entityToDto(MealAmount mealAmount);
}

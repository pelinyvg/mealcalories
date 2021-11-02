package com.outlin.mealcalories.mappers;

import com.outlin.mealcalories.dtos.MealDTO;
import com.outlin.mealcalories.models.Meal;
import org.mapstruct.Mapper;

@Mapper
public interface MealMapper {
    Meal dtoToEntity(MealDTO mealDTO);
    MealDTO entityToDto(Meal meal);
}

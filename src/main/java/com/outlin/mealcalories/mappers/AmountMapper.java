package com.outlin.mealcalories.mappers;

import com.outlin.mealcalories.dtos.AmountDTO;
import com.outlin.mealcalories.models.Amount;
import org.mapstruct.Mapper;

@Mapper
public interface AmountMapper {
    Amount dtoToEntity(AmountDTO dto);
    AmountDTO entityToDto(Amount amount);
}

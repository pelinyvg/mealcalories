package com.outlin.mealcalories.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AmountDTO {
    private Double value;
    private String unit;
}

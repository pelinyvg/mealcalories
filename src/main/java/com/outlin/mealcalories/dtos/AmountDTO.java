package com.outlin.mealcalories.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AmountDTO {
    private Double value;
    private String unit;
}

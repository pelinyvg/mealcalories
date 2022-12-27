package com.outlin.mealcalories.dtos;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class IngredientAmountDTO {
	private IngredientDTO ingredient;
	private AmountDTO amount;
}

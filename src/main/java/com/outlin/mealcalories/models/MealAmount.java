package com.outlin.mealcalories.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "meal_amount")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MealAmount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "calorie_total")
    private Double calorieTotal;
    @OneToOne
    @JoinColumn(name = "amount_id")
    private Amount amount;
    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;
}

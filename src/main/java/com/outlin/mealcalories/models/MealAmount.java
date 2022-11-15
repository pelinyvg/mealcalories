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
    @OneToOne
    private Amount amount;
    @OneToOne
    private Meal meal;
}

package com.outlin.mealcalories.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {
    @Id
    private Long id;
    private String name;
    @ManyToOne
    private Meal meal;
    @OneToOne
    private Amount amount;


}

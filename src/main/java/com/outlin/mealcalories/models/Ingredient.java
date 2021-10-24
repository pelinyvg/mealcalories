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
    private Double calorieIn100gr;
    @ManyToOne
    private Meal meal;
    @OneToOne
    private Amount amount;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Meal getMeal() {
        return meal;
    }

    public Amount getAmount() {
        return amount;
    }
}

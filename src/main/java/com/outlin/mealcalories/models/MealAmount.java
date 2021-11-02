package com.outlin.mealcalories.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "meal_amount")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MealAmount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Amount amount;
    @OneToOne
    private Meal meal;

    public Long getId() {
        return id;
    }

    public Amount getAmount() {
        return amount;
    }

    public Meal getMeal() {
        return meal;
    }
}

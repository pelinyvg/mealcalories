package com.outlin.mealcalories.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Meal {
    @Id
    private Long id;
    private String name;
    private Double calorieIn100gr;
    @OneToOne
    private Amount amount;
}

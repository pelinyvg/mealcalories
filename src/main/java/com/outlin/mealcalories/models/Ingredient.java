package com.outlin.mealcalories.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Ingredient {
    @Id
    private Long id;
    private String name;
    @ManyToOne
    private Meal meal;
}

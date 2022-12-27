package com.outlin.mealcalories.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table(name = "recipe")
@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "recipe_name")
    private String name;
    @Column(name = "calorie_in_100_gr")
    private Double calorieIn100gr;
    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<IngredientAmount> ingredientsWithAmounts;
}


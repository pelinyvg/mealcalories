package com.outlin.mealcalories.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ingredient_amount")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IngredientAmount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "amount_id", referencedColumnName = "id")
    private Amount amount;
    @OneToOne
    @JoinColumn(name = "ingredient_id", referencedColumnName = "id")
    private Ingredient ingredient;

    public Long getId() {
        return id;
    }

    public Amount getAmount() {
        return amount;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }
}

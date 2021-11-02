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
public class Amount {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Double value;
    private String unit;

    public Long getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }
}

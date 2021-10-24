package com.outlin.mealcalories.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Amount {
    @Id
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

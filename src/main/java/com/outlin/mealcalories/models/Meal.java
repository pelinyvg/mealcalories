package com.outlin.mealcalories.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
@Data
public class Meal {
    @Id
    private Long id;
}

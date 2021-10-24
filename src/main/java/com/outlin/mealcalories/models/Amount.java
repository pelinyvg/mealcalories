package com.outlin.mealcalories.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Amount {
    @Id
    private Long id;
}

package com.outlin.mealcalories.services;

import com.outlin.mealcalories.repositories.MealRepository;
import org.springframework.stereotype.Service;

@Service
public class MealService {

    private final MealRepository mealRepository;

    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }
}

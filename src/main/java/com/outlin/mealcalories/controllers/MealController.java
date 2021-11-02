package com.outlin.mealcalories.controllers;

import com.outlin.mealcalories.dtos.MealDTO;
import com.outlin.mealcalories.mappers.MealMapper;
import com.outlin.mealcalories.services.MealService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("meals")
public class MealController {

    private final MealService mealService;
    private final MealMapper mealMapper;

    public MealController(MealService mealService, MealMapper mealMapper) {
        this.mealService = mealService;
        this.mealMapper = mealMapper;
    }

    @PostMapping
    public ResponseEntity<MealDTO> addMeal(@RequestBody MealDTO mealDTO) {
        MealDTO request = mealMapper.entityToDto(mealService.createAmount(mealMapper.dtoToEntity(mealDTO)));
        return ResponseEntity.ok(request);
    }
}

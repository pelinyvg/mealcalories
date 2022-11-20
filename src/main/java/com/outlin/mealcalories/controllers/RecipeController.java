package com.outlin.mealcalories.controllers;

import com.outlin.mealcalories.dtos.RecipeDTO;
import com.outlin.mealcalories.mappers.RecipeMapper;
import com.outlin.mealcalories.services.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("recipes")
public class RecipeController {

    private final RecipeService recipeService;
    private final RecipeMapper recipeMapper;

    public RecipeController(RecipeService recipeService, RecipeMapper recipeMapper) {
        this.recipeService = recipeService;
        this.recipeMapper = recipeMapper;
    }

    @PostMapping
    public ResponseEntity<RecipeDTO> addRecipe(@RequestBody RecipeDTO recipeDTO) {
        RecipeDTO request = recipeMapper.entityToDto(recipeService.createRecipe(recipeMapper.dtoToEntity(recipeDTO)));
        return ResponseEntity.ok(request);
    }

    @GetMapping("/{id}")
	public ResponseEntity<RecipeDTO> getRecipe(@PathVariable Long id) {
    	RecipeDTO request = recipeMapper.entityToDto(recipeService.getRecipe(id));
    	return ResponseEntity.ok(request);
    }
}

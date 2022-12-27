package com.outlin.mealcalories.controllers;

import com.outlin.mealcalories.dtos.RecipeDTO;
import com.outlin.mealcalories.mappers.RecipeMapper;
import com.outlin.mealcalories.models.Recipe;
import com.outlin.mealcalories.services.impl.RecipeServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeServiceImpl recipeService;
    private final RecipeMapper recipeMapper;

    public RecipeController(RecipeServiceImpl recipeService, RecipeMapper recipeMapper) {
        this.recipeService = recipeService;
        this.recipeMapper = recipeMapper;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<RecipeDTO> addRecipe(@RequestBody RecipeDTO recipe) {
        Recipe request = recipeMapper.dtoToEntity(recipe);
        recipeService.createRecipe(request);
        RecipeDTO response = recipeMapper.entityToDto(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
	public ResponseEntity<RecipeDTO> getRecipe(@PathVariable Long id) {
    	RecipeDTO request = recipeMapper.entityToDto(recipeService.getRecipe(id));
    	return ResponseEntity.ok(request);
    }
}

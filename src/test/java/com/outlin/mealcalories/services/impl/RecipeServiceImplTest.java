package com.outlin.mealcalories.services.impl;

import com.outlin.mealcalories.models.Recipe;
import com.outlin.mealcalories.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static com.outlin.mealcalories.util.RecipeUtil.getCorrectRecipe;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class RecipeServiceImplTest {

    @InjectMocks private RecipeServiceImpl recipeService;
    @Mock private RecipeRepository recipeRepository;
    private Recipe recipe;

    @BeforeEach
    void setUp() {
        openMocks(this);
        recipe = getCorrectRecipe();
    }

    @Test
    void testCreateRecipe() {
        when(recipeRepository.save(recipe)).thenReturn(recipe);

        var result = recipeService.createRecipe(recipe);

        assertThat(result).isEqualTo(recipe);

        verify(recipeRepository).save(any());
    }

    @Test
    void testGetRecipe() {
        when(recipeRepository.findById(1L)).thenReturn(Optional.of(recipe));

        var result = recipeService.getRecipe(1L);

        assertThat(result).isEqualTo(recipe);

        verify(recipeRepository).findById(1L);
    }
}
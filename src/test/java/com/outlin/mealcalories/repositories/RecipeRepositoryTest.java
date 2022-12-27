package com.outlin.mealcalories.repositories;

import com.outlin.mealcalories.models.Recipe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

import static com.outlin.mealcalories.util.RecipeUtil.getCorrectRecipe;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class RecipeRepositoryTest {

    @Autowired
    RecipeRepository recipeRepository;
    @Autowired
    EntityManager entityManager;

    private Recipe recipe;

    @BeforeEach
    void setUp() {
        recipe = getCorrectRecipe();
        var ingredient = getCorrectRecipe().getIngredientsWithAmounts().stream().findFirst().get().getIngredient();
        entityManager.persist(ingredient);
        entityManager.persist(recipe);
        entityManager.flush();
    }

    @Test
        // TODO fix
    void testSaveRecipe() {
        var saved = recipeRepository.save(recipe);

        assertThat(saved).isEqualTo(recipe);
    }
}
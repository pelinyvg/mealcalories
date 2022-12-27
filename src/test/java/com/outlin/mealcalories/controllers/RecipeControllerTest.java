package com.outlin.mealcalories.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.outlin.mealcalories.dtos.AmountDTO;
import com.outlin.mealcalories.dtos.IngredientAmountDTO;
import com.outlin.mealcalories.dtos.IngredientDTO;
import com.outlin.mealcalories.dtos.RecipeDTO;
import com.outlin.mealcalories.mappers.RecipeMapper;
import com.outlin.mealcalories.models.Recipe;
import com.outlin.mealcalories.services.impl.RecipeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static com.outlin.mealcalories.util.IngredientAmountUtil.getFlour;
import static com.outlin.mealcalories.util.RecipeUtil.getCorrectRecipe;
import static com.outlin.mealcalories.util.RecipeUtil.getRecipeDTO;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = RecipeController.class)
class RecipeControllerTest {

    @Autowired private MockMvc mvc;
    @MockBean
    private RecipeServiceImpl recipeService;
    @MockBean private RecipeMapper recipeMapper;

    static ObjectMapper mapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        return objectMapper;
    }


    @Test
    void testAddRecipe() throws Exception {
        var recipeDTO = getRecipeDTO();

        mvc.perform(MockMvcRequestBuilders
                .post("/recipes")
                .content(asJsonString(recipeDTO))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isCreated());
    }

    @Test
    void testGetRecipe() throws Exception {
        var recipe = getCorrectRecipe();

        when(recipeService.getRecipe(1L)).thenReturn(recipe);

        this.mvc.perform(MockMvcRequestBuilders
                        .get("/recipes/{id}", 1L)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

    static String asJsonString(final Object obj) {
        try {
            return mapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
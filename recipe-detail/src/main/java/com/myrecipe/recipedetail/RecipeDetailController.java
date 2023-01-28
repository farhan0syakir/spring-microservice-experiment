package com.myrecipe.recipedetail;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeDetailController {

	@GetMapping("recipe-detail/{id}")
	public RecipeDetail getRecipeDetail(@PathVariable String id){
		return RecipeDetail.builder()
				.name("bakso")
				.description("bakso gituloh")
				.build();
	}
}

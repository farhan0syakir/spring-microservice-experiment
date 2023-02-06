package com.myrecipe.recipedetail;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeDetailController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping("recipe-detail/{id}")
	public RecipeDetail getRecipeDetail(@PathVariable String id) {
		return RecipeDetail.builder()
				.name("bakso")
				.description("bakso gituloh")
				.build();
	}

	@GetMapping("hello")
	public String hello() {
		return "greetings from " + serverPort;
	}
}
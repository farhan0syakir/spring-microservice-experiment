package com.myrecipe.recipedetail;

import com.myrecipe.recipedetail.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeListController {

	@Autowired
	RecipeDetailFeignClient recipeDetailFeignClient;

	@GetMapping("recipe-list")
	public String getRecipeDetail(){
		return recipeDetailFeignClient.getHello();
	}
}

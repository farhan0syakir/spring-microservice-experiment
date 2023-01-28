package com.myrecipe.recipedetail;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RecipeDetail {
	private String recipeDetailId;
	private String name;
	private String description;
}

package com.myrecipe.recipedetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RecipeListApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeListApplication.class, args);
	}

}

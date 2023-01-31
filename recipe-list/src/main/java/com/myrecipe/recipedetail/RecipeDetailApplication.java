package com.myrecipe.recipedetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RecipeDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeDetailApplication.class, args);
	}

}

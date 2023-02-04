package com.myrecipe.recipedetail;

import com.myrecipe.recipedetail.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "my-recipe-detail")
public interface  RecipeDetailFeignClient {

//	@RequestMapping(method = RequestMethod.GET, value = "/posts")
//	List<Post> getPosts();
//
//	@RequestMapping(method = RequestMethod.GET, value = "/posts/{postId}", produces = "application/json")
//	Post getPostById(@PathVariable("postId") Long postId);
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	String getHello();
}

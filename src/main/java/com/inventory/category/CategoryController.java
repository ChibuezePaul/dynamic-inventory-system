package com.inventory.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CategoryController {
	
	@Autowired
	CategoryServiceImpl categoryServiceImpl;
	
	@PostMapping("/addCategory")
	public String addCategory(@RequestBody Category category) {
		
		return categoryServiceImpl.addCategory(category);
	}
	
	@PostMapping("/editCategory/{id}")
	public Category editCategory(@PathVariable("id") Long id, @RequestBody Category category){
		
		return categoryServiceImpl.editCategory(id, category);
	}
	
	@GetMapping("/deleteCategory/{id}")
	public String deleteCategory(@PathVariable("id") Long id){
		
		return categoryServiceImpl.deleteCategory(id);
	}

	@GetMapping("/getAllCategory")
	public List<Category> getAllCategory(){
		
		return categoryServiceImpl.getAllCategory();
	}
	
	@GetMapping("/getCategory/{id}")
	public Category getCategory(@PathVariable("id") Long id){

		return categoryServiceImpl.getCategory(id);
	}
}

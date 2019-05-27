package com.inventory.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		
		return productServiceImpl.addProduct(product);
	}
	
	@PostMapping("/editProduct/{id}")
	public Product editProduct(@PathVariable("id") Long id, @RequestBody Product product){
		
		return productServiceImpl.editProduct(id, product);
	}
	
	@GetMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") Long id){
		
		return productServiceImpl.deleteProduct(id);
	}

	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		
		return productServiceImpl.getAllProduct();
	}
	
	@GetMapping("/getProduct/{id}")
	public Product getProduct(@PathVariable("id") Long id){

		return productServiceImpl.getProduct(id);
	}
}

package com.inventory.product;

import java.util.List;

public interface ProductService {
	public String addProduct(Product product);
	
	public Product editProduct(Long id, Product product);

	public String deleteProduct(Long id);

	public List <Product> getAllProduct();
	
	public Product getProduct(Long id);
}

package com.inventory.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public String addProduct(Product product) {
		productRepo.save(product);
		return "Product Added";
	}

	@Override
	public Product editProduct(Long id, Product product) {

		Product editPrd = productRepo.getOne(id);
		
		editPrd.setName(product.getName());
		editPrd.setPrdSuplier(product.getPrdSuplier());
		editPrd.setPrdUnit(product.getPrdUnit());
		editPrd.setPrdLow(product.getPrdLow());
		editPrd.setPrdImg(product.getPrdImg());
		editPrd.setPrdPrice(product.getPrdPrice());
		editPrd.setPrdCode(product.getPrdCode());
		editPrd.setPrdDetails(product.getPrdDetails());
		editPrd.setPrdUnitAvail(product.getPrdUnitAvail());
		editPrd.setPrdCategory(product.getPrdCategory());
		editPrd.setDateModified(LocalDate.now());
		
		return productRepo.save(editPrd);
	}

	@Override
	public String deleteProduct(Long id) {
		productRepo.deleteById(id);
		return "Category Deleted";
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getProduct(Long id) {

		return productRepo.getOne(id);
	}
		
}

package com.inventory.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class SalesServiceImpl implements SalesService {

	@Autowired
	SalesRepo salesRepo;
	
	@Override
	public String addSales(Sales sales) {
		salesRepo.save(sales);
		return "Sales Added";
	}

	@Override
	public Sales editSales(Long id, Sales sales) {

		Sales editSale = salesRepo.getOne(id);

		editSale.setName(sales.getName());
		editSale.setDetails(sales.getDetails());
		editSale.setDateModified(LocalDate.now());
		
		return salesRepo.save(editSale);
	}

	@Override
	public String deleteSales(Long id) {
		salesRepo.deleteById(id);
		return "Sales Deleted";
	}

	@Override
	public List<Sales> getAllSales() {
		return salesRepo.findAll();
	}
	
	@Override
	public Sales getSales(Long id) {
		return salesRepo.getOne(id);
	}
}

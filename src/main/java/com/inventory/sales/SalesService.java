package com.inventory.sales;

import java.util.List;

public interface SalesService {
    String addSales(Sales sales);
    Sales editSales(Long id, Sales sales);
    List<Sales> getAllSales();
    String deleteSales(Long id);
    Sales getSales(Long id);
}
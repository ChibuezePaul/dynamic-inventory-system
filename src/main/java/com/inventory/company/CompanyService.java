package com.inventory.company;

import java.util.List;

public interface CompanyService {
    String addCompany(Company company);
    Company editCompany(Long id, Company company);
    List<Company> getAllCompany();
    Company getCompany(Long id);
    String deleteCompany(Long id);
}
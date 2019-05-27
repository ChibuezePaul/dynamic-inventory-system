package com.inventory.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepo companyRepo;
	
	@Override
	public String addCompany(Company company) {
		companyRepo.save(company);
		return "Company Added";
	}

	@Override
	public Company editCompany(Long id, Company company) {

		Company editComp = companyRepo.getOne(id);

		editComp.setName(company.getName());
		editComp.setActive(company.getActive());
		editComp.setCoyDescription(company.getCoyDescription());
		editComp.setDateModified(LocalDate.now());
		
		return companyRepo.save(editComp);
	}

	@Override
	public String deleteCompany(Long id) {
		companyRepo.deleteById(id);
		return "Company Deleted";
	}

	@Override
	public List<Company> getAllCompany() {
		return companyRepo.findAll();
	}
	
	@Override
	public Company getCompany(Long id) {
		return companyRepo.getOne(id);
	}
}

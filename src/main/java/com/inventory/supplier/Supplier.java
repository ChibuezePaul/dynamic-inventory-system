package com.inventory.supplier;

import com.inventory.CommonFields;

import javax.persistence.Entity;

@Entity
public class Supplier extends CommonFields {

	private static final long serialVersionUID = 1L;
	
	private Integer active = 1;
	private String supplierWebsite;
    private String supplierCode = "SUP"+System.currentTimeMillis();

    public Supplier(Integer active, String supplierWebsite, String supplierCode) {
        this.active = active;
        this.supplierWebsite = supplierWebsite;
        this.supplierCode = supplierCode;
    }

    public Supplier() {
    }

    public String getSupplierWebsite() {
        return supplierWebsite;
    }

    public void setSupplierWebsite(String supplierWebsite) {
        this.supplierWebsite = supplierWebsite;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierWebsite='" + supplierWebsite + '\'' +
                ", supplierCode=" + supplierCode +
                '}';
    }
}

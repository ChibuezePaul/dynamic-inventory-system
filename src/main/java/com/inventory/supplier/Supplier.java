package com.inventory.supplier;

import com.inventory.commonFields.CommonFields;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class Supplier extends CommonFields {
    private String supplierWebsite;
    private Timestamp supplierCode;

    public Supplier(String supplierWebsite, Timestamp supplierCode) {
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

    public Timestamp getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(Timestamp supplierCode) {
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

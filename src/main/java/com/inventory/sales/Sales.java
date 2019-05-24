package com.inventory.sales;

import javax.persistence.Entity;

@Entity
public class Sales {
    private String paymentType;
    private Float amount;
    private String quantity;
    private String details;
}

package com.inventory.sales;

import com.inventory.CommonFields;

import javax.persistence.Entity;

@Entity
public class Sales extends CommonFields{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String paymentType;
    private Float amount;
    private String quantity;
    private String details;

    public Sales(String paymentType, Float amount, String quantity, String details) {
        this.paymentType = paymentType;
        this.amount = amount;
        this.quantity = quantity;
        this.details = details;
    }

    public Sales() {
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "paymentType='" + paymentType + '\'' +
                ", amount=" + amount +
                ", quantity='" + quantity + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}

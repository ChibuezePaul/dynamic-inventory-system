package com.inventory.product;


import com.inventory.CommonFields;
import com.inventory.category.Category;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product extends CommonFields{

	private static final long serialVersionUID = 1L;
	
	private String prdSuplier;
	
	private Long prdUnit;
	
	private Long prdLow;
	
	private String prdImg;

	private String prdCategory;
	
	private Float prdPrice;
	
	private String prdCode = "PRD"+System.currentTimeMillis();
	
	private String prdDetails;
	
	private Long prdUnitAvail;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cat_id", unique = true)
	private Category prdCat;
	
	protected Product() {
	}

	public Product(String prdSuplier, Long prdUnit, Long prdLow, String prdImg, String prdCategory, Float prdPrice,
			String prdCode, String prdDetails, Long prdUnitAvail, Category prdCat) {
		this.prdSuplier = prdSuplier;
		this.prdUnit = prdUnit;
		this.prdLow = prdLow;
		this.prdImg = prdImg;
		this.prdCategory = prdCategory;
		this.prdPrice = prdPrice;
		this.prdCode = prdCode;
		this.prdDetails = prdDetails;
		this.prdUnitAvail = prdUnitAvail;
		this.prdCat = prdCat;
	}

	public String getPrdSuplier() {
		return prdSuplier;
	}
	
	public void setPrdSuplier(String prdSuplier) {
		this.prdSuplier = prdSuplier;
	}
	
	public Long getPrdUnit() {
		return prdUnit;
	}
	
	public void setPrdUnit(Long prdUnit) {
		this.prdUnit = prdUnit;
	}
	
	public Long getPrdLow() {
		return prdLow;
	}
	
	public void setPrdLow(Long prdLow) {
		this.prdLow = prdLow;
	}
	
	public String getPrdImg() {
		return prdImg;
	}
	
	public void setPrdImg(String prdImg) {
		this.prdImg = prdImg;
	}
	
	public Float getPrdPrice() {
		return prdPrice;
	}
	
	public void setPrdPrice(Float prdPrice) {
		this.prdPrice = prdPrice;
	}
	
	public String getPrdCode() {
		return prdCode;
	}
	
	public void setPrdCode(String prdCode) {
		this.prdCode = prdCode;
	}
	
	public String getPrdDetails() {
		return prdDetails;
	}
	
	public void setPrdDetails(String prdDetails) {
		this.prdDetails = prdDetails;
	}
	
	public Long getPrdUnitAvail() {
		return prdUnitAvail;
	}
	
	public void setPrdUnitAvail(Long prdUnitAvail) {
		this.prdUnitAvail = prdUnitAvail;
	}
	
	public Category getPrdCat() {
		return prdCat;
	}
	
	public void setPrdCat(Category prdCat) {
		this.prdCat = prdCat;
	}
	
	public String getPrdCategory() {
		return prdCategory;
	}

	public void setPrdCategory(String prdCategory) {
		this.prdCategory = prdCategory;
	}

	@Override
	public String toString() {
		return "Product [prdSuplier=" + prdSuplier + ", prdUnit=" + prdUnit + ", prdLow=" + prdLow + ", prdImg="
				+ prdImg + ", prdCategory=" + prdCategory + ", prdPrice=" + prdPrice + ", prdCode=" + prdCode
				+ ", prdDetails=" + prdDetails + ", prdUnitAvail=" + prdUnitAvail + ", prdCat=" + prdCat + "]";
	}

}

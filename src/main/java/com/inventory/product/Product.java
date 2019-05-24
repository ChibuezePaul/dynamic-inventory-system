package com.inventory.product;

import java.sql.Timestamp;

import javax.persistence.Entity;

import com.inventory.commonFields.CommonFields;

@Entity
public class Product extends CommonFields{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String prdCat;
	private String prdSuplier;
	private Long prdUnit;
	private Long prdLow;
	private String prdImg;
	private Float prdPrice;
	private Timestamp prdCode;
	private String prdDetails;
	private Long prdUnitAvail;
	
	protected Product() {
	}

	public Product(String prdCat, String prdSuplier, Long prdUnit, Long prdLow, String prdImg, Float prdPrice,
			Timestamp prdCode, String prdDetails, Long prdUnitAvail) {
		this.prdCat = prdCat;
		this.prdSuplier = prdSuplier;
		this.prdUnit = prdUnit;
		this.prdLow = prdLow;
		this.prdImg = prdImg;
		this.prdPrice = prdPrice;
		this.prdCode = prdCode;
		this.prdDetails = prdDetails;
		this.prdUnitAvail = prdUnitAvail;
	}
	public String getPrdCat() {
		return prdCat;
	}
	public void setPrdCat(String prdCat) {
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
	public Timestamp getPrdCode() {
		return prdCode;
	}
	public void setPrdCode(Timestamp prdCode) {
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
	@Override
	public String toString() {
		return "Product [prdCat=" + prdCat + ", prdSuplier=" + prdSuplier + ", prdUnit=" + prdUnit + ", prdLow="
				+ prdLow + ", prdImg=" + prdImg + ", prdPrice=" + prdPrice + ", prdCode=" + prdCode + ", prdDetails="
				+ prdDetails + ", prdUnitAvail=" + prdUnitAvail + "]";
	}

}

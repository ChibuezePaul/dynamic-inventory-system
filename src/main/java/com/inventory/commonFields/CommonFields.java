package com.inventory.commonFields;

import java.io.Serializable;
import java.time.LocalDate;

public class CommonFields implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private LocalDate dateCreated;
	private LocalDate dateModified;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDate getDateModified() {
		return dateModified;
	}
	public void setDateModified(LocalDate dateModified) {
		this.dateModified = dateModified;
	}

	
}

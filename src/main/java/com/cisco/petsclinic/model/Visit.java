package com.cisco.petsclinic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Visit {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String petname;
	private String petOwner;
	private String visitDate;
	private String reason;
	public Visit() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPetname() {
		return petname;
	}
	public void setPetname(String petname) {
		this.petname = petname;
	}
	public String getPetOwner() {
		return petOwner;
	}
	public void setPetOwner(String petOwner) {
		this.petOwner = petOwner;
	}
	public String getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Visit(String petname, String petOwner, String visitDate, String reason) {
		super();
		this.petname = petname;
		this.petOwner = petOwner;
		this.visitDate = visitDate;
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "PetsClinic [id=" + id + ", petname=" + petname + ", petOwner=" + petOwner + ", visitDate=" + visitDate
				+ ", reason=" + reason + "]";
	}
	
	
} 
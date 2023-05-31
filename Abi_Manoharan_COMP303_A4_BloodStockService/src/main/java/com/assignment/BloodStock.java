package com.assignment;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity    
@Table(name="BloodStock")
public class BloodStock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BloodStockId")
	private int bloodStockId;
	@Column(name="BloodGroup")
	private String bloodGroup;
	@Column(name="Quantity")
	private int quantity;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	@Column(name="BestBefore")
	private Date bestBefore;
	@Column(name="Status")
	private String status;
	
	
	public BloodStock() {
		super();
	}
	public BloodStock(int bloodStockId, String bloodGroup, int quantity, Date bestBefore, String status) {
		super();
		this.bloodStockId = bloodStockId;
		this.bloodGroup = bloodGroup;
		this.quantity = quantity;
		this.bestBefore = bestBefore;
		this.status = status;
	}
	public int getBloodStockId() {
		return bloodStockId;
	}
	public void setBloodStockId(int bloodStockId) {
		this.bloodStockId = bloodStockId;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getBestBefore() {
		return bestBefore;
	}
	public void setBestBefore(Date bestBefore) {
		this.bestBefore = bestBefore;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}


package com.assignment;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity    
@Table(name="bloodBank")
public class BloodBank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BloodBankId")
	private int bloodBankId;
	@Column(name="BloodBankName")
	private String bloodBankName;
	@Column(name="Address")
	private String address;
	@Column(name="City")
	private String city;
	@Column(name="PhoneNumber")
	private int phoneNumber;
	@Column(name="Website")
	private String website;
	@Column(name="Email")
	private String email;
	
	public BloodBank(int bloodBankId, String bloodBankName, String address, String city, int phoneNumber, String website,
			String email) {
		super();
		this.bloodBankId = bloodBankId;
		this.bloodBankName = bloodBankName;
		this.address = address;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.website = website;
		this.email = email;
	}
	
	public BloodBank() {
		super();
	}
	
	public int getBloodBankId() {
		return bloodBankId;
	}
	public void setBloodBankId(int bloodBankId) {
		this.bloodBankId = bloodBankId;
	}
	public String getBloodBankName() {
		return bloodBankName;
	}
	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	



}


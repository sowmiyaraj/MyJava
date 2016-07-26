package com.dallas.hibernate;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@Column(length=15)
	private String name;
	
	private Address homeAddress;
	
	
	@AttributeOverrides(
		value = {
		@AttributeOverride(column = @Column(name="officehousenum"), name = "housenum"),
		@AttributeOverride(column = @Column(name="officepincode"), name = "pincode"),
		@AttributeOverride(column = @Column(name="officestreet"), name = "street")})
	private Address officeAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
}

package com.dallas.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
 private int housenum;
 @Column(length=20)
 private String street;
 private int pincode;
public int getHousenum() {
	return housenum;
}
public void setHousenum(int housenum) {
	this.housenum = housenum;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
 
}

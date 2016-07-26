package com.dallas.hibernate;



import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import java.util.*;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Trainer {
   
	
	@Column(length=20)
	protected String name;
	/*@Column(length=20)
	private String subject;*/
	
	
	@Id 
	@GeneratedValue
	protected  int age;
	
	@Transient
	protected int bonus;
	
	/*@Temporal(value=TemporalType.TIMESTAMP)
	private Date joiningdate;
	
	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}*/
	/*protected Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}*/

/*	@ElementCollection
	protected List<String> subject = new ArrayList<>();
	
	@ElementCollection
	protected List<String> qual = new ArrayList<>();
	
	public List<String> getQual() {
		return qual;
	}

	public void setQual(List<String> qual) {
		this.qual = qual;
	}
*/
	protected int salary;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	/*public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}*/
    /*	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	*/

	/*public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}*/

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

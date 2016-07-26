package com.dallas.hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="java_student")
public class Student {
	
	
   @Id
   @Column(name="official_name",length=20)
   private String name;

   @Column(name="official_age")
   private int age;

   private float sal;
   
   public float getSal() {
	return sal;
   }


   public void setSal(float sal) {
	this.sal = sal;
   }
   private char gender;

public char getGender() {
	return gender;
}


public void setGender(char gender) {
	this.gender = gender;
}


   
	public String getName() {
		return name;
	}
    
   
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

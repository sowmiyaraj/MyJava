package com.dallas.sowmiya.streamexample;

public class Employee {
	
	private String empName;
	private int empCode;
	private String empSpec;
	
	Employee(String empName, int empCode, String empSpec)
	{
		this.empName = empName;
		this.empCode = empCode;
		this.empSpec = empSpec;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpCode() {
		return empCode;
	}
	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}
	public String getEmpSpec() {
		return empSpec;
	}
	public void setEmpSpecialized(String empSpecialized) {
		this.empSpec = empSpec;
	}
	
}

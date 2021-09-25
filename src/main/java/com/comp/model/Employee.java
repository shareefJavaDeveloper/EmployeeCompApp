package com.comp.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.Id;

@Entity
@Table(name = "employee")
@Data
public class Employee {
	
	@Id
	private long employeeId;
	
	private String name;
	
	private String address;
	
	private long basic;
	
	private long houseRentalAllowance;
	
	private long conveyanceAllowance;
	
	private long medicalAllowance;
	
	private long specialAllowance;
	
	private long AdvanceStatuatoryBonus;
}

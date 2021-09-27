package com.comp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Id;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
public class Employee {
	
	@Id
	private long employeeId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "basic")
	private long basic;
	
	@Column(name = "houseRentalAllowance")
	private long houseRentalAllowance;
	
	@Column(name="conveyanceAllowance")
	private long conveyanceAllowance;
	
	@Column(name="medicalAllowance")
	private long medicalAllowance;
	
	@Column(name="specialAllowance")
	private long specialAllowance;
	
	@Column(name="AdvanceStatuatoryBonus")
	private long AdvanceStatuatoryBonus;
}

package com.comp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	public long employeeId;
	
	@Column(name = "name")
	public String name;
	
	@Column(name = "address")
	public String address;
	
	@Column(name = "basic")
	public long basic;
	
	@Column(name = "houseRentalAllowance")
	public long houseRentalAllowance;
	
	@Column(name="conveyanceAllowance")
	public long conveyanceAllowance;
	
	@Column(name="medicalAllowance")
	public long medicalAllowance;
	
	@Column(name="specialAllowance")
	public long specialAllowance;
	
	@Column(name="AdvanceStatuatoryBonus")
	public long AdvanceStatuatoryBonus;
}

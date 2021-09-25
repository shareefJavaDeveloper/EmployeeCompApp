package com.comp.EmployeeRepository;

import org.springframework.data.repository.CrudRepository;

import com.comp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}

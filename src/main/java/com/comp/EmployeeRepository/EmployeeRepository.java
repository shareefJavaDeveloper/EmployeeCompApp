package com.comp.EmployeeRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comp.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{

}

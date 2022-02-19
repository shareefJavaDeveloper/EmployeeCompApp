package com.comp.ServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.comp.EmployeeRepository.EmployeeRepository;
import com.comp.Service.FileService;
import com.comp.Utils.CSVUtils;
import com.comp.model.Employee;

@Service
public class FileServiceImpl implements FileService{
	
	@Autowired
	CSVUtils csvUtils;
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public void store(MultipartFile file) {
		
		List<Employee> employees;
		try {
			employees = csvUtils.read(Employee.class, file.getInputStream());
			repo.saveAll(employees);
		} catch (IOException e) {
			throw new RuntimeException("Error in reading the file : " + e.getLocalizedMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		  }
		
	}

package com.comp.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

import com.comp.model.Employee;

@Component
public class CSVUtils {
	
	public List<Employee> parseCSV(InputStream is) {
		BufferedReader fileReader = null;
		CSVParser csvParser = null;

		List<Employee> employees = new ArrayList<Employee>();
	 try {
		 fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			csvParser = new CSVParser(fileReader,
					CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

			Iterable<CSVRecord> csvRecords = csvParser.getRecords();
			
			for (CSVRecord csvRecord : csvRecords) {
				Employee employee = new Employee(
						Long.parseLong(csvRecord.get(ProjConstants.EMP_ID)),
						csvRecord.get(ProjConstants.EMP_NAME),
						csvRecord.get(ProjConstants.EMP_ADD),
						Long.parseLong(csvRecord.get(ProjConstants.EMP_BASIC)),
						Long.parseLong(csvRecord.get(ProjConstants.EMP_HRA)),
						Long.parseLong(csvRecord.get(ProjConstants.EMP_CA)),
						Long.parseLong(csvRecord.get(ProjConstants.EMP_MA)),
						Long.parseLong(csvRecord.get(ProjConstants.EMP_SA)),
						Long.parseLong(csvRecord.get(ProjConstants.EMP_ASB))
						
						);
				
				employees.add(employee);
			}
			
		} catch (Exception e) {
			System.out.println("Reading CSV Error!");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				csvParser.close();
			} catch (IOException e) {
				System.out.println("Closing fileReader/csvParser Error!");
				e.printStackTrace();
			}
		}
		
		return employees;
}
}

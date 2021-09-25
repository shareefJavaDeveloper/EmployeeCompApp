package com.comp.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import com.comp.model.Employee;

public class CSVUtils {
	
	public Employee parseCSV(MultipartFile file) {
	 try {
		 BufferedReader fileReader = new BufferedReader(new InputStreamReader(file.getInputStream(), "UTF-8"));
				 CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT);

				 Iterable<CSVRecord> employee = csvParser.getRecords();

				 for (CSVRecord csvRecord : employee) {
						
				}
	    }
	    catch(IOException ioe) {
	      ioe.printStackTrace();
	    }
	return null;

}
}

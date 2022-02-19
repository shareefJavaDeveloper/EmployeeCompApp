package com.comp.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

@Component
public class CSVUtils {

	private CSVUtils() {
		super();
	}
	
	private static final CsvMapper mapper = new CsvMapper();
	
	public static <T> List<T> read(Class<T> clazz, InputStream stream) throws IOException {
		
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		
		CsvSchema schema = mapper.schemaFor(clazz).withHeader().withColumnReordering(true);
		ObjectReader reader = mapper.readerFor(clazz).with(schema);
		
		return reader.<T>readValues(stream).readAll();
		
	}
	
	
}


package com.comp.Service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
	
	public void store(MultipartFile file);

}

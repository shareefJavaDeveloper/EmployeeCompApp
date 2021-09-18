package com.comp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadFileController {
	
	 @GetMapping("/")
	    public String index() {
	        return "multipartfile/uploadform.html";
	    }

}

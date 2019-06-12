package com.macrosoft.ocrws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class OcrwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcrwsApplication.class, args);
	}

}

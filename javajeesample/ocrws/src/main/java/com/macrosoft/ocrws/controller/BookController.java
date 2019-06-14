package com.macrosoft.ocrws.controller;

import jakarta.tutorial.helloservice.endpoint.BookWeb;
import jakarta.tutorial.helloservice.endpoint.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class BookController {

	private BookWeb service = new BookWeb();

	@RequestMapping("/bookws")
	public  Book getBook() {
		
        jakarta.tutorial.helloservice.endpoint.BookWs port = service.getBookWsPort();
        return port.getBookById();
    }
}
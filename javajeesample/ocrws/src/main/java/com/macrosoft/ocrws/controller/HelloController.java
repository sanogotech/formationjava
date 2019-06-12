package com.macrosoft.ocrws.controller;

import jakarta.tutorial.helloservice.endpoint.HelloService;
import jakarta.tutorial.helloservice.endpoint.Client;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private HelloService service = new HelloService();

    @RequestMapping("/hellows")
    public String  hello( ) {
		
		String  responsews = new String();
		  responsews = "<p>" + sayHello("world") + "</p>" + "<p>" ;
        return  responsews;
    }
	
	
	 private String sayHello(java.lang.String arg0) {
        jakarta.tutorial.helloservice.endpoint.Hello port = 
                service.getHelloPort();
        return port.sayHello(arg0);
    }
	
	@RequestMapping("/clientws")
	public  Client getClient(String name) {
        jakarta.tutorial.helloservice.endpoint.Hello port = 
                service.getHelloPort();
        return port.getClient(name);
    }
}
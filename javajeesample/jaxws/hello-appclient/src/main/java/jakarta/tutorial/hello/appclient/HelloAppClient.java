/*
 * Copyright (c) 2014, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package jakarta.tutorial.hello.appclient;

import jakarta.tutorial.helloservice.endpoint.HelloService;
import javax.xml.ws.WebServiceRef;
import jakarta.tutorial.helloservice.endpoint.Client;

public class HelloAppClient {
    @WebServiceRef(wsdlLocation = 
      "http://localhost:8080/hello/HelloService?WSDL")
    private static HelloService service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(sayHello("world"));
	   System.out.println(getClient("client").getNom());
    }

    private static String sayHello(java.lang.String arg0) {
        jakarta.tutorial.helloservice.endpoint.Hello port = 
                service.getHelloPort();
        return port.sayHello(arg0);
    }
	
	
	  private static  Client getClient(String name) {
        jakarta.tutorial.helloservice.endpoint.Hello port = 
                service.getHelloPort();
        return port.getClient(name);
    }
}
package com.cnss.demo.utils;

public enum Mobile {
	
	Samsung(400), Nokia(250),Motorola(325),MONSIEUR(520);
	  
	   int price;
	   Mobile(int p) {
	      price = p;
	   }
	   int showPrice() {
	      return price;
	   } 

}

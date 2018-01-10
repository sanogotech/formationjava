package com.cnss.demo.utils;

public class MobileEumTest {
	
	public static void main(String args[]) {
		   
	      System.out.println("CellPhone List:");
	      for(Mobile m : Mobile.values()) { 
	         System.out.println(m + " costs " + m.showPrice() + " dollars");
	      }

	      Mobile ret;
	      ret = Mobile.valueOf("Samsung"); 
	      System.out.println("Selected : " + ret);  
	      
	      ret = Mobile.valueOf("MONSIEUR"); 
	      System.out.println("Selected : " + ret); 
	   }

}

package com.cnss.demo.utils.enumuration;

public enum Civilite {
	
	  MADAME("MADAME","MME"),
	  MADEMOISELLE("MADEMOISELLE","MLLE"),
	  MONSIEUR("MONSIEUR","MR") ;  
	
	  private String valeur ;
	  private String abreviation ;  
	     
	    private Civilite(String valeur,String abreviation) {  
	    	this.valeur = valeur ; 
	        this.abreviation = abreviation ;  
	   }  
	    
	    public String toString() {  
	        return  this.abreviation ;  
	   } 
	     
	    public String getAbreviation() {  
	        return  this.abreviation ;  
	   } 
	    
	    public String getValeur() {  
	        return  this.valeur ;  
	   }
	    
	    
}

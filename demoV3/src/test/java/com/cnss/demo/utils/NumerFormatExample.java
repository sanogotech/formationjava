package com.cnss.demo.utils;

import java.math.BigDecimal;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class NumerFormatExample {
	
	 @NumberFormat(style = Style.CURRENCY)
	  private final BigDecimal amount =null;

	  @NumberFormat(style = Style.NUMBER, pattern = "#,###.###")
	  private final BigDecimal interest=null;

	  @NumberFormat(style = Style.PERCENT)
	  private final BigDecimal interestRate=null;
	  
	  byte temperature = 64;
	  short vitesseMax = 32000;
	  
	  int temperatureSolei = 15600000;
	  
	  float nombre= 2.0f;
	  
	  float pi =3.141592653f;
	  
	  double division= 0.333333333333333333333333333333333333333333334d;

}

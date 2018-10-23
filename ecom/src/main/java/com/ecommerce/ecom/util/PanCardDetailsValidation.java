package com.ecommerce.ecom.util;

import java.util.regex.Pattern;

public class PanCardDetailsValidation {

	 public static boolean isValidPanCard = false;
	 
	public static boolean validatePanCardNumber(String panCardNumber){
		
		 Pattern panCardPattern = Pattern.compile("[a-zA-Z]{5}\\d{4}[a-zA-Z]{1}");
		   isValidPanCard = panCardPattern.matcher(panCardNumber).matches();
        return isValidPanCard;
    }
	
	/*public static void main(String[] args) 
	 {
	  String panCardNumber="bngps1288a";
	  System.out.println("The pan card validation result is as " + PanCardDetailsValidation.validatePanCardNumber(panCardNumber) );
	 
	 
	  }*/
	 
	  

	 
}

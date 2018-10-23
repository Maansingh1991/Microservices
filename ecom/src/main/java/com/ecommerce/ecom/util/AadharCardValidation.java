package com.ecommerce.ecom.util;

import java.util.regex.Pattern;

public class AadharCardValidation {

	 public static boolean isValidAadhar = false;
	 
	public static boolean validateAadharNumber(String aadharNumber){
        Pattern aadharPattern = Pattern.compile("[2-9]{1}[0-9]{11}");
        isValidAadhar = aadharPattern.matcher(aadharNumber).matches();
        return isValidAadhar;
    }
	
	/*public static void main(String[] args) {
		
		 String aadharNumber="453312341234";
		 System.out.println("The aadhar card validation result is as " + AadharCardValidation.validateAadharNumber(aadharNumber) );
	}*/

}

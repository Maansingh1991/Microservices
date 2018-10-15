package com.ecommerce.ecom.util;

import java.util.Scanner;

public class PanCardDetailsValidation {

	public static void main(String[] args) 
	 {
	  System.out.println("Enter the number of the valid pan Numbers for Test");
	  Scanner scn=new Scanner(System.in);
	  int theTestCaseCount=scn.nextInt();
	  String s[]=new String[theTestCaseCount];
	  boolean output[]=new boolean[theTestCaseCount];
	  for(int i=0; i<s.length;i++)
	  {
	   s[i]=scn.next();
	   boolean ss=s[i].matches("[a-zA-Z]{5}\\d{4}[a-zA-Z]{1}");
	   output[i]=ss;
	  }
	  for(boolean b:output)
	  {
	   System.out.println("The verification result " + b);
	  }
	  scn.close();
	  

	 }
}

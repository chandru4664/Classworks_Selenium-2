package com.htc.finalsample;

public class ReferenceFinal {
	// Java program to demonstrate 
	// reference final variable
	 
	  public static void main(String[] args) 
	    {
	        // a final reference variable sb
	        final StringBuilder sb = new StringBuilder("Hello");
	         
	        System.out.println(sb);
	         
	        // changing internal state of object
	        // reference by final reference variable sb
	        sb.append("World");
	         
	        System.out.println(sb);
	    }    
	}


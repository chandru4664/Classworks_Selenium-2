package com.htc.hashcodeequals;

public class MainModule {
	 public static void main (String[] args)
	    {
	     
	        // creating the Objects of Student class.
	        Student g1 = new Student("aa", 1);
	        Student g2 = new Student("aa", 1);
	         
	        // comparing above created Objects.
	        if(g1.hashCode() == g2.hashCode())
	        {
	 
	            if(g1.equals(g2))
	                System.out.println("Both Objects are equal. ");
	            else
	                System.out.println("Both Objects are not equal. ");
	     
	        }
	        else
	        System.out.println("Both Objects are not equal. "); 
	    } 
}

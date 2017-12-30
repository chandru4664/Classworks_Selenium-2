package com.htc.suite;

			
import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;		

public class SuiteTest1 {				

    						

   
    @Test(expected = ArithmeticException.class)					
    public void testArithmeticException() {					
       System.out.println("From SuiteTest1 Method1 testing Exception ");
        int t=10/0;
    }		

    @Test		
    public void testString() {					
      String  message = "Hello World";							
      System.out.println("From SuiteTest1 Method2 comparing string");					
        assertEquals(message,"Hello World" );					
       							
    }		
}		
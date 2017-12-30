package com.htc.suite;

import org.junit.Assert;		
import org.junit.Test;		

public class SuiteTest2 {				
    /** Test of setName() method, of class Value */		

    @Test		
    public void createAndSetName() {					
        Student v1 = new Student();					

        v1.setName("Sayooj");					

        String expected = "SayoojP";					
        String actual = v1.getName();					

        Assert.assertEquals(expected, actual);					
        System.out.println("From Suite 2 Method 1 Testing the setter and getter");							
    }		

}		
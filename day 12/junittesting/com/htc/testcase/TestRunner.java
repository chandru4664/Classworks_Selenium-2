package com.htc.testcase;

import org.junit.runner.JUnitCore;		
import org.junit.runner.Result;		
import org.junit.runner.notification.Failure;	
import org.junit.runner.notification.*;

public class TestRunner {				
			public static void main(String[] args) {									
      Result result = JUnitCore.runClasses(TestCase2.class);	
      System.out.println("Runcount " +result.getRunCount());
      System.out.println("Ignorecount " +result.getIgnoreCount());
      System.out.println("Run Time " +result.getRunTime());
			for (Failure failure : result.getFailures()) {							
         System.out.println(failure.toString());					
      }		
      System.out.println("Result="+result.wasSuccessful());							
   }		
}      
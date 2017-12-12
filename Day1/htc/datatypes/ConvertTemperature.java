package com.htc.datatypes;

/*
 * Convert temperature between Celsius and Fahrenheit
 */
public class ConvertTemperature {  // Save as "ConvertTemperature.java"
   public static void main(String[] args) {
      double celsius, fahrenheit;
 
      celsius = 37.5;
      fahrenheit = celsius * 9.0 / 5.0 + 32.0;
      System.out.println(celsius + " degree C is " + fahrenheit + " degree F.");
 
      fahrenheit = 100.0;
      celsius =  (fahrenheit - 32.0) * 5.0 / 9.0;
      System.out.println(fahrenheit + " degree F is " + celsius + " degree C.");
 
   }
}


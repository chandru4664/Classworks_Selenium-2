package com.htc.regexsample;

import java.util.Scanner;
import java.util.regex.*;  
public class RegexExample1{  
public static void main(String args[]){  
String s;
Scanner obj= new Scanner(System.in);
System.out.println("Enter the string");
s=obj.next();
	//1st way  
Pattern p = Pattern.compile(".s");//. represents single character  
Matcher m = p.matcher("as");  
boolean b = m.matches();  
  
//2nd way  
boolean b2=Pattern.compile(".s").matcher(s).matches();  
  
//3rd way  
boolean b3 = Pattern.matches(".s", "bz");  
  
System.out.println(b+" "+b2+" "+b3);  
}}  
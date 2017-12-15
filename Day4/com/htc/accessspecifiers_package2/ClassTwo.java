package com.htc.accessspecifiers_package2;

//Java program to illustrate
//protected modifier

import com.htc.accessspecifiers_package1.*; //importing all classes in package p1

//ClassTwo is subclass of ClassOne
class ClassTwo extends ClassOne
{
 public static void main(String args[])
 {  
	 ClassTwo obj = new ClassTwo();  
     obj.display();  
 }  
   
}

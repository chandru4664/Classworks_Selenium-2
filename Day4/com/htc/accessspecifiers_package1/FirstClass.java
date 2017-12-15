package com.htc.accessspecifiers_package1;
//Java program to illustrate error while 
//using class from different package with
//private modifier for the method
//default for class.class cannot be accessed outside pkg
class FirstClass {
	private void display()
    {
        System.out.println("From private method");
    }
}

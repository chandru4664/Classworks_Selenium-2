package com.htc.accessspecifiers_package2;
//Java program to illustrate error while 
//using class from different package with
//default modifier
import com.htc.accessspecifiers_package1.*;
public class HelloWorldNew {
	public static void main(String args[])
    {  
       //accessing class Geek from package p1
		HelloWorld obj = new HelloWorld();

       obj.display();
    }
}

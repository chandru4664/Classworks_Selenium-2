package com.htc.serialization;

//Java code for serialization and deserialization 
//of a Java object
import java.io.*;

class Demo implements java.io.Serializable
{
 public int a;
 public String b;

 // Default constructor
 public Demo(int a, String b)
 {
     this.a = a;
     this.b = b;
 }

}
package com.htc.constructors;

class Student3{  
int id;  
String name;  
  
void display(){System.out.println(id+" "+name);} 
}
public class DefaultConstructor {
	public static void main(String args[]){  
		Student3 s1=new Student3();  
		Student3 s2=new Student3();  
		s1.display();  
		s2.display();  
		}  
}

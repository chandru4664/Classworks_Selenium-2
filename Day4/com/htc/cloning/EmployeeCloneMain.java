package com.htc.cloning;

public class EmployeeCloneMain {
	public static void main(String arg[]){
		 EmployeeClone obj1 = new EmployeeClone();
		 obj1.setName("Jamie Zawinski");
		 try {
			 EmployeeClone obj2 = (EmployeeClone) obj1.clone(); //Shallow Copy
		 System.out.println(obj2.getName());
		 System.out.println(obj2.getDesignation());
		
		 } catch (CloneNotSupportedException cnse) {
		 System.out.println("Cloneable should be implemented. " + cnse );
		 }
		 }
}

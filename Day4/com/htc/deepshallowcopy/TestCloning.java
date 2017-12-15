package com.htc.deepshallowcopy;

public class TestCloning {
	 
    public static void main(String[] args) throws CloneNotSupportedException
    {
        
        // To Demonstrate change reflected in original object from cloned object
        // also to demonstrate Deep cloning
      Department hr = new Department(1, "Human Resource");
        Employee original = new Employee(1, "Admin", hr);
        //Employee cloned = (Employee) original.clone();
        Employee cloned=original;
        //Let change the department name in cloned object and we will verify in original object
        cloned.getDepartment().setName("Finance");
        System.out.println("original: "+original.getDepartment().getName());
        System.out.println("cloned: "+cloned.getDepartment().getName());
   //This implies we have done a deep copy
        
        
    }
}
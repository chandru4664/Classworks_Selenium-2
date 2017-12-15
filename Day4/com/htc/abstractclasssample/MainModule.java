package com.htc.abstractclasssample;

public class MainModule {
	 public static void main (String[] args) 
	    {
	     
	        // creating the Object of Rectangle class
	        // and using shape class reference.
	        Shape rect = new Rectangle(2,3, "Rectangle");
	        System.out.println("Area of rectangle: " + rect.area());
	        rect.moveTo(1,2);
	        rect.draw();
	         
	        System.out.println(" ");
	         
	        // creating the Objects of circle class
	        Shape circle = new Circle(2, "Cicle");
	        System.out.println("Area of circle: " + circle.area());
	        circle.moveTo(2,4);
	        circle.draw();
	     
	    }
}

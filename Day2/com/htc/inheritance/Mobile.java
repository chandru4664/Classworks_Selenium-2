package com.htc.inheritance;
/*Superclass/Baseclass*/

public class Mobile {	
	private String manufacturer;
	private String operating_system;
	public String model;
	private int cost;
	//Constructor to set properties/characteristics of object
	Mobile(String manufacture, String os,String model, int cost){
		this.manufacturer = manufacture;
		this.operating_system=os;
		this.model=model;
		this.cost=cost;
	}
	//Method to get access Model property of Object
	public String getModel(){
		return this.model;
	}
	// We can add other method to get access to other properties
	@Override
	public String toString() {
		return "Mobile [manufacturer=" + manufacturer + ", operating_system=" + operating_system + ", model=" + model
				+ ", cost=" + cost + "]";
	}
	
}
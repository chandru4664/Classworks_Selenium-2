package com.htc.inheritance;

public class MainModule {

	 public static void main (String args[])
	 {
		 String modelname;
		 Mobile mobileobject=new Mobile("Windows","windows","recent",15000);
		 modelname=mobileobject.getModel();
		 System.out.println(modelname);
		 System.out.println(mobileobject);
		 
		 
		 Android androidobject=new Android("Huawei","Nougat","Honor 9i",20000);
		 System.out.println(androidobject);
		 
		 Blackberry blackberryobject=new Blackberry("Blackberry","blackberry","KEYone",39000);
		 System.out.println(blackberryobject);
	 }
 }

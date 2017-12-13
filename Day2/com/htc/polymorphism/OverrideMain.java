package com.htc.polymorphism;

public class OverrideMain {
	public static void main(String args[])
	{
		Shape shapeobject1 = new CircleOverride();
		shapeobject1.draw();
		Shape shapeobject2 = new SquareOverride();
		shapeobject2.draw();
		
		
	}
}

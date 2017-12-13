package com.htc.polymorphism;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleOverload circleobject= new CircleOverload();
		circleobject.draw();
		circleobject.draw(4);
		circleobject.draw(5, "Red");
		
	}

}

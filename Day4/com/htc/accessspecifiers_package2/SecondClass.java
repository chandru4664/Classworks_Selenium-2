package com.htc.accessspecifiers_package2;
import com.htc.accessspecifiers_package1.*;
public class SecondClass extends Firstclass {
	public static void main(String args[])
    {
        FirstClass obj = new FirstClass();
        //trying to access private method of another class
        obj.display();
    }
}

package com.htc.cloning;

public class ShallowMain {
	 public static void main(String[] args) {
	        int[] vals = {3, 7, 9};
	        ShallowCopy e = new ShallowCopy(vals);
	        e.showData(); // prints out [3, 7, 9]
	        vals[0] = 13;
	        e.showData(); // prints out [13, 7, 9]
	 
	        // When we changed the first element of the arrayin main, that got reflected in our object's memeber variable array       
	        //we just have a reference to the array vals[] since we did a shallow copy.
	    }
}

package com.htc.cloning;

public class DeepCopyMain {
	 public static void main(String[] args) {
	        int[] vals = {3, 7, 9};
	        DeepCopy e = new DeepCopy(vals);
	        e.showData(); // prints out [3, 7, 9]
	        vals[0] = 13;
	        e.showData(); // prints out [3, 7, 9]
	 
	       // changes in array values will not be 
	       // shown in data values. 
	    }
}

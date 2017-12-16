package com.htc.throwskeyword;

public class WithoutThrows {
	// Java program to illustrate error in case 
	// of unhandled exception
	//error because there is a chance of exception if the main thread is going to sleep, 
	//other threads get the chance to execute main() method which will cause InterruptedException.
	    public static void main(String[] args)    {
	        Thread.sleep(10000);
	        System.out.println("Hello Geeks");
	    }
	}

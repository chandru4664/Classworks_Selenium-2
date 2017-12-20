package com.htc.fileio;

import java.io.FileOutputStream;
//Writing a string to a file.
public class FileOutputStreamExample2 {
	public static void main(String args[]){    
        try{    
        	FileOutputStream fout=new FileOutputStream("d:\\testout.txt");    
        	String s="This a test.";    
        	byte b[]=s.getBytes();//converting string into byte array    
        	fout.write(b);    
        	fout.close();    
        	System.out.println("success...");    
         }
        	catch(Exception e){
        		System.out.println(e);}    
   }    
}

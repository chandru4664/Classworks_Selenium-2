package com.htc.fileio;

import java.io.FileInputStream;
//reading a single character from a file.
public class FileInputStreamExample {
	public static void main(String args[]){    
        try{    
          FileInputStream fin=new FileInputStream("d:\\testout.txt");    
          int i=fin.read();   
          System.out.print((char)i);   //cast to char  

          fin.close();    
        }catch(Exception e){
        	System.out.println(e);}    
       }    
}

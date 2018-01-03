package com.htc.selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//sample program that illustrates the methos of WebElement object
public class PG2 {
    public static void main(String[] args) {
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
    	System.setProperty("webdriver.chrome.driver","e:\\SELENIUMDRIVERS\\chromedriver.exe");
    	//WebDriver driver = new FirefoxDriver();
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.facebook.com";
      
        
        driver.get(baseUrl);
        WebElement emailElement=driver.findElement(By.id("email"));
        System.out.println("Tagname of email textbox  is :"+ emailElement.getTagName());
        System.out.println("name of email textbox  is :"+emailElement.getAttribute("name"));
        System.out.println("classname of email textbox  is :"+emailElement.getAttribute("class"));
        System.out.println("IsEnabled of email textbox  is :"+ emailElement.isEnabled());
        System.out.println("IsEnabled of email textbox  is :"+emailElement.isDisplayed());
        System.out.println("class of email webelement  is :" + emailElement.getClass());
        System.out.println("loacation of email textbox  is :" +  emailElement.getLocation());
 
        driver.close();
        System.exit(0);
}
}
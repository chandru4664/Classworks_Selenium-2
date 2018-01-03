package com.htc.selenium1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG3 {
    public static void main(String[] args) {
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
    	//WebDriver driver = new FirefoxDriver();
    	System.setProperty("webdriver.chrome.driver","e:\\SELENIUMDRIVERS\\chromedriver.exe");
    	//WebDriver driver = new FirefoxDriver();
    	WebDriver driver = new ChromeDriver();
        driver.get("http://www.popuptest.com/popuptest2.html");
        driver.close();//only the current window will close.
       // driver.quit();  // using QUIT all windows will close
    }
}
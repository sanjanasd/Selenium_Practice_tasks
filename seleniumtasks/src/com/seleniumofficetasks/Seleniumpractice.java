package com.seleniumofficetasks;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumpractice {
     public static void main(String[] args) {
    	 WebDriver driver = new ChromeDriver();
         //driver.get("https://practicetestautomation.com/practice/");
//    	 driver.get("https://www.saucedemo.com/");
  //      driver.manage().window().maximize();
////         driver.findElement(By.xpath("//a[ @href='https://practicetestautomation.com/practice-test-exceptions/']")).click();
////         driver.findElement(By.id("edit_btn")).click();
//         driver.findElement(By.id("user-name")).sendKeys("standard_user");
//         driver.findElement(By.id("password")).sendKeys("secret_sauce");
//         driver.findElement(By.id("login-button")).click();
    	 driver.get("https://demo.guru99.com/test/newtours/");
    	 driver.manage().window().maximize();
    	 System.out.println(driver.getCurrentUrl());
    	 System.out.println(driver.getTitle());
    	 driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
    	 System.out.println(driver.getCurrentUrl());
    	 System.out.println(driver.getTitle());
    	 driver.findElement(By.name("firstName")).sendKeys("Sanjana");
    	 driver.findElement(By.name("lastName")).sendKeys("Sandeep");
    	 driver.findElement(By.name("phone")).sendKeys("9900235747");
    	 driver.findElement(By.id("userName")).sendKeys("sanjana@gmail.com");
    	 driver.findElement(By.name("address1")).sendKeys("san");
    	 driver.findElement(By.name("city")).sendKeys("Banglore");
    	 driver.findElement(By.name("state")).sendKeys("karnataka");
    	 driver.findElement(By.name("postalCode")).sendKeys("12345");
    	 driver.findElement(By.id("email")).sendKeys("sanjana@gmail.com");
    	 driver.findElement(By.name("password")).sendKeys("sanj123");
    	 driver.findElement(By.name("confirmPassword")).sendKeys("sanj123");
    	driver.findElement(By.name("submit")).click();
    	
    	 
    	 
    	 
    	 
	}
}

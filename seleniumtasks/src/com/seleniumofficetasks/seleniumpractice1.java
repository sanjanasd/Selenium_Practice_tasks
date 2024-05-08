package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys("Sandeep");
		driver.findElement(By.id("customer.lastName")).sendKeys("N S");
		driver.findElement(By.id("customer.address.street")).sendKeys("banglore123");
		driver.findElement(By.id("customer.address.city")).sendKeys("Banglore");
		driver.findElement(By.id("customer.address.state")).sendKeys("karnataka");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("34567");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("3424526671");
		driver.findElement(By.id("customer.ssn")).sendKeys("1234");
		driver.findElement(By.id("customer.username")).sendKeys("Sandeep");
		driver.findElement(By.id("customer.password")).sendKeys("sanjana123");
		driver.findElement(By.id("repeatedPassword")).sendKeys("sanjana123");
		Thread.sleep(5000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Sandeep");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("sanjana123");
		Thread.sleep(3000);
		driver.findElement(By.className("button")).click();

		
		

	}

}

package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpractive4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demo.guru99.com/insurance/v1/index.php");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("user_firstname")).sendKeys("sandeep");
		Thread.sleep(3000);
		driver.findElement(By.id("user_surname")).sendKeys("sandy");
		Thread.sleep(3000);
		driver.findElement(By.id("user_phone")).sendKeys("9900235747");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\'licencetype_f\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("jp nagar");
		Thread.sleep(3000);
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Banglore");
		Thread.sleep(3000);
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("sandeepsanju@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("sansan");
		Thread.sleep(3000);
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("sansan");
		Thread.sleep(3000);
		driver.findElement(By.id("resetform")).click();
		Thread.sleep(3000);
		}

}

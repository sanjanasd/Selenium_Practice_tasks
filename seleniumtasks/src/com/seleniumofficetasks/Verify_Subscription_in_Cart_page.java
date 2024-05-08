package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Subscription_in_Cart_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();
		driver.findElement(By.id("susbscribe_email")).sendKeys("sanjana@gmail.com");
		driver.findElement(By.xpath("//button[@id=\"subscribe\"]/i")).click();
	
		
	
	}

}

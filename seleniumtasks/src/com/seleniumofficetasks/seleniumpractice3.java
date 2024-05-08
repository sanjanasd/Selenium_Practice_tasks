package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpractice3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\'shopping_cart_link\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\'react-burger-menu-btn\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\'logout_sidebar_link\']")).click();
		Thread.sleep(2000);
		}

}

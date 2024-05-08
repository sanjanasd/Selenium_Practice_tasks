package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_User_with_existing_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("name")).sendKeys("sanjjj");
		driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]")).sendKeys("sanjjj@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")).click();

		

	}

}

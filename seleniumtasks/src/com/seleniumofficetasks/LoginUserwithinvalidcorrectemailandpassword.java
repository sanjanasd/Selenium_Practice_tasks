package com.seleniumofficetasks;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUserwithinvalidcorrectemailandpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("email")).sendKeys("san@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sa22");
		driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
		
	}

}

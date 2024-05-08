package com.seleniumofficetasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logoutuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("email")).sendKeys("sanjjj@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("123456");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	    driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]")).click();
	    driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	    

	}

}

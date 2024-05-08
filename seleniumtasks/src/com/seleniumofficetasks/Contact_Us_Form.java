package com.seleniumofficetasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Us_Form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("name")).sendKeys("sanjana");
		driver.findElement(By.name("email")).sendKeys("sann@gmail.com");
		driver.findElement(By.name("subject")).sendKeys("SAAAA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("message")).sendKeys("saa dfgh fsdfg");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id='form-section']/a/span")).click();

	}

}

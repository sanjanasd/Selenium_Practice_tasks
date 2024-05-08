package com.seleniumofficetasks;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		//driver.get("https://demo.automationtesting.in/Register.html");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		//driver.findElement(By.className("//input[@ class=\'form-control ng-pristine ng-invalid ng-invalid-required ng-touched\']")).sendKeys("Sanjana");
//		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Sanjana");
//		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("S D");
//		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Jp nagar");
//		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("Sanjana@gmail.com");
//		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("6363577804");
//		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
//		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
//		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
//		driver.findElement(By.id("firstpassword")).sendKeys("Sanjana");
//		driver.findElement(By.id("secondpassword")).sendKeys("sandeep");
//		driver.findElement(By.xpath("//*[contains(text(),'Refresh')]")).click();
		driver.findElement(By.xpath("//nav[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/i[2]")).click();
		driver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=account/register&language=en-gb']")).click();
		
		
		





	}

}

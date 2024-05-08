package com.seleniumofficetasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Products_in_Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//header[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[5]/div/div[1]/div[1]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[@class=\"btn btn-success close-modal btn-block\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[3]/div/div[1]/div[1]/a")).click();
		driver.findElement(By.xpath("//p[2][@class=\"text-center\"]/a")).click();		
	}

}

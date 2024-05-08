package com.seleniumofficetasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.javatopics.throws1;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//div[@class=\" nav nav-tabs\"]/div[2]/div[1]/button")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"#CancelTab\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.dismiss();
		driver.findElement(By.xpath("//a[@href=\"#Textbox\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		Thread.sleep(3000);
		alert3.sendKeys("sanjanaa");
		alert3.accept();
		
		

	}

}

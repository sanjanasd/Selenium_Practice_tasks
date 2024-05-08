package com.seleniumofficetasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertok {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		Alert alr = driver.switchTo().alert();
		Thread.sleep(3000);
		alr.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert alr1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alr1.accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		Alert alr2 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(alr2.getText());
		Thread.sleep(3000);
		alr2.sendKeys("Sanjana");
		alr2.accept();

	}

}

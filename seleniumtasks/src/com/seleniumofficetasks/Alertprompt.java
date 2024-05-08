package com.seleniumofficetasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		Thread.sleep(3000);
		al.accept();
		driver.findElement(By.xpath("//button[@onclick=\"myDesk()\"]")).click();
		Thread.sleep(3000);
		Alert al2 = driver.switchTo().alert();
		Thread.sleep(3000);
		al2.accept();
		driver.findElement(By.xpath("//button[@onclick=\"myPromp()\"]")).click();
		Thread.sleep(3000);
		Alert al3 = driver.switchTo().alert();
		Thread.sleep(3000);
		al3.sendKeys("sanjana");
		System.out.println(al3.getText());
		Thread.sleep(7000);
//		al3.accept();
	}

}

package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.busonlineticket.com/");
//		driver.findElement(By.name("deptdate")).click();
//		driver.findElement(By.xpath("//a[@data-handler='next']")).click();
//		driver.findElement(By.xpath("//a[text()='7']")).click();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		Thread.sleep(5000);
		driver.findElement(By.id("first_date_picker")).click();
		driver.findElement(By.xpath("//a[text()='26']")).click();
		driver.findElement(By.id("second_date_picker")).click();
		driver.findElement(By.xpath("//a[text()='8']")).click();
		driver.findElement(By.id("third_date_picker")).click();
		driver.findElement(By.xpath("//a[text()='7']")).click();
		driver.findElement(By.id("fourth_date_picker")).click();
		driver.findElement(By.xpath("//a[text()='28']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("fifth_date_picker")).click();
		driver.findElement(By.xpath("//a[text()='30']")).click();
		driver.findElement(By.xpath("//img[@class=\"ui-datepicker-trigger\"]")).click();
		driver.findElement(By.xpath("//a[text()='24']")).click();
		
}
}
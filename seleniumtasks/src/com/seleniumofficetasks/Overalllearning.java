package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Overalllearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flynas.com/en");
		driver.findElement(By.xpath("//a[@title=\"Sign-up\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("sanjana@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("sansan");
		Thread.sleep(3000);
		driver.findElement(By.name("confpassword")).sendKeys("sansan");
		Thread.sleep(3000);
		driver.findElement(By.name("title")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("sanjana");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("s d");
		Thread.sleep(3000);
		driver.findElement(By.name("dobday")).click();
		driver.findElement(By.xpath("//*[@id=\"mat-option-8\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("dobmonth")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-39\"]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("dobyear")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"mat-option-52\"]/span")).click();
		
		
		

	}

}

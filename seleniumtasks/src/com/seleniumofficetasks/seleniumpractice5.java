package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpractice5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//nav[@id=\"top\"]/div/div[2]/ul/li[2]/div/a/i[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://demo.opencart.com/index.php?route=account/register&language=en-gb']")).click();
		Thread.sleep(10000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@ class='list-group mb-3']/a[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\'btn btn-primary\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("input-firstname")).sendKeys("San");
		Thread.sleep(3000);
		driver.findElement(By.id("input-lastname")).sendKeys("s d");
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys("san@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys("sandeep");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\'input-newsletter-yes\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@ type=\"checkbox\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		Thread.sleep(3000);

		


	}

}

package com.seleniumofficetasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class=\"header-middle\"]/div/div/div[2]/div/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement searchtextfield= driver.findElement(By.id("search_product"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		searchtextfield.sendKeys("SAREE");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("submit_search")).click();

		

	}

}

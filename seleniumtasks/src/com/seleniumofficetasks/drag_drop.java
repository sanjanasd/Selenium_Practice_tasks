package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		WebElement drop = driver.findElement(By.id("angular"));
		Thread.sleep(3000);
		WebElement trash = driver.findElement(By.id("droparea"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drop, trash).build().perform();
		
		WebElement drop1 = driver.findElement(By.id("mongo"));
		WebElement trash1 = driver.findElement(By.id("droparea"));
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(drop1, trash1).build().perform();

		WebElement drop11 = driver.findElement(By.id("node"));
		WebElement trash11 = driver.findElement(By.id("droparea"));
		Actions act11 = new Actions(driver);
		act11.dragAndDrop(drop11, trash11).build().perform();

	}

}

package com.seleniumclassPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("san123");
		WebElement icon = driver.findElement(By.xpath("//div[@class=\'showPassword shownhide\']"));
		Actions act = new Actions(driver);
		act.clickAndHold(icon).build().perform();
		

	}


	}

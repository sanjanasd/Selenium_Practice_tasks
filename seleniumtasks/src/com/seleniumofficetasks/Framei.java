package com.seleniumofficetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framei {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/6");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='ProductDisplay_productDetails__drqNI']/div[4]/h6/button")).click();
		

	}

}

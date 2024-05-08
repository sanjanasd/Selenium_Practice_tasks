package com.seleniumofficetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningclearMethod {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("https://omayo.blogspot.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(5000);
////		WebElement ele=driver.findElement(By.name("fname"));
////		ele.clear();
////		ele.sendKeys("sanjana");
////		
////		
////		//two ways:-
////		
////		driver.findElement(By.id("name"))
////		driver.findElement(By.id("submit")).click()
////		WebElement element=driver.findElement(By.id("name"));
////		element.sendKeys("sanjana");
////		element.click();
//		WebElement element1 = driver.findElement(By.xpath("//div[@ id='HTML11']/div/textarea"));
//		element1.clear();
//		element1.sendKeys("sansan");
//		
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		List<WebElement> li=driver.findElements(By.tagName("a"));
//		for(int i=0;i<li.size();i++) {
//			String links=li.get(i).getAttribute("href");
//			System.out.println(links);
		
		
//		WebElement elem=driver.findElement(By.xpath("//div[@class='_2GaeWJ']/img"));
//		System.out.println(elem.getAttribute("src"));
		
		
		
		
		
		
		
		
		
	 driver.get("https://www.amazon.in/");
	 Thread.sleep(3000);
	 WebElement e1 = driver.findElement(By.xpath("//div[@id=\"CardInstanceynQK1OmE24LjYTlGuEBBkQ\"]/div[2]/div[1]/div[1]/a/div[1]/img"));
	 System.out.println(e1.getAttribute("src"));
	 
		
	}
}
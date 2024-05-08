package com.seleniumclassPractice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement photoframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(photoframe);
		WebElement img1 = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
		WebElement trash = driver.findElement(By.id("trash"));
		Actions act =new Actions(driver);
		act.dragAndDrop(img1, trash).perform();
		
		
//		Srolltoelement
//		driver.get("https://www.myntra.com/");
//		WebElement returnelement = driver.findElement(By.xpath("//a[@href=\"/faqs#returns\"]"));
//		Actions act= new Actions(driver);
//		act.scrollToElement(returnelement).perform();
		
	}

}
